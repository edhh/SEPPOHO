/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.poho.servicios.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import mx.sep.poho.servicios.TramitesService;
import mx.sep.poho.dao.join.TramitesJoinMapper;
import mx.sep.poho.dao.Tsh82ConfigModeloContratoMapper;
import mx.sep.poho.dao.Tsh003TramiteMapper;
import mx.sep.poho.datos.vo.ContratoVO;
import mx.sep.poho.modelo.Tsh82ConfigModeloContrato;
import mx.sep.poho.modelo.Tsh82ConfigModeloContratoExample;
import mx.sep.poho.modelo.Tsh003Tramite;
import mx.sep.poho.modelo.Tsh003TramiteExample;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import mx.sep.poho.dao.Tsh087TramitesFirmadosMapper;
import mx.sep.poho.modelo.Tsh087TramitesFirmados;
import mx.sep.poho.modelo.Tsh087TramitesFirmadosExample;
import mx.sep.poho.dao.join.TramitesFirmadosJoinMapper;
import mx.sep.poho.servicios.util.Constants;

/**
 *
 * @author PabloJesusMendozaCer
 */
@Service
public class TramitesServiceImpl implements TramitesService{
    
    
    
    @Autowired
    private TramitesJoinMapper tramitesJoinMapper;
    
    @Autowired
    private Tsh82ConfigModeloContratoMapper tsh82ConfigModeloContratoMapper;
    
    @Autowired
    private Tsh087TramitesFirmadosMapper tsh087TramitesFirmadosMapper;
    
    @Autowired
    private Tsh003TramiteMapper tsh003TramiteMapper;
    
    @Autowired
    private TramitesFirmadosJoinMapper tramitesFirmadosJoinMapper;
    
    public List <Integer> obtieneAnniosTramite(String rfc){
        List<Integer> lstAnnios = tramitesJoinMapper.obtieneAnniosTramites(rfc);
        Collections.sort(lstAnnios);
        return lstAnnios;
        
    }
    
    public List<Tsh003Tramite> obtieneContratosXnumTramite (Integer noTramite){
        
        Tsh003TramiteExample ts003Example = new Tsh003TramiteExample();
        System.out.println(noTramite);
        ts003Example.createCriteria().andNuTramiteEqualTo(noTramite).andCveStatusEqualTo(1036);
        List<Tsh003Tramite> lstContratos = tsh003TramiteMapper.selectByExample(ts003Example);
        System.out.println(lstContratos);
        return lstContratos;
    }
    
    public List<ContratoVO> obtieneTramitesAnnio (String rfc, Integer annio){
        List<ContratoVO> lstContratos = tramitesJoinMapper.obtieneContratosXAnnio(rfc, annio);
        return lstContratos;
    }
    
    public Tsh82ConfigModeloContrato obtieneNombreReporte (Short annio, Date fechaIniContrato, String claveUnidad){
        Tsh82ConfigModeloContratoExample tsh82Example = new Tsh82ConfigModeloContratoExample();
        tsh82Example.createCriteria().andAnnioEqualTo(annio).andVigInicioLessThanOrEqualTo(fechaIniContrato).andVigFinalGreaterThanOrEqualTo(fechaIniContrato);
        List<Tsh82ConfigModeloContrato> lstTsh82 = tsh82ConfigModeloContratoMapper.selectByExample(tsh82Example);
        Tsh82ConfigModeloContrato modeloContrato = new Tsh82ConfigModeloContrato();
        if(!lstTsh82.isEmpty() && lstTsh82.size() != 0){
            for (Tsh82ConfigModeloContrato configModCont : lstTsh82) {
                if(configModCont.getCveUnidad().equals(claveUnidad)){
                    modeloContrato = configModCont;
                    break;
                }
                if(configModCont.getCveUnidad().equals("*")){
                    modeloContrato = configModCont;
                }
                
            }
        }
        return modeloContrato;
    }
    
    public Integer guardaDatosFirmaPrestador (Tsh087TramitesFirmados datosFirma){
        
        Integer noTramitesFirmadosPrestador = tramitesFirmadosJoinMapper.obtieneNoContratosXAnioNoTramite(datosFirma.getAnnio().intValue(), datosFirma.getNuTramite());
        if(noTramitesFirmadosPrestador == 0){
            tramitesFirmadosJoinMapper.guardaDatosFirma(datosFirma);
            tramitesJoinMapper.actualizaEstatusCveFirmantes(Constants.EN_ESPERA_FIRMA_AUTORIDAD, datosFirma.getAnnio().intValue(),datosFirma.getNuTramite());
            return 1;
        }
        else {
            return null;
        }
        //Tsh087TramitesFirmadosExample tsh087Example = new Tsh087TramitesFirmadosExample();
        //tsh087Example.createCriteria().andAnnioEqualTo(datosFirma.getAnnio()).andNuTramiteEqualTo(datosFirma.getNuTramite());
        //List<Tsh087TramitesFirmados> lstTsh087 = tsh087TramitesFirmadosMapper.selectByExample(tsh087Example);
        /*if(!lstTsh087.isEmpty() || lstTsh087.size() != 0){
            return null;
        }
        else{
            return tsh087TramitesFirmadosMapper.insert(datosFirma);
        }*/
       //return tsh087TramitesFirmadosMapper.insert(datosFirma);
    }
    
}
