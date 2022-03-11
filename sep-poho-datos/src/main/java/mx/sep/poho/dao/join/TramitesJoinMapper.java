/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.poho.dao.join;

import java.util.List;


/**
 *
 * @author PabloJesusMendozaCer
 */
public interface TramitesJoinMapper {
    
    List<Integer> obtieneAnniosTramites (String rfc);
}
