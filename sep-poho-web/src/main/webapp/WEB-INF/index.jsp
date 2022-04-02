<%-- 
    Document   : tramitesUsuario
    Created on : 15/02/2022, 12:20:08 PM
    Author     : PabloJesusMendozaCer
--%>

<%@page language="java" 
        contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>
<%@ page import="mx.sep.seguridad.util.SeguridadUtil"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<script src="/lib/jquery.min.js"></script>
<script src="/lib/jquery.plugin.js"></script>


<t:particularTemplate>

    <jsp:attribute name="paginaTitulo">
        Contratos
    </jsp:attribute>
    <jsp:attribute name="scripts">
    </jsp:attribute>
    <jsp:attribute name="breadcrumb">
    </jsp:attribute>
    <jsp:body>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <div class="container">

            <h4>Parámetros de búsqueda</h4>
            <hr class="red">
            
             <div class="row">
                <div class="form-group">
                    <div class="col-md-2" id="cctAluDiv">
                        <label class="control-label" for="anio">Año*:</label>
                        <select class="form-control"  id="anio">
                            <option>Selecciona </option>
                         </select>
                        <!--input class="form-control" id="cCenTrab" placeholder="Centro de Trabajo" type="text" value="" disabled onkeyup="this.value = this.value.toUpperCase()"-->
                        <span id="errorAnio" class="help-block" ></span>
                    </div>
                </div>
             </div>
             
            
             <div class="row">
             <div class="form-group">
            <div class="col-md-6">
                <button class="btn btn-primary pull-right" type="submit" onclick="obtieneContratos()" id="btnGuardar"><i class='fa fa-circle-o-notch fa-spin' id="loadingBuscar" style="display: none;"></i> Buscar</button>
            </div>
             </div>
            </div>            
            
            
             <hr>
            <h2>Contratos del prestador de servicios</h2>
            <hr class="red">
            <div class="row bottom-buffer" id="resultadoLista">
                <div class="col-md-12" >
                    <div class="table-responsive" style="width:100%" id="datosCtDiv">
                        <table class="table table-responsive table-striped" name="contratosTrabajador" id="contratosTrabajador">
                            
                        </table>                                                
                    </div>
                </div>

            
        </div>
            <div class="row">
                <p>(*) Campos obligatorios </p>
            </div>
            
            

            <div class="modal fade" id="myModal4">
                <div class="modal-dialog" id="myModal15">
                    <div class="modal-content" id="myModal6">
                        <div class="modal-header" id="myModal7">
                            <h4 class="modal-title">POHO</h4>
                        </div>
                        <div class="modal-body">
                            <form role="form">
                                <div class="form-group">
                                    <label class="control-label" for="certificado">Certificado (.cer)*:</label>
                                    <input id="certificado" type="file">
                                </div>
                                <div class="form-group">
                                    <label class="control-label" for="llavePrivada">Llave privada (.key)*:</label>
                                    <input id="llavePrivada" name="llavePrivada" type="file">
                                </div>
                                <div class="form-group">
                                    <label class="control-label" for="fraseLlaves">Contrase&ntilde;a de clave privada*:</label>
                                    <input class="form-control" id="fraseLlaves" name="fraseLlaves" placeholder="Contrase&ntilde;a" type="password">
                                </div>
                                <div class="form-group" id="divRFC">
                                    <label class="control-label" for="rfc">R.F.C. *:</label>
                                    <input class="form-control" disabled id="rfc" placeholder="R.F.C." type="text" onkeyup="this.value = this.value.toUpperCase()" maxlength="13">
                                    <span id="errorRFC" class="help-block" ></span>
                                </div>
                                <div class="checkbox">
                                    <label>
                                      <input type="checkbox" id="checkPrivacidad">
                                      He leído y acepto el aviso de privacidad
                                    </label>
                                </div>
                                <div id="error" style="display: none;">
                                    <span style="color: red">Datos incorrectos, verifique e inténtelo de nuevo.</span>
                                </div>
                                <div id="error2" style="display: none;">
                                    <span style="color: red">El usuario no cuenta con un trámite activo.</span>
                                </div>
                                <div id="error3" style="display: none;">
                                    <span style="color: red">El usuario ya ha iniciado sesi&oacute;n en otro lugar.</span>
                                </div>
                                <div id="error4" style="display: none;">
                                    <span style="color: red">Problema al ingresar,verifique su conexión a Internet.</span>
                                </div>
                                <div id="error5" style="display: none;">
                                    <span style="color: red">Debe aceptar el aviso de privacidad antes de validar su e.firma.</span>
                                </div>
                                
                            </form>
                        </div>
                        <div class="modal-footer">
                            <button class="btn btn-primary" type="button" id="firmaButton" onclick="return validateKeyPairs(event);" ><i class='fa fa-circle-o-notch fa-spin' id="loadingLlaves" style="display: none;"></i> Validar e.firma</button>
                            <button type="button" class="btn btn-default" data-dismiss="modal" id="firmarBtn">Firmar</button>
                            <button type="button" class="btn btn-default" data-dismiss="modal" id="no">Cerrar</button>
                        </div>
                        <div class="alert" style="text-align:left;padding-left: 12px;"><b>Aviso de privacidad</b>
                                    <p style="text-align:left;">La recolección de datos personales se lleva a cabo a través de .....</p>
                        </div>
                    </div><!-- /.modal-content -->
                </div><!-- /.modal-dialog -->
            </div><!-- /.modal -->
            
            <div class="modal fade" id="myModal1">
                <div class="modal-dialog" id="myModal12">
                    <div class="modal-content" id="myModal2">
                        <div class="modal-header" id="myModal3">
                            <h4 class="modal-title">POHO</h4>
                        </div>
                        <div class="modal-body">
                            <p>Aviso de privacidad</p>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
                        </div>
                    </div><!-- /.modal-content -->
                </div><!-- /.modal-dialog -->
            </div><!-- /.modal -->
            
            <div class="modal fade" id="myModalObligatorios">
                <div class="modal-dialog" id="myModal15">
                    <div class="modal-content" id="myModal6">
                        <div class="modal-header" id="myModal7">
                            <h4 class="modal-title">LEEN</h4>
                        </div>
                        <div class="modal-body">
                            <p>Verifique los datos introducidos</p>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal" id="no">Cerrar</button>
                        </div>
                    </div><!-- /.modal-content -->
                </div><!-- /.modal-dialog -->
            </div><!-- /.modal -->            
           
             </jsp:body>

</t:particularTemplate>
<script type="text/javascript">var baseURI = '${pageContext.request.contextPath}';
</script>


<script src="<c:url value="/static/js/libs/bootstrap/jquery.maphighlight.min.js" /> "></script>
<script src="<c:url value="/static/js/libs/bootstrap/imageMapResizer.min.js" /> "></script>
<script src="<c:url value="/static/js/libs/bootstrap/bootstrap-table.min.js" /> "></script>
<script src="<c:url value="/static/js/app/tramite/contratos.js" />" rel="text/javascript"></script>
<script type="text/javascript" src="<c:url value='/static/js/firma/Firma.js'/>"></script>   
   <script>
       
    function modalFirmar(){
        $('#firmarBtn').prop('disabled',true);
        $('#rfc').val("");
        $('#checkPrivacidad').prop('checked',false);
    console.log("${pageContext.request.contextPath}/FirmaController");
     $('#myModal4').modal('show');
    }
    var objFirma = new fielnet.Firma({
        //subDirectory: "/static/js/firma",
        subDirectory: "${pageContext.request.contextPath}/static/js/firma",
        ajaxAsync : true,
        controller : "${pageContext.request.contextPath}/FirmaController"
    });
    $('#firmarBtn').prop('disabled',true);
    $('#rfc').val("");
    $('#checkPrivacidad').prop('checked',false);
    console.log("${pageContext.request.contextPath}/FirmaController");
    var fileDragAndDrop = null;
    console.log("Script firma");
    objFirma.validateWebBrowser("El explorador web no tiene soporte para HTML5. El proceso de firmado no continuará");
    
    $(function() {
        console.log("Function lee certificado y llave");
        objFirma.readCertificate("certificado");
        objFirma.readPrivateKey("llavePrivada");
    });
    
    //Función que intentará abrir el par de llaves
    function validateKeyPairs(e) {
        jQuery("#loadingLlaves").show("blind");
        $('#firmaButton').prop('disabled',true);
        if (!jQuery('#checkPrivacidad').is(':checked')) {
            jQuery("#error5").show("blind");
            jQuery("#loadingLlaves").hide();
            $('#firmaButton').prop('disabled',false);
            return;
        }
        else{
            jQuery("#error5").hide();
        }
        console.log($('.checkPrivacidad:checked').val());
        //objFirma.readCertificateAndPrivateKey($("#fraseLlaves").val(),$("#fraseLlaves").val());
        console.log("Validando pares llaves");
        objFirma.validateKeyPairs($("#fraseLlaves").val(), function (result) {
            console.log(result);
            if (result.state == 0) {
                console.log("Correcto");
                decodificarCertificadoUsuario(true);
            } else {
                console.log("Fallo");
                alert(result.description);
                jQuery("#loadingLlaves").hide();
                $('#firmaButton').prop('disabled',false);
            }
        });
        //$('#solicitudRVOERevisionForm').submit();
    }
    
    function decodeCertificate() {
        objFirma.setReferencia("Decodificación de Certificado");
        objFirma.decodeCertificate({ocsp: true, tsa: {name: "NA", algorithm: fielnet.Digest.SHA1}}, function (e) {
            if (e.state == 0) {
                console.log("1");
                console.log("e.state-"+e.state);
                console.log(e);
                var nombre = e.subjectName;
                var serie = e.hexSerie;
                var vigencia = e.notBefore + " - " + e.notAfter;
                //alert("Propietario:"+nombre+" Serie:"+serie+ " Vigencia:"+vigencia);
                console.log("Propietario:"+nombre+" Serie:"+serie+ " Vigencia:"+vigencia);
            } else {
                //$("#credenciales").html("Error al decodificar certificado");
                alert("Error al decodificar certificado");
            }
        });
    }
    
    function decodificarCertificadoUsuario(bOcsp) {
        //console.log("rfcUsuario-"+rfcUsuario);
        //console.log("solicitud-"+solicitudRvoe);
        //var cadena = prompt("Referencia");
        console.log(objFirma.getCertificate());
        var cadena = "MECP940508SR2"+"-"+"12345";
        console.log("cadena-"+cadena);
        objFirma.setReferencia(cadena);
        objFirma.decodeCertificate({ocsp: (typeof bOcsp == "undefined" ? false : bOcsp), tsa: {name: "NA", algorithm: fielnet.Digest.SHA1}}, function (cert) {
            console.log(cert);
            if (cert.state == 0) {
                console.log("cert.state-"+cert.state);
                cert.transfer;
                console.log("cert.transfer-"+cert.transfer);
                console.log(cert);
                console.log("ab");
                console.log("USUARIO: " + rfcUsuario);
                console.log(JSON.stringify(cert, undefined, 4));
                console.log("RFC-"+cert.subjectRFC);
                $('#rfc').val(cert.subjectRFC);
                if(rfcUsuario != cert.subjectRFC){
                    alert("La e.firma no corresponde al usuario registrado.");
                    jQuery("#loadingLlaves").hide();
                }else{
                                    $('#firmarBtn').prop('disabled',false);
                $('#firmaButton').prop('disabled',true);
                jQuery("#loadingLlaves").hide();
                }
                //$("#contenidoModalCertificado").html("<textarea class='form-control' style='width:100%; height:500px;'>" + JSON.stringify(cert, undefined, 4) + "</textarea>");
                //$("#modalDetallesCertificado").modal();
                //alert(JSON.stringify(cert, undefined, 4) );
                //console.log("solicitudEstatus-"+solicitudEstatus);
            } else {
                alert(cert.description);
                $('#guardarIGButton').prop('disabled',true);
                $('#firmarBtn').prop('disabled',false);
                jQuery("#loadingLlaves").hide();
                $('#firmaButton').prop('disabled',false);
            }
        });
    }
    
    //Función que intentará abrir el par de llaves
    function validateKeyPairs2(e) {
        alert("aaa");
        decodificarCertificadoUsuario2(true);
    }
    
    function decodificarCertificadoUsuario2(bOcsp) {
        $('#guardarIGButton').prop('disabled',false);
        $('#firmaButton').prop('disabled',true);
    }
    
    function limpiaDatosEFirma(){
        $('#j_username').val("");
        $('#btnEnviar').prop('disabled',true);
        $('#firmaButton').prop('disabled',false);
    }
    
    function modalFirmar(){
        $('#firmarBtn').prop('disabled',true);
        $('#rfc').val("");
        $('#checkPrivacidad').prop('checked',false);
    console.log("${pageContext.request.contextPath}/FirmaController");
     $('#myModal4').modal('show');
    }

</script>