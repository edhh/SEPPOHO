/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.poho.web.controller.firma;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



    import fielnet.ws.Autenticacion;
    import fielnet.ws.DecodeCertificate;
    import fielnet.ws.DigestData;
    import fielnet.ws.DigestDataResponse;
    import fielnet.ws.FromXmlToChain;
    import fielnet.ws.FromXmlToChainResponse;
    import fielnet.ws.ReportPkcs1Extended;
    import fielnet.ws.ReportPkcs1ExtendedResponse;
    import fielnet.ws.RequestNom151;
    import fielnet.ws.RequestNom151Response;
    import fielnet.ws.RequestTimeStamping;
    import fielnet.ws.RequestTimeStampingResponse;
    import fielnet.ws.TDecodeCertificate;
    import fielnet.ws.TDigestData;
    import fielnet.ws.TFromXmlToChain;
    import fielnet.ws.TReportPkcs1;
    import fielnet.ws.TReportPkcs1Extended;
    import fielnet.ws.TRequestNom151;
    import fielnet.ws.TRequestTimeStamping;
    import fielnet.ws.TVerifyNom151;
    import fielnet.ws.TVerifyPkcs1;
    import fielnet.ws.TVerifyPkcs7;
    import fielnet.ws.TVerifyTimeStamping;
    import fielnet.ws.VerifyNom151;
    import fielnet.ws.VerifyNom151Response;
    import fielnet.ws.VerifyPkcs1;
    import fielnet.ws.VerifyPkcs1Response;
    import fielnet.ws.VerifyPkcs7;
    import fielnet.ws.VerifyPkcs7Response;
    import fielnet.ws.VerifyTimeStamping;
    import fielnet.ws.VerifyTimeStampingResponse;
    import java.io.IOException;
    import java.io.InputStream;
    import java.io.PrintWriter;
    import java.net.URL;
    import java.util.List;
    import javax.servlet.ServletException;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
import mx.sep.poho.web.controller.MenuSeguridadController;
    import org.codehaus.jackson.map.ObjectMapper;
    import org.codehaus.jackson.map.ObjectWriter;
    import org.slf4j.Logger;
    import org.slf4j.LoggerFactory;

    /**
     *
     * @author eduardo.hernandez
     */
    public class FirmaController extends HttpServlet {
        
        final static Logger logger = LoggerFactory.getLogger(MenuSeguridadController.class);
        
        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            logger.debug("CONTROLADOR FIRMA");
            System.out.println("CONTROLADOR FIRMA");
            response.setContentType("application/json; charset=utf-8");
            PrintWriter out = response.getWriter();
            String entidad = this.getInitParameter("entidad");
            String url = this.getInitParameter("url");
            String usuario = this.getInitParameter("usuario");
            String pass = this.getInitParameter("contrasena");
            fielnet.ws.Autenticacion authentication = new Autenticacion();
            authentication.setEntity(entidad);
            authentication.setUser(usuario);
            authentication.setPassword(pass);
            if (request.getMethod().equalsIgnoreCase("POST")) {        
                fielnet.ws.WSCommerceFielService service = new fielnet.ws.WSCommerceFielService(new URL(url));
                fielnet.ws.WSCommerceFiel port = service.getWSCommerceFielPort();
                String nomName = request.getParameter("nom");
                String makeOcsp = request.getParameter("verifyOCSP");
                //String tsaName = request.getParameter("tsaName");
                String tsaName = "septsaqa";
                //String tsaAlgorithm = request.getParameter("tsaAlgorithm");
                String tsaAlgorithm = "3";
                String operacion = request.getParameter("metodo");
                if (operacion == null) {
                    out.write(encodeError(-89, "Operación no definida"));
                    return;
                }
                if (operacion.equals("decodecert")) {
                    System.out.println("OPERACION DECODECERT");
                    String certificate = request.getParameter("cert");
                    String reference = request.getParameter("referencia");
                    reference = new String((new sun.misc.BASE64Decoder()).decodeBuffer(reference), "utf8");
                    if (reference == null || reference.trim().isEmpty()) {
                        reference = "Decodificación Certificado";
                        System.out.println("REFRENCIA VACIO");
                    }
                    if (certificate != null && request.getParameter("verifyOCSP") != null) {
                        DecodeCertificate parameters = new DecodeCertificate();
                        parameters.setBase64Certificate(certificate.replace(" ", "+"));
                        parameters.setOcsp(request.getParameter("verifyOCSP").equals("true") ? 1 : 0);
                        parameters.setReference(reference);
                        parameters.setTsaAlgorithm(Integer.parseInt(tsaAlgorithm));
                        //parameters.setTsaName(tsaName);
                        parameters.setTsaName("NA");
                        fielnet.ws.DecodeCertificateResponse decodeResponse = port.decodeCertificate(parameters, authentication);
                        if (decodeResponse != null) {
                            TDecodeCertificate decodeResult = decodeResponse.getReturn();
                            ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
                            String json = ow.writeValueAsString(decodeResult);
                            out.write(json);

                        } else {
                            System.out.println("ERROR");
                            out.write(encodeError(-90, "No se obtuvo respuesta de web service"));
                        }

                    } else {
                        out.write(encodeError(23, "Parámetros de operación incompletos"));

                    }

                } else if (operacion.equals("pkcs1")) {
                    String certificate = request.getParameter("cert");
                    String firma = request.getParameter("firma");
                    String cadenaOriginal = request.getParameter("original");
                    String reference = request.getParameter("referencia");
                    if (reference == null) {
                        reference = "Firma cadena de datos";
                    } else {
                        reference = new String((new sun.misc.BASE64Decoder()).decodeBuffer(reference), "utf8");
                    }
                    if (certificate != null) {
                        certificate = certificate.replace(" ", "+");
                    }
                    if (firma != null) {
                        firma = firma.replace(" ", "+");
                    }
                    if (cadenaOriginal != null) {
                        cadenaOriginal = cadenaOriginal.replace(" ", "+");
                    }

                    fielnet.ws.ReportPkcs1 pkcs1Parameters = new fielnet.ws.ReportPkcs1();
                    pkcs1Parameters.setB64Certificate(certificate);
                    pkcs1Parameters.setB64Sign(firma);
                    pkcs1Parameters.setChain(cadenaOriginal);
                    pkcs1Parameters.setModeChain(3);
                    pkcs1Parameters.setNomName(nomName);
                    //pkcs1Parameters.setOcsp(makeOcsp == null ? 1 : makeOcsp.equals("true") ? 1 : 0);
                    pkcs1Parameters.setOcsp(1);
                    pkcs1Parameters.setReference(reference);
                    pkcs1Parameters.setTsaName(tsaName);
                    pkcs1Parameters.setTsaAlgorithm(Integer.parseInt(tsaAlgorithm));
                    fielnet.ws.ReportPkcs1Response result = port.reportPkcs1(pkcs1Parameters, authentication);

                    if (result != null) {
                        TReportPkcs1 report = result.getReturn();
                        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
                        String json = ow.writeValueAsString(report);
                        out.write(json);

                    } else {
                        out.write(encodeError(23, "No se obtuvo respuesta del WSCommerceFiel"));
                    }
                } else if (operacion.equals("der")) {
                    String digestion = request.getParameter("digest");
                    String fecha = request.getParameter("fecha");
                    if (digestion != null) {
                        digestion = digestion.replace(" ", "+");
                    }
                    String token = port.digestExtended(digestion, fecha);
                    token = token.replace(System.getProperty("line.separator"), "");
                    if (token == null || token.isEmpty()) {
                        out.write(encodeError(24, "No se obtuvo vector para firma"));
                    } else {
                        out.write("{\"state\":" + 0 + ",\"data\":\"" + token + "\",\"description\":\"Satisfactorio\"}");
                    }
                } else if (operacion.equals("vector")) {
                    String vector = request.getParameter("vector");
                    String firmaVector = request.getParameter("firma");
                    String certificadoBase64 = request.getParameter("cert");
                    if (!noEmpty(vector, firmaVector, certificadoBase64)) {
                        out.write(encodeError(23, "Parámetros de operación incompletos"));
                        return;
                    }
                    vector = vector.replace(" ", "+");
                    firmaVector = firmaVector.replace(" ", "+");
                    certificadoBase64 = certificadoBase64.replace(" ", "+");
                    fielnet.ws.ReportPkcs1Extended parameters = new ReportPkcs1Extended();
                    parameters.setB64Certificate(certificadoBase64);
                    parameters.setB64Sign(firmaVector);
                    parameters.setChain(vector);
                    parameters.setModeChain(3);
                    parameters.setNomName(nomName);
                    parameters.setTsaName(tsaName);
                    parameters.setTsaAlgorithm(Integer.parseInt(tsaAlgorithm));
                    parameters.setOcsp(makeOcsp == null ? 1 : makeOcsp.equals("true") ? 1 : 0);
                    String reference = request.getParameter("referencia");
                    if (reference == null) {
                        reference = "Firma cadena de datos";
                    } else {
                        reference = new String((new sun.misc.BASE64Decoder()).decodeBuffer(reference), "utf8");
                    }
                    parameters.setReference(reference);
                    ReportPkcs1ExtendedResponse result = port.reportPkcs1Extended(parameters, authentication);
                    if (result == null) {
                        out.write(encodeError(23, "No se obtuvo respuesta del WSCommerceFiel"));
                    } else {
                        TReportPkcs1Extended ext = result.getReturn();
                        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
                        String json = ow.writeValueAsString(ext);
                        out.write(json);
                    }
                } else if (operacion.equals("transformXML")) {
                    String xmlOriginal = new String(request.getParameter("xml").getBytes(), "utf8");
                    String xslt = request.getParameter("idXSLT");
                    String reference = request.getParameter("referencia");
                    if (reference == null) {
                        reference = "Transformación XSLT";
                    } else {
                        reference = new String((new sun.misc.BASE64Decoder()).decodeBuffer(reference), "utf8");
                    }
                    if (noEmpty(xmlOriginal, xslt)) {
                        xmlOriginal = xmlOriginal.replace(" ", "+");
                        FromXmlToChain parameters = new FromXmlToChain();
                        parameters.setBase64Xml(xmlOriginal);
                        parameters.setNameXslt(xslt);
                        parameters.setReference(reference);
                        FromXmlToChainResponse responseChain = port.fromXmlToChain(parameters, authentication);
                        if (responseChain != null) {
                            TFromXmlToChain reponseResult = responseChain.getReturn();
                            ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
                            String json = ow.writeValueAsString(reponseResult);
                            out.write(json);
                        } else {
                            out.write(encodeError(23, "No se obtuvo respuesta del WSCommerceFiel"));
                        }

                    } else {
                        out.write(encodeError(23, "Parámetros de operación incompletos"));
                    }
                } else if (operacion.equals("hashData")) {
                    String cadena = new String(request.getParameter("cadena").getBytes(), "utf8");
                    String codificacion = request.getParameter("codificacion");
                    String algoritmo = request.getParameter("algoritmo");
                    String ciclos = request.getParameter("ciclos");
                    String reference = request.getParameter("reference");
                    if (reference == null || reference.isEmpty()) {
                        reference = "Digestión de cadena de datos";
                    } else {
                        reference = new String((new sun.misc.BASE64Decoder()).decodeBuffer(reference), "utf8");
                    }
                    if (noEmpty(cadena, codificacion, algoritmo, ciclos, reference)) {
                        DigestData digestData = new DigestData();
                        digestData.setAlgorithm(Integer.parseInt(algoritmo));
                        digestData.setChain(cadena);
                        digestData.setCount(Integer.parseInt(ciclos));
                        digestData.setModeChain(Integer.parseInt(codificacion));
                        digestData.setReference(reference);
                        DigestDataResponse responseD = port.digestData(digestData, authentication);
                        if (responseD != null) {
                            TDigestData dataRes = responseD.getReturn();
                            ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
                            String json = ow.writeValueAsString(dataRes);
                            out.write(json);
                        } else {

                        }

                    } else {
                        out.write(encodeError(23, "Parámetros de operación incompletos"));
                    }
                } else if (operacion.equals("timeStamp")) {
                    String digestion = new String(request.getParameter("digestion").getBytes(), "utf8");
                    String referencia = request.getParameter("reference");
                    if (referencia == null || referencia.trim().isEmpty()) {
                        referencia = "Generación de estampilla de tiempo";
                    } else {
                        referencia = new String((new sun.misc.BASE64Decoder()).decodeBuffer(referencia), "utf8");
                    }

                    if (noEmpty(digestion, referencia)) {
                        digestion = digestion.replace(" ", "+");
                        RequestTimeStamping requestTSA = new RequestTimeStamping();
                        requestTSA.setReference(referencia);
                        requestTSA.setStrDigest(digestion);
                        requestTSA.setTsaName(tsaName);

                        RequestTimeStampingResponse responseTSA = port.requestTimeStamping(requestTSA, authentication);
                        if (responseTSA != null) {
                            TRequestTimeStamping responseTSAR = responseTSA.getReturn();
                            ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
                            String json = ow.writeValueAsString(responseTSAR);
                            out.write(json);
                        } else {
                            out.write(encodeError(23, "No se obtuvo respuesta del WSCommerceFiel"));
                        }
                    } else {
                        out.write(encodeError(23, "Parámetros de operación incompletos"));
                    }

                } else if (operacion.equalsIgnoreCase("fileNOM")) {
                    String buffer = request.getParameter("buffer");
                    String referencia = request.getParameter("reference");
                    String fileName = request.getParameter("fileName");
                    if (referencia == null || referencia.trim().isEmpty()) {
                        referencia = "Generación de NOM";
                    } else {
                        referencia = new String((new sun.misc.BASE64Decoder()).decodeBuffer(referencia), "utf8");
                    }
                    if (noEmpty(buffer, nomName, fileName)) {
                        buffer = buffer.replace(" ", "+");
                        RequestNom151 parametersNOM = new RequestNom151();
                        parametersNOM.setFileName(fileName);
                        parametersNOM.setNomName(nomName);
                        parametersNOM.setReference(referencia);
                        parametersNOM.setChain(buffer);
                        parametersNOM.setModeChain(3);
                        RequestNom151Response responseNOM = port.requestNom151(parametersNOM, authentication);
                        if (responseNOM != null) {
                            TRequestNom151 responeRe = responseNOM.getReturn();
                            ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
                            String json = ow.writeValueAsString(responeRe);
                            out.write(json);
                        } else {
                            out.write(encodeError(23, "No se obtuvo respuesta del WSCommerceFiel"));
                        }

                    } else {
                        out.write(encodeError(23, "Parámetros de operación incompletos"));
                    }
                } else if (operacion.equals("validacionPKCS1")) {
                    String referencia = request.getParameter("referencia");
                    String cadenaOriginal = request.getParameter("cadenaOriginal");
                    String firma = request.getParameter("firma");
                    String certificado = request.getParameter("cert");
                    if (referencia == null || referencia.trim().isEmpty()) {
                        referencia = "Validación PKCS1";
                    } else {
                        referencia = new String((new sun.misc.BASE64Decoder()).decodeBuffer(referencia), "utf8");
                    }
                    if (noEmpty(cadenaOriginal, firma, certificado)) {
                        firma = firma.replace(" ", "+");
                        certificado = certificado.replace(" ", "+");
                        cadenaOriginal = cadenaOriginal.replace(" ", "+");
                        VerifyPkcs1 parametersPKCS1 = new VerifyPkcs1();
                        parametersPKCS1.setReference(referencia);
                        parametersPKCS1.setBase64Certificate(certificado);
                        parametersPKCS1.setChain(cadenaOriginal);
                        parametersPKCS1.setModeChain(3);
                        parametersPKCS1.setBase64Sign(firma);

                        VerifyPkcs1Response responsePKCS1 = port.verifyPkcs1(parametersPKCS1, authentication);
                        if (responsePKCS1 != null) {
                            TVerifyPkcs1 responeRe = responsePKCS1.getReturn();
                            ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
                            String json = ow.writeValueAsString(responeRe);
                            out.write(json);
                        } else {
                            out.write(encodeError(23, "No se obtuvo respuesta del WSCommerceFiel"));
                        }

                    } else {
                        out.write(encodeError(23, "Parámetros de operación incompletos"));
                    }
                } else if (operacion.equals("verifyTimeStamping")) {
                    String estampilla = request.getParameter("estampilla");
                    String referencia = request.getParameter("referencia");
                    if (referencia == null || referencia.trim().isEmpty()) {
                        referencia = "Decodificación Estampilla de tiempo";
                    } else {
                        referencia = new String((new sun.misc.BASE64Decoder()).decodeBuffer(referencia), "utf8");
                    }
                    if (noEmpty(estampilla)) {
                        estampilla = estampilla.replace(" ", "+");
                        VerifyTimeStamping param = new VerifyTimeStamping();
                        param.setBase64TimeStamping(estampilla);
                        param.setReference(referencia);
                        VerifyTimeStampingResponse responseR = port.verifyTimeStamping(param, authentication);
                        if (responseR != null) {
                            TVerifyTimeStamping r = responseR.getReturn();
                            ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
                            String json = ow.writeValueAsString(r);
                            out.write(json);

                        } else {
                            out.write(encodeError(23, "No se obtuvo respuesta de WSCommerceFiel"));
                        }
                    } else {
                        out.write(encodeError(23, "Parámetros de operación incompletos"));
                    }
                } else if (operacion.equals("validaNOM")) {
                    String referencia = request.getParameter("referencia");
                    if (referencia == null || referencia.trim().isEmpty()) {
                        referencia = "Decodificación Estampilla de tiempo";
                    } else {
                        referencia = new String((new sun.misc.BASE64Decoder()).decodeBuffer(referencia), "utf8");
                    }
                    String psc = request.getParameter("psc");
                    String user = request.getParameter("user");
                    String constancia = request.getParameter("constancia");
                    if (noEmpty(psc, user, constancia)) {
                        psc = psc.replace(" ", "+");
                        user = user.replace(" ", "+");
                        constancia = constancia.replace(" ", "+");
                        VerifyNom151 param = new VerifyNom151();
                        param.setBase64ClientCertificate(user);
                        param.setBase64PscCertificate(psc);
                        param.setBase64Nom151(constancia);
                        param.setReference(referencia);
                        VerifyNom151Response re = port.verifyNom151(param, authentication);
                        if (re != null) {
                            TVerifyNom151 r = re.getReturn();
                            ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
                            String json = ow.writeValueAsString(r);
                            out.write(json);
                        } else {
                            out.write(encodeError(23, "No se obtuvo respuesta de WSCommerceFiel"));
                        }
                    } else {
                        out.write(encodeError(23, "Parámetros de operación incompletos"));
                    }
                } else if (operacion.equals("decodePKCS7")) {
                    VerifyPkcs7 param = new VerifyPkcs7();
                    String referencia = request.getParameter("referencia");
                    String pkcs7 = request.getParameter("pkcs7");
                    if (referencia == null || referencia.trim().isEmpty()) {
                        referencia = "Decodificación Estampilla de tiempo";
                    } else {
                        referencia = new String((new sun.misc.BASE64Decoder()).decodeBuffer(referencia), "utf8");
                    }

                    if (noEmpty(pkcs7)) {
                        pkcs7 = pkcs7.replace(" ", "+");
                        param.setBase64Pkcs7(pkcs7);
                        param.setReference(referencia);
                        VerifyPkcs7Response r = port.verifyPkcs7(param, authentication);
                        if (r != null) {
                            List<TVerifyPkcs7> resPk = r.getReturn();
                            if (!resPk.isEmpty()) {
                                ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
                                String json = ow.writeValueAsString(resPk);
                                out.write(json);
                            }
                            else{
                             out.write("[]");
                            }
                        }

                    } else {
                        out.write(encodeError(23, "Parámetros de operación incompletos"));
                    }
                }
            } else {
                out.write(encodeError(22, "Método no válido GET"));
            }

        }

        private boolean noEmpty(String... elements) {
            boolean ok = true;
            for (String s : elements) {
                if (null == s || s.trim().isEmpty()) {
                    ok = false;
                    break;
                }
            }

            return ok;
        }

        private String encodeError(int estado, String descripcion) {
            String result = "";
            result = "{\"state\":" + estado + ",\"description\":\"" + descripcion + "\"}";
            return result;
        }

        // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
        /**
         * Handles the HTTP <code>GET</code> method.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            logger.debug("DO GET");
            processRequest(request, response);
        }

        /**
         * Handles the HTTP <code>POST</code> method.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            logger.debug("DO POST");
            processRequest(request, response);
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo() {
            return "Short description";
        }// </editor-fold>

    }

