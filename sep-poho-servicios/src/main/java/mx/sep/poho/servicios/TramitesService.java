/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.poho.servicios;

import java.util.List;
import mx.sep.poho.datos.vo.ContratoVO;

/**
 *
 * @author PabloJesusMendozaCer
 */
public interface TramitesService {

    List<Integer> obtieneAnniosTramite(String rfc);
    
    List<ContratoVO> obtieneTramitesAnnio (String rfc, Integer annio);
}
