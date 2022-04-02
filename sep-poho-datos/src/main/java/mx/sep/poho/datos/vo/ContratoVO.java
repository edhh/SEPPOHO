/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.poho.datos.vo;

/**
 *
 * @author PabloJesusMendozaCer
 */
public class ContratoVO {
    
    private Integer annio;
    
    private Long noTramite;
    
    private String claveNivel;
    
    private String periodo;
    
    private String claveUnidad;
    
    private Integer estatus;

    /**
     * @return the annio
     */
    public Integer getAnnio() {
        return annio;
    }

    /**
     * @param annio the annio to set
     */
    public void setAnnio(Integer annio) {
        this.annio = annio;
    }

    /**
     * @return the noTramite
     */
    public Long getNoTramite() {
        return noTramite;
    }

    /**
     * @param noTramite the noTramite to set
     */
    public void setNoTramite(Long noTramite) {
        this.noTramite = noTramite;
    }

    /**
     * @return the claveNivel
     */
    public String getClaveNivel() {
        return claveNivel;
    }

    /**
     * @param claveNivel the claveNivel to set
     */
    public void setClaveNivel(String claveNivel) {
        this.claveNivel = claveNivel;
    }

    /**
     * @return the periodo
     */
    public String getPeriodo() {
        return periodo;
    }

    /**
     * @param periodo the periodo to set
     */
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    /**
     * @return the claveUnidad
     */
    public String getClaveUnidad() {
        return claveUnidad;
    }

    /**
     * @param claveUnidad the claveUnidad to set
     */
    public void setClaveUnidad(String claveUnidad) {
        this.claveUnidad = claveUnidad;
    }

    /**
     * @return the estatus
     */
    public Integer getEstatus() {
        return estatus;
    }

    /**
     * @param estatus the estatus to set
     */
    public void setEstatus(Integer estatus) {
        this.estatus = estatus;
    }
    
}
