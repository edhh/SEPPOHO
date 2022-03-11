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
                <button class="btn btn-primary pull-right" type="submit" onclick="insertaAlumno()" id="btnGuardar">Buscar</button>
            </div>
             </div>
            </div>            
            
            
             <hr>
            <h2>Contratos del prestador de servicios</h2>
            <hr class="red">
            <div class="row bottom-buffer" id="resultadoLista">
                <div class="col-md-12" >
                    <div class="table-responsive" style="width:100%" id="datosCtDiv">
                        <table class="table table-responsive table-striped" name="" id="alumnosPlantel">
                              <tr>
                                <th>Año</th>
                                <th>Nivel</th>
                                <th>Número de tramite</th>                                
                                <th>Periodo del contrato</th>
                                <th>Unidad Responsable</th>
                                <th>Estatus</th>
                                <th>Firmar</th>
                                <th>Descargar</th>
                              </tr>
                              <tr>
                                <td>2020</td>
                                <td>N11</td>
                                <td>12936</td>
                                <td>01/01/2020 - 31/03/2020</td>
                                <td>711</td>
                                <td>Pendiente de firmas</td>
                                <td><button class="btn btn-primary" id="btnFirmar" onclick="modalFirmar()">Firmar</button></td>
                                <td><button class="btn btn-primary" id="btnImprimir">Descargar</button></td>
                              </tr>
                              <tr>
                                <td>2020</td>
                                <td>12956</td>
                                <td>N11</td>
                                <td>01/04/2020 - 30/06/2020</td>
                                <td>711</td>
                                <td>Pendiente de firma de autoridad</td>
                                <td><button class="btn btn-primary" id="btnFirmar" onclick="modalFirmar()">Firmar</button></td>
                                <td><button class="btn btn-primary" id="btnImprimir"">Descargar</button></td>
                              </tr>
                              <tr>
                                <td>2020</td>
                                <td>12976</td>
                                <td>N11</td>
                                <td>01/07/2020 - 30/09/2020</td>
                                <td>711</td>
                                <td>Pendiente de firma de prestador</td>
                                <td><button class="btn btn-primary" id="btnFirmar" onclick="modalFirmar()">Firmar</button></td>
                                <td><button class="btn btn-primary" id="btnImprimir" >Descargar</button></td>
                              </tr>
                              <tr>
                                <td>2020</td>
                                <td>12998</td>
                                <td>N11</td>
                                <td>01/10/2020 - 3|/12/2020</td>
                                <td>711</td>
                                <td>Firmado</td>
                                <td><button class="btn btn-primary" id="btnFirmar" onclick="modalFirmar()">Firmar</button></td>
                                <td><button class="btn btn-primary" id="btnImprimir" >Descargar</button></td>
                              </tr>
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
                                    <label class="control-label" for="cer">Certificado (.cer)*:</label>
                                    <input id="cer" type="file">
                                </div>
                                <div class="form-group">
                                    <label class="control-label" for="key">Llave privada (.key)*:</label>
                                    <input id="key" type="file">
                                </div>
                                <div class="form-group">
                                    <label class="control-label" for="password">Contrase&ntilde;a de clave privada*:</label>
                                    <input class="form-control" id="password" placeholder="Contrase&ntilde;a" type="password">
                                </div>
                                <div class="form-group" id="divRFC">
                                    <label class="control-label" for="rfc">R.F.C. *:</label>
                                    <input class="form-control" disabled id="rfc" placeholder="R.F.C." type="text" onkeyup="this.value = this.value.toUpperCase()" maxlength="13">
                                    <span id="errorRFC" class="help-block" ></span>
                                </div>
                                <div class="checkbox">
                                    <label>
                                      <input type="checkbox">
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
                                
                            </form>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal" id="si">Firmar</button>
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