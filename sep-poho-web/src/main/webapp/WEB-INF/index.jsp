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
<%@taglib prefix="x" uri="http://www.springframework.org/tags"%>
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

            <h4>Búsqueda</h4>
            <hr class="red">
            <div>
                <p>Selecciona el año de contrato que quieras consultar.</p>
            </div>
            
             <div class="row">
                <div class="form-group">
                    <div class="col-md-2" id="cctAluDiv">
                        <label class="control-label" for="anio">Año de contrato*:</label>
                        <select class="form-control"  id="anio">
                            <option>Selecciona </option>
                         </select>
                        <!--input class="form-control" id="cCenTrab" placeholder="Centro de Trabajo" type="text" value="" disabled onkeyup="this.value = this.value.toUpperCase()"-->
                        <span id="errorAnio" class="help-block" ></span>
                    </div>
                </div>
             </div>
             
            <div>
                <p>(*) Campos obligatorios </p>
            </div>
             <div class="row">
             <div class="form-group pull-right">
                 <button class="btn btn-default" type="button" onclick="limpiaGrid()" id="btnLimpiar"><i style="display: none;"></i> Limpiar</button>
                 &nbsp;
                 <button class="btn btn-primary" type="submit" onclick="obtieneContratos(event)" id="btnGuardar"><i class='fa fa-circle-o-notch fa-spin' id="loadingBuscar" style="display: none;"></i> Buscar</button>
                
                
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
            
            

            <div class="modal fade" id="myModal4">
                <div class="modal-dialog  modal-lg" id="myModal15">
                    <div class="modal-content" id="myModal6">
                        <div class="modal-header" id="myModal7">
                            <h4 class="modal-title">Firma de contrato</h4>
                        </div>
                        <div class="modal-body">
                            <div class="alert alert-success" id="alertaExito">
                                <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                <p>El contrato se ha firmado exitosamente.</p>
                            </div>
                            <div class="alert alert-danger" id="alertaError">
                                <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                <p>El contrato ya ha sido firmado previamente.</p>
                            </div>
                            <div class="alert alert-danger" id="alertaErrorEstatus">
                                <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                <p>El contrato no es apto para firma debido a su estatus.</p>
                            </div>
                            <div id="errorLog" tabindex="0" class="row col-md-12">
                                <div class="alert alert-danger" id="errorDiv" tabindex="1" style="display:none">
                                    <s:property value="error" escapeHtml="false"/>         						
                                </div>
                                <div class="alert alert-warning" id="warningDiv" tabindex="2" style="display:none">
                                    <s:property value="warning"  escapeHtml="false"/>
                                </div>
                            </div>
                            <form role="form">
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
                                <div id="error5" style="display: none;">
                                    <span style="color: red">Es necesario ingresar el certificado.</span>
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
                                <div id="error6" style="display: none;">
                                    <span style="color: red">Es necesario ingresar la clave privada.</span>
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
                                    <div class="col-md-5">
                                        <button class="btn btn-primary" type="button" id="firmaButton" onclick="return validateKeyPairs(event);" ><i class='fa fa-circle-o-notch fa-spin' id="loadingLlaves" style="display: none;"></i> Validar</button>
                                        <div style="height: 0px; width: 0px; overflow: hidden;"><div style="height: 0px; width: 0px; overflow: hidden;"></div></div>
                                    </div>
                                </div>
                                <div id="error7" style="display: none;">
                                    <span style="color: red">Es necesario ingresar la contrase&ntilde;a de la clave privada.</span>
                                </div>
                                <div class="row" id="divRFC">
                                    <div class="col-md-5">
                                    <label class="control-label" for="j_username">RFC*:</label>
                                    </div>
                                    </div>
                                <div class="row">
                                    <div class="col-md-5">
                                    <input class="form-control" disabled id="rfc" name="rfc" placeholder="RFC" type="text" onkeyup="this.value = this.value.toUpperCase()" maxlength="13">
                                    <span id="errorRFC" class="help-block" ></span>
                                </div>
                                    </div>
                                 <div class="row">
                                <div class="col-md-10">
                                <div class="checkbox">
                                    <label>
                                      <input type="checkbox" id="checkPrivacidad">
                                      He leído y acepto el aviso de privacidad
                                    </label>
                                </div>
                                    </div>
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
                                <div id="error8" style="display: none;">
                                    <span style="color: red">Debe aceptar el aviso de privacidad antes de validar su e.firma.</span>
                                </div>
                                <div>
                                    <p>(*) Campos obligatorios </p>
                                </div>
                            </form>
                            <br>
                                <div class="alert alert-info bottom-buffer">
                                <strong>Aviso de privacidad</strong>
                                <p>
                                    La Dirección General de Recursos Humanos y Organización de la Secretaría de Educación Pública, con domicilio en Avenida Universidad No. 1200, Sector 3-1, Col. Xoco, Alcaldía Benito Juárez, C.P. 03330, utilizará sus datos personales recabados de conformidad con lo dispuesto por la Ley General de Protección de Datos Personales en Posesión de Sujetos Obligados y demás disposiciones aplicables y serán incorporados, protegidos y tratados en el Sistema de Datos Personales.
                                    <br>
                                    Usted puede acceder al aviso de privacidad integral a través de la página oficial de la Secretaría de Educación Pública: 
                                    <br>
                                    <a href ="https://www.gob.mx/cms/uploads/attachment/file/724546/AVISO_DE_PRIVACIDAD_INTEGRAL_-_DGRHYO.pdf">www.gob.mx/cms/uploads/attachment/file/724546/AVISO_DE_PRIVACIDAD_INTEGRAL_-_DGRHYO.pdf </a>
                                </p>
                                </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" onclick="return firma(event);" id="firmarBtn"><i class='fa fa-circle-o-notch fa-spin' id="firmando" style="display: none;"></i> Firmar</button>
                            <button type="button" class="btn btn-danger" data-dismiss="modal" id="no">Cerrar</button>
                        </div>
                        <div class="modal-body">
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
                            <h4 class="modal-title">POHO</h4>
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
     initEfirma();  
    function modalFirmar(){
        $('#firmarBtn').prop('disabled',true);
        $('#rfc').val("");
        $('#checkPrivacidad').prop('checked',false);
    //console.log("${pageContext.request.contextPath}/FirmaController");
     $('#myModal4').modal('show');
    }
    var objFirma = new fielnet.Firma({
        //subDirectory: "/static/js/firma",
        subDirectory: "${pageContext.request.contextPath}/static/js/firma",
        ajaxAsync : true,
        ocsp : 1,
        controller : "${pageContext.request.contextPath}/FirmaController"
    });
    $('#firmarBtn').prop('disabled',true);
    $('#rfc').val("");
    $('#checkPrivacidad').prop('checked',false);
    //console.log("${pageContext.request.contextPath}/FirmaController");
    var fileDragAndDrop = null;
    //console.log("Script firma");
    objFirma.validateWebBrowser("El explorador web no tiene soporte para HTML5. El proceso de firmado no continuará");
    
    $(function() {
        //console.log("Function lee certificado y llave");
        objFirma.readCertificate("idFileCer");
        objFirma.readPrivateKey("idFileKey");
    });
    
    //Función que intentará abrir el par de llaves
    function validateKeyPairs(e) {
        if (e.detail > 1 || e.detail === 2 || e.detail === 3) {
            //console.log("Double click");
            jQuery("#loadingLlaves").hide();
            return;
          }
        validaSesion();
        $('#warningDiv').css("display", "none");
        jQuery("#loadingLlaves").show("blind");
        $('#firmaButton').prop('disabled',true);
        if (($("#idFileCer").val() == '')|| ($("#idFileCer").val() == null)){
            jQuery("#error5").show("blind");
            jQuery("#loadingLlaves").hide();
            $('#firmaButton').prop('disabled',false);
            //alert("Ingrese el certificado");
            return;
        }
        else
            jQuery("#error5").hide();
        
        if (($("#idFileKey").val() == '')|| ($("#idFileKey").val() == null)){
            jQuery("#error6").show("blind");
            jQuery("#loadingLlaves").hide();
            $('#firmaButton').prop('disabled',false);
            //alert("Ingrese el certificado");
            return;
        }
        else
            jQuery("#error6").hide();
        
        if (($("#fraseLlaves").val() == '')|| ($("#fraseLlaves").val() == null)){
            jQuery("#error7").show("blind");
            jQuery("#loadingLlaves").hide();
            $('#firmaButton').prop('disabled',false);
            //alert("Ingrese el certificado");
            return;
        }
        else
            jQuery("#error7").hide();
        
        if (!jQuery('#checkPrivacidad').is(':checked')) {
            jQuery("#error8").show("blind");
            jQuery("#loadingLlaves").hide();
            $('#firmaButton').prop('disabled',false);
            return;
        }
        else{
            jQuery("#error8").hide();
        }
        //console.log($('.checkPrivacidad:checked').val());
        //objFirma.readCertificateAndPrivateKey($("#fraseLlaves").val(),$("#fraseLlaves").val());
        //console.log("Validando pares llaves");
        objFirma.validateKeyPairs($("#fraseLlaves").val(), function (result) {
            //console.log(result);
            if (result.state == 0) {
                decodificarCertificadoUsuario(true);
            } else {
                //alert(result.description);
                jQuery("#loadingLlaves").hide();
                $('#firmaButton').prop('disabled',false);
                $('#warningDiv').html(result.description);
                $('#warningDiv').css("display", "block");
                document.getElementById('errorLog').focus();
            }
        });
        //$('#solicitudRVOERevisionForm').submit();
    }
    
    
    function decodificarCertificadoUsuario(bOcsp) {
        //console.log("rfcUsuario-"+rfcUsuario);
        //console.log("solicitud-"+solicitudRvoe);
        //var cadena = prompt("Referencia");
        //console.log(objFirma.getCertificate());
        var cadena = "MECP940508SR2"+"-"+"12345";
        //console.log("cadena-"+cadena);
        objFirma.setReferencia(cadena);
        objFirma.decodeCertificate({ocsp: (typeof bOcsp == "undefined" ? false : bOcsp), tsa: {name: "NA", algorithm: fielnet.Digest.SHA1}}, function (cert) {
            //console.log(cert);
            if (cert.state == 0) {
                //console.log("cert.state-"+cert.state);
                cert.transfer;
                //console.log("cert.transfer-"+cert.transfer);
                //console.log(cert);
                //console.log("ab");
                //console.log("USUARIO: " + rfcUsuario);
                //console.log(JSON.stringify(cert, undefined, 4));
                //console.log("RFC-"+cert.subjectRFC);
                $('#rfc').val(cert.subjectRFC);
                if(rfcUsuario != cert.subjectRFC){
                    alert("La e.firma no corresponde al usuario registrado.");
                    jQuery("#loadingLlaves").hide();
                    $('#firmarBtn').prop('disabled',true);
                    //firma();
                }else{
                                    $('#firmarBtn').prop('disabled',false);
                $('#firmaButton').prop('disabled',true);
                jQuery("#loadingLlaves").hide();
                //firma();
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
    
 
    function firma(e){
        if (e.detail === 2) {
            //console.log("Double click");
            jQuery("#firmando").hide();
            return;
          }
          validaSesion();
          console.log("Estatus a firmar: " + estatusTramiteFirmar);
          if(estatusTramiteFirmar != 1902){
              jQuery("#firmando").hide();
              jQuery("#alertaErrorEstatus").show("blind");
              $('#firmarBtn').prop('disabled',false);
              return;
          }
        jQuery("#alertaError").hide();
        jQuery("#alertaErrorEstatus").hide();
        jQuery("#firmando").show("blind");
        $('#firmarBtn').prop('disabled',true);
        //console.log(cadenaOriginal);
        objFirma.signPKCS1(cadenaOriginal,fielnet.Digest.SHA1,fielnet.Encoding.UTF8,{ocsp:true,tsa:{name:'NA', algorithm:0},nom:{name:'NA'}},function(e){
            if (e.state == 0) {
                //console.log("FIRMADO EXITOSO");
                console.log(e);
            var strCommonName = e.cn;
            var strFechaProceso = e.tsaMoment;
            var strHexSerie = e.hexSerie;
            var strSign = e.sign;
            var iTransfer = e.transfer;
            //objectFirmaPrestador.fhFirmaP = e.tsaMoment;
            objectFirmaPrestador.nombreFirmanteP = e.cn;
            objectFirmaPrestador.nuSerieFirmanteP = e.hexSerie;
            objectFirmaPrestador.firmaP = e.sign;
            objectFirmaPrestador.tsaP = e.tsaMoment;
            //objectFirmaPrestador.curpFirmanteP = e.subjectCurp;
            //console.log("FIRMADO EXITOSO!!!!");
            //console.log(objectFirmaPrestador);
            guardaDatosFirma(objectFirmaPrestador);
            }
            else {
                jQuery("#firmando").hide();
                $('#firmarBtn').prop('disabled',false);
                //console.log(e);
            alert(e.description);
            }
        });
    }
    
    function guardaDatosFirma(datosContrato){


        $.ajax({
            type: "POST",
            contentType: "application/json; charset=UTF-8",
            url: baseURI + "/mvc/tramite/datosFirmaPrestador",
            data: JSON.stringify(datosContrato),
            dataType: 'json',
            timeout: 100000,
            success: function (data) {
                if (data !== null) {
                    if(data == 1){
                        jQuery("#firmando").hide();
                        jQuery("#alertaExito").show("blind");
                        $('#firmarBtn').prop('disabled',true);
                        obtieneContratos();
                        //console.log("Obteniendo datos grid")
                    }
                    else{
                        jQuery("#firmando").hide();
                        jQuery("#alertaError").show("blind");
                        $('#firmarBtn').prop('disabled',false);
                    }
                    //MENSAJE EXITO
                }
            },
            error: function (e, errorThrown) {
                jQuery("#firmando").hide();
                $('#firmarBtn').prop('disabled',false);
                jQuery("#alertaError").show("blind");
                //console.log("error js " + e.toString());
                //console.log("error js " + errorThrown);
            },
            done: function (e) {
                jQuery("#firmando").hide();
            }
        });
        
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
    //console.log("${pageContext.request.contextPath}/FirmaController");
     $('#myModal4').modal('show');
    }

</script>