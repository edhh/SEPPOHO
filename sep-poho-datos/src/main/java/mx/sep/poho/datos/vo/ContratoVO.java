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
    
    private String rfc;
    
    private String curp;
    
    private String apPaterno;
    
    private String apMaterno;
    
    private String nombre;
    
    private String fechaIniContrato;
    
    private String fechaFinContrato;
       
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

    /**
     * @return the rfc
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * @param rfc the rfc to set
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * @return the curp
     */
    public String getCurp() {
        return curp;
    }

    /**
     * @param curp the curp to set
     */
    public void setCurp(String curp) {
        this.curp = curp;
    }

    /**
     * @return the apPaterno
     */
    public String getApPaterno() {
        return apPaterno;
    }

    /**
     * @param apPaterno the apPaterno to set
     */
    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    /**
     * @return the apMaterno
     */
    public String getApMaterno() {
        return apMaterno;
    }

    /**
     * @param apMaterno the apMaterno to set
     */
    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the fechaIniContrato
     */
    public String getFechaIniContrato() {
        return fechaIniContrato;
    }

    /**
     * @param fechaIniContrato the fechaIniContrato to set
     */
    public void setFechaIniContrato(String fechaIniContrato) {
        this.fechaIniContrato = fechaIniContrato;
    }

    /**
     * @return the fechaFinContrato
     */
    public String getFechaFinContrato() {
        return fechaFinContrato;
    }

    /**
     * @param fechaFinContrato the fechaFinContrato to set
     */
    public void setFechaFinContrato(String fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }
    
}
