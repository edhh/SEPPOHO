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

 function modalFirmar(){
     $('#myModal4').modal('show');
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
