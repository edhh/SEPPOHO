/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.poho.servicios.impl;


import java.util.List;
import mx.sep.poho.servicios.ParametrosFirmaService;
import mx.sep.poho.dao.Tsh086ParametrosFirmaMapper;
import mx.sep.poho.modelo.Tsh086ParametrosFirma;
import mx.sep.poho.modelo.Tsh086ParametrosFirmaExample;
import mx.sep.poho.servicios.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PabloJesusMendozaCer
 */
@Service
public class ParametrosFirmaServiceImpl implements ParametrosFirmaService{
    
    @Autowired
    Tsh086ParametrosFirmaMapper tsh086ParametrosFirmaMapper;
    
    public String obtieneURL (){
        Tsh086ParametrosFirmaExample tsh086Exanple = new Tsh086ParametrosFirmaExample();
        tsh086Exanple.createCriteria().andCparametroFirmaEqualTo(Constants.URL_FIRMA);
        List<Tsh086ParametrosFirma> tsh086 = tsh086ParametrosFirmaMapper.selectByExample(tsh086Exanple);
        System.out.println("URL: "+ tsh086.get(0).getCvalorParametroFirma());
        return tsh086.get(0).getCvalorParametroFirma();
    }
    
    public String obtieneEntidad (){
        Tsh086ParametrosFirmaExample tsh086Exanple = new Tsh086ParametrosFirmaExample();
        tsh086Exanple.createCriteria().andCparametroFirmaEqualTo(Constants.ENTIDAD_FIRMA);
        List<Tsh086ParametrosFirma> tsh086 = tsh086ParametrosFirmaMapper.selectByExample(tsh086Exanple);
        System.out.println("ENTIDAD: "+ tsh086.get(0).getCvalorParametroFirma());
        return tsh086.get(0).getCvalorParametroFirma();
    }
    
    public String obtienePassword (){
        Tsh086ParametrosFirmaExample tsh086Exanple = new Tsh086ParametrosFirmaExample();
        tsh086Exanple.createCriteria().andCparametroFirmaEqualTo(Constants.PASSWORD_FIRMA);
        List<Tsh086ParametrosFirma> tsh086 = tsh086ParametrosFirmaMapper.selectByExample(tsh086Exanple);
        System.out.println("PASS: "+ tsh086.get(0).getCvalorParametroFirma());
        return tsh086.get(0).getCvalorParametroFirma();
    }
    
    public String obtieneNombreTSA (){
        Tsh086ParametrosFirmaExample tsh086Exanple = new Tsh086ParametrosFirmaExample();
        tsh086Exanple.createCriteria().andCparametroFirmaEqualTo(Constants.TSA_NAME_FIRMA);
        List<Tsh086ParametrosFirma> tsh086 = tsh086ParametrosFirmaMapper.selectByExample(tsh086Exanple);
        System.out.println("TSA: "+ tsh086.get(0).getCvalorParametroFirma());
        return tsh086.get(0).getCvalorParametroFirma();
    }
    
    public String obtieneAlgoritmoTSA (){
        Tsh086ParametrosFirmaExample tsh086Exanple = new Tsh086ParametrosFirmaExample();
        tsh086Exanple.createCriteria().andCparametroFirmaEqualTo(Constants.TSA_ALGORITHM_FIRMA);
        List<Tsh086ParametrosFirma> tsh086 = tsh086ParametrosFirmaMapper.selectByExample(tsh086Exanple);
        return tsh086.get(0).getCvalorParametroFirma();
    }
    
    public String obtieneAlgoritmoOCSP (){
        Tsh086ParametrosFirmaExample tsh086Exanple = new Tsh086ParametrosFirmaExample();
        tsh086Exanple.createCriteria().andCparametroFirmaEqualTo(Constants.OCSP_ALGORITHM_FIRMA);
        List<Tsh086ParametrosFirma> tsh086 = tsh086ParametrosFirmaMapper.selectByExample(tsh086Exanple);
        return tsh086.get(0).getCvalorParametroFirma();
    }
}
