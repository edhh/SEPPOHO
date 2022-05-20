package mx.sep.poho.modelo;

public class Tsh086ParametrosFirma {
    private Integer nidParametroFirma;

    private String cparametroFirma;

    private String cvalorParametroFirma;

    public Integer getNidParametroFirma() {
        return nidParametroFirma;
    }

    public void setNidParametroFirma(Integer nidParametroFirma) {
        this.nidParametroFirma = nidParametroFirma;
    }

    public String getCparametroFirma() {
        return cparametroFirma;
    }

    public void setCparametroFirma(String cparametroFirma) {
        this.cparametroFirma = cparametroFirma == null ? null : cparametroFirma.trim();
    }

    public String getCvalorParametroFirma() {
        return cvalorParametroFirma;
    }

    public void setCvalorParametroFirma(String cvalorParametroFirma) {
        this.cvalorParametroFirma = cvalorParametroFirma == null ? null : cvalorParametroFirma.trim();
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
        Tsh086ParametrosFirma other = (Tsh086ParametrosFirma) that;
        return (this.getNidParametroFirma() == null ? other.getNidParametroFirma() == null : this.getNidParametroFirma().equals(other.getNidParametroFirma()))
            && (this.getCparametroFirma() == null ? other.getCparametroFirma() == null : this.getCparametroFirma().equals(other.getCparametroFirma()))
            && (this.getCvalorParametroFirma() == null ? other.getCvalorParametroFirma() == null : this.getCvalorParametroFirma().equals(other.getCvalorParametroFirma()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNidParametroFirma() == null) ? 0 : getNidParametroFirma().hashCode());
        result = prime * result + ((getCparametroFirma() == null) ? 0 : getCparametroFirma().hashCode());
        result = prime * result + ((getCvalorParametroFirma() == null) ? 0 : getCvalorParametroFirma().hashCode());
        return result;
    }
}