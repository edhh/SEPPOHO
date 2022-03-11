/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.poho.servicios.impl;

import java.util.List;
import mx.sep.poho.servicios.TramitesService;
import mx.sep.poho.dao.join.TramitesJoinMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author PabloJesusMendozaCer
 */
@Service
public class TramitesServiceImpl implements TramitesService{
    
    @Autowired
    private TramitesJoinMapper tramitesJoinMapper;
    
    public List <Integer> obtieneAnniosTramite(String rfc){
        List<Integer> lstAnnios = tramitesJoinMapper.obtieneAnniosTramites(rfc);
        return lstAnnios;
        
    }
    
}
