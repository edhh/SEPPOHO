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
import mx.sep.poho.modelo.Tsh82ConfigModeloContrato;
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
    
        @RequestMapping(value = "/repContrato", method = RequestMethod.GET)
    public ModelAndView reporteContrato(ModelMap modelMap,HttpServletResponse response, HttpServletRequest request, @RequestParam("noTramite") Integer noTramite)throws WriterException, IOException, Exception {
        Map model = new HashMap();
        try{
            List<Tsh003Tramite> contratoLst = tramitesService.obtieneContratosXnumTramite(noTramite);
            if(contratoLst.isEmpty() || contratoLst.size() == 0){
                return null;
            }
            Tsh003Tramite contrato = contratoLst.get(0); 
            Tsh82ConfigModeloContrato modeloContrato = tramitesService.obtieneNombreReporte(contrato.getAnnio().shortValue(), contrato.getFhIni(), contrato.getCveUnidad());
            if(modeloContrato.getId() == null){
                return null;
            }
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
            File jasperFile = new File ("/WEB-INF/classes/mx/sep/poho/reportes/ModeloContrato_01032022_SC.jrxml");
            //jasperFile.delete();
            //System.out.println(jasperFile.length());
            //System.out.println(jasperFile.getName());
            //DiskFileItem fileItem = new DiskFileItem("file", "text/plain", false, jasperFile.getName(), (int) jasperFile.length() , jasperFile.getParentFile());
            //fileItem.getOutputStream();
            //MultipartFile multipartFile = new CommonsMultipartFile(fileItem);
            //byte[] objJasper = multipartFile.getBytes();
            System.out.println(jasperFiles);
            FileUtils.writeByteArrayToFile(new File("C:\\Users\\PabloJesusMendozaCer\\Documents\\GitHub\\SEPPOHO\\sep-poho-web\\target\\sep-poho-web\\WEB-INF\\classes\\mx\\sep\\poho\\reportes\\ModeloContrato_01032022_SC_clon.jasper"), jasperFiles);
            //TimeUnit.SECONDS.sleep(5);
        }
        catch(Exception  e){
            System.out.println(e);
        }
        File jasperFile2 = new File ("C:\\Users\\PabloJesusMendozaCer\\Documents\\GitHub\\SEPPOHO\\sep-poho-web\\target\\sep-poho-web\\WEB-INF\\classes\\mx\\sep\\poho\\reportes\\ModeloContrato_01032022_SC_clon.jasper");
        System.out.println("SE LLENA EL OBJETO");
        List<DatosContratoVO> lstDatosContrato = new ArrayList<DatosContratoVO>();
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
        lstDatosContrato.add(datosContrato);
        JRBeanCollectionDataSource jrbean = new JRBeanCollectionDataSource(lstDatosContrato);
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
        
        
        //JasperReport jasperReport = 
        System.out.println("Se obtiene el jasper de la ruta especificada");
        //InputStream jasperStream = this.getClass().getResourceAsStream(new File("C:\\Users\\PabloJesusMendozaCer\\Documents\\GitHub\\SEPPOHO\\sep-poho-web\\target\\sep-poho-web\\WEB-INF\\classes\\mx\\sep\\poho\\reportes\\ModeloContrato_01032022_SC_clon.jasper", jasperFiles));
        System.out.println("Se carga el jasper en el objeto especificado");
        JasperReport jasperReport = (JasperReport) JRLoader.loadObject(jasperFile2);
        //String pathJasperFile = "C:\\Users\\PabloJesusMendozaCer\\Documents\\GitHub\\SEPPOHO\\sep-poho-web\\target\\sep-poho-web\\WEB-INF\\classes\\mx\\sep\\poho\\reportes\\ModeloContrato_01032022_SC_clon.jasper";
        JasperPrint print = new JasperPrint();
        System.out.println("Se crea el reporte");
        print = JasperFillManager.fillReport(jasperReport,model);
        //byte[] pdfBytes = JasperExportManager.exportReportToPdf(print);
        //ModelAndView modelAndView = new ModelAndView("repContrato", model);
        System.out.println("Se retorna el model and view empty");
        //ModelAndView modelAndView = new ModelAndView();
        
        System.out.println("eNCABEZADOS DE RESPUESTA");
        response.setContentType("application/x-pdf");
        response.setHeader("Content-disposition", "inline; filename=helloWorldReport.pdf");
        final OutputStream outStream = response.getOutputStream();
        JasperExportManager.exportReportToPdfStream(print, outStream);
        
        ModelAndView modelAndView = new ModelAndView("repContrato", modelMap);
        //Cookie cookie = new Cookie("downloadRepContrato", "");
        //cookie.setPath("/");
        //response.addCookie(cookie);
        //ModelAndView modelAndView = new ModelAndView("repCredencial", modelMap);
        return modelAndView;
    }
}
