/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.poho.web.controller.reportes;

import com.google.zxing.WriterException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Blob;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.sep.poho.datos.vo.ContratoVO;
import mx.sep.poho.modelo.Tsh003Tramite;
import mx.sep.poho.modelo.Tsh003TramiteExample;
import mx.sep.poho.dao.Tsh003TramiteMapper;
import mx.sep.poho.modelo.Tsh82ConfigModeloContrato;
import mx.sep.poho.dao.Tsh088DatosContratosDefMapper;
import mx.sep.poho.modelo.Tsh088DatosContratosDef;
import mx.sep.poho.modelo.Tsh088DatosContratosDefExample;
import mx.sep.poho.dao.Tsh087TramitesFirmadosMapper;
import mx.sep.poho.modelo.Tsh087TramitesFirmados;
import mx.sep.poho.modelo.Tsh087TramitesFirmadosExample;
import mx.sep.poho.modelo.join.DatosGeneracionContratoVO;
import mx.sep.poho.modelo.join.DatosContratoVO;
import mx.sep.poho.servicios.TramitesService;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.io.FileUtils;
import org.springframework.jdbc.core.JdbcTemplate;
//import org.dozer.DozerBeanMapper;
//import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
/**
 *
 * @author PabloJesusMendozaCer
 */
@Controller
@RequestMapping("/jasper")
public class JasperController {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Autowired
    private TramitesService tramitesService;
    
    @Autowired
    private Tsh088DatosContratosDefMapper tsh088DatosContratosDefMapper;
    
    @Autowired
    private  Tsh087TramitesFirmadosMapper tsh087TramitesFirmadosMapper;
    
    @Autowired
    private Tsh003TramiteMapper tsh003TramiteMapper;
    
        @RequestMapping(value = "/repContrato", method = RequestMethod.GET)
    public ModelAndView reporteContrato(ModelMap modelMap,HttpServletResponse response, HttpServletRequest request, @RequestParam("noTramite") Integer noTramite)throws WriterException, IOException, Exception {
        Map model = new HashMap();
        Tsh088DatosContratosDefExample tsh088Example = new Tsh088DatosContratosDefExample();
        DatosGeneracionContratoVO datosContrato = new DatosGeneracionContratoVO();
        String rutaSer = request.getSession().getServletContext()
                .getRealPath("/");
        try{
            List<Tsh003Tramite> contratoLst = tramitesService.obtieneContratosXnumTramite(noTramite);
            if(contratoLst.isEmpty() || contratoLst.size() == 0){
                return null;
            }
            Tsh003Tramite contrato = contratoLst.get(0); 
            System.out.println(contrato.getCurp());
            String nombre = contrato.getNbContratante().trim() + " " + contrato.getApPaterno().trim() + " " + contrato.getApMaterno().trim();
            System.out.println(nombre);
            Tsh82ConfigModeloContrato modeloContrato = tramitesService.obtieneNombreReporte(contrato.getAnnio().shortValue(), contrato.getFhIni(), contrato.getCveUnidad());
            if(modeloContrato.getId() == null){
                return null;
            }
            
            tsh088Example.createCriteria().andNuTramiteEqualTo(noTramite).andAnnioEqualTo(contrato.getAnnio().shortValue());
            List<Tsh088DatosContratosDef> lstDatosContrato = tsh088DatosContratosDefMapper.selectByExample(tsh088Example);
            Tsh087TramitesFirmadosExample tsh087Example = new Tsh087TramitesFirmadosExample();
            //tsh087Example.createCriteria().andAnnioEqualTo(contrato.getAnnio().shortValue()).andNuTramiteEqualTo(noTramite);
            //List<Tsh087TramitesFirmados> tsh087Lst = tsh087TramitesFirmadosMapper.selectByExample(tsh087Example);
            
            datosContrato.setAnnio(lstDatosContrato.get(0).getAnnio());
            datosContrato.setCiudadFirma(lstDatosContrato.get(0).getCiudadFirma());
            //datosContrato.setCurpContratado(tsh087Lst.get(0).getCurpFirmanteP());
            datosContrato.setCurpContratado(contrato.getCurp());
            //datosContrato.setCurpDirectorGeneral(tsh087Lst.get(0).getCurpFirmanteDg());
            //datosContrato.setCurpDirectorUR(tsh087Lst.get(0).getCurpFirmanteUr());
            datosContrato.setDescEntregables(lstDatosContrato.get(0).getDescEntregables());
            datosContrato.setDescFunciones(lstDatosContrato.get(0).getDescFunciones());
            datosContrato.setDescNacContratado(lstDatosContrato.get(0).getDescNacContratado());
            datosContrato.setDescPerfilContratado(lstDatosContrato.get(0).getDescPerfilContratado());
            datosContrato.setDomDependencia(lstDatosContrato.get(0).getDomDependencia());
            datosContrato.setDomicilioContratado(lstDatosContrato.get(0).getDomicilioContratado());
            datosContrato.setExperienciaContratado(lstDatosContrato.get(0).getExperienciaContratado());
            datosContrato.setFhFirmaContrato(lstDatosContrato.get(0).getFhFirmaContrato());
            datosContrato.setFhVigenciaFinal(lstDatosContrato.get(0).getFhVigenciaFinal());
            datosContrato.setFhVigenciaInicial(lstDatosContrato.get(0).getFhVigenciaInicial());
            //datosContrato.setFirmaDirectorGeneral(tsh087Lst.get(0).getFirmaDg());
            //datosContrato.setFirmaDirectorUr(tsh087Lst.get(0).getFirmaUr());
            //datosContrato.setFirmaPrestador(tsh087Lst.get(0).getFirmaP());
            datosContrato.setFirmaRecepRepActNombre(lstDatosContrato.get(0).getFirmaRecepRepActNombre());
            datosContrato.setFirmaRecepRepActPrefijo(lstDatosContrato.get(0).getFirmaRecepRepActPrefijo());
            datosContrato.setFirmaRecepRepActPuesto(lstDatosContrato.get(0).getFirmaRecepRepActPuesto());
            datosContrato.setFirmaRepAreaNombre(lstDatosContrato.get(0).getFirmaRepAreaNombre());
            datosContrato.setFirmaRepAreaPrefijo(lstDatosContrato.get(0).getFirmaRepAreaPrefijo());
            datosContrato.setFirmaRepAreaPuesto(lstDatosContrato.get(0).getFirmaRepAreaPuesto());
            datosContrato.setFirmaRepAreaTitulo(lstDatosContrato.get(0).getFirmaRepAreaTitulo());
            datosContrato.setFirmaRepSepNombre(lstDatosContrato.get(0).getFirmaRepSepNombre());
            datosContrato.setFirmaRepSepPrefijo(lstDatosContrato.get(0).getFirmaRepSepPrefijo());
            datosContrato.setFirmaRepSepPuesto(lstDatosContrato.get(0).getFirmaRepSepPuesto());
            datosContrato.setFirmaRepSepTitulo(lstDatosContrato.get(0).getFirmaRepSepTitulo());
            datosContrato.setImporteLetra(lstDatosContrato.get(0).getImporteLetra());
            datosContrato.setNbDepCompatibilidad(lstDatosContrato.get(0).getNbDepCompatibilidad());
            //datosContrato.setNombreContratado(tsh087Lst.get(0).getNuSerieFirmanteP());
            datosContrato.setNombreContratado(nombre);
            datosContrato.setNombreUr(lstDatosContrato.get(0).getNombreUr());
            datosContrato.setNuExhibiciones(lstDatosContrato.get(0).getNuExhibiciones());
            datosContrato.setNuTramite(noTramite);
            datosContrato.setNum2ReqCompatibilidad(lstDatosContrato.get(0).getNum2ReqCompatibilidad());
            datosContrato.setNumOfExisPzaVac(lstDatosContrato.get(0).getNumOfExisPzaVac());
            datosContrato.setNumOfResSfp(lstDatosContrato.get(0).getNumOfResSfp());
            datosContrato.setNumReqCompatiblidad(lstDatosContrato.get(0).getNumReqCompatiblidad());
            datosContrato.setOficioFhCompatiblidad(lstDatosContrato.get(0).getOficioFhCompatiblidad());
            datosContrato.setOficioFhExisPzaVac(lstDatosContrato.get(0).getOficioFhExisPzaVac());
            datosContrato.setOficioFhRespSfp(lstDatosContrato.get(0).getOficioFhRespSfp());
            datosContrato.setPartida(lstDatosContrato.get(0).getPartida());
            datosContrato.setPrefijoContratado(lstDatosContrato.get(0).getPrefijoContratado());
            datosContrato.setPrevioDefinitivo(lstDatosContrato.get(0).getPrevioDefinitivo());
            datosContrato.setPuestoCompatibilidad(lstDatosContrato.get(0).getPuestoCompatibilidad());
            datosContrato.setReqCompatibilidad(lstDatosContrato.get(0).getReqCompatibilidad());
            datosContrato.setReqIssste(lstDatosContrato.get(0).getReqIssste());
            datosContrato.setReqOfExisPzaVac(lstDatosContrato.get(0).getReqOfExisPzaVac());
            datosContrato.setReqOfRespSfp(lstDatosContrato.get(0).getReqOfRespSfp());
            datosContrato.setRfcContratado(lstDatosContrato.get(0).getRfcContratado());
            //datosContrato.setSelloDirectorGeneral(tsh087Lst.get(0).getTsaDg());
            //datosContrato.setSelloDirectorUR(tsh087Lst.get(0).getTsaUr());
            //datosContrato.setSelloPrestador(tsh087Lst.get(0).getTsaP());
            //datosContrato.setSerieDirectorGeneral(tsh087Lst.get(0).getNuSerieFirmanteDg());
            //datosContrato.setSerieDirectorUR(tsh087Lst.get(0).getNuSerieFirmanteUr());
            //datosContrato.setSeriePrestador(tsh087Lst.get(0).getNuSerieFirmanteP());
            datosContrato.setSumImBrutoRecibidos(lstDatosContrato.get(0).getSumImBrutoRecibidos());
            //datosContrato.setSuplenciaDirectorGeneral(tsh087Lst.get(0).getSuplenciaDg());
            //datosContrato.setSuplenciaDirectorUR(tsh087Lst.get(0).getSuplenciaUr());
            datosContrato.setUr(lstDatosContrato.get(0).getUr());
            //datosContrato.setCadenaOriginal(tsh087Lst.get(0).getCadenaOriginal());
            datosContrato.setBanderaPrestador("1");
            datosContrato.setLstDatos(lstDatosContrato);
            

                    
            //datosContrato = DatosGeneracionContratoVO(lstDatosContrato.get(0));
            
            /*  LECTURA Y GENERACION DEL ARCHIVO MEDIANTE UN ARRAY CHAR DE LA BD
            String path = System.getProperty("user.dir");
            System.out.println(path);
            String userDirectory = new File("").getAbsolutePath();
            System.out.println(userDirectory);
            String userDirectory2 = Paths.get("")
                .toAbsolutePath()
                .toString();
            System.out.println(userDirectory2);
            String classpath = System.getProperty("java.class.path");
            System.out.println(classpath);
            Path pdfPath = Paths.get("C:\\Users\\PabloJesusMendozaCer\\Documents\\GitHub\\SEPPOHO\\sep-poho-web\\target\\sep-poho-web\\WEB-INF\\classes\\mx\\sep\\poho\\reportes\\ModeloContrato_01032022_SC.jasper");
            byte[] jasperFiles = Files.readAllBytes(pdfPath);
            //File jasperFile = new File ("/WEB-INF/classes/mx/sep/poho/reportes/ModeloContrato_01032022_SC.jrxml");
            //jasperFile.delete();
            //System.out.println(jasperFile.length());
            //System.out.println(jasperFile.getName());
            //DiskFileItem fileItem = new DiskFileItem("file", "text/plain", false, jasperFile.getName(), (int) jasperFile.length() , jasperFile.getParentFile());
            //fileItem.getOutputStream();
            //MultipartFile multipartFile = new CommonsMultipartFile(fileItem);
            //byte[] objJasper = multipartFile.getBytes();
            System.out.println(jasperFiles);
            //FileUtils.writeByteArrayToFile(new File("C:\\Users\\PabloJesusMendozaCer\\Documents\\GitHub\\SEPPOHO\\sep-poho-web\\target\\sep-poho-web\\WEB-INF\\classes\\mx\\sep\\poho\\reportes\\ModeloContrato_01032022_SC_clon.jasper"), jasperFiles);
            //TimeUnit.SECONDS.sleep(5);
*/
        }
        catch(Exception  e){
            System.out.println(e);
        }
        //File jasperFile2 = new File ("C:\\Users\\PabloJesusMendozaCer\\Documents\\GitHub\\SEPPOHO\\sep-poho-web\\target\\sep-poho-web\\WEB-INF\\classes\\mx\\sep\\poho\\reportes\\ModeloContrato_01032022_SC_clon.jasper");
        System.out.println("SE LLENA EL OBJETO");
        /*List<DatosContratoVO> lstDatosContrato = new ArrayList<DatosContratoVO>();
        DatosContratoVO datosContrato = new DatosContratoVO();
        datosContrato.setNombreFirmaRepArea("JACOBO BELLO JOYA");
        datosContrato.setNombreContratado("PABLO JESUS MENDOZA CERON");
        datosContrato.setPuestoFirmaRepArea("DIRECTOR GENERAL DE ADMINISTRACI?N DE LA UNIDAD DEL SISTEMA PARA LA CARRERA DE LAS MAESTRAS Y LOS MAESTROS");
        datosContrato.setDescPerfinContratado("LICENCIATURA EN INFORMATICA");
        datosContrato.setDescNacionalidadContratado("MEXICANA");
        datosContrato.setRfcContratado("MECP940508SR2");
        datosContrato.setExperienciaContratado("CUANTRO A?OS ");
        datosContrato.setDomicilioContratado("PEZ SIERRA 23, LT.22 POLIGONO 02");
        datosContrato.setDescFunciones("1.- DETALLAR LAS ACTIVIDADES DIARIAS A CUBRIR POR LOS EJECUTIVOS DE INFORMACI?N Y SOPORTE T?CNICO Y GENERAR LA INFORMACI?N REQUERIDADA., 2.- COORDINA LA REDACCI?N DE LAS NOTAS, 3.- ELABORAR EL GUI?N DEL PROGRAMA");
        datosContrato.setSumaImpBrutoRecibido("25,254.76");
        datosContrato.setImporteLetra("VEINTICINCO MIL DOSCIENTOS CINCUENTA Y CUATRO PESOS 76/100 M.N");
        datosContrato.setNoExhibiciones("4");
        datosContrato.setPrevioDefinitivo("0");
        lstDatosContrato.add(datosContrato);*/
        List<DatosGeneracionContratoVO> lstDatosContrato = new ArrayList();
        lstDatosContrato.add(datosContrato);
        JRBeanCollectionDataSource jrbean = new JRBeanCollectionDataSource(lstDatosContrato);
        model.put("pRuta", rutaSer);
        model.put("lista", jrbean);
        List<Object> emptyList = new ArrayList<Object>();
        Object nothing = null;
        //emptyList.add(nothing);
        //JRBeanCollectionDataSource jRBeanCollectionDataSource = new JRBeanCollectionDataSource(emptyList,false); 
        //modelMap.put("dataSourceKey", jdbcTemplate.getDataSource());
        //modelMap.put("PATH_JASPER", "WEB-INF/classes/");
        //modelMap.put("PATH_WEB", rutaSer);
        //modelMap.put("pCriterio", 1);
        //modelMap.put("datasource", jRBeanCollectionDataSource);
        //JasperReportsCsvView view = (JasperReportsCsvView) context.getBean("csvReport");
        
        /* PRUEBAS PARA LA GENERACION Y DESCARGA DEL REPORTE DESDE LA BD
        System.out.println("Se obtiene el jasper de la ruta especificada");
        //InputStream jasperStream = this.getClass().getResourceAsStream(new File("C:\\Users\\PabloJesusMendozaCer\\Documents\\GitHub\\SEPPOHO\\sep-poho-web\\target\\sep-poho-web\\WEB-INF\\classes\\mx\\sep\\poho\\reportes\\ModeloContrato_01032022_SC_clon.jasper", jasperFiles));
        System.out.println("Se carga el jasper en el objeto especificado");
       // JasperReport jasperReport = (JasperReport) JRLoader.loadObject(jasperFile2);
        //String pathJasperFile = "C:\\Users\\PabloJesusMendozaCer\\Documents\\GitHub\\SEPPOHO\\sep-poho-web\\target\\sep-poho-web\\WEB-INF\\classes\\mx\\sep\\poho\\reportes\\ModeloContrato_01032022_SC_clon.jasper";
        JasperPrint print = new JasperPrint();
        System.out.println("Se crea el reporte");
        //print = JasperFillManager.fillReport(jasperReport,model);
        //byte[] pdfBytes = JasperExportManager.exportReportToPdf(print);
       */
        
        
        ModelAndView modelAndView = new ModelAndView("repContrato", model);
        //System.out.println("Se retorna el model and view empty");
        //ModelAndView modelAndView = new ModelAndView();
        
        //System.out.println("eNCABEZADOS DE RESPUESTA");
        //response.setContentType("application/x-pdf");
        //response.setHeader("Content-disposition", "inline; filename=helloWorldReport.pdf");
        //final OutputStream outStream = response.getOutputStream();
        //JasperExportManager.exportReportToPdfStream(print, outStream);
        
        //ModelAndView modelAndView = new ModelAndView("repContrato", modelMap);
        //Cookie cookie = new Cookie("downloadRepContrato", "");
        //cookie.setPath("/");
        //response.addCookie(cookie);
        //ModelAndView modelAndView = new ModelAndView("repCredencial", modelMap);
        return modelAndView;
    }
}
