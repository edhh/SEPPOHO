/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.poho.dao.join;

/**
 *
 * @author PabloJesusMendozaCer
 */

import java.util.List;
import mx.sep.poho.modelo.Tsh087TramitesFirmados;
import org.apache.ibatis.annotations.Param;

public interface TramitesFirmadosJoinMapper {
    
    Integer obtieneNoContratosXAnioNoTramite (@Param("annio") Integer annio, @Param("nuTramite") Integer noTramite);
    
    void guardaDatosFirma (Tsh087TramitesFirmados datosFirmaP);
    
}
