/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.poho.servicios;

/**
 *
 * @author PabloJesusMendozaCer
 */
public interface ParametrosFirmaService {
    
    String obtieneURL ();
    
    String obtieneEntidad ();
    
    String obtienePassword ();
    
    String obtieneNombreTSA ();
    
    String obtieneAlgoritmoTSA ();
    
    String obtieneAlgoritmoOCSP ();
    
}
