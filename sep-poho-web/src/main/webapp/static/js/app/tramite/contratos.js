/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
window.addEventListener ?
window.addEventListener("load", obtAnniosTramites, false) :
window.attachEvent && window.attachEvent("onload", obtAnniosTramites);
var rfcUsuario = "";


    
 function validaDatos() {
        console.log("Validacion de datos requeridos");
        var rfcPattern = "^([A-ZÑ\x26]{3,4}([0-9]{2})(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])([A-Z]|[0-9]){2}([A-Z]|[0-9]){1})?$";
        var datosValidos = true;
        var rfc = $("#rfc").val();
        console.log("DATOS A VALIDAR: " + "  "+rfc);
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
                console.log(response);
                var search = {};
                search["rfc"] = response.username;
                console.log(search);
                console.log("Search antes de peticion: " +search);
                $.ajax({
                        type: "GET",
                        cache: false,
                        url: baseURI + '/mvc/tramite/anniosTramites',
                        contentType: "application/json;",
                        data : JSON.stringify(""),
                        dataType: 'json',
                        success: function(response) {
                            console.log(response);
                            console.log(response.length);
                            //drawTableGeneric(response);
                            populateSelectAnnios(response);
                        },

                        error: function(jqXHR, textStatus, errorThrown) {
                          $('#mensajesError').html('<div class="alert alert-warning">No se encontraron registros</div>').show();
                            console.log('jqXHR.status:: ' + jqXHR.status);
                            console.log('jqXHR.text:: ' + jqXHR.text);
                            console.log('textStatus:: ' + textStatus);
                        }
                    });
                    rfcUsuario = response.username;
            },
                   
            error: function(jqXHR, textStatus, errorThrown) {
              $('#mensajesError').html('<div class="alert alert-warning">No se encontraron registros</div>').show();
                console.log('jqXHR.status:: ' + jqXHR.status);
                console.log('jqXHR.text:: ' + jqXHR.text);
                console.log('textStatus:: ' + textStatus);
            }
        });
    //console.log(rfcUsuario);
    //var search = {};
    //    search["rfc"] = rfcUsuario;

}

function populateSelectAnnios(lstAnnios){
    console.log("POPULATING SELECT GRADOS");
    console.log(lstAnnios);
    document.getElementById("anio").options.length = 0;
    for (var i = 0; i <= lstAnnios.length-1; i++) {
            $('#anio').append('<option value="' + lstAnnios[i] + '">' + lstAnnios[i] + '</option>');
        }
}

function obtieneContratos(){

    //obtCT();
    //obtGrados();
    //deshabilitaBotones();
    $('#btnGuardar').prop('disabled',true);
    jQuery("#loadingBuscar").show("blind");
    console.log($("#anio").val());
    $.ajax({
            type: "GET",
            cache: false,
            url: baseURI + "/mvc/tramite/tramitesAnnios/"+$("#anio").val(),
            contentType: "application/json; charset=utf-8",
            dataType: 'json',
            success: function(response) {
                console.log(response);
                console.log(response.length);
                jQuery("#loadingBuscar").hide();
                //drawTableGeneric(response);
                if (response.length > 0) {
                    console.log('if');
                    drawTableGeneric(response);

                } else {
                    console.log('else');
                    //muestraDivMensajeError();
                }
                $('#btnGuardar').prop('disabled',false);
            },
                   
            error: function(jqXHR, textStatus, errorThrown) {
              //$('#mensajesError').html('<div class="alert alert-warning">No se encontraron registros</div>').show();
                console.log('jqXHR.status:: ' + jqXHR.status);
                console.log('jqXHR.text:: ' + jqXHR.text);
                console.log('textStatus:: ' + textStatus);
                $('#btnGuardar').prop('disabled',false);
                jQuery("#loadingBuscar").hide();
            }
        });
}

function drawTableGeneric(result) {
    console.log("RESULTADO CUANDO SE DIBUJA LA TABLA");
        console.log(result);
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
            title: 'N&uacute;mero de tramite',
            align: 'left'
        },{
            field: 'periodo',
            title: 'Periodo del contrato',
            align: 'left'
        },{
            field: 'claveUnidad',
            title: 'Unidad Responsable',
            align: 'left'
        },{
            field: 'estatus',
            title: 'Estatus',
            align: 'left'
        },{
            field: 'firmar',
            title: '',
            align: 'left',
            formatter: btnFirmar(result[0].estatus)
        },{
            field: 'descargar',
            title: '',
            align: 'left',
            formatter: btnDescargar(result[0])
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

function btnFirmar(estatus){
    console.log(estatus);
                      $('#contratosTrabajador').on('click-cell.bs.table', function (field, value, row, $el) {
                            console.log("CLICK" + value);
                            console.log($el);
                        if (value == "firmar"){
                            //alert($el.ctId"-"+$el.curp+"-"+$el.nombre);
                            console.log("Modficar");
                            $('#firmarBtn').prop('disabled',true);
                            $('#rfc').val("");
                            $('#checkPrivacidad').prop('checked',false);
                            $('#myModal4').modal('show');
                        }
                        else if(value == "descargar"){
                            console.log("DESCARGANDO");
                            var aux = {};
                            aux["noTramite"] = $el.noTramite;
                            window.document.location.href = baseURI + '/mvc/jasper/repContrato?noTramite=' + $el.noTramite;
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
    if (estatus == 6)
        return "<button type='button' class='btn btn-primary' disabled>Firmar</button>";
    else
        return "<button type='button' class='btn btn-primary'>Firmar</button>";
}

function btnDescargar(contrato){
    console.log("Btn Descargar val: "+contrato.annio);
    //var btn = document.createElement("BUTTON");
    //btn.innerHTML = "Do Something";
    //document.body.appendChild(btn); 
    /*$('#contratosTrabajador').on('click-cell.bs.table', function (field, value, row, $el) {
        console.log("CLICK" + value);
        console.log($el);
        generarContrato(contrato);
    });*/
    if (contrato.annio >= 2015)
        return "<button type='button' class='btn btn-primary' disabled>Descargar</button>";
    else{
        return "<button type='button' class='btn btn-primary'>Descargar</button>";    
    }
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
