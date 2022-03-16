/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.poho.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.sep.poho.datos.vo.UsuarioVO;

import mx.sep.seguridad.modelo.ModuloMenu;
import mx.sep.seguridad.modelo.OpcionMenu;
import mx.sep.seguridad.modelo.UsuarioSeguridad;
import mx.sep.seguridad.servicios.MenuSeguridadServicio;
import mx.sep.seguridad.util.SeguridadUtil;
import mx.sep.poho.dao.Tsh003TramiteMapper;
import mx.sep.poho.modelo.Tsh003Tramite;
import mx.sep.poho.modelo.Tsh003TramiteExample;
import mx.sep.poho.servicios.TramitesService;
//import mx.sep.sidepaae.modelo.Tdp090Usuarios;
//import mx.sep.poho.servicios.configuracion.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.session.SessionInformation;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;
import org.springframework.http.HttpStatus;

/**
 *
 * @author PabloJesusMendozaCer
 */
@Controller
@RequestMapping(value = "/tramite")
public class TramitesController {
    
    final static Logger logger = LoggerFactory.getLogger(TramitesController.class);
    @Autowired
    private MenuSeguridadServicio menuSeguridadServicio;
    @Autowired
    private TramitesService tramitesService;
    
    @RequestMapping(value = "/anniosTramites", method = RequestMethod.GET)
    @ResponseBody
    public List<Integer> obtenerAnniosTramites() {
		UsuarioVO usuario = new UsuarioVO();
                List<Integer> lstAnnios = new ArrayList<Integer>();
		try {
			UsuarioSeguridad usuarioSeguridad = SeguridadUtil.getUsuarioActual();
                        usuario.setNombre(usuarioSeguridad.getNombre());
			usuario.setUsername(usuarioSeguridad.getUsername());
                        lstAnnios = tramitesService.obtieneAnniosTramite(usuarioSeguridad.getUsername());
		} catch (Exception ex) {
			logger.error("Error al obtener el usuario de seguridad.", ex);
			String mensaje = "No se pudo realizar la busqueda solicitada:" + " por favor intente mas tarde";
			return lstAnnios;
		}
		return lstAnnios;

	}
    
}
