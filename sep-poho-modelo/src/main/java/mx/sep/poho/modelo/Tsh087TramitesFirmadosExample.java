package mx.sep.poho.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Tsh087TramitesFirmadosExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tsh087TramitesFirmadosExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andAnnioIsNull() {
            addCriterion("annio is null");
            return (Criteria) this;
        }

        public Criteria andAnnioIsNotNull() {
            addCriterion("annio is not null");
            return (Criteria) this;
        }

        public Criteria andAnnioEqualTo(Short value) {
            addCriterion("annio =", value, "annio");
            return (Criteria) this;
        }

        public Criteria andAnnioNotEqualTo(Short value) {
            addCriterion("annio <>", value, "annio");
            return (Criteria) this;
        }

        public Criteria andAnnioGreaterThan(Short value) {
            addCriterion("annio >", value, "annio");
            return (Criteria) this;
        }

        public Criteria andAnnioGreaterThanOrEqualTo(Short value) {
            addCriterion("annio >=", value, "annio");
            return (Criteria) this;
        }

        public Criteria andAnnioLessThan(Short value) {
            addCriterion("annio <", value, "annio");
            return (Criteria) this;
        }

        public Criteria andAnnioLessThanOrEqualTo(Short value) {
            addCriterion("annio <=", value, "annio");
            return (Criteria) this;
        }

        public Criteria andAnnioIn(List<Short> values) {
            addCriterion("annio in", values, "annio");
            return (Criteria) this;
        }

        public Criteria andAnnioNotIn(List<Short> values) {
            addCriterion("annio not in", values, "annio");
            return (Criteria) this;
        }

        public Criteria andAnnioBetween(Short value1, Short value2) {
            addCriterion("annio between", value1, value2, "annio");
            return (Criteria) this;
        }

        public Criteria andAnnioNotBetween(Short value1, Short value2) {
            addCriterion("annio not between", value1, value2, "annio");
            return (Criteria) this;
        }

        public Criteria andNuTramiteIsNull() {
            addCriterion("nu_tramite is null");
            return (Criteria) this;
        }

        public Criteria andNuTramiteIsNotNull() {
            addCriterion("nu_tramite is not null");
            return (Criteria) this;
        }

        public Criteria andNuTramiteEqualTo(Integer value) {
            addCriterion("nu_tramite =", value, "nuTramite");
            return (Criteria) this;
        }

        public Criteria andNuTramiteNotEqualTo(Integer value) {
            addCriterion("nu_tramite <>", value, "nuTramite");
            return (Criteria) this;
        }

        public Criteria andNuTramiteGreaterThan(Integer value) {
            addCriterion("nu_tramite >", value, "nuTramite");
            return (Criteria) this;
        }

        public Criteria andNuTramiteGreaterThanOrEqualTo(Integer value) {
            addCriterion("nu_tramite >=", value, "nuTramite");
            return (Criteria) this;
        }

        public Criteria andNuTramiteLessThan(Integer value) {
            addCriterion("nu_tramite <", value, "nuTramite");
            return (Criteria) this;
        }

        public Criteria andNuTramiteLessThanOrEqualTo(Integer value) {
            addCriterion("nu_tramite <=", value, "nuTramite");
            return (Criteria) this;
        }

        public Criteria andNuTramiteIn(List<Integer> values) {
            addCriterion("nu_tramite in", values, "nuTramite");
            return (Criteria) this;
        }

        public Criteria andNuTramiteNotIn(List<Integer> values) {
            addCriterion("nu_tramite not in", values, "nuTramite");
            return (Criteria) this;
        }

        public Criteria andNuTramiteBetween(Integer value1, Integer value2) {
            addCriterion("nu_tramite between", value1, value2, "nuTramite");
            return (Criteria) this;
        }

        public Criteria andNuTramiteNotBetween(Integer value1, Integer value2) {
            addCriterion("nu_tramite not between", value1, value2, "nuTramite");
            return (Criteria) this;
        }

        public Criteria andNombreFirmanteDgIsNull() {
            addCriterion("nombre_firmante_dg is null");
            return (Criteria) this;
        }

        public Criteria andNombreFirmanteDgIsNotNull() {
            addCriterion("nombre_firmante_dg is not null");
            return (Criteria) this;
        }

        public Criteria andNombreFirmanteDgEqualTo(String value) {
            addCriterion("nombre_firmante_dg =", value, "nombreFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andNombreFirmanteDgNotEqualTo(String value) {
            addCriterion("nombre_firmante_dg <>", value, "nombreFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andNombreFirmanteDgGreaterThan(String value) {
            addCriterion("nombre_firmante_dg >", value, "nombreFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andNombreFirmanteDgGreaterThanOrEqualTo(String value) {
            addCriterion("nombre_firmante_dg >=", value, "nombreFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andNombreFirmanteDgLessThan(String value) {
            addCriterion("nombre_firmante_dg <", value, "nombreFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andNombreFirmanteDgLessThanOrEqualTo(String value) {
            addCriterion("nombre_firmante_dg <=", value, "nombreFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andNombreFirmanteDgLike(String value) {
            addCriterion("nombre_firmante_dg like", value, "nombreFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andNombreFirmanteDgNotLike(String value) {
            addCriterion("nombre_firmante_dg not like", value, "nombreFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andNombreFirmanteDgIn(List<String> values) {
            addCriterion("nombre_firmante_dg in", values, "nombreFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andNombreFirmanteDgNotIn(List<String> values) {
            addCriterion("nombre_firmante_dg not in", values, "nombreFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andNombreFirmanteDgBetween(String value1, String value2) {
            addCriterion("nombre_firmante_dg between", value1, value2, "nombreFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andNombreFirmanteDgNotBetween(String value1, String value2) {
            addCriterion("nombre_firmante_dg not between", value1, value2, "nombreFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andPuestoFirmanteDgIsNull() {
            addCriterion("puesto_firmante_dg is null");
            return (Criteria) this;
        }

        public Criteria andPuestoFirmanteDgIsNotNull() {
            addCriterion("puesto_firmante_dg is not null");
            return (Criteria) this;
        }

        public Criteria andPuestoFirmanteDgEqualTo(String value) {
            addCriterion("puesto_firmante_dg =", value, "puestoFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andPuestoFirmanteDgNotEqualTo(String value) {
            addCriterion("puesto_firmante_dg <>", value, "puestoFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andPuestoFirmanteDgGreaterThan(String value) {
            addCriterion("puesto_firmante_dg >", value, "puestoFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andPuestoFirmanteDgGreaterThanOrEqualTo(String value) {
            addCriterion("puesto_firmante_dg >=", value, "puestoFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andPuestoFirmanteDgLessThan(String value) {
            addCriterion("puesto_firmante_dg <", value, "puestoFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andPuestoFirmanteDgLessThanOrEqualTo(String value) {
            addCriterion("puesto_firmante_dg <=", value, "puestoFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andPuestoFirmanteDgLike(String value) {
            addCriterion("puesto_firmante_dg like", value, "puestoFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andPuestoFirmanteDgNotLike(String value) {
            addCriterion("puesto_firmante_dg not like", value, "puestoFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andPuestoFirmanteDgIn(List<String> values) {
            addCriterion("puesto_firmante_dg in", values, "puestoFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andPuestoFirmanteDgNotIn(List<String> values) {
            addCriterion("puesto_firmante_dg not in", values, "puestoFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andPuestoFirmanteDgBetween(String value1, String value2) {
            addCriterion("puesto_firmante_dg between", value1, value2, "puestoFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andPuestoFirmanteDgNotBetween(String value1, String value2) {
            addCriterion("puesto_firmante_dg not between", value1, value2, "puestoFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andCurpFirmanteDgIsNull() {
            addCriterion("curp_firmante_dg is null");
            return (Criteria) this;
        }

        public Criteria andCurpFirmanteDgIsNotNull() {
            addCriterion("curp_firmante_dg is not null");
            return (Criteria) this;
        }

        public Criteria andCurpFirmanteDgEqualTo(String value) {
            addCriterion("curp_firmante_dg =", value, "curpFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andCurpFirmanteDgNotEqualTo(String value) {
            addCriterion("curp_firmante_dg <>", value, "curpFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andCurpFirmanteDgGreaterThan(String value) {
            addCriterion("curp_firmante_dg >", value, "curpFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andCurpFirmanteDgGreaterThanOrEqualTo(String value) {
            addCriterion("curp_firmante_dg >=", value, "curpFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andCurpFirmanteDgLessThan(String value) {
            addCriterion("curp_firmante_dg <", value, "curpFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andCurpFirmanteDgLessThanOrEqualTo(String value) {
            addCriterion("curp_firmante_dg <=", value, "curpFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andCurpFirmanteDgLike(String value) {
            addCriterion("curp_firmante_dg like", value, "curpFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andCurpFirmanteDgNotLike(String value) {
            addCriterion("curp_firmante_dg not like", value, "curpFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andCurpFirmanteDgIn(List<String> values) {
            addCriterion("curp_firmante_dg in", values, "curpFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andCurpFirmanteDgNotIn(List<String> values) {
            addCriterion("curp_firmante_dg not in", values, "curpFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andCurpFirmanteDgBetween(String value1, String value2) {
            addCriterion("curp_firmante_dg between", value1, value2, "curpFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andCurpFirmanteDgNotBetween(String value1, String value2) {
            addCriterion("curp_firmante_dg not between", value1, value2, "curpFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmanteDgIsNull() {
            addCriterion("nu_serie_firmante_dg is null");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmanteDgIsNotNull() {
            addCriterion("nu_serie_firmante_dg is not null");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmanteDgEqualTo(String value) {
            addCriterion("nu_serie_firmante_dg =", value, "nuSerieFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmanteDgNotEqualTo(String value) {
            addCriterion("nu_serie_firmante_dg <>", value, "nuSerieFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmanteDgGreaterThan(String value) {
            addCriterion("nu_serie_firmante_dg >", value, "nuSerieFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmanteDgGreaterThanOrEqualTo(String value) {
            addCriterion("nu_serie_firmante_dg >=", value, "nuSerieFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmanteDgLessThan(String value) {
            addCriterion("nu_serie_firmante_dg <", value, "nuSerieFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmanteDgLessThanOrEqualTo(String value) {
            addCriterion("nu_serie_firmante_dg <=", value, "nuSerieFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmanteDgLike(String value) {
            addCriterion("nu_serie_firmante_dg like", value, "nuSerieFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmanteDgNotLike(String value) {
            addCriterion("nu_serie_firmante_dg not like", value, "nuSerieFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmanteDgIn(List<String> values) {
            addCriterion("nu_serie_firmante_dg in", values, "nuSerieFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmanteDgNotIn(List<String> values) {
            addCriterion("nu_serie_firmante_dg not in", values, "nuSerieFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmanteDgBetween(String value1, String value2) {
            addCriterion("nu_serie_firmante_dg between", value1, value2, "nuSerieFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmanteDgNotBetween(String value1, String value2) {
            addCriterion("nu_serie_firmante_dg not between", value1, value2, "nuSerieFirmanteDg");
            return (Criteria) this;
        }

        public Criteria andFirmaDgIsNull() {
            addCriterion("firma_dg is null");
            return (Criteria) this;
        }

        public Criteria andFirmaDgIsNotNull() {
            addCriterion("firma_dg is not null");
            return (Criteria) this;
        }

        public Criteria andFirmaDgEqualTo(String value) {
            addCriterion("firma_dg =", value, "firmaDg");
            return (Criteria) this;
        }

        public Criteria andFirmaDgNotEqualTo(String value) {
            addCriterion("firma_dg <>", value, "firmaDg");
            return (Criteria) this;
        }

        public Criteria andFirmaDgGreaterThan(String value) {
            addCriterion("firma_dg >", value, "firmaDg");
            return (Criteria) this;
        }

        public Criteria andFirmaDgGreaterThanOrEqualTo(String value) {
            addCriterion("firma_dg >=", value, "firmaDg");
            return (Criteria) this;
        }

        public Criteria andFirmaDgLessThan(String value) {
            addCriterion("firma_dg <", value, "firmaDg");
            return (Criteria) this;
        }

        public Criteria andFirmaDgLessThanOrEqualTo(String value) {
            addCriterion("firma_dg <=", value, "firmaDg");
            return (Criteria) this;
        }

        public Criteria andFirmaDgLike(String value) {
            addCriterion("firma_dg like", value, "firmaDg");
            return (Criteria) this;
        }

        public Criteria andFirmaDgNotLike(String value) {
            addCriterion("firma_dg not like", value, "firmaDg");
            return (Criteria) this;
        }

        public Criteria andFirmaDgIn(List<String> values) {
            addCriterion("firma_dg in", values, "firmaDg");
            return (Criteria) this;
        }

        public Criteria andFirmaDgNotIn(List<String> values) {
            addCriterion("firma_dg not in", values, "firmaDg");
            return (Criteria) this;
        }

        public Criteria andFirmaDgBetween(String value1, String value2) {
            addCriterion("firma_dg between", value1, value2, "firmaDg");
            return (Criteria) this;
        }

        public Criteria andFirmaDgNotBetween(String value1, String value2) {
            addCriterion("firma_dg not between", value1, value2, "firmaDg");
            return (Criteria) this;
        }

        public Criteria andTsaDgIsNull() {
            addCriterion("tsa_dg is null");
            return (Criteria) this;
        }

        public Criteria andTsaDgIsNotNull() {
            addCriterion("tsa_dg is not null");
            return (Criteria) this;
        }

        public Criteria andTsaDgEqualTo(String value) {
            addCriterion("tsa_dg =", value, "tsaDg");
            return (Criteria) this;
        }

        public Criteria andTsaDgNotEqualTo(String value) {
            addCriterion("tsa_dg <>", value, "tsaDg");
            return (Criteria) this;
        }

        public Criteria andTsaDgGreaterThan(String value) {
            addCriterion("tsa_dg >", value, "tsaDg");
            return (Criteria) this;
        }

        public Criteria andTsaDgGreaterThanOrEqualTo(String value) {
            addCriterion("tsa_dg >=", value, "tsaDg");
            return (Criteria) this;
        }

        public Criteria andTsaDgLessThan(String value) {
            addCriterion("tsa_dg <", value, "tsaDg");
            return (Criteria) this;
        }

        public Criteria andTsaDgLessThanOrEqualTo(String value) {
            addCriterion("tsa_dg <=", value, "tsaDg");
            return (Criteria) this;
        }

        public Criteria andTsaDgLike(String value) {
            addCriterion("tsa_dg like", value, "tsaDg");
            return (Criteria) this;
        }

        public Criteria andTsaDgNotLike(String value) {
            addCriterion("tsa_dg not like", value, "tsaDg");
            return (Criteria) this;
        }

        public Criteria andTsaDgIn(List<String> values) {
            addCriterion("tsa_dg in", values, "tsaDg");
            return (Criteria) this;
        }

        public Criteria andTsaDgNotIn(List<String> values) {
            addCriterion("tsa_dg not in", values, "tsaDg");
            return (Criteria) this;
        }

        public Criteria andTsaDgBetween(String value1, String value2) {
            addCriterion("tsa_dg between", value1, value2, "tsaDg");
            return (Criteria) this;
        }

        public Criteria andTsaDgNotBetween(String value1, String value2) {
            addCriterion("tsa_dg not between", value1, value2, "tsaDg");
            return (Criteria) this;
        }

        public Criteria andSuplenciaDgIsNull() {
            addCriterion("suplencia_dg is null");
            return (Criteria) this;
        }

        public Criteria andSuplenciaDgIsNotNull() {
            addCriterion("suplencia_dg is not null");
            return (Criteria) this;
        }

        public Criteria andSuplenciaDgEqualTo(String value) {
            addCriterion("suplencia_dg =", value, "suplenciaDg");
            return (Criteria) this;
        }

        public Criteria andSuplenciaDgNotEqualTo(String value) {
            addCriterion("suplencia_dg <>", value, "suplenciaDg");
            return (Criteria) this;
        }

        public Criteria andSuplenciaDgGreaterThan(String value) {
            addCriterion("suplencia_dg >", value, "suplenciaDg");
            return (Criteria) this;
        }

        public Criteria andSuplenciaDgGreaterThanOrEqualTo(String value) {
            addCriterion("suplencia_dg >=", value, "suplenciaDg");
            return (Criteria) this;
        }

        public Criteria andSuplenciaDgLessThan(String value) {
            addCriterion("suplencia_dg <", value, "suplenciaDg");
            return (Criteria) this;
        }

        public Criteria andSuplenciaDgLessThanOrEqualTo(String value) {
            addCriterion("suplencia_dg <=", value, "suplenciaDg");
            return (Criteria) this;
        }

        public Criteria andSuplenciaDgLike(String value) {
            addCriterion("suplencia_dg like", value, "suplenciaDg");
            return (Criteria) this;
        }

        public Criteria andSuplenciaDgNotLike(String value) {
            addCriterion("suplencia_dg not like", value, "suplenciaDg");
            return (Criteria) this;
        }

        public Criteria andSuplenciaDgIn(List<String> values) {
            addCriterion("suplencia_dg in", values, "suplenciaDg");
            return (Criteria) this;
        }

        public Criteria andSuplenciaDgNotIn(List<String> values) {
            addCriterion("suplencia_dg not in", values, "suplenciaDg");
            return (Criteria) this;
        }

        public Criteria andSuplenciaDgBetween(String value1, String value2) {
            addCriterion("suplencia_dg between", value1, value2, "suplenciaDg");
            return (Criteria) this;
        }

        public Criteria andSuplenciaDgNotBetween(String value1, String value2) {
            addCriterion("suplencia_dg not between", value1, value2, "suplenciaDg");
            return (Criteria) this;
        }

        public Criteria andNombreFirmanteUrIsNull() {
            addCriterion("nombre_firmante_ur is null");
            return (Criteria) this;
        }

        public Criteria andNombreFirmanteUrIsNotNull() {
            addCriterion("nombre_firmante_ur is not null");
            return (Criteria) this;
        }

        public Criteria andNombreFirmanteUrEqualTo(String value) {
            addCriterion("nombre_firmante_ur =", value, "nombreFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andNombreFirmanteUrNotEqualTo(String value) {
            addCriterion("nombre_firmante_ur <>", value, "nombreFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andNombreFirmanteUrGreaterThan(String value) {
            addCriterion("nombre_firmante_ur >", value, "nombreFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andNombreFirmanteUrGreaterThanOrEqualTo(String value) {
            addCriterion("nombre_firmante_ur >=", value, "nombreFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andNombreFirmanteUrLessThan(String value) {
            addCriterion("nombre_firmante_ur <", value, "nombreFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andNombreFirmanteUrLessThanOrEqualTo(String value) {
            addCriterion("nombre_firmante_ur <=", value, "nombreFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andNombreFirmanteUrLike(String value) {
            addCriterion("nombre_firmante_ur like", value, "nombreFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andNombreFirmanteUrNotLike(String value) {
            addCriterion("nombre_firmante_ur not like", value, "nombreFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andNombreFirmanteUrIn(List<String> values) {
            addCriterion("nombre_firmante_ur in", values, "nombreFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andNombreFirmanteUrNotIn(List<String> values) {
            addCriterion("nombre_firmante_ur not in", values, "nombreFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andNombreFirmanteUrBetween(String value1, String value2) {
            addCriterion("nombre_firmante_ur between", value1, value2, "nombreFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andNombreFirmanteUrNotBetween(String value1, String value2) {
            addCriterion("nombre_firmante_ur not between", value1, value2, "nombreFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andPuestoFirmanteUrIsNull() {
            addCriterion("puesto_firmante_ur is null");
            return (Criteria) this;
        }

        public Criteria andPuestoFirmanteUrIsNotNull() {
            addCriterion("puesto_firmante_ur is not null");
            return (Criteria) this;
        }

        public Criteria andPuestoFirmanteUrEqualTo(String value) {
            addCriterion("puesto_firmante_ur =", value, "puestoFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andPuestoFirmanteUrNotEqualTo(String value) {
            addCriterion("puesto_firmante_ur <>", value, "puestoFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andPuestoFirmanteUrGreaterThan(String value) {
            addCriterion("puesto_firmante_ur >", value, "puestoFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andPuestoFirmanteUrGreaterThanOrEqualTo(String value) {
            addCriterion("puesto_firmante_ur >=", value, "puestoFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andPuestoFirmanteUrLessThan(String value) {
            addCriterion("puesto_firmante_ur <", value, "puestoFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andPuestoFirmanteUrLessThanOrEqualTo(String value) {
            addCriterion("puesto_firmante_ur <=", value, "puestoFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andPuestoFirmanteUrLike(String value) {
            addCriterion("puesto_firmante_ur like", value, "puestoFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andPuestoFirmanteUrNotLike(String value) {
            addCriterion("puesto_firmante_ur not like", value, "puestoFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andPuestoFirmanteUrIn(List<String> values) {
            addCriterion("puesto_firmante_ur in", values, "puestoFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andPuestoFirmanteUrNotIn(List<String> values) {
            addCriterion("puesto_firmante_ur not in", values, "puestoFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andPuestoFirmanteUrBetween(String value1, String value2) {
            addCriterion("puesto_firmante_ur between", value1, value2, "puestoFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andPuestoFirmanteUrNotBetween(String value1, String value2) {
            addCriterion("puesto_firmante_ur not between", value1, value2, "puestoFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andCurpFirmanteUrIsNull() {
            addCriterion("curp_firmante_ur is null");
            return (Criteria) this;
        }

        public Criteria andCurpFirmanteUrIsNotNull() {
            addCriterion("curp_firmante_ur is not null");
            return (Criteria) this;
        }

        public Criteria andCurpFirmanteUrEqualTo(String value) {
            addCriterion("curp_firmante_ur =", value, "curpFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andCurpFirmanteUrNotEqualTo(String value) {
            addCriterion("curp_firmante_ur <>", value, "curpFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andCurpFirmanteUrGreaterThan(String value) {
            addCriterion("curp_firmante_ur >", value, "curpFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andCurpFirmanteUrGreaterThanOrEqualTo(String value) {
            addCriterion("curp_firmante_ur >=", value, "curpFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andCurpFirmanteUrLessThan(String value) {
            addCriterion("curp_firmante_ur <", value, "curpFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andCurpFirmanteUrLessThanOrEqualTo(String value) {
            addCriterion("curp_firmante_ur <=", value, "curpFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andCurpFirmanteUrLike(String value) {
            addCriterion("curp_firmante_ur like", value, "curpFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andCurpFirmanteUrNotLike(String value) {
            addCriterion("curp_firmante_ur not like", value, "curpFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andCurpFirmanteUrIn(List<String> values) {
            addCriterion("curp_firmante_ur in", values, "curpFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andCurpFirmanteUrNotIn(List<String> values) {
            addCriterion("curp_firmante_ur not in", values, "curpFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andCurpFirmanteUrBetween(String value1, String value2) {
            addCriterion("curp_firmante_ur between", value1, value2, "curpFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andCurpFirmanteUrNotBetween(String value1, String value2) {
            addCriterion("curp_firmante_ur not between", value1, value2, "curpFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmanteUrIsNull() {
            addCriterion("nu_serie_firmante_ur is null");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmanteUrIsNotNull() {
            addCriterion("nu_serie_firmante_ur is not null");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmanteUrEqualTo(String value) {
            addCriterion("nu_serie_firmante_ur =", value, "nuSerieFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmanteUrNotEqualTo(String value) {
            addCriterion("nu_serie_firmante_ur <>", value, "nuSerieFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmanteUrGreaterThan(String value) {
            addCriterion("nu_serie_firmante_ur >", value, "nuSerieFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmanteUrGreaterThanOrEqualTo(String value) {
            addCriterion("nu_serie_firmante_ur >=", value, "nuSerieFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmanteUrLessThan(String value) {
            addCriterion("nu_serie_firmante_ur <", value, "nuSerieFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmanteUrLessThanOrEqualTo(String value) {
            addCriterion("nu_serie_firmante_ur <=", value, "nuSerieFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmanteUrLike(String value) {
            addCriterion("nu_serie_firmante_ur like", value, "nuSerieFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmanteUrNotLike(String value) {
            addCriterion("nu_serie_firmante_ur not like", value, "nuSerieFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmanteUrIn(List<String> values) {
            addCriterion("nu_serie_firmante_ur in", values, "nuSerieFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmanteUrNotIn(List<String> values) {
            addCriterion("nu_serie_firmante_ur not in", values, "nuSerieFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmanteUrBetween(String value1, String value2) {
            addCriterion("nu_serie_firmante_ur between", value1, value2, "nuSerieFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmanteUrNotBetween(String value1, String value2) {
            addCriterion("nu_serie_firmante_ur not between", value1, value2, "nuSerieFirmanteUr");
            return (Criteria) this;
        }

        public Criteria andFirmaUrIsNull() {
            addCriterion("firma_ur is null");
            return (Criteria) this;
        }

        public Criteria andFirmaUrIsNotNull() {
            addCriterion("firma_ur is not null");
            return (Criteria) this;
        }

        public Criteria andFirmaUrEqualTo(String value) {
            addCriterion("firma_ur =", value, "firmaUr");
            return (Criteria) this;
        }

        public Criteria andFirmaUrNotEqualTo(String value) {
            addCriterion("firma_ur <>", value, "firmaUr");
            return (Criteria) this;
        }

        public Criteria andFirmaUrGreaterThan(String value) {
            addCriterion("firma_ur >", value, "firmaUr");
            return (Criteria) this;
        }

        public Criteria andFirmaUrGreaterThanOrEqualTo(String value) {
            addCriterion("firma_ur >=", value, "firmaUr");
            return (Criteria) this;
        }

        public Criteria andFirmaUrLessThan(String value) {
            addCriterion("firma_ur <", value, "firmaUr");
            return (Criteria) this;
        }

        public Criteria andFirmaUrLessThanOrEqualTo(String value) {
            addCriterion("firma_ur <=", value, "firmaUr");
            return (Criteria) this;
        }

        public Criteria andFirmaUrLike(String value) {
            addCriterion("firma_ur like", value, "firmaUr");
            return (Criteria) this;
        }

        public Criteria andFirmaUrNotLike(String value) {
            addCriterion("firma_ur not like", value, "firmaUr");
            return (Criteria) this;
        }

        public Criteria andFirmaUrIn(List<String> values) {
            addCriterion("firma_ur in", values, "firmaUr");
            return (Criteria) this;
        }

        public Criteria andFirmaUrNotIn(List<String> values) {
            addCriterion("firma_ur not in", values, "firmaUr");
            return (Criteria) this;
        }

        public Criteria andFirmaUrBetween(String value1, String value2) {
            addCriterion("firma_ur between", value1, value2, "firmaUr");
            return (Criteria) this;
        }

        public Criteria andFirmaUrNotBetween(String value1, String value2) {
            addCriterion("firma_ur not between", value1, value2, "firmaUr");
            return (Criteria) this;
        }

        public Criteria andTsaUrIsNull() {
            addCriterion("tsa_ur is null");
            return (Criteria) this;
        }

        public Criteria andTsaUrIsNotNull() {
            addCriterion("tsa_ur is not null");
            return (Criteria) this;
        }

        public Criteria andTsaUrEqualTo(String value) {
            addCriterion("tsa_ur =", value, "tsaUr");
            return (Criteria) this;
        }

        public Criteria andTsaUrNotEqualTo(String value) {
            addCriterion("tsa_ur <>", value, "tsaUr");
            return (Criteria) this;
        }

        public Criteria andTsaUrGreaterThan(String value) {
            addCriterion("tsa_ur >", value, "tsaUr");
            return (Criteria) this;
        }

        public Criteria andTsaUrGreaterThanOrEqualTo(String value) {
            addCriterion("tsa_ur >=", value, "tsaUr");
            return (Criteria) this;
        }

        public Criteria andTsaUrLessThan(String value) {
            addCriterion("tsa_ur <", value, "tsaUr");
            return (Criteria) this;
        }

        public Criteria andTsaUrLessThanOrEqualTo(String value) {
            addCriterion("tsa_ur <=", value, "tsaUr");
            return (Criteria) this;
        }

        public Criteria andTsaUrLike(String value) {
            addCriterion("tsa_ur like", value, "tsaUr");
            return (Criteria) this;
        }

        public Criteria andTsaUrNotLike(String value) {
            addCriterion("tsa_ur not like", value, "tsaUr");
            return (Criteria) this;
        }

        public Criteria andTsaUrIn(List<String> values) {
            addCriterion("tsa_ur in", values, "tsaUr");
            return (Criteria) this;
        }

        public Criteria andTsaUrNotIn(List<String> values) {
            addCriterion("tsa_ur not in", values, "tsaUr");
            return (Criteria) this;
        }

        public Criteria andTsaUrBetween(String value1, String value2) {
            addCriterion("tsa_ur between", value1, value2, "tsaUr");
            return (Criteria) this;
        }

        public Criteria andTsaUrNotBetween(String value1, String value2) {
            addCriterion("tsa_ur not between", value1, value2, "tsaUr");
            return (Criteria) this;
        }

        public Criteria andSuplenciaUrIsNull() {
            addCriterion("suplencia_ur is null");
            return (Criteria) this;
        }

        public Criteria andSuplenciaUrIsNotNull() {
            addCriterion("suplencia_ur is not null");
            return (Criteria) this;
        }

        public Criteria andSuplenciaUrEqualTo(String value) {
            addCriterion("suplencia_ur =", value, "suplenciaUr");
            return (Criteria) this;
        }

        public Criteria andSuplenciaUrNotEqualTo(String value) {
            addCriterion("suplencia_ur <>", value, "suplenciaUr");
            return (Criteria) this;
        }

        public Criteria andSuplenciaUrGreaterThan(String value) {
            addCriterion("suplencia_ur >", value, "suplenciaUr");
            return (Criteria) this;
        }

        public Criteria andSuplenciaUrGreaterThanOrEqualTo(String value) {
            addCriterion("suplencia_ur >=", value, "suplenciaUr");
            return (Criteria) this;
        }

        public Criteria andSuplenciaUrLessThan(String value) {
            addCriterion("suplencia_ur <", value, "suplenciaUr");
            return (Criteria) this;
        }

        public Criteria andSuplenciaUrLessThanOrEqualTo(String value) {
            addCriterion("suplencia_ur <=", value, "suplenciaUr");
            return (Criteria) this;
        }

        public Criteria andSuplenciaUrLike(String value) {
            addCriterion("suplencia_ur like", value, "suplenciaUr");
            return (Criteria) this;
        }

        public Criteria andSuplenciaUrNotLike(String value) {
            addCriterion("suplencia_ur not like", value, "suplenciaUr");
            return (Criteria) this;
        }

        public Criteria andSuplenciaUrIn(List<String> values) {
            addCriterion("suplencia_ur in", values, "suplenciaUr");
            return (Criteria) this;
        }

        public Criteria andSuplenciaUrNotIn(List<String> values) {
            addCriterion("suplencia_ur not in", values, "suplenciaUr");
            return (Criteria) this;
        }

        public Criteria andSuplenciaUrBetween(String value1, String value2) {
            addCriterion("suplencia_ur between", value1, value2, "suplenciaUr");
            return (Criteria) this;
        }

        public Criteria andSuplenciaUrNotBetween(String value1, String value2) {
            addCriterion("suplencia_ur not between", value1, value2, "suplenciaUr");
            return (Criteria) this;
        }

        public Criteria andCadenaOriginalIsNull() {
            addCriterion("cadena_original is null");
            return (Criteria) this;
        }

        public Criteria andCadenaOriginalIsNotNull() {
            addCriterion("cadena_original is not null");
            return (Criteria) this;
        }

        public Criteria andCadenaOriginalEqualTo(String value) {
            addCriterion("cadena_original =", value, "cadenaOriginal");
            return (Criteria) this;
        }

        public Criteria andCadenaOriginalNotEqualTo(String value) {
            addCriterion("cadena_original <>", value, "cadenaOriginal");
            return (Criteria) this;
        }

        public Criteria andCadenaOriginalGreaterThan(String value) {
            addCriterion("cadena_original >", value, "cadenaOriginal");
            return (Criteria) this;
        }

        public Criteria andCadenaOriginalGreaterThanOrEqualTo(String value) {
            addCriterion("cadena_original >=", value, "cadenaOriginal");
            return (Criteria) this;
        }

        public Criteria andCadenaOriginalLessThan(String value) {
            addCriterion("cadena_original <", value, "cadenaOriginal");
            return (Criteria) this;
        }

        public Criteria andCadenaOriginalLessThanOrEqualTo(String value) {
            addCriterion("cadena_original <=", value, "cadenaOriginal");
            return (Criteria) this;
        }

        public Criteria andCadenaOriginalLike(String value) {
            addCriterion("cadena_original like", value, "cadenaOriginal");
            return (Criteria) this;
        }

        public Criteria andCadenaOriginalNotLike(String value) {
            addCriterion("cadena_original not like", value, "cadenaOriginal");
            return (Criteria) this;
        }

        public Criteria andCadenaOriginalIn(List<String> values) {
            addCriterion("cadena_original in", values, "cadenaOriginal");
            return (Criteria) this;
        }

        public Criteria andCadenaOriginalNotIn(List<String> values) {
            addCriterion("cadena_original not in", values, "cadenaOriginal");
            return (Criteria) this;
        }

        public Criteria andCadenaOriginalBetween(String value1, String value2) {
            addCriterion("cadena_original between", value1, value2, "cadenaOriginal");
            return (Criteria) this;
        }

        public Criteria andCadenaOriginalNotBetween(String value1, String value2) {
            addCriterion("cadena_original not between", value1, value2, "cadenaOriginal");
            return (Criteria) this;
        }

        public Criteria andFhFirmaIsNull() {
            addCriterion("fh_firma is null");
            return (Criteria) this;
        }

        public Criteria andFhFirmaIsNotNull() {
            addCriterion("fh_firma is not null");
            return (Criteria) this;
        }

        public Criteria andFhFirmaEqualTo(Date value) {
            addCriterionForJDBCDate("fh_firma =", value, "fhFirma");
            return (Criteria) this;
        }

        public Criteria andFhFirmaNotEqualTo(Date value) {
            addCriterionForJDBCDate("fh_firma <>", value, "fhFirma");
            return (Criteria) this;
        }

        public Criteria andFhFirmaGreaterThan(Date value) {
            addCriterionForJDBCDate("fh_firma >", value, "fhFirma");
            return (Criteria) this;
        }

        public Criteria andFhFirmaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fh_firma >=", value, "fhFirma");
            return (Criteria) this;
        }

        public Criteria andFhFirmaLessThan(Date value) {
            addCriterionForJDBCDate("fh_firma <", value, "fhFirma");
            return (Criteria) this;
        }

        public Criteria andFhFirmaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fh_firma <=", value, "fhFirma");
            return (Criteria) this;
        }

        public Criteria andFhFirmaIn(List<Date> values) {
            addCriterionForJDBCDate("fh_firma in", values, "fhFirma");
            return (Criteria) this;
        }

        public Criteria andFhFirmaNotIn(List<Date> values) {
            addCriterionForJDBCDate("fh_firma not in", values, "fhFirma");
            return (Criteria) this;
        }

        public Criteria andFhFirmaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fh_firma between", value1, value2, "fhFirma");
            return (Criteria) this;
        }

        public Criteria andFhFirmaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fh_firma not between", value1, value2, "fhFirma");
            return (Criteria) this;
        }

        public Criteria andNombreFirmantePIsNull() {
            addCriterion("nombre_firmante_p is null");
            return (Criteria) this;
        }

        public Criteria andNombreFirmantePIsNotNull() {
            addCriterion("nombre_firmante_p is not null");
            return (Criteria) this;
        }

        public Criteria andNombreFirmantePEqualTo(String value) {
            addCriterion("nombre_firmante_p =", value, "nombreFirmanteP");
            return (Criteria) this;
        }

        public Criteria andNombreFirmantePNotEqualTo(String value) {
            addCriterion("nombre_firmante_p <>", value, "nombreFirmanteP");
            return (Criteria) this;
        }

        public Criteria andNombreFirmantePGreaterThan(String value) {
            addCriterion("nombre_firmante_p >", value, "nombreFirmanteP");
            return (Criteria) this;
        }

        public Criteria andNombreFirmantePGreaterThanOrEqualTo(String value) {
            addCriterion("nombre_firmante_p >=", value, "nombreFirmanteP");
            return (Criteria) this;
        }

        public Criteria andNombreFirmantePLessThan(String value) {
            addCriterion("nombre_firmante_p <", value, "nombreFirmanteP");
            return (Criteria) this;
        }

        public Criteria andNombreFirmantePLessThanOrEqualTo(String value) {
            addCriterion("nombre_firmante_p <=", value, "nombreFirmanteP");
            return (Criteria) this;
        }

        public Criteria andNombreFirmantePLike(String value) {
            addCriterion("nombre_firmante_p like", value, "nombreFirmanteP");
            return (Criteria) this;
        }

        public Criteria andNombreFirmantePNotLike(String value) {
            addCriterion("nombre_firmante_p not like", value, "nombreFirmanteP");
            return (Criteria) this;
        }

        public Criteria andNombreFirmantePIn(List<String> values) {
            addCriterion("nombre_firmante_p in", values, "nombreFirmanteP");
            return (Criteria) this;
        }

        public Criteria andNombreFirmantePNotIn(List<String> values) {
            addCriterion("nombre_firmante_p not in", values, "nombreFirmanteP");
            return (Criteria) this;
        }

        public Criteria andNombreFirmantePBetween(String value1, String value2) {
            addCriterion("nombre_firmante_p between", value1, value2, "nombreFirmanteP");
            return (Criteria) this;
        }

        public Criteria andNombreFirmantePNotBetween(String value1, String value2) {
            addCriterion("nombre_firmante_p not between", value1, value2, "nombreFirmanteP");
            return (Criteria) this;
        }

        public Criteria andCurpFirmantePIsNull() {
            addCriterion("curp_firmante_p is null");
            return (Criteria) this;
        }

        public Criteria andCurpFirmantePIsNotNull() {
            addCriterion("curp_firmante_p is not null");
            return (Criteria) this;
        }

        public Criteria andCurpFirmantePEqualTo(String value) {
            addCriterion("curp_firmante_p =", value, "curpFirmanteP");
            return (Criteria) this;
        }

        public Criteria andCurpFirmantePNotEqualTo(String value) {
            addCriterion("curp_firmante_p <>", value, "curpFirmanteP");
            return (Criteria) this;
        }

        public Criteria andCurpFirmantePGreaterThan(String value) {
            addCriterion("curp_firmante_p >", value, "curpFirmanteP");
            return (Criteria) this;
        }

        public Criteria andCurpFirmantePGreaterThanOrEqualTo(String value) {
            addCriterion("curp_firmante_p >=", value, "curpFirmanteP");
            return (Criteria) this;
        }

        public Criteria andCurpFirmantePLessThan(String value) {
            addCriterion("curp_firmante_p <", value, "curpFirmanteP");
            return (Criteria) this;
        }

        public Criteria andCurpFirmantePLessThanOrEqualTo(String value) {
            addCriterion("curp_firmante_p <=", value, "curpFirmanteP");
            return (Criteria) this;
        }

        public Criteria andCurpFirmantePLike(String value) {
            addCriterion("curp_firmante_p like", value, "curpFirmanteP");
            return (Criteria) this;
        }

        public Criteria andCurpFirmantePNotLike(String value) {
            addCriterion("curp_firmante_p not like", value, "curpFirmanteP");
            return (Criteria) this;
        }

        public Criteria andCurpFirmantePIn(List<String> values) {
            addCriterion("curp_firmante_p in", values, "curpFirmanteP");
            return (Criteria) this;
        }

        public Criteria andCurpFirmantePNotIn(List<String> values) {
            addCriterion("curp_firmante_p not in", values, "curpFirmanteP");
            return (Criteria) this;
        }

        public Criteria andCurpFirmantePBetween(String value1, String value2) {
            addCriterion("curp_firmante_p between", value1, value2, "curpFirmanteP");
            return (Criteria) this;
        }

        public Criteria andCurpFirmantePNotBetween(String value1, String value2) {
            addCriterion("curp_firmante_p not between", value1, value2, "curpFirmanteP");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmantePIsNull() {
            addCriterion("nu_serie_firmante_p is null");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmantePIsNotNull() {
            addCriterion("nu_serie_firmante_p is not null");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmantePEqualTo(String value) {
            addCriterion("nu_serie_firmante_p =", value, "nuSerieFirmanteP");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmantePNotEqualTo(String value) {
            addCriterion("nu_serie_firmante_p <>", value, "nuSerieFirmanteP");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmantePGreaterThan(String value) {
            addCriterion("nu_serie_firmante_p >", value, "nuSerieFirmanteP");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmantePGreaterThanOrEqualTo(String value) {
            addCriterion("nu_serie_firmante_p >=", value, "nuSerieFirmanteP");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmantePLessThan(String value) {
            addCriterion("nu_serie_firmante_p <", value, "nuSerieFirmanteP");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmantePLessThanOrEqualTo(String value) {
            addCriterion("nu_serie_firmante_p <=", value, "nuSerieFirmanteP");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmantePLike(String value) {
            addCriterion("nu_serie_firmante_p like", value, "nuSerieFirmanteP");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmantePNotLike(String value) {
            addCriterion("nu_serie_firmante_p not like", value, "nuSerieFirmanteP");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmantePIn(List<String> values) {
            addCriterion("nu_serie_firmante_p in", values, "nuSerieFirmanteP");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmantePNotIn(List<String> values) {
            addCriterion("nu_serie_firmante_p not in", values, "nuSerieFirmanteP");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmantePBetween(String value1, String value2) {
            addCriterion("nu_serie_firmante_p between", value1, value2, "nuSerieFirmanteP");
            return (Criteria) this;
        }

        public Criteria andNuSerieFirmantePNotBetween(String value1, String value2) {
            addCriterion("nu_serie_firmante_p not between", value1, value2, "nuSerieFirmanteP");
            return (Criteria) this;
        }

        public Criteria andFirmaPIsNull() {
            addCriterion("firma_p is null");
            return (Criteria) this;
        }

        public Criteria andFirmaPIsNotNull() {
            addCriterion("firma_p is not null");
            return (Criteria) this;
        }

        public Criteria andFirmaPEqualTo(String value) {
            addCriterion("firma_p =", value, "firmaP");
            return (Criteria) this;
        }

        public Criteria andFirmaPNotEqualTo(String value) {
            addCriterion("firma_p <>", value, "firmaP");
            return (Criteria) this;
        }

        public Criteria andFirmaPGreaterThan(String value) {
            addCriterion("firma_p >", value, "firmaP");
            return (Criteria) this;
        }

        public Criteria andFirmaPGreaterThanOrEqualTo(String value) {
            addCriterion("firma_p >=", value, "firmaP");
            return (Criteria) this;
        }

        public Criteria andFirmaPLessThan(String value) {
            addCriterion("firma_p <", value, "firmaP");
            return (Criteria) this;
        }

        public Criteria andFirmaPLessThanOrEqualTo(String value) {
            addCriterion("firma_p <=", value, "firmaP");
            return (Criteria) this;
        }

        public Criteria andFirmaPLike(String value) {
            addCriterion("firma_p like", value, "firmaP");
            return (Criteria) this;
        }

        public Criteria andFirmaPNotLike(String value) {
            addCriterion("firma_p not like", value, "firmaP");
            return (Criteria) this;
        }

        public Criteria andFirmaPIn(List<String> values) {
            addCriterion("firma_p in", values, "firmaP");
            return (Criteria) this;
        }

        public Criteria andFirmaPNotIn(List<String> values) {
            addCriterion("firma_p not in", values, "firmaP");
            return (Criteria) this;
        }

        public Criteria andFirmaPBetween(String value1, String value2) {
            addCriterion("firma_p between", value1, value2, "firmaP");
            return (Criteria) this;
        }

        public Criteria andFirmaPNotBetween(String value1, String value2) {
            addCriterion("firma_p not between", value1, value2, "firmaP");
            return (Criteria) this;
        }

        public Criteria andTsaPIsNull() {
            addCriterion("tsa_p is null");
            return (Criteria) this;
        }

        public Criteria andTsaPIsNotNull() {
            addCriterion("tsa_p is not null");
            return (Criteria) this;
        }

        public Criteria andTsaPEqualTo(String value) {
            addCriterion("tsa_p =", value, "tsaP");
            return (Criteria) this;
        }

        public Criteria andTsaPNotEqualTo(String value) {
            addCriterion("tsa_p <>", value, "tsaP");
            return (Criteria) this;
        }

        public Criteria andTsaPGreaterThan(String value) {
            addCriterion("tsa_p >", value, "tsaP");
            return (Criteria) this;
        }

        public Criteria andTsaPGreaterThanOrEqualTo(String value) {
            addCriterion("tsa_p >=", value, "tsaP");
            return (Criteria) this;
        }

        public Criteria andTsaPLessThan(String value) {
            addCriterion("tsa_p <", value, "tsaP");
            return (Criteria) this;
        }

        public Criteria andTsaPLessThanOrEqualTo(String value) {
            addCriterion("tsa_p <=", value, "tsaP");
            return (Criteria) this;
        }

        public Criteria andTsaPLike(String value) {
            addCriterion("tsa_p like", value, "tsaP");
            return (Criteria) this;
        }

        public Criteria andTsaPNotLike(String value) {
            addCriterion("tsa_p not like", value, "tsaP");
            return (Criteria) this;
        }

        public Criteria andTsaPIn(List<String> values) {
            addCriterion("tsa_p in", values, "tsaP");
            return (Criteria) this;
        }

        public Criteria andTsaPNotIn(List<String> values) {
            addCriterion("tsa_p not in", values, "tsaP");
            return (Criteria) this;
        }

        public Criteria andTsaPBetween(String value1, String value2) {
            addCriterion("tsa_p between", value1, value2, "tsaP");
            return (Criteria) this;
        }

        public Criteria andTsaPNotBetween(String value1, String value2) {
            addCriterion("tsa_p not between", value1, value2, "tsaP");
            return (Criteria) this;
        }

        public Criteria andFhFirmaPIsNull() {
            addCriterion("fh_firma_p is null");
            return (Criteria) this;
        }

        public Criteria andFhFirmaPIsNotNull() {
            addCriterion("fh_firma_p is not null");
            return (Criteria) this;
        }

        public Criteria andFhFirmaPEqualTo(Date value) {
            addCriterionForJDBCDate("fh_firma_p =", value, "fhFirmaP");
            return (Criteria) this;
        }

        public Criteria andFhFirmaPNotEqualTo(Date value) {
            addCriterionForJDBCDate("fh_firma_p <>", value, "fhFirmaP");
            return (Criteria) this;
        }

        public Criteria andFhFirmaPGreaterThan(Date value) {
            addCriterionForJDBCDate("fh_firma_p >", value, "fhFirmaP");
            return (Criteria) this;
        }

        public Criteria andFhFirmaPGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fh_firma_p >=", value, "fhFirmaP");
            return (Criteria) this;
        }

        public Criteria andFhFirmaPLessThan(Date value) {
            addCriterionForJDBCDate("fh_firma_p <", value, "fhFirmaP");
            return (Criteria) this;
        }

        public Criteria andFhFirmaPLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fh_firma_p <=", value, "fhFirmaP");
            return (Criteria) this;
        }

        public Criteria andFhFirmaPIn(List<Date> values) {
            addCriterionForJDBCDate("fh_firma_p in", values, "fhFirmaP");
            return (Criteria) this;
        }

        public Criteria andFhFirmaPNotIn(List<Date> values) {
            addCriterionForJDBCDate("fh_firma_p not in", values, "fhFirmaP");
            return (Criteria) this;
        }

        public Criteria andFhFirmaPBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fh_firma_p between", value1, value2, "fhFirmaP");
            return (Criteria) this;
        }

        public Criteria andFhFirmaPNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fh_firma_p not between", value1, value2, "fhFirmaP");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}