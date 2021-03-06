package mx.sep.seguridad.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import mx.sep.seguridad.modelo.RolSeguridad;
import mx.sep.seguridad.modelo.UsuarioSeguridad;
import mx.sep.seguridad.servicios.CustomUserDetails;
import org.springframework.security.core.GrantedAuthority;

import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Métodos de utilería para interactuar con el módulo de seguridad.
 * 
 * @author Alejandro Pimentel
 *
 */
public class SeguridadUtil {

	/**
	 * Trata de obtener la información del usuario autenticado para el hilo
	 * de ejecución actual.
	 * 
	 * Si no le es posible obtenerlo lanza un {@link RuntimeException}
	 * 
	 * @return Un objeto tipo {@link UsuarioSeguridad}
	 */
    public static UsuarioSeguridad getUsuarioActual() {
        if(SecurityContextHolder.getContext().
                getAuthentication() == null
           || !SecurityContextHolder.getContext().
                getAuthentication().
                getPrincipal().
                getClass().
                equals(CustomUserDetails.class)) {
            throw new RuntimeException("La sesión actual no ha sido autenticada", null);
        }

        CustomUserDetails cud = (CustomUserDetails) SecurityContextHolder.getContext().
                getAuthentication().
                getPrincipal();
        
        List<RolSeguridad> roles = new ArrayList();
        Collection<GrantedAuthority> authorities = cud.getAuthorities();
        for (GrantedAuthority grantedAuthority : authorities) {
            roles.add(new RolSeguridad(grantedAuthority.getAuthority(), true));
        }
        UsuarioSeguridad us = new UsuarioSeguridad(cud.getUsername(), "", cud.getNombre(), cud.isEnabled(), roles);
        
        return us;
    }
}
