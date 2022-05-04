package mx.sep.poho.modelo;

import java.util.Date;

public class Tsh82ConfigModeloContrato {
    private Short annio;

    private Date vigInicio;

    private Date vigFinal;

    private String cveUnidad;

    private String nombreModelo;

    private Short id;

    public Short getAnnio() {
        return annio;
    }

    public void setAnnio(Short annio) {
        this.annio = annio;
    }

    public Date getVigInicio() {
        return vigInicio;
    }

    public void setVigInicio(Date vigInicio) {
        this.vigInicio = vigInicio;
    }

    public Date getVigFinal() {
        return vigFinal;
    }

    public void setVigFinal(Date vigFinal) {
        this.vigFinal = vigFinal;
    }

    public String getCveUnidad() {
        return cveUnidad;
    }

    public void setCveUnidad(String cveUnidad) {
        this.cveUnidad = cveUnidad == null ? null : cveUnidad.trim();
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo == null ? null : nombreModelo.trim();
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Tsh82ConfigModeloContrato other = (Tsh82ConfigModeloContrato) that;
        return (this.getAnnio() == null ? other.getAnnio() == null : this.getAnnio().equals(other.getAnnio()))
            && (this.getVigInicio() == null ? other.getVigInicio() == null : this.getVigInicio().equals(other.getVigInicio()))
            && (this.getVigFinal() == null ? other.getVigFinal() == null : this.getVigFinal().equals(other.getVigFinal()))
            && (this.getCveUnidad() == null ? other.getCveUnidad() == null : this.getCveUnidad().equals(other.getCveUnidad()))
            && (this.getNombreModelo() == null ? other.getNombreModelo() == null : this.getNombreModelo().equals(other.getNombreModelo()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAnnio() == null) ? 0 : getAnnio().hashCode());
        result = prime * result + ((getVigInicio() == null) ? 0 : getVigInicio().hashCode());
        result = prime * result + ((getVigFinal() == null) ? 0 : getVigFinal().hashCode());
        result = prime * result + ((getCveUnidad() == null) ? 0 : getCveUnidad().hashCode());
        result = prime * result + ((getNombreModelo() == null) ? 0 : getNombreModelo().hashCode());
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }
}