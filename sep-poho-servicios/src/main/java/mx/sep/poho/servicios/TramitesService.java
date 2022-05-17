/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.poho.servicios;

import java.util.Date;
import java.util.List;
import mx.sep.poho.datos.vo.ContratoVO;
import mx.sep.poho.modelo.Tsh003Tramite;
import mx.sep.poho.modelo.Tsh82ConfigModeloContrato;
import mx.sep.poho.modelo.Tsh087TramitesFirmados;

/**
 *
 * @author PabloJesusMendozaCer
 */
public interface TramitesService {

    List<Integer> obtieneAnniosTramite(String rfc);
    
    List<ContratoVO> obtieneTramitesAnnio (String rfc, Integer annio);
    
    Tsh82ConfigModeloContrato obtieneNombreReporte (Short annio, Date fechaIniContrato, String claveUnidad);
    
    List<Tsh003Tramite> obtieneContratosXnumTramite (Integer noTramite);
    
    Integer guardaDatosFirmaPrestador (Tsh087TramitesFirmados datosFirma);
}
