/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.poho.web.controller.reportes;

import com.google.zxing.WriterException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
import org.springframework.web.servlet.ModelAndView;
/**
 *
 * @author PabloJesusMendozaCer
 */
@Controller
@RequestMapping("/jasper")
public class JasperController {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
        @RequestMapping(value = "/repContrato", method = RequestMethod.GET)
    public ModelAndView reporteContrato(ModelMap modelMap,HttpServletResponse response, HttpServletRequest request, @RequestParam("noTramite") Long noTramite)throws WriterException, IOException, Exception {
        modelMap.put("dataSourceKey", jdbcTemplate.getDataSource());
        modelMap.put("PATH_JASPER", "WEB-INF/classes/");
        //modelMap.put("PATH_WEB", rutaSer);
        modelMap.put("pCriterio", 1);
        ModelAndView modelAndView = new ModelAndView("repContrato", modelMap);
        //Cookie cookie = new Cookie("downloadRepContrato", "");
        //cookie.setPath("/");
        //response.addCookie(cookie);
        //ModelAndView modelAndView = new ModelAndView("repCredencial", modelMap);
        return modelAndView;
    }
}
