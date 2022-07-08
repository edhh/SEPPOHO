/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
window.addEventListener ?
window.addEventListener("load", obtAnniosTramites, false) :
window.attachEvent && window.attachEvent("onload", obtAnniosTramites);
var rfcUsuario = "";
var cadenaOriginal = "";
var estatusTramiteFirmar = "";
var objectFirmaPrestador = {
    annio: "",
    nuTramite: "",
    nombreFirmanteP: "",
    curpFirmanteP: "",
    nuSerieFirmanteP: "",
    firmaP: "",
    tsaP: "",
    fhFirmaP: "",
};

$("#btnFirma_cer").on("change", function () {
    $_cer = this.files[0];
    $cer.val($_cer.name);
});
    
 function validaDatos() {
        //console.log("Validacion de datos requeridos");
        var rfcPattern = "^([A-ZÑ\x26]{3,4}([0-9]{2})(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])([A-Z]|[0-9]){2}([A-Z]|[0-9]){1})?$";
        var datosValidos = true;
        var rfc = $("#rfc").val();
        //console.log("DATOS A VALIDAR: " + "  "+rfc);
        if (rfc == "" || rfc === null || rfc.length === 0 ) {
            $("#divRFC").parent("div.form-group").addClass("has-error");
            $("#errorRFC").text('');
            $("#errorRFC").show();
            $("#errorRFC").append("Campo obligatorio");
            datosValidos = false;
            
        }       

        if (!rfc.match(rfcPattern)) {
            $("#divRFC").parent("div.form-group").addClass("has-error");
            $("#errorRFC").text('');
            $("#errorRFC").show();
            $("#errorRFC").append("El formato del R.F.C. es inv&aacute;lido");
            datosValidos = false;
        }
        return datosValidos;
 }
 
 function modalTerminos(){
                $('#myModal1').modal('show');
 }
 
 function obtAnniosTramites()
{
    var vUrl = baseURI + '/mvc/seguridad/menu/obtenerUsuario';
    //conectaPost(vUrl,"",ObtNombreUsuario);
    $.ajax({
		url : vUrl,
		type : 'POST',
		contentType : 'application/json',
		data : JSON.stringify(""),
		dataType : "json",
		cache : false,
            success: function(response) {
                //console.log(response);
                var search = {};
                search["rfc"] = response.username;
                //console.log(search);
                //console.log("Search antes de peticion: " +search);
                $.ajax({
                        type: "GET",
                        cache: false,
                        url: baseURI + '/mvc/tramite/anniosTramites',
                        contentType: "application/json;",
                        data : JSON.stringify(""),
                        dataType: 'json',
                        success: function(response) {
                            //console.log(response);
                            //console.log(response.length);
                            //drawTableGeneric(response);
                            populateSelectAnnios(response);
                        },

                        error: function(jqXHR, textStatus, errorThrown) {
                          $('#mensajesError').html('<div class="alert alert-warning">No se encontraron registros</div>').show();
                            //console.log('jqXHR.status:: ' + jqXHR.status);
                            //console.log('jqXHR.text:: ' + jqXHR.text);
                            //console.log('textStatus:: ' + textStatus);
                        }
                    });
                    rfcUsuario = response.username;
            },
                   
            error: function(jqXHR, textStatus, errorThrown) {
              $('#mensajesError').html('<div class="alert alert-warning">No se encontraron registros</div>').show();
                //console.log('jqXHR.status:: ' + jqXHR.status);
                //console.log('jqXHR.text:: ' + jqXHR.text);
                //console.log('textStatus:: ' + textStatus);
            }
        });
    //console.log(rfcUsuario);
    //var search = {};
    //    search["rfc"] = rfcUsuario;

}

function populateSelectAnnios(lstAnnios){
    //console.log("POPULATING SELECT GRADOS");
    //console.log(lstAnnios);
    document.getElementById("anio").options.length = 0;
    for (var i = 0; i <= lstAnnios.length-1; i++) {
            $('#anio').append('<option value="' + lstAnnios[i] + '">' + lstAnnios[i] + '</option>');
        }
}

function obtieneContratos(e){

    //obtCT();
    //obtGrados();
    //deshabilitaBotones();
    /*if (e.detail === 2) {
            //console.log("Double click");
            jQuery("#loadingBuscar").hide();
            return;
          }*/
    $('#btnGuardar').prop('disabled',true);
    jQuery("#loadingBuscar").show("blind");

    //console.log($("#anio").val());
    $.ajax({
            type: "GET",
            cache: false,
            url: baseURI + "/mvc/tramite/tramitesAnnios/"+$("#anio").val(),
            contentType: "application/json; charset=utf-8",
            dataType: 'json',
            success: function(response) {
                //console.log(response);
                //console.log(response.length);
                jQuery("#loadingBuscar").hide();
                //drawTableGeneric(response);
                if (response.length > 0) {
                    //console.log('if');
                    drawTableGeneric(response);

                } else {
                    //console.log('else');
                    //muestraDivMensajeError();
                }
                $('#btnGuardar').prop('disabled',false);
            },
                   
            error: function(jqXHR, textStatus, errorThrown) {
              //$('#mensajesError').html('<div class="alert alert-warning">No se encontraron registros</div>').show();
                //console.log('jqXHR.status:: ' + jqXHR.status);
                //console.log('jqXHR.text:: ' + jqXHR.text);
                //console.log('textStatus:: ' + textStatus);
                $('#btnGuardar').prop('disabled',false);
                jQuery("#loadingBuscar").hide();
                if (jqXHR.status == 200 && (jqXHR.text == '' || jqXHR.text == null)) {
                alert("La sesi\u00F3n ha sido cerrada por inactividad");

                setTimeout(function () {
                    location.href = baseURI + '/sep-poho-web/login.jsp';
                }, 10);
            }
            }
        });
}

function drawTableGeneric(result) {
    //console.log("RESULTADO CUANDO SE DIBUJA LA TABLA");
        //console.log(result);
    var columnas = [{
            field: 'annio',
            title: 'A&ntilde;o',
            align: 'left'
        },
        {
            field: 'claveNivel',
            title: 'Nivel',
            align: 'left'
        }, {
            field: 'noTramite',
            title: 'N&uacute;mero de contrato',
            align: 'left'
        },{
            field: 'periodo',
            title: 'Periodo del contrato',
            align: 'left'
        },{
            field: 'claveUnidad',
            title: 'Unidad responsable',
            align: 'left'
        },{
            field: 'estatus',
            title: 'Estatus',
            align: 'left',
            formatter : formatterEstatus
        },{
            field: 'firmar',
            title: '',
            align: 'left',
            formatter: btnFirmar
        },{
            field: 'descargar',
            title: '',
            align: 'left',
            formatter: btnDescargar
        },
        
    ]
    $('#contratosTrabajador').bootstrapTable({
        columns: columnas,
    });

    //mostrarResultados();
   ;
    $('#datosCtDiv').show();
    $('#contratosTrabajador').bootstrapTable('hideLoading');
    $('#contratosTrabajador').bootstrapTable('destroy');
    $('#contratosTrabajador').bootstrapTable({
        pagination: true,
        //paginationHAlign: 'left',
        //paginationType: 'simple',
        //pagination
        paginationDetailHAlign: 'right',
        classes: 'table table-responsive table-striped datosCt',
        striped: true,
        pageList: [],
        columns: columnas,
        //rowStyle: rowStyle,
        data: result
    });
    document.getElementById("resultadoLista").style.display = "inline";
}

function btnFirmar(estatus , row){
    console.log(row);
     //console.log("row estatus btn firmar: " + row.estatus);
                      $('#contratosTrabajador').on('click-cell.bs.table', function (field, value, row2, $el) {
                          //var text = $(event.target).text();
                          //console.log(text);
                            validaSesion();
                            //console.log($el);
                            //console.log("CLICK" + value);
                            //console.log("El: " + $el);
                            //console.log(field);
                            //console.log(row2);
                            var str = JSON.stringify(row);
                            //console.log("field = "+ str);
                        if (value == "firmar" && row.estatus == 1902 ){
                            //alert($el.ctId"-"+$el.curp+"-"+$el.nombre);
                            //console.log("Modficar");
                            estatusTramiteFirmar = row.estatus;
                            console.log(estatusTramiteFirmar);
                            cadenaOriginal = "||" + $el.annio + "|" + $el.noTramite + "|" + $el.rfc + "|" + $el.curp + "|" + $el.apPaterno + "|" + $el.apMaterno + "|" + $el.nombre + "|" + $el.fechaIniContrato + "|" + $el.fechaFinContrato + "|" + $el.claveNivel + "|" + $el.claveUnidad + "||";
                            //console.log("cadena Original: "+cadenaOriginal);
                            objectFirmaPrestador.annio = $el.annio;
                            objectFirmaPrestador.curpFirmanteP = $el.curp;
                            //objectFirmaPrestador.nombreFirmanteP = $el.nombre + " " + $el.apPaterno + " " + $el.apMaterno;
                            objectFirmaPrestador.nuTramite = $el.noTramite;
                            
                        }
                        else if(value == "descargar" && (row.estatus != 1901 && row.estatus != null && row.noTramite088 !== null && row.estatus != 1906 && row.estatus != 0)){
                            //console.log("DESCARGANDO");
                            var aux = {};
                            //aux["noTramite"] = $el.noTramite;
                            //window.document.location.href = baseURI + '/mvc/jasper/repContrato?noTramite=' + $el.noTramite;
                            
                            //
//$('#ModalGafetes').modal('hide');
                        
            /*$.ajax({
                type: "GET",
                cache: false,
                url: baseURI + "/mvc/jasper/repContrato",
                data: aux,
                contentType: "application/json; charset=utf-8",
                dataType: 'text',
                success: function (data) {
                    console.log(data);

                    //var blob = converBase64toBlob(data);

                    //var link=document.createElement('a');
                    //    link.href=window.URL.createObjectURL(blob);
                    //    link.download=aux.nombre;
                    //    link.click();

                    var blob = new Blob([data], {type: "application/pdf"});
                    var link = window.URL.createObjectURL(blob);
                    window.open(link, '', 'height=650,width=840');

                    //var pdf= window.open("");
                    //pdf.document.write("<iframe width='100%' height='100%'"+
                    //" src='"+link+"'></iframe>");           

                },
                error: function (jqXHR, textStatus, errorThrown) {
                    console.log('jqXHR.status:: ' + jqXHR.status);
                    console.log('jqXHR.text:: ' + jqXHR.text);
                    console.log('textStatus:: ' + textStatus);
                }
            });
                            //location.href = '../jasper/repContrato?idSolicitud='+$el.noTramite;
                            //$('#myModal4').modal('show');
                            //$("#myModal4 .modal-body").text('\u00BFEst\u00E1 seguro que desea eliminar el registro?');
                            //alumnoId = $el.alumnoId;
                            //eliminarAlumno($el.alumnoId);
                        */}
                    });
    //var btn = document.createElement("BUTTON");
    //btn.innerHTML = "Do Something";
    //document.body.appendChild(btn);
    if ((row.estatus != 1902))
        return "<button type='button' id = 'btnFirmar' value ='firmar' onclick='accionBtnFirma()' class='btn btn-primary' disabled>Firmar</button>";
    else
        return "<button type='button' value ='firmar' id = 'btnFirmar' onclick='accionBtnFirma()' class='btn btn-primary'>Firmar</button>";
}2

function accionBtnFirma(){
    $('#firmarBtn').prop('disabled', true);
    $('#rfc').val("");
    $('#checkPrivacidad').prop('checked', false);
    $('#myModal4').modal('show');
    jQuery("#alertaExito").hide();
    jQuery("#alertaError").hide();
    jQuery("#alertaErrorEstatus").hide();
    jQuery("#warningDiv").hide();
    $('#firmaButton').prop('disabled', false);
    $('#firmarBtn').prop('disabled', true);
    $('#rfc').val("");
    jQuery('#cer').val(null);
    jQuery('#key').val(null);
    jQuery('#fraseLlaves').val(null);
    jQuery('#idFileCer').val(null);
    jQuery('#idFileKey').val(null);
    $('#checkPrivacidad').prop('checked', false);
    
}
function btnDescargar(estatus , row){
    //console.log(estatus);
    //console.log("NU TRAMITE 088: " + row.noTramite088);
   // console.log("Btn Descargar val: "+contrato.annio);
    //var btn = document.createElement("BUTTON");
    //btn.innerHTML = "Do Something";
    //document.body.appendChild(btn); 
    /*$('#contratosTrabajador').on('click-cell.bs.table', function (field, value, row, $el) {
        console.log("CLICK" + value);
        console.log($el);
        generarContrato(contrato);
    });*/
    if (row.estatus != 1901 && row.estatus != null && row.noTramite088 !== null && row.estatus != 1906 && row.estatus != 0)
        return "<button type='button' class='btn btn-primary' onclick='accionBtnDescargar("+row.noTramite+")' value ='descargar'>Descargar</button>";
    else{
        //return "<form action='${pageContext.request.contextPath}/mvc/jasper/repContrato?noTramite='" + contrato.noTramite + "> <button class='btn btn-primary pull-right'  id='btnDescarga' type='submit' >Descargar</button></form>";
        return "<button type='button' class='btn btn-primary'  onclick='accionBtnDescargar("+row.noTramite+")' disabled value ='descargar'>Descargar</button>";    
    }
}

function accionBtnDescargar(noTramite){
    console.log(noTramite);
    var aux = {};
    aux["noTramite"] = noTramite;
    window.document.location.href = baseURI + '/mvc/jasper/repContrato?noTramite=' + noTramite;
}

function formatterEstatus(estatus , row){
    //console.log("FORMATTER ESTATUS: " + estatus);
    //console.log("FORMATTER ESTATUS: " + row.noTramite088);
    if(estatus == 1901 || estatus == null || estatus == '' || row.noTramite088 == null)
        return "SIN FIRMAS ELECTR&Oacute;NICAS";
    if (estatus == 1902)
            return "EN ESPERA DE FIRMA ELECTR&Oacute;NICA";
    if (estatus == 1903)
        return "EN ESPERA DE FIRMA DE LA AUTORIDAD";
    if (estatus == 1904)
        return "EN ESPERA DE FIRMAR ELECTR&Oacute;NICAMENTE";
    if (estatus == 1905)
        return "FIRMADO ELECTR&Oacute;NICAMENTE";
    if (estatus == 1906)
        return "PARA FIRMA AUT&Oacute;GRAFA";
    
}

/*function generarContrato(contrato) {
    var tokenVar = new Date().getTime();
    var object = {noContrato: contrato.noContrato,
        annio: contrato.annio};
    object = jsUtils.excludeNullProperties(object);
    var contentForm = dom.byId('contentForm' + aleatorio);
    var proper = {
        name: 'sendForm' + aleatorio,
        id: 'sendForm' + aleatorio,
        method: 'GET',
        action: configModule.urlBase + 'jasper/repContrato/' + tokenVar,
        target: 'hiddenIFrame' + aleatorio
    };
    var form = jsUtils.objectToForm(object, contentForm, proper);
    form.submit();
    btnExportar.set('disabled', true);
    var pollDownload = setInterval(function () {
        if (document.cookie.indexOf("downloadRepContrato=" + tokenVar) > -1) {
            document.cookie = "downloadRepContrato=" + tokenVar + "; expires=" + new Date(0).toGMTString() + "; path=/";
            btnExportar.set('disabled', false);
            clearInterval(pollDownload);
        }
    }, 500);

}*/


    function converBase64toBlob(content, contentType) {
        contentType = contentType || '';
        var sliceSize = 512;
        var byteCharacters = window.atob(content); //method which converts base64 to binary
        var byteArrays = [];
        for (var offset = 0; offset < byteCharacters.length; offset += sliceSize) {
            var slice = byteCharacters.slice(offset, offset + sliceSize);
            var byteNumbers = new Array(slice.length);
            for (var i = 0; i < slice.length; i++) {
                byteNumbers[i] = slice.charCodeAt(i);
            }
            var byteArray = new Uint8Array(byteNumbers);
            byteArrays.push(byteArray);
        }
        var blob = new Blob(byteArrays, {
            type: contentType
        }); //statement which creates the blob
        return blob;
    }
    
        function initEfirma() {
        //console.log("inicializando las variables de la e.firma...");
        var wrapper = $('<div/>').css({height: 0, width: 0, 'overflow': 'hidden'});
        var fileInput = $('#idFileCer').wrap(wrapper);
        $('#cer').val(null);
        $('#key').val(null);
        fileInput.change(function () {
            $this = $(this);
            $('#cer').val($this.val().substring(12));
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
    
    function limpiaGrid(){
        validaSesion();
        drawTableGeneric(null);
    }
    
    function validaSesion(){
            $.ajax({
            type: "POST",
            cache: false,
            url: baseURI + "/mvc/seguridad/menu/obtenerUsuario",
            contentType: "application/json; charset=utf-8",
            dataType: 'json',
            success: function(response) {
            },                   
            error: function(jqXHR, textStatus, errorThrown) {
              //$('#mensajesError').html('<div class="alert alert-warning">No se encontraron registros</div>').show();
                //console.log('jqXHR.status:: ' + jqXHR.status);
                //console.log('jqXHR.text:: ' + jqXHR.text);
                //console.log('textStatus:: ' + textStatus);
                $('#btnGuardar').prop('disabled',false);
                jQuery("#loadingBuscar").hide();
                if (jqXHR.status == 200 && (jqXHR.text == '' || jqXHR.text == null)) {
                alert("La sesi\u00F3n ha sido cerrada por inactividad");

                setTimeout(function () {
                    location.href = baseURI + '/sep-poho-web/login.jsp';
                }, 10);
            }
            }
        }); 
    }
    
