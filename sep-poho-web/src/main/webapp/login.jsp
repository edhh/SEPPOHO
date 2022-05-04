<%@page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.jar.Attributes"%>
<%@page import="java.util.jar.Manifest"%>
<%@page import="java.io.InputStream"%>

<!-- v 2.0.6 -->
<%! String impVersion = "";%>  
<%
    try {
        ServletContext context = getServletConfig().getServletContext();
        InputStream inputStream = context.getResourceAsStream("/META-INF/MANIFEST.MF");
        Manifest manifest = new Manifest(inputStream);
        Attributes attributes = manifest.getMainAttributes();
        impVersion = attributes.getValue("Build-Time");
    } catch (Exception ex) {
        impVersion = "No se obtuvo fecha y hora de compilaci&oacute;n";
    }
      //request.setAttribute("timeBuild", impVersion); 
%>

<t:loginTemplate>
    <jsp:attribute name="paginaTitulo">
        Portal de Honorarios
    </jsp:attribute>
    <jsp:attribute name="scripts">
    </jsp:attribute>
    <jsp:body>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <div class="container">
            <div class="row">
                <div class="col-md-8">
                    <h3>Portal de Honorarios</h3>
                        <hr class="red">
                        
                        <div>
                            <p>Para acceder al portal ingresa tu e.firma.</p>
                        </div>
                        </div>
                        </div>

                        <div id="login" class="col-sm-10">

                            <br>
                            <form id="command" role="form" class="form-horizontal bottom-buffer"
                                  role="form" id="frmLogin" action="j_spring_security_check"
                                  method="post">
                                <div class="row">
                                    
					<div class="col-md-5">
						<label for="selEntidad">Certificado (.cer)<span class="form-text">*</span>:</label>
					</div>
				
                                </div>
                                <div class="row"> 
                                   <div class="col-md-5">
                                        <input class="form-control" id="cer" placeholder="Ubicación del certificado" name="key" readonly="">
                                    </div>
                                    <div class="col-md-5">
                                        <div id="fileCer" class="btn btn-default">
                                            Buscar
                                        </div>
                                        <div style="height: 0px; width: 0px; overflow: hidden;"><div style="height: 0px; width: 0px; overflow: hidden;"><input type="file" name="idFileCer" id="idFileCer" accept=".cer"></div></div>
                                        <!-- 
                                        <input  type="file" style="display: none"/> -->
                                    </div>
                                </div>
                                                                
                                <div class="row">
                                    <div class="col-md-5">
                                    <label class="control-label" for="llavePrivada">Clave privada (.key)*:</label>
                                    </div>
                                </div>
                                
                                <div class="row"> 
                                    <div class="col-md-5">
                                        <input class="form-control" id="key" placeholder="Ubicaci&oacute;n de la clave privada" name="key" readonly="">
                                    </div>
                                    <div class="col-md-5">
                                        <div id="fileKey" class="btn btn-default">
                                            Buscar
                                        </div>
                                        <div style="height: 0px; width: 0px; overflow: hidden;"><div style="height: 0px; width: 0px; overflow: hidden;"><input type="file" name="idFileKey" id="idFileKey" accept=".key"></div></div>
                                        <!-- 
                                        <input  type="file" style="display: none"/> -->
                                    </div>
                                </div>
                                
                                <div class="row">
                                    <div class="col-md-5">
                                    <label class="control-label" for="fraseLlaves">Contrase&ntilde;a de clave privada*:</label>
                                    </div>
                                    </div>
                                <div class="row">
                                    <div class="col-md-5">
                                    <input class="form-control" id="fraseLlaves" name="fraseLlaves" placeholder="Contrase&ntilde;a" type="password">
                                    </div>
                                </div>
                                <div class="row" id="divRFC">
                                    <div class="col-md-5">
                                    <label class="control-label" for="j_username">RFC*:</label>
                                    </div>
                                    </div>
                                <div class="row">
                                    <div class="col-md-5">
                                    <input class="form-control" id="j_username" name="j_username" placeholder="RFC" type="text" onkeyup="this.value = this.value.toUpperCase()" maxlength="13">
                                    <span id="errorRFC" class="help-block" ></span>
                                </div>
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
                                    <span style="color: red">El usuario se encuentra inhabilitado.</span>
                                </div>
                                <div id="error3" style="display: none;">
                                    <span style="color: red">El usuario ya ha iniciado sesi&oacue;n en otro lugar.</span>
                                </div>
                                <div id="error4" style="display: none;">
                                    <span style="color: red">Problema al ingresar,verifique su conexión a Internet.</span>
                                </div>
                                <div id="error5" style="display: none;">
                                    <span style="color: red">Debe aceptar el aviso de privacidad antes de validar su e.firma.</span>
                                </div>
                                <br>
                                <div>
                                    <p>(*) Campos obligatorios </p>
                                </div>
                                <div class="form-group pull-right">
                                <button class="btn btn-primary" type="button" id="firmaButton" onclick="return validateKeyPairs(event);" ><i class='fa fa-circle-o-notch fa-spin' id="loadingLlaves" style="display: none;"></i> Validar e.firma</button>
                                        &nbsp;
                                
                                        
                                    <button class="btn btn-default pull-right" type="button" id="btnEnviar" ><i class='fa fa-circle-o-notch fa-spin' id="loadingEntrar" style="display: none;"></i> Ingresar</button>
                                        <button class="btn btn-default pull-right" type="submit" style="display:none" id="btnSubmit"></button>
                                </div>
                                
                            </form>
                            <br>
                                <div class="alert alert-info bottom-buffer">
                                <strong>Aviso de privacidad</strong>
                                <p>
                                    La recolección de datos personales se lleva a cabo a través de la página electrónica www.gob.mx/cedulaprofesional cuyo administrador y responsable del tratamiento es la Dirección General de Profesiones de la Secretaría de Educación Pública. Los datos personales que se recaban serán utilizados con la finalidad de generar y obtener el registro de título profesional y expedición de cédula profesional.
                                    <br>
                                    Si deseas conocer nuestro aviso de privacidad integral, lo podrás consultar en el portal: 
                                    <br>
                                    <a href ="http://www.sep.gob.mx/actualiza/aviso.html"> www.sep.gob.mx/actualiza/aviso.html </a>
                                </p>
                                </div>
                        </div>
                </div>
                <div class="col-md-8 text-right">
                    <!-- TESTING -->
                    <!--<h6 id="title" align="center">versi&oacute;n 2.27</h6>-->
                    <!-- PRODUCCION -->
                    <h6 id="title">versi&oacute;n 2.0.6</h6>
                </div>
            </jsp:body>
        </t:loginTemplate>
        <script type="text/javascript" src="<c:url value='/static/js/libs/jquery/jquery-cookie-min.js'/>"></script> 

        <script>
            
            jQuery(document).ready(function () {
                jQuery('#recordarme').click(function () {
                    crearCookieRecordame();
                });
               
                verificarCookieRecordarme();

            <c:if test="${param.authfailed == true}" >
                var messageException = "<c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}"/>";
                jQuery("#loadingEntrar").hide();
                //$('#btnEnviar').prop('disabled',false);
                if ("Bad credentials" === messageException) {
                    jQuery("#error").show("blind");
                } else if ("User is disabled" === messageException) {
                    jQuery("#error2").show("blind");
                } else if ("Maximum sessions of 1 for this principal exceeded" === messageException) {
                    jQuery("#error3").show("blind");
                } else {
                    jQuery("#error4").show("blind");
                }
            </c:if>
                jQuery("#btnEnviar").click(function () {
                    crearCookieRecordame();
                    jQuery("#btnSubmit").click();
                    jQuery("#loadingEntrar").show("blind");
                    $('#btnEnviar').prop('disabled',true);
                    console.log("BOTN ENTRAR");
                });

                jQuery('#j_username').keypress(function (e) {
                    var key = e.which;
                    if (key == 13) {
                        console.log("Enviado");
                        jQuery("#btnEnviar").click();
                        return false;
                    }
                });

                jQuery('#j_password').keypress(function (e) {
                    var key = e.which;
                    if (key == 13) {
                        jQuery("#btnEnviar").click();
                        return false;
                    }
                });
            });

            function verificarCookieRecordarme() {
                var recordarme = getCookie('recordarme');
                if (recordarme == 'true')
                {
                    var rfc = getCookie('rfc-rvoe');
                    var password = getCookie('password-rvoe');

                    jQuery('#j_username').val(rfc);
                    jQuery('#j_password').val(password);
                    jQuery('#recordarme').attr("checked", "checked");

                } else
                {

                }
            }

            function crearCookieRecordame() {
                if (jQuery('#recordarme').is(':checked')) {
                    var rfc = jQuery('#j_username').val();
                    var password = jQuery('#j_password').val();
                    var diasExpiracion = 14;

                    setCookie('rfc-rvoe', rfc, diasExpiracion);
                    setCookie('password-rvoe', password, diasExpiracion);
                    setCookie('recordarme', true, diasExpiracion);
                }
                else
                {
                    setCookie('rfc-rvoe', "", -1);
                    setCookie('password-rvoe', "", -1);
                    setCookie('recordarme', "", -1);
                }
            }

            function setCookie(cname, cvalue, exdays) {
                var d = new Date();
                d.setTime(d.getTime() + (exdays * 24 * 60 * 60 * 1000));
                var expires = "expires=" + d.toUTCString();
                document.cookie = cname + "=" + cvalue + ";" + expires + ";path=/";
            }

            function getCookie(cname) {
                var name = cname + "=";
                var decodedCookie = decodeURIComponent(document.cookie);
                var ca = decodedCookie.split(';');
                for (var i = 0; i < ca.length; i++) {
                    var c = ca[i];
                    while (c.charAt(0) == ' ') {
                        c = c.substring(1);
                    }
                    if (c.indexOf(name) == 0) {
                        return c.substring(name.length, c.length);
                    }
                }
                return "";

            }


        </script>
   <script type="text/javascript" src="<c:url value='/static/js/firma/Firma.js'/>"></script>   
   <script>
    var objFirma = new fielnet.Firma({
        //subDirectory: "/static/js/firma",
        subDirectory: "${pageContext.request.contextPath}/static/js/firma",
        ajaxAsync : true,
        controller : "${pageContext.request.contextPath}/FirmaController"
    });
    initEfirma();
    $("#btnFirma_cer").on("change", function () {
        console.log($_cer);
    $_cer = this.files[0];
    $cer.val($_cer.name);
    });
    $('#btnEnviar').prop('disabled',true);
    $('#j_username').val("");
    $('#checkPrivacidad').prop('checked',false);
    $('#loadingLlaves'). prop('styler','display:none;');
    console.log("${pageContext.request.contextPath}/FirmaController");
    var fileDragAndDrop = null;
    console.log("Script firma");
    objFirma.validateWebBrowser("El explorador web no tiene soporte para HTML5. El proceso de firmado no continuará");
    
    $(function() {
        console.log("Function lee certificado y llave");
        objFirma.readCertificate("idFileCer");
        objFirma.readPrivateKey("idFileKey");
    });
    
    //Función que intentará abrir el par de llaves
    function validateKeyPairs(e) {
        jQuery("#loadingLlaves").show("blind");
        $('#firmaButton').prop('disabled',true);
        console.log($("#certificado").val());
        if (($("#certificado").val() == '')){
            //jQuery("#error5").show("blind");
            alert("Ingrese el certificado");
            return;
        }
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
    
            function initEfirma() {
        console.log("inicializando las variables de la e.firma...");
        var wrapper = $('<div/>').css({height: 0, width: 0, 'overflow': 'hidden'});
        var fileInput = $('#idFileCer').wrap(wrapper);
        $('#cer').val(null);
        $('#key').val(null);

        fileInput.change(function () {
            $this = $(this);
            $('#cer').val($this.val().substring(12));
            console.log($this.val());
        });

        $('#fileCer').click(function () {
            fileInput.click();
        }).show();

        var wrapperKey = $('<div/>').css({height: 0, width: 0, 'overflow': 'hidden'});
        var fileInputKey = $('#idFileKey').wrap(wrapperKey);

        fileInputKey.change(function () {
            $this = $(this);
            $('#key').val($this.val().substring(12));
        });

        $('#fileKey').click(function () {
            fileInputKey.click();
        }).show();

        //$('#confirmarTramite').prop('disabled', true);
    }
    
    function decodificarCertificadoUsuario(bOcsp) {
        //console.log("rfcUsuario-"+rfcUsuario);
        //console.log("solicitud-"+solicitudRvoe);
        //var cadena = prompt("Referencia");
        console.log(objFirma.getCertificate());
        var cadena = "MECP940508SR2"+"-"+"12345";
        console.log("cadena-"+cadena);
        //$('#firmaButton' ).append( "<i class='fa fa-circle-o-notch fa-spin'></i>" );
        objFirma.setReferencia(cadena);
        objFirma.decodeCertificate({ocsp: (typeof bOcsp == "undefined" ? false : bOcsp), tsa: {name: "NA", algorithm: fielnet.Digest.SHA1}}, function (cert) {
            console.log(cert);
            if (cert.state == 0) {
                console.log("cert.state-"+cert.state);
                cert.transfer;
                console.log("cert.transfer-"+cert.transfer);
                console.log(cert);
                console.log("ab");
                console.log(JSON.stringify(cert, undefined, 4));
                console.log("RFC-"+cert.subjectRFC);
                $('#j_username').val(cert.subjectRFC);
                $('#btnEnviar').prop('disabled',false);
                $('#firmaButton').prop('disabled',true);
                jQuery("#loadingLlaves").hide();
                //if(rfcUsuario != cert.subjectRFC){
                //    alert("La e.firma no corresponde al usuario registrado.");
                //}else{
                //    $('#guardarIGButton').prop('disabled',false);
                //    $('#firmaButton').prop('disabled',true);
                //}
                //$("#contenidoModalCertificado").html("<textarea class='form-control' style='width:100%; height:500px;'>" + JSON.stringify(cert, undefined, 4) + "</textarea>");
                //$("#modalDetallesCertificado").modal();
                //alert(JSON.stringify(cert, undefined, 4) );
                //console.log("solicitudEstatus-"+solicitudEstatus);
            } else {
                alert(cert.description);
                $('#guardarIGButton').prop('disabled',true);
                $('#firmaButton').prop('disabled',false);
                jQuery("#loadingLlaves").hide();
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

</script>
