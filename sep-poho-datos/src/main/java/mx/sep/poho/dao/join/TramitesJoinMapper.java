/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.poho.dao.join;

import java.util.List;
import mx.sep.poho.datos.vo.ContratoVO;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author PabloJesusMendozaCer
 */
public interface TramitesJoinMapper {
    
    List<Integer> obtieneAnniosTramites (String rfc);
    
    List<ContratoVO> obtieneContratosXAnnio (@Param("rfc") String rfc, @Param("annio") Integer annio);
    
}
