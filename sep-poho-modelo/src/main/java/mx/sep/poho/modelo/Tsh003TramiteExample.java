package mx.sep.poho.modelo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Tsh003TramiteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tsh003TramiteExample() {
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

        public Criteria andCveConsecTramIsNull() {
            addCriterion("cve_consec_tram is null");
            return (Criteria) this;
        }

        public Criteria andCveConsecTramIsNotNull() {
            addCriterion("cve_consec_tram is not null");
            return (Criteria) this;
        }

        public Criteria andCveConsecTramEqualTo(Short value) {
            addCriterion("cve_consec_tram =", value, "cveConsecTram");
            return (Criteria) this;
        }

        public Criteria andCveConsecTramNotEqualTo(Short value) {
            addCriterion("cve_consec_tram <>", value, "cveConsecTram");
            return (Criteria) this;
        }

        public Criteria andCveConsecTramGreaterThan(Short value) {
            addCriterion("cve_consec_tram >", value, "cveConsecTram");
            return (Criteria) this;
        }

        public Criteria andCveConsecTramGreaterThanOrEqualTo(Short value) {
            addCriterion("cve_consec_tram >=", value, "cveConsecTram");
            return (Criteria) this;
        }

        public Criteria andCveConsecTramLessThan(Short value) {
            addCriterion("cve_consec_tram <", value, "cveConsecTram");
            return (Criteria) this;
        }

        public Criteria andCveConsecTramLessThanOrEqualTo(Short value) {
            addCriterion("cve_consec_tram <=", value, "cveConsecTram");
            return (Criteria) this;
        }

        public Criteria andCveConsecTramIn(List<Short> values) {
            addCriterion("cve_consec_tram in", values, "cveConsecTram");
            return (Criteria) this;
        }

        public Criteria andCveConsecTramNotIn(List<Short> values) {
            addCriterion("cve_consec_tram not in", values, "cveConsecTram");
            return (Criteria) this;
        }

        public Criteria andCveConsecTramBetween(Short value1, Short value2) {
            addCriterion("cve_consec_tram between", value1, value2, "cveConsecTram");
            return (Criteria) this;
        }

        public Criteria andCveConsecTramNotBetween(Short value1, Short value2) {
            addCriterion("cve_consec_tram not between", value1, value2, "cveConsecTram");
            return (Criteria) this;
        }

        public Criteria andNuOficioIsNull() {
            addCriterion("nu_oficio is null");
            return (Criteria) this;
        }

        public Criteria andNuOficioIsNotNull() {
            addCriterion("nu_oficio is not null");
            return (Criteria) this;
        }

        public Criteria andNuOficioEqualTo(Integer value) {
            addCriterion("nu_oficio =", value, "nuOficio");
            return (Criteria) this;
        }

        public Criteria andNuOficioNotEqualTo(Integer value) {
            addCriterion("nu_oficio <>", value, "nuOficio");
            return (Criteria) this;
        }

        public Criteria andNuOficioGreaterThan(Integer value) {
            addCriterion("nu_oficio >", value, "nuOficio");
            return (Criteria) this;
        }

        public Criteria andNuOficioGreaterThanOrEqualTo(Integer value) {
            addCriterion("nu_oficio >=", value, "nuOficio");
            return (Criteria) this;
        }

        public Criteria andNuOficioLessThan(Integer value) {
            addCriterion("nu_oficio <", value, "nuOficio");
            return (Criteria) this;
        }

        public Criteria andNuOficioLessThanOrEqualTo(Integer value) {
            addCriterion("nu_oficio <=", value, "nuOficio");
            return (Criteria) this;
        }

        public Criteria andNuOficioIn(List<Integer> values) {
            addCriterion("nu_oficio in", values, "nuOficio");
            return (Criteria) this;
        }

        public Criteria andNuOficioNotIn(List<Integer> values) {
            addCriterion("nu_oficio not in", values, "nuOficio");
            return (Criteria) this;
        }

        public Criteria andNuOficioBetween(Integer value1, Integer value2) {
            addCriterion("nu_oficio between", value1, value2, "nuOficio");
            return (Criteria) this;
        }

        public Criteria andNuOficioNotBetween(Integer value1, Integer value2) {
            addCriterion("nu_oficio not between", value1, value2, "nuOficio");
            return (Criteria) this;
        }

        public Criteria andCveUsuarioIsNull() {
            addCriterion("cve_usuario is null");
            return (Criteria) this;
        }

        public Criteria andCveUsuarioIsNotNull() {
            addCriterion("cve_usuario is not null");
            return (Criteria) this;
        }

        public Criteria andCveUsuarioEqualTo(String value) {
            addCriterion("cve_usuario =", value, "cveUsuario");
            return (Criteria) this;
        }

        public Criteria andCveUsuarioNotEqualTo(String value) {
            addCriterion("cve_usuario <>", value, "cveUsuario");
            return (Criteria) this;
        }

        public Criteria andCveUsuarioGreaterThan(String value) {
            addCriterion("cve_usuario >", value, "cveUsuario");
            return (Criteria) this;
        }

        public Criteria andCveUsuarioGreaterThanOrEqualTo(String value) {
            addCriterion("cve_usuario >=", value, "cveUsuario");
            return (Criteria) this;
        }

        public Criteria andCveUsuarioLessThan(String value) {
            addCriterion("cve_usuario <", value, "cveUsuario");
            return (Criteria) this;
        }

        public Criteria andCveUsuarioLessThanOrEqualTo(String value) {
            addCriterion("cve_usuario <=", value, "cveUsuario");
            return (Criteria) this;
        }

        public Criteria andCveUsuarioLike(String value) {
            addCriterion("cve_usuario like", value, "cveUsuario");
            return (Criteria) this;
        }

        public Criteria andCveUsuarioNotLike(String value) {
            addCriterion("cve_usuario not like", value, "cveUsuario");
            return (Criteria) this;
        }

        public Criteria andCveUsuarioIn(List<String> values) {
            addCriterion("cve_usuario in", values, "cveUsuario");
            return (Criteria) this;
        }

        public Criteria andCveUsuarioNotIn(List<String> values) {
            addCriterion("cve_usuario not in", values, "cveUsuario");
            return (Criteria) this;
        }

        public Criteria andCveUsuarioBetween(String value1, String value2) {
            addCriterion("cve_usuario between", value1, value2, "cveUsuario");
            return (Criteria) this;
        }

        public Criteria andCveUsuarioNotBetween(String value1, String value2) {
            addCriterion("cve_usuario not between", value1, value2, "cveUsuario");
            return (Criteria) this;
        }

        public Criteria andCveConsecutivoIsNull() {
            addCriterion("cve_consecutivo is null");
            return (Criteria) this;
        }

        public Criteria andCveConsecutivoIsNotNull() {
            addCriterion("cve_consecutivo is not null");
            return (Criteria) this;
        }

        public Criteria andCveConsecutivoEqualTo(Short value) {
            addCriterion("cve_consecutivo =", value, "cveConsecutivo");
            return (Criteria) this;
        }

        public Criteria andCveConsecutivoNotEqualTo(Short value) {
            addCriterion("cve_consecutivo <>", value, "cveConsecutivo");
            return (Criteria) this;
        }

        public Criteria andCveConsecutivoGreaterThan(Short value) {
            addCriterion("cve_consecutivo >", value, "cveConsecutivo");
            return (Criteria) this;
        }

        public Criteria andCveConsecutivoGreaterThanOrEqualTo(Short value) {
            addCriterion("cve_consecutivo >=", value, "cveConsecutivo");
            return (Criteria) this;
        }

        public Criteria andCveConsecutivoLessThan(Short value) {
            addCriterion("cve_consecutivo <", value, "cveConsecutivo");
            return (Criteria) this;
        }

        public Criteria andCveConsecutivoLessThanOrEqualTo(Short value) {
            addCriterion("cve_consecutivo <=", value, "cveConsecutivo");
            return (Criteria) this;
        }

        public Criteria andCveConsecutivoIn(List<Short> values) {
            addCriterion("cve_consecutivo in", values, "cveConsecutivo");
            return (Criteria) this;
        }

        public Criteria andCveConsecutivoNotIn(List<Short> values) {
            addCriterion("cve_consecutivo not in", values, "cveConsecutivo");
            return (Criteria) this;
        }

        public Criteria andCveConsecutivoBetween(Short value1, Short value2) {
            addCriterion("cve_consecutivo between", value1, value2, "cveConsecutivo");
            return (Criteria) this;
        }

        public Criteria andCveConsecutivoNotBetween(Short value1, Short value2) {
            addCriterion("cve_consecutivo not between", value1, value2, "cveConsecutivo");
            return (Criteria) this;
        }

        public Criteria andCveStatusIsNull() {
            addCriterion("cve_status is null");
            return (Criteria) this;
        }

        public Criteria andCveStatusIsNotNull() {
            addCriterion("cve_status is not null");
            return (Criteria) this;
        }

        public Criteria andCveStatusEqualTo(Integer value) {
            addCriterion("cve_status =", value, "cveStatus");
            return (Criteria) this;
        }

        public Criteria andCveStatusNotEqualTo(Integer value) {
            addCriterion("cve_status <>", value, "cveStatus");
            return (Criteria) this;
        }

        public Criteria andCveStatusGreaterThan(Integer value) {
            addCriterion("cve_status >", value, "cveStatus");
            return (Criteria) this;
        }

        public Criteria andCveStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("cve_status >=", value, "cveStatus");
            return (Criteria) this;
        }

        public Criteria andCveStatusLessThan(Integer value) {
            addCriterion("cve_status <", value, "cveStatus");
            return (Criteria) this;
        }

        public Criteria andCveStatusLessThanOrEqualTo(Integer value) {
            addCriterion("cve_status <=", value, "cveStatus");
            return (Criteria) this;
        }

        public Criteria andCveStatusIn(List<Integer> values) {
            addCriterion("cve_status in", values, "cveStatus");
            return (Criteria) this;
        }

        public Criteria andCveStatusNotIn(List<Integer> values) {
            addCriterion("cve_status not in", values, "cveStatus");
            return (Criteria) this;
        }

        public Criteria andCveStatusBetween(Integer value1, Integer value2) {
            addCriterion("cve_status between", value1, value2, "cveStatus");
            return (Criteria) this;
        }

        public Criteria andCveStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("cve_status not between", value1, value2, "cveStatus");
            return (Criteria) this;
        }

        public Criteria andTpoTramiteIsNull() {
            addCriterion("tpo_tramite is null");
            return (Criteria) this;
        }

        public Criteria andTpoTramiteIsNotNull() {
            addCriterion("tpo_tramite is not null");
            return (Criteria) this;
        }

        public Criteria andTpoTramiteEqualTo(Integer value) {
            addCriterion("tpo_tramite =", value, "tpoTramite");
            return (Criteria) this;
        }

        public Criteria andTpoTramiteNotEqualTo(Integer value) {
            addCriterion("tpo_tramite <>", value, "tpoTramite");
            return (Criteria) this;
        }

        public Criteria andTpoTramiteGreaterThan(Integer value) {
            addCriterion("tpo_tramite >", value, "tpoTramite");
            return (Criteria) this;
        }

        public Criteria andTpoTramiteGreaterThanOrEqualTo(Integer value) {
            addCriterion("tpo_tramite >=", value, "tpoTramite");
            return (Criteria) this;
        }

        public Criteria andTpoTramiteLessThan(Integer value) {
            addCriterion("tpo_tramite <", value, "tpoTramite");
            return (Criteria) this;
        }

        public Criteria andTpoTramiteLessThanOrEqualTo(Integer value) {
            addCriterion("tpo_tramite <=", value, "tpoTramite");
            return (Criteria) this;
        }

        public Criteria andTpoTramiteIn(List<Integer> values) {
            addCriterion("tpo_tramite in", values, "tpoTramite");
            return (Criteria) this;
        }

        public Criteria andTpoTramiteNotIn(List<Integer> values) {
            addCriterion("tpo_tramite not in", values, "tpoTramite");
            return (Criteria) this;
        }

        public Criteria andTpoTramiteBetween(Integer value1, Integer value2) {
            addCriterion("tpo_tramite between", value1, value2, "tpoTramite");
            return (Criteria) this;
        }

        public Criteria andTpoTramiteNotBetween(Integer value1, Integer value2) {
            addCriterion("tpo_tramite not between", value1, value2, "tpoTramite");
            return (Criteria) this;
        }

        public Criteria andCveUnidadIsNull() {
            addCriterion("cve_unidad is null");
            return (Criteria) this;
        }

        public Criteria andCveUnidadIsNotNull() {
            addCriterion("cve_unidad is not null");
            return (Criteria) this;
        }

        public Criteria andCveUnidadEqualTo(String value) {
            addCriterion("cve_unidad =", value, "cveUnidad");
            return (Criteria) this;
        }

        public Criteria andCveUnidadNotEqualTo(String value) {
            addCriterion("cve_unidad <>", value, "cveUnidad");
            return (Criteria) this;
        }

        public Criteria andCveUnidadGreaterThan(String value) {
            addCriterion("cve_unidad >", value, "cveUnidad");
            return (Criteria) this;
        }

        public Criteria andCveUnidadGreaterThanOrEqualTo(String value) {
            addCriterion("cve_unidad >=", value, "cveUnidad");
            return (Criteria) this;
        }

        public Criteria andCveUnidadLessThan(String value) {
            addCriterion("cve_unidad <", value, "cveUnidad");
            return (Criteria) this;
        }

        public Criteria andCveUnidadLessThanOrEqualTo(String value) {
            addCriterion("cve_unidad <=", value, "cveUnidad");
            return (Criteria) this;
        }

        public Criteria andCveUnidadLike(String value) {
            addCriterion("cve_unidad like", value, "cveUnidad");
            return (Criteria) this;
        }

        public Criteria andCveUnidadNotLike(String value) {
            addCriterion("cve_unidad not like", value, "cveUnidad");
            return (Criteria) this;
        }

        public Criteria andCveUnidadIn(List<String> values) {
            addCriterion("cve_unidad in", values, "cveUnidad");
            return (Criteria) this;
        }

        public Criteria andCveUnidadNotIn(List<String> values) {
            addCriterion("cve_unidad not in", values, "cveUnidad");
            return (Criteria) this;
        }

        public Criteria andCveUnidadBetween(String value1, String value2) {
            addCriterion("cve_unidad between", value1, value2, "cveUnidad");
            return (Criteria) this;
        }

        public Criteria andCveUnidadNotBetween(String value1, String value2) {
            addCriterion("cve_unidad not between", value1, value2, "cveUnidad");
            return (Criteria) this;
        }

        public Criteria andApPaternoIsNull() {
            addCriterion("ap_paterno is null");
            return (Criteria) this;
        }

        public Criteria andApPaternoIsNotNull() {
            addCriterion("ap_paterno is not null");
            return (Criteria) this;
        }

        public Criteria andApPaternoEqualTo(String value) {
            addCriterion("ap_paterno =", value, "apPaterno");
            return (Criteria) this;
        }

        public Criteria andApPaternoNotEqualTo(String value) {
            addCriterion("ap_paterno <>", value, "apPaterno");
            return (Criteria) this;
        }

        public Criteria andApPaternoGreaterThan(String value) {
            addCriterion("ap_paterno >", value, "apPaterno");
            return (Criteria) this;
        }

        public Criteria andApPaternoGreaterThanOrEqualTo(String value) {
            addCriterion("ap_paterno >=", value, "apPaterno");
            return (Criteria) this;
        }

        public Criteria andApPaternoLessThan(String value) {
            addCriterion("ap_paterno <", value, "apPaterno");
            return (Criteria) this;
        }

        public Criteria andApPaternoLessThanOrEqualTo(String value) {
            addCriterion("ap_paterno <=", value, "apPaterno");
            return (Criteria) this;
        }

        public Criteria andApPaternoLike(String value) {
            addCriterion("ap_paterno like", value, "apPaterno");
            return (Criteria) this;
        }

        public Criteria andApPaternoNotLike(String value) {
            addCriterion("ap_paterno not like", value, "apPaterno");
            return (Criteria) this;
        }

        public Criteria andApPaternoIn(List<String> values) {
            addCriterion("ap_paterno in", values, "apPaterno");
            return (Criteria) this;
        }

        public Criteria andApPaternoNotIn(List<String> values) {
            addCriterion("ap_paterno not in", values, "apPaterno");
            return (Criteria) this;
        }

        public Criteria andApPaternoBetween(String value1, String value2) {
            addCriterion("ap_paterno between", value1, value2, "apPaterno");
            return (Criteria) this;
        }

        public Criteria andApPaternoNotBetween(String value1, String value2) {
            addCriterion("ap_paterno not between", value1, value2, "apPaterno");
            return (Criteria) this;
        }

        public Criteria andApMaternoIsNull() {
            addCriterion("ap_materno is null");
            return (Criteria) this;
        }

        public Criteria andApMaternoIsNotNull() {
            addCriterion("ap_materno is not null");
            return (Criteria) this;
        }

        public Criteria andApMaternoEqualTo(String value) {
            addCriterion("ap_materno =", value, "apMaterno");
            return (Criteria) this;
        }

        public Criteria andApMaternoNotEqualTo(String value) {
            addCriterion("ap_materno <>", value, "apMaterno");
            return (Criteria) this;
        }

        public Criteria andApMaternoGreaterThan(String value) {
            addCriterion("ap_materno >", value, "apMaterno");
            return (Criteria) this;
        }

        public Criteria andApMaternoGreaterThanOrEqualTo(String value) {
            addCriterion("ap_materno >=", value, "apMaterno");
            return (Criteria) this;
        }

        public Criteria andApMaternoLessThan(String value) {
            addCriterion("ap_materno <", value, "apMaterno");
            return (Criteria) this;
        }

        public Criteria andApMaternoLessThanOrEqualTo(String value) {
            addCriterion("ap_materno <=", value, "apMaterno");
            return (Criteria) this;
        }

        public Criteria andApMaternoLike(String value) {
            addCriterion("ap_materno like", value, "apMaterno");
            return (Criteria) this;
        }

        public Criteria andApMaternoNotLike(String value) {
            addCriterion("ap_materno not like", value, "apMaterno");
            return (Criteria) this;
        }

        public Criteria andApMaternoIn(List<String> values) {
            addCriterion("ap_materno in", values, "apMaterno");
            return (Criteria) this;
        }

        public Criteria andApMaternoNotIn(List<String> values) {
            addCriterion("ap_materno not in", values, "apMaterno");
            return (Criteria) this;
        }

        public Criteria andApMaternoBetween(String value1, String value2) {
            addCriterion("ap_materno between", value1, value2, "apMaterno");
            return (Criteria) this;
        }

        public Criteria andApMaternoNotBetween(String value1, String value2) {
            addCriterion("ap_materno not between", value1, value2, "apMaterno");
            return (Criteria) this;
        }

        public Criteria andNbContratanteIsNull() {
            addCriterion("nb_contratante is null");
            return (Criteria) this;
        }

        public Criteria andNbContratanteIsNotNull() {
            addCriterion("nb_contratante is not null");
            return (Criteria) this;
        }

        public Criteria andNbContratanteEqualTo(String value) {
            addCriterion("nb_contratante =", value, "nbContratante");
            return (Criteria) this;
        }

        public Criteria andNbContratanteNotEqualTo(String value) {
            addCriterion("nb_contratante <>", value, "nbContratante");
            return (Criteria) this;
        }

        public Criteria andNbContratanteGreaterThan(String value) {
            addCriterion("nb_contratante >", value, "nbContratante");
            return (Criteria) this;
        }

        public Criteria andNbContratanteGreaterThanOrEqualTo(String value) {
            addCriterion("nb_contratante >=", value, "nbContratante");
            return (Criteria) this;
        }

        public Criteria andNbContratanteLessThan(String value) {
            addCriterion("nb_contratante <", value, "nbContratante");
            return (Criteria) this;
        }

        public Criteria andNbContratanteLessThanOrEqualTo(String value) {
            addCriterion("nb_contratante <=", value, "nbContratante");
            return (Criteria) this;
        }

        public Criteria andNbContratanteLike(String value) {
            addCriterion("nb_contratante like", value, "nbContratante");
            return (Criteria) this;
        }

        public Criteria andNbContratanteNotLike(String value) {
            addCriterion("nb_contratante not like", value, "nbContratante");
            return (Criteria) this;
        }

        public Criteria andNbContratanteIn(List<String> values) {
            addCriterion("nb_contratante in", values, "nbContratante");
            return (Criteria) this;
        }

        public Criteria andNbContratanteNotIn(List<String> values) {
            addCriterion("nb_contratante not in", values, "nbContratante");
            return (Criteria) this;
        }

        public Criteria andNbContratanteBetween(String value1, String value2) {
            addCriterion("nb_contratante between", value1, value2, "nbContratante");
            return (Criteria) this;
        }

        public Criteria andNbContratanteNotBetween(String value1, String value2) {
            addCriterion("nb_contratante not between", value1, value2, "nbContratante");
            return (Criteria) this;
        }

        public Criteria andTpoSexoIsNull() {
            addCriterion("tpo_sexo is null");
            return (Criteria) this;
        }

        public Criteria andTpoSexoIsNotNull() {
            addCriterion("tpo_sexo is not null");
            return (Criteria) this;
        }

        public Criteria andTpoSexoEqualTo(String value) {
            addCriterion("tpo_sexo =", value, "tpoSexo");
            return (Criteria) this;
        }

        public Criteria andTpoSexoNotEqualTo(String value) {
            addCriterion("tpo_sexo <>", value, "tpoSexo");
            return (Criteria) this;
        }

        public Criteria andTpoSexoGreaterThan(String value) {
            addCriterion("tpo_sexo >", value, "tpoSexo");
            return (Criteria) this;
        }

        public Criteria andTpoSexoGreaterThanOrEqualTo(String value) {
            addCriterion("tpo_sexo >=", value, "tpoSexo");
            return (Criteria) this;
        }

        public Criteria andTpoSexoLessThan(String value) {
            addCriterion("tpo_sexo <", value, "tpoSexo");
            return (Criteria) this;
        }

        public Criteria andTpoSexoLessThanOrEqualTo(String value) {
            addCriterion("tpo_sexo <=", value, "tpoSexo");
            return (Criteria) this;
        }

        public Criteria andTpoSexoLike(String value) {
            addCriterion("tpo_sexo like", value, "tpoSexo");
            return (Criteria) this;
        }

        public Criteria andTpoSexoNotLike(String value) {
            addCriterion("tpo_sexo not like", value, "tpoSexo");
            return (Criteria) this;
        }

        public Criteria andTpoSexoIn(List<String> values) {
            addCriterion("tpo_sexo in", values, "tpoSexo");
            return (Criteria) this;
        }

        public Criteria andTpoSexoNotIn(List<String> values) {
            addCriterion("tpo_sexo not in", values, "tpoSexo");
            return (Criteria) this;
        }

        public Criteria andTpoSexoBetween(String value1, String value2) {
            addCriterion("tpo_sexo between", value1, value2, "tpoSexo");
            return (Criteria) this;
        }

        public Criteria andTpoSexoNotBetween(String value1, String value2) {
            addCriterion("tpo_sexo not between", value1, value2, "tpoSexo");
            return (Criteria) this;
        }

        public Criteria andRfcIsNull() {
            addCriterion("rfc is null");
            return (Criteria) this;
        }

        public Criteria andRfcIsNotNull() {
            addCriterion("rfc is not null");
            return (Criteria) this;
        }

        public Criteria andRfcEqualTo(String value) {
            addCriterion("rfc =", value, "rfc");
            return (Criteria) this;
        }

        public Criteria andRfcNotEqualTo(String value) {
            addCriterion("rfc <>", value, "rfc");
            return (Criteria) this;
        }

        public Criteria andRfcGreaterThan(String value) {
            addCriterion("rfc >", value, "rfc");
            return (Criteria) this;
        }

        public Criteria andRfcGreaterThanOrEqualTo(String value) {
            addCriterion("rfc >=", value, "rfc");
            return (Criteria) this;
        }

        public Criteria andRfcLessThan(String value) {
            addCriterion("rfc <", value, "rfc");
            return (Criteria) this;
        }

        public Criteria andRfcLessThanOrEqualTo(String value) {
            addCriterion("rfc <=", value, "rfc");
            return (Criteria) this;
        }

        public Criteria andRfcLike(String value) {
            addCriterion("rfc like", value, "rfc");
            return (Criteria) this;
        }

        public Criteria andRfcNotLike(String value) {
            addCriterion("rfc not like", value, "rfc");
            return (Criteria) this;
        }

        public Criteria andRfcIn(List<String> values) {
            addCriterion("rfc in", values, "rfc");
            return (Criteria) this;
        }

        public Criteria andRfcNotIn(List<String> values) {
            addCriterion("rfc not in", values, "rfc");
            return (Criteria) this;
        }

        public Criteria andRfcBetween(String value1, String value2) {
            addCriterion("rfc between", value1, value2, "rfc");
            return (Criteria) this;
        }

        public Criteria andRfcNotBetween(String value1, String value2) {
            addCriterion("rfc not between", value1, value2, "rfc");
            return (Criteria) this;
        }

        public Criteria andCveTituloIsNull() {
            addCriterion("cve_titulo is null");
            return (Criteria) this;
        }

        public Criteria andCveTituloIsNotNull() {
            addCriterion("cve_titulo is not null");
            return (Criteria) this;
        }

        public Criteria andCveTituloEqualTo(Integer value) {
            addCriterion("cve_titulo =", value, "cveTitulo");
            return (Criteria) this;
        }

        public Criteria andCveTituloNotEqualTo(Integer value) {
            addCriterion("cve_titulo <>", value, "cveTitulo");
            return (Criteria) this;
        }

        public Criteria andCveTituloGreaterThan(Integer value) {
            addCriterion("cve_titulo >", value, "cveTitulo");
            return (Criteria) this;
        }

        public Criteria andCveTituloGreaterThanOrEqualTo(Integer value) {
            addCriterion("cve_titulo >=", value, "cveTitulo");
            return (Criteria) this;
        }

        public Criteria andCveTituloLessThan(Integer value) {
            addCriterion("cve_titulo <", value, "cveTitulo");
            return (Criteria) this;
        }

        public Criteria andCveTituloLessThanOrEqualTo(Integer value) {
            addCriterion("cve_titulo <=", value, "cveTitulo");
            return (Criteria) this;
        }

        public Criteria andCveTituloIn(List<Integer> values) {
            addCriterion("cve_titulo in", values, "cveTitulo");
            return (Criteria) this;
        }

        public Criteria andCveTituloNotIn(List<Integer> values) {
            addCriterion("cve_titulo not in", values, "cveTitulo");
            return (Criteria) this;
        }

        public Criteria andCveTituloBetween(Integer value1, Integer value2) {
            addCriterion("cve_titulo between", value1, value2, "cveTitulo");
            return (Criteria) this;
        }

        public Criteria andCveTituloNotBetween(Integer value1, Integer value2) {
            addCriterion("cve_titulo not between", value1, value2, "cveTitulo");
            return (Criteria) this;
        }

        public Criteria andCveNivelPuestoIsNull() {
            addCriterion("cve_nivel_puesto is null");
            return (Criteria) this;
        }

        public Criteria andCveNivelPuestoIsNotNull() {
            addCriterion("cve_nivel_puesto is not null");
            return (Criteria) this;
        }

        public Criteria andCveNivelPuestoEqualTo(String value) {
            addCriterion("cve_nivel_puesto =", value, "cveNivelPuesto");
            return (Criteria) this;
        }

        public Criteria andCveNivelPuestoNotEqualTo(String value) {
            addCriterion("cve_nivel_puesto <>", value, "cveNivelPuesto");
            return (Criteria) this;
        }

        public Criteria andCveNivelPuestoGreaterThan(String value) {
            addCriterion("cve_nivel_puesto >", value, "cveNivelPuesto");
            return (Criteria) this;
        }

        public Criteria andCveNivelPuestoGreaterThanOrEqualTo(String value) {
            addCriterion("cve_nivel_puesto >=", value, "cveNivelPuesto");
            return (Criteria) this;
        }

        public Criteria andCveNivelPuestoLessThan(String value) {
            addCriterion("cve_nivel_puesto <", value, "cveNivelPuesto");
            return (Criteria) this;
        }

        public Criteria andCveNivelPuestoLessThanOrEqualTo(String value) {
            addCriterion("cve_nivel_puesto <=", value, "cveNivelPuesto");
            return (Criteria) this;
        }

        public Criteria andCveNivelPuestoLike(String value) {
            addCriterion("cve_nivel_puesto like", value, "cveNivelPuesto");
            return (Criteria) this;
        }

        public Criteria andCveNivelPuestoNotLike(String value) {
            addCriterion("cve_nivel_puesto not like", value, "cveNivelPuesto");
            return (Criteria) this;
        }

        public Criteria andCveNivelPuestoIn(List<String> values) {
            addCriterion("cve_nivel_puesto in", values, "cveNivelPuesto");
            return (Criteria) this;
        }

        public Criteria andCveNivelPuestoNotIn(List<String> values) {
            addCriterion("cve_nivel_puesto not in", values, "cveNivelPuesto");
            return (Criteria) this;
        }

        public Criteria andCveNivelPuestoBetween(String value1, String value2) {
            addCriterion("cve_nivel_puesto between", value1, value2, "cveNivelPuesto");
            return (Criteria) this;
        }

        public Criteria andCveNivelPuestoNotBetween(String value1, String value2) {
            addCriterion("cve_nivel_puesto not between", value1, value2, "cveNivelPuesto");
            return (Criteria) this;
        }

        public Criteria andCveEdoIsNull() {
            addCriterion("cve_edo is null");
            return (Criteria) this;
        }

        public Criteria andCveEdoIsNotNull() {
            addCriterion("cve_edo is not null");
            return (Criteria) this;
        }

        public Criteria andCveEdoEqualTo(Integer value) {
            addCriterion("cve_edo =", value, "cveEdo");
            return (Criteria) this;
        }

        public Criteria andCveEdoNotEqualTo(Integer value) {
            addCriterion("cve_edo <>", value, "cveEdo");
            return (Criteria) this;
        }

        public Criteria andCveEdoGreaterThan(Integer value) {
            addCriterion("cve_edo >", value, "cveEdo");
            return (Criteria) this;
        }

        public Criteria andCveEdoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cve_edo >=", value, "cveEdo");
            return (Criteria) this;
        }

        public Criteria andCveEdoLessThan(Integer value) {
            addCriterion("cve_edo <", value, "cveEdo");
            return (Criteria) this;
        }

        public Criteria andCveEdoLessThanOrEqualTo(Integer value) {
            addCriterion("cve_edo <=", value, "cveEdo");
            return (Criteria) this;
        }

        public Criteria andCveEdoIn(List<Integer> values) {
            addCriterion("cve_edo in", values, "cveEdo");
            return (Criteria) this;
        }

        public Criteria andCveEdoNotIn(List<Integer> values) {
            addCriterion("cve_edo not in", values, "cveEdo");
            return (Criteria) this;
        }

        public Criteria andCveEdoBetween(Integer value1, Integer value2) {
            addCriterion("cve_edo between", value1, value2, "cveEdo");
            return (Criteria) this;
        }

        public Criteria andCveEdoNotBetween(Integer value1, Integer value2) {
            addCriterion("cve_edo not between", value1, value2, "cveEdo");
            return (Criteria) this;
        }

        public Criteria andFhIniIsNull() {
            addCriterion("fh_ini is null");
            return (Criteria) this;
        }

        public Criteria andFhIniIsNotNull() {
            addCriterion("fh_ini is not null");
            return (Criteria) this;
        }

        public Criteria andFhIniEqualTo(Date value) {
            addCriterionForJDBCDate("fh_ini =", value, "fhIni");
            return (Criteria) this;
        }

        public Criteria andFhIniNotEqualTo(Date value) {
            addCriterionForJDBCDate("fh_ini <>", value, "fhIni");
            return (Criteria) this;
        }

        public Criteria andFhIniGreaterThan(Date value) {
            addCriterionForJDBCDate("fh_ini >", value, "fhIni");
            return (Criteria) this;
        }

        public Criteria andFhIniGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fh_ini >=", value, "fhIni");
            return (Criteria) this;
        }

        public Criteria andFhIniLessThan(Date value) {
            addCriterionForJDBCDate("fh_ini <", value, "fhIni");
            return (Criteria) this;
        }

        public Criteria andFhIniLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fh_ini <=", value, "fhIni");
            return (Criteria) this;
        }

        public Criteria andFhIniIn(List<Date> values) {
            addCriterionForJDBCDate("fh_ini in", values, "fhIni");
            return (Criteria) this;
        }

        public Criteria andFhIniNotIn(List<Date> values) {
            addCriterionForJDBCDate("fh_ini not in", values, "fhIni");
            return (Criteria) this;
        }

        public Criteria andFhIniBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fh_ini between", value1, value2, "fhIni");
            return (Criteria) this;
        }

        public Criteria andFhIniNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fh_ini not between", value1, value2, "fhIni");
            return (Criteria) this;
        }

        public Criteria andFhFinIsNull() {
            addCriterion("fh_fin is null");
            return (Criteria) this;
        }

        public Criteria andFhFinIsNotNull() {
            addCriterion("fh_fin is not null");
            return (Criteria) this;
        }

        public Criteria andFhFinEqualTo(Date value) {
            addCriterionForJDBCDate("fh_fin =", value, "fhFin");
            return (Criteria) this;
        }

        public Criteria andFhFinNotEqualTo(Date value) {
            addCriterionForJDBCDate("fh_fin <>", value, "fhFin");
            return (Criteria) this;
        }

        public Criteria andFhFinGreaterThan(Date value) {
            addCriterionForJDBCDate("fh_fin >", value, "fhFin");
            return (Criteria) this;
        }

        public Criteria andFhFinGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fh_fin >=", value, "fhFin");
            return (Criteria) this;
        }

        public Criteria andFhFinLessThan(Date value) {
            addCriterionForJDBCDate("fh_fin <", value, "fhFin");
            return (Criteria) this;
        }

        public Criteria andFhFinLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fh_fin <=", value, "fhFin");
            return (Criteria) this;
        }

        public Criteria andFhFinIn(List<Date> values) {
            addCriterionForJDBCDate("fh_fin in", values, "fhFin");
            return (Criteria) this;
        }

        public Criteria andFhFinNotIn(List<Date> values) {
            addCriterionForJDBCDate("fh_fin not in", values, "fhFin");
            return (Criteria) this;
        }

        public Criteria andFhFinBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fh_fin between", value1, value2, "fhFin");
            return (Criteria) this;
        }

        public Criteria andFhFinNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fh_fin not between", value1, value2, "fhFin");
            return (Criteria) this;
        }

        public Criteria andCveProgramaIsNull() {
            addCriterion("cve_programa is null");
            return (Criteria) this;
        }

        public Criteria andCveProgramaIsNotNull() {
            addCriterion("cve_programa is not null");
            return (Criteria) this;
        }

        public Criteria andCveProgramaEqualTo(String value) {
            addCriterion("cve_programa =", value, "cvePrograma");
            return (Criteria) this;
        }

        public Criteria andCveProgramaNotEqualTo(String value) {
            addCriterion("cve_programa <>", value, "cvePrograma");
            return (Criteria) this;
        }

        public Criteria andCveProgramaGreaterThan(String value) {
            addCriterion("cve_programa >", value, "cvePrograma");
            return (Criteria) this;
        }

        public Criteria andCveProgramaGreaterThanOrEqualTo(String value) {
            addCriterion("cve_programa >=", value, "cvePrograma");
            return (Criteria) this;
        }

        public Criteria andCveProgramaLessThan(String value) {
            addCriterion("cve_programa <", value, "cvePrograma");
            return (Criteria) this;
        }

        public Criteria andCveProgramaLessThanOrEqualTo(String value) {
            addCriterion("cve_programa <=", value, "cvePrograma");
            return (Criteria) this;
        }

        public Criteria andCveProgramaLike(String value) {
            addCriterion("cve_programa like", value, "cvePrograma");
            return (Criteria) this;
        }

        public Criteria andCveProgramaNotLike(String value) {
            addCriterion("cve_programa not like", value, "cvePrograma");
            return (Criteria) this;
        }

        public Criteria andCveProgramaIn(List<String> values) {
            addCriterion("cve_programa in", values, "cvePrograma");
            return (Criteria) this;
        }

        public Criteria andCveProgramaNotIn(List<String> values) {
            addCriterion("cve_programa not in", values, "cvePrograma");
            return (Criteria) this;
        }

        public Criteria andCveProgramaBetween(String value1, String value2) {
            addCriterion("cve_programa between", value1, value2, "cvePrograma");
            return (Criteria) this;
        }

        public Criteria andCveProgramaNotBetween(String value1, String value2) {
            addCriterion("cve_programa not between", value1, value2, "cvePrograma");
            return (Criteria) this;
        }

        public Criteria andCveCodigoIsNull() {
            addCriterion("cve_codigo is null");
            return (Criteria) this;
        }

        public Criteria andCveCodigoIsNotNull() {
            addCriterion("cve_codigo is not null");
            return (Criteria) this;
        }

        public Criteria andCveCodigoEqualTo(String value) {
            addCriterion("cve_codigo =", value, "cveCodigo");
            return (Criteria) this;
        }

        public Criteria andCveCodigoNotEqualTo(String value) {
            addCriterion("cve_codigo <>", value, "cveCodigo");
            return (Criteria) this;
        }

        public Criteria andCveCodigoGreaterThan(String value) {
            addCriterion("cve_codigo >", value, "cveCodigo");
            return (Criteria) this;
        }

        public Criteria andCveCodigoGreaterThanOrEqualTo(String value) {
            addCriterion("cve_codigo >=", value, "cveCodigo");
            return (Criteria) this;
        }

        public Criteria andCveCodigoLessThan(String value) {
            addCriterion("cve_codigo <", value, "cveCodigo");
            return (Criteria) this;
        }

        public Criteria andCveCodigoLessThanOrEqualTo(String value) {
            addCriterion("cve_codigo <=", value, "cveCodigo");
            return (Criteria) this;
        }

        public Criteria andCveCodigoLike(String value) {
            addCriterion("cve_codigo like", value, "cveCodigo");
            return (Criteria) this;
        }

        public Criteria andCveCodigoNotLike(String value) {
            addCriterion("cve_codigo not like", value, "cveCodigo");
            return (Criteria) this;
        }

        public Criteria andCveCodigoIn(List<String> values) {
            addCriterion("cve_codigo in", values, "cveCodigo");
            return (Criteria) this;
        }

        public Criteria andCveCodigoNotIn(List<String> values) {
            addCriterion("cve_codigo not in", values, "cveCodigo");
            return (Criteria) this;
        }

        public Criteria andCveCodigoBetween(String value1, String value2) {
            addCriterion("cve_codigo between", value1, value2, "cveCodigo");
            return (Criteria) this;
        }

        public Criteria andCveCodigoNotBetween(String value1, String value2) {
            addCriterion("cve_codigo not between", value1, value2, "cveCodigo");
            return (Criteria) this;
        }

        public Criteria andNuOficioShcpIsNull() {
            addCriterion("nu_oficio_shcp is null");
            return (Criteria) this;
        }

        public Criteria andNuOficioShcpIsNotNull() {
            addCriterion("nu_oficio_shcp is not null");
            return (Criteria) this;
        }

        public Criteria andNuOficioShcpEqualTo(String value) {
            addCriterion("nu_oficio_shcp =", value, "nuOficioShcp");
            return (Criteria) this;
        }

        public Criteria andNuOficioShcpNotEqualTo(String value) {
            addCriterion("nu_oficio_shcp <>", value, "nuOficioShcp");
            return (Criteria) this;
        }

        public Criteria andNuOficioShcpGreaterThan(String value) {
            addCriterion("nu_oficio_shcp >", value, "nuOficioShcp");
            return (Criteria) this;
        }

        public Criteria andNuOficioShcpGreaterThanOrEqualTo(String value) {
            addCriterion("nu_oficio_shcp >=", value, "nuOficioShcp");
            return (Criteria) this;
        }

        public Criteria andNuOficioShcpLessThan(String value) {
            addCriterion("nu_oficio_shcp <", value, "nuOficioShcp");
            return (Criteria) this;
        }

        public Criteria andNuOficioShcpLessThanOrEqualTo(String value) {
            addCriterion("nu_oficio_shcp <=", value, "nuOficioShcp");
            return (Criteria) this;
        }

        public Criteria andNuOficioShcpLike(String value) {
            addCriterion("nu_oficio_shcp like", value, "nuOficioShcp");
            return (Criteria) this;
        }

        public Criteria andNuOficioShcpNotLike(String value) {
            addCriterion("nu_oficio_shcp not like", value, "nuOficioShcp");
            return (Criteria) this;
        }

        public Criteria andNuOficioShcpIn(List<String> values) {
            addCriterion("nu_oficio_shcp in", values, "nuOficioShcp");
            return (Criteria) this;
        }

        public Criteria andNuOficioShcpNotIn(List<String> values) {
            addCriterion("nu_oficio_shcp not in", values, "nuOficioShcp");
            return (Criteria) this;
        }

        public Criteria andNuOficioShcpBetween(String value1, String value2) {
            addCriterion("nu_oficio_shcp between", value1, value2, "nuOficioShcp");
            return (Criteria) this;
        }

        public Criteria andNuOficioShcpNotBetween(String value1, String value2) {
            addCriterion("nu_oficio_shcp not between", value1, value2, "nuOficioShcp");
            return (Criteria) this;
        }

        public Criteria andCveTpoProgramaIsNull() {
            addCriterion("cve_tpo_programa is null");
            return (Criteria) this;
        }

        public Criteria andCveTpoProgramaIsNotNull() {
            addCriterion("cve_tpo_programa is not null");
            return (Criteria) this;
        }

        public Criteria andCveTpoProgramaEqualTo(Integer value) {
            addCriterion("cve_tpo_programa =", value, "cveTpoPrograma");
            return (Criteria) this;
        }

        public Criteria andCveTpoProgramaNotEqualTo(Integer value) {
            addCriterion("cve_tpo_programa <>", value, "cveTpoPrograma");
            return (Criteria) this;
        }

        public Criteria andCveTpoProgramaGreaterThan(Integer value) {
            addCriterion("cve_tpo_programa >", value, "cveTpoPrograma");
            return (Criteria) this;
        }

        public Criteria andCveTpoProgramaGreaterThanOrEqualTo(Integer value) {
            addCriterion("cve_tpo_programa >=", value, "cveTpoPrograma");
            return (Criteria) this;
        }

        public Criteria andCveTpoProgramaLessThan(Integer value) {
            addCriterion("cve_tpo_programa <", value, "cveTpoPrograma");
            return (Criteria) this;
        }

        public Criteria andCveTpoProgramaLessThanOrEqualTo(Integer value) {
            addCriterion("cve_tpo_programa <=", value, "cveTpoPrograma");
            return (Criteria) this;
        }

        public Criteria andCveTpoProgramaIn(List<Integer> values) {
            addCriterion("cve_tpo_programa in", values, "cveTpoPrograma");
            return (Criteria) this;
        }

        public Criteria andCveTpoProgramaNotIn(List<Integer> values) {
            addCriterion("cve_tpo_programa not in", values, "cveTpoPrograma");
            return (Criteria) this;
        }

        public Criteria andCveTpoProgramaBetween(Integer value1, Integer value2) {
            addCriterion("cve_tpo_programa between", value1, value2, "cveTpoPrograma");
            return (Criteria) this;
        }

        public Criteria andCveTpoProgramaNotBetween(Integer value1, Integer value2) {
            addCriterion("cve_tpo_programa not between", value1, value2, "cveTpoPrograma");
            return (Criteria) this;
        }

        public Criteria andImPagoMesIsNull() {
            addCriterion("im_pago_mes is null");
            return (Criteria) this;
        }

        public Criteria andImPagoMesIsNotNull() {
            addCriterion("im_pago_mes is not null");
            return (Criteria) this;
        }

        public Criteria andImPagoMesEqualTo(BigDecimal value) {
            addCriterion("im_pago_mes =", value, "imPagoMes");
            return (Criteria) this;
        }

        public Criteria andImPagoMesNotEqualTo(BigDecimal value) {
            addCriterion("im_pago_mes <>", value, "imPagoMes");
            return (Criteria) this;
        }

        public Criteria andImPagoMesGreaterThan(BigDecimal value) {
            addCriterion("im_pago_mes >", value, "imPagoMes");
            return (Criteria) this;
        }

        public Criteria andImPagoMesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("im_pago_mes >=", value, "imPagoMes");
            return (Criteria) this;
        }

        public Criteria andImPagoMesLessThan(BigDecimal value) {
            addCriterion("im_pago_mes <", value, "imPagoMes");
            return (Criteria) this;
        }

        public Criteria andImPagoMesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("im_pago_mes <=", value, "imPagoMes");
            return (Criteria) this;
        }

        public Criteria andImPagoMesIn(List<BigDecimal> values) {
            addCriterion("im_pago_mes in", values, "imPagoMes");
            return (Criteria) this;
        }

        public Criteria andImPagoMesNotIn(List<BigDecimal> values) {
            addCriterion("im_pago_mes not in", values, "imPagoMes");
            return (Criteria) this;
        }

        public Criteria andImPagoMesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("im_pago_mes between", value1, value2, "imPagoMes");
            return (Criteria) this;
        }

        public Criteria andImPagoMesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("im_pago_mes not between", value1, value2, "imPagoMes");
            return (Criteria) this;
        }

        public Criteria andImAguinaldoIsNull() {
            addCriterion("im_aguinaldo is null");
            return (Criteria) this;
        }

        public Criteria andImAguinaldoIsNotNull() {
            addCriterion("im_aguinaldo is not null");
            return (Criteria) this;
        }

        public Criteria andImAguinaldoEqualTo(BigDecimal value) {
            addCriterion("im_aguinaldo =", value, "imAguinaldo");
            return (Criteria) this;
        }

        public Criteria andImAguinaldoNotEqualTo(BigDecimal value) {
            addCriterion("im_aguinaldo <>", value, "imAguinaldo");
            return (Criteria) this;
        }

        public Criteria andImAguinaldoGreaterThan(BigDecimal value) {
            addCriterion("im_aguinaldo >", value, "imAguinaldo");
            return (Criteria) this;
        }

        public Criteria andImAguinaldoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("im_aguinaldo >=", value, "imAguinaldo");
            return (Criteria) this;
        }

        public Criteria andImAguinaldoLessThan(BigDecimal value) {
            addCriterion("im_aguinaldo <", value, "imAguinaldo");
            return (Criteria) this;
        }

        public Criteria andImAguinaldoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("im_aguinaldo <=", value, "imAguinaldo");
            return (Criteria) this;
        }

        public Criteria andImAguinaldoIn(List<BigDecimal> values) {
            addCriterion("im_aguinaldo in", values, "imAguinaldo");
            return (Criteria) this;
        }

        public Criteria andImAguinaldoNotIn(List<BigDecimal> values) {
            addCriterion("im_aguinaldo not in", values, "imAguinaldo");
            return (Criteria) this;
        }

        public Criteria andImAguinaldoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("im_aguinaldo between", value1, value2, "imAguinaldo");
            return (Criteria) this;
        }

        public Criteria andImAguinaldoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("im_aguinaldo not between", value1, value2, "imAguinaldo");
            return (Criteria) this;
        }

        public Criteria andImTotalContratoIsNull() {
            addCriterion("im_total_contrato is null");
            return (Criteria) this;
        }

        public Criteria andImTotalContratoIsNotNull() {
            addCriterion("im_total_contrato is not null");
            return (Criteria) this;
        }

        public Criteria andImTotalContratoEqualTo(BigDecimal value) {
            addCriterion("im_total_contrato =", value, "imTotalContrato");
            return (Criteria) this;
        }

        public Criteria andImTotalContratoNotEqualTo(BigDecimal value) {
            addCriterion("im_total_contrato <>", value, "imTotalContrato");
            return (Criteria) this;
        }

        public Criteria andImTotalContratoGreaterThan(BigDecimal value) {
            addCriterion("im_total_contrato >", value, "imTotalContrato");
            return (Criteria) this;
        }

        public Criteria andImTotalContratoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("im_total_contrato >=", value, "imTotalContrato");
            return (Criteria) this;
        }

        public Criteria andImTotalContratoLessThan(BigDecimal value) {
            addCriterion("im_total_contrato <", value, "imTotalContrato");
            return (Criteria) this;
        }

        public Criteria andImTotalContratoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("im_total_contrato <=", value, "imTotalContrato");
            return (Criteria) this;
        }

        public Criteria andImTotalContratoIn(List<BigDecimal> values) {
            addCriterion("im_total_contrato in", values, "imTotalContrato");
            return (Criteria) this;
        }

        public Criteria andImTotalContratoNotIn(List<BigDecimal> values) {
            addCriterion("im_total_contrato not in", values, "imTotalContrato");
            return (Criteria) this;
        }

        public Criteria andImTotalContratoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("im_total_contrato between", value1, value2, "imTotalContrato");
            return (Criteria) this;
        }

        public Criteria andImTotalContratoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("im_total_contrato not between", value1, value2, "imTotalContrato");
            return (Criteria) this;
        }

        public Criteria andImPagadoIsNull() {
            addCriterion("im_pagado is null");
            return (Criteria) this;
        }

        public Criteria andImPagadoIsNotNull() {
            addCriterion("im_pagado is not null");
            return (Criteria) this;
        }

        public Criteria andImPagadoEqualTo(BigDecimal value) {
            addCriterion("im_pagado =", value, "imPagado");
            return (Criteria) this;
        }

        public Criteria andImPagadoNotEqualTo(BigDecimal value) {
            addCriterion("im_pagado <>", value, "imPagado");
            return (Criteria) this;
        }

        public Criteria andImPagadoGreaterThan(BigDecimal value) {
            addCriterion("im_pagado >", value, "imPagado");
            return (Criteria) this;
        }

        public Criteria andImPagadoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("im_pagado >=", value, "imPagado");
            return (Criteria) this;
        }

        public Criteria andImPagadoLessThan(BigDecimal value) {
            addCriterion("im_pagado <", value, "imPagado");
            return (Criteria) this;
        }

        public Criteria andImPagadoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("im_pagado <=", value, "imPagado");
            return (Criteria) this;
        }

        public Criteria andImPagadoIn(List<BigDecimal> values) {
            addCriterion("im_pagado in", values, "imPagado");
            return (Criteria) this;
        }

        public Criteria andImPagadoNotIn(List<BigDecimal> values) {
            addCriterion("im_pagado not in", values, "imPagado");
            return (Criteria) this;
        }

        public Criteria andImPagadoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("im_pagado between", value1, value2, "imPagado");
            return (Criteria) this;
        }

        public Criteria andImPagadoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("im_pagado not between", value1, value2, "imPagado");
            return (Criteria) this;
        }

        public Criteria andImFaltanteIsNull() {
            addCriterion("im_faltante is null");
            return (Criteria) this;
        }

        public Criteria andImFaltanteIsNotNull() {
            addCriterion("im_faltante is not null");
            return (Criteria) this;
        }

        public Criteria andImFaltanteEqualTo(BigDecimal value) {
            addCriterion("im_faltante =", value, "imFaltante");
            return (Criteria) this;
        }

        public Criteria andImFaltanteNotEqualTo(BigDecimal value) {
            addCriterion("im_faltante <>", value, "imFaltante");
            return (Criteria) this;
        }

        public Criteria andImFaltanteGreaterThan(BigDecimal value) {
            addCriterion("im_faltante >", value, "imFaltante");
            return (Criteria) this;
        }

        public Criteria andImFaltanteGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("im_faltante >=", value, "imFaltante");
            return (Criteria) this;
        }

        public Criteria andImFaltanteLessThan(BigDecimal value) {
            addCriterion("im_faltante <", value, "imFaltante");
            return (Criteria) this;
        }

        public Criteria andImFaltanteLessThanOrEqualTo(BigDecimal value) {
            addCriterion("im_faltante <=", value, "imFaltante");
            return (Criteria) this;
        }

        public Criteria andImFaltanteIn(List<BigDecimal> values) {
            addCriterion("im_faltante in", values, "imFaltante");
            return (Criteria) this;
        }

        public Criteria andImFaltanteNotIn(List<BigDecimal> values) {
            addCriterion("im_faltante not in", values, "imFaltante");
            return (Criteria) this;
        }

        public Criteria andImFaltanteBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("im_faltante between", value1, value2, "imFaltante");
            return (Criteria) this;
        }

        public Criteria andImFaltanteNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("im_faltante not between", value1, value2, "imFaltante");
            return (Criteria) this;
        }

        public Criteria andCveDescFuncIsNull() {
            addCriterion("cve_desc_func is null");
            return (Criteria) this;
        }

        public Criteria andCveDescFuncIsNotNull() {
            addCriterion("cve_desc_func is not null");
            return (Criteria) this;
        }

        public Criteria andCveDescFuncEqualTo(Integer value) {
            addCriterion("cve_desc_func =", value, "cveDescFunc");
            return (Criteria) this;
        }

        public Criteria andCveDescFuncNotEqualTo(Integer value) {
            addCriterion("cve_desc_func <>", value, "cveDescFunc");
            return (Criteria) this;
        }

        public Criteria andCveDescFuncGreaterThan(Integer value) {
            addCriterion("cve_desc_func >", value, "cveDescFunc");
            return (Criteria) this;
        }

        public Criteria andCveDescFuncGreaterThanOrEqualTo(Integer value) {
            addCriterion("cve_desc_func >=", value, "cveDescFunc");
            return (Criteria) this;
        }

        public Criteria andCveDescFuncLessThan(Integer value) {
            addCriterion("cve_desc_func <", value, "cveDescFunc");
            return (Criteria) this;
        }

        public Criteria andCveDescFuncLessThanOrEqualTo(Integer value) {
            addCriterion("cve_desc_func <=", value, "cveDescFunc");
            return (Criteria) this;
        }

        public Criteria andCveDescFuncIn(List<Integer> values) {
            addCriterion("cve_desc_func in", values, "cveDescFunc");
            return (Criteria) this;
        }

        public Criteria andCveDescFuncNotIn(List<Integer> values) {
            addCriterion("cve_desc_func not in", values, "cveDescFunc");
            return (Criteria) this;
        }

        public Criteria andCveDescFuncBetween(Integer value1, Integer value2) {
            addCriterion("cve_desc_func between", value1, value2, "cveDescFunc");
            return (Criteria) this;
        }

        public Criteria andCveDescFuncNotBetween(Integer value1, Integer value2) {
            addCriterion("cve_desc_func not between", value1, value2, "cveDescFunc");
            return (Criteria) this;
        }

        public Criteria andDescripcionIsNull() {
            addCriterion("descripcion is null");
            return (Criteria) this;
        }

        public Criteria andDescripcionIsNotNull() {
            addCriterion("descripcion is not null");
            return (Criteria) this;
        }

        public Criteria andDescripcionEqualTo(String value) {
            addCriterion("descripcion =", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotEqualTo(String value) {
            addCriterion("descripcion <>", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionGreaterThan(String value) {
            addCriterion("descripcion >", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionGreaterThanOrEqualTo(String value) {
            addCriterion("descripcion >=", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLessThan(String value) {
            addCriterion("descripcion <", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLessThanOrEqualTo(String value) {
            addCriterion("descripcion <=", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLike(String value) {
            addCriterion("descripcion like", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotLike(String value) {
            addCriterion("descripcion not like", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionIn(List<String> values) {
            addCriterion("descripcion in", values, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotIn(List<String> values) {
            addCriterion("descripcion not in", values, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionBetween(String value1, String value2) {
            addCriterion("descripcion between", value1, value2, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotBetween(String value1, String value2) {
            addCriterion("descripcion not between", value1, value2, "descripcion");
            return (Criteria) this;
        }

        public Criteria andCveTpoPtoIsNull() {
            addCriterion("cve_tpo_pto is null");
            return (Criteria) this;
        }

        public Criteria andCveTpoPtoIsNotNull() {
            addCriterion("cve_tpo_pto is not null");
            return (Criteria) this;
        }

        public Criteria andCveTpoPtoEqualTo(Short value) {
            addCriterion("cve_tpo_pto =", value, "cveTpoPto");
            return (Criteria) this;
        }

        public Criteria andCveTpoPtoNotEqualTo(Short value) {
            addCriterion("cve_tpo_pto <>", value, "cveTpoPto");
            return (Criteria) this;
        }

        public Criteria andCveTpoPtoGreaterThan(Short value) {
            addCriterion("cve_tpo_pto >", value, "cveTpoPto");
            return (Criteria) this;
        }

        public Criteria andCveTpoPtoGreaterThanOrEqualTo(Short value) {
            addCriterion("cve_tpo_pto >=", value, "cveTpoPto");
            return (Criteria) this;
        }

        public Criteria andCveTpoPtoLessThan(Short value) {
            addCriterion("cve_tpo_pto <", value, "cveTpoPto");
            return (Criteria) this;
        }

        public Criteria andCveTpoPtoLessThanOrEqualTo(Short value) {
            addCriterion("cve_tpo_pto <=", value, "cveTpoPto");
            return (Criteria) this;
        }

        public Criteria andCveTpoPtoIn(List<Short> values) {
            addCriterion("cve_tpo_pto in", values, "cveTpoPto");
            return (Criteria) this;
        }

        public Criteria andCveTpoPtoNotIn(List<Short> values) {
            addCriterion("cve_tpo_pto not in", values, "cveTpoPto");
            return (Criteria) this;
        }

        public Criteria andCveTpoPtoBetween(Short value1, Short value2) {
            addCriterion("cve_tpo_pto between", value1, value2, "cveTpoPto");
            return (Criteria) this;
        }

        public Criteria andCveTpoPtoNotBetween(Short value1, Short value2) {
            addCriterion("cve_tpo_pto not between", value1, value2, "cveTpoPto");
            return (Criteria) this;
        }

        public Criteria andCveStatusPtoIsNull() {
            addCriterion("cve_status_pto is null");
            return (Criteria) this;
        }

        public Criteria andCveStatusPtoIsNotNull() {
            addCriterion("cve_status_pto is not null");
            return (Criteria) this;
        }

        public Criteria andCveStatusPtoEqualTo(Integer value) {
            addCriterion("cve_status_pto =", value, "cveStatusPto");
            return (Criteria) this;
        }

        public Criteria andCveStatusPtoNotEqualTo(Integer value) {
            addCriterion("cve_status_pto <>", value, "cveStatusPto");
            return (Criteria) this;
        }

        public Criteria andCveStatusPtoGreaterThan(Integer value) {
            addCriterion("cve_status_pto >", value, "cveStatusPto");
            return (Criteria) this;
        }

        public Criteria andCveStatusPtoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cve_status_pto >=", value, "cveStatusPto");
            return (Criteria) this;
        }

        public Criteria andCveStatusPtoLessThan(Integer value) {
            addCriterion("cve_status_pto <", value, "cveStatusPto");
            return (Criteria) this;
        }

        public Criteria andCveStatusPtoLessThanOrEqualTo(Integer value) {
            addCriterion("cve_status_pto <=", value, "cveStatusPto");
            return (Criteria) this;
        }

        public Criteria andCveStatusPtoIn(List<Integer> values) {
            addCriterion("cve_status_pto in", values, "cveStatusPto");
            return (Criteria) this;
        }

        public Criteria andCveStatusPtoNotIn(List<Integer> values) {
            addCriterion("cve_status_pto not in", values, "cveStatusPto");
            return (Criteria) this;
        }

        public Criteria andCveStatusPtoBetween(Integer value1, Integer value2) {
            addCriterion("cve_status_pto between", value1, value2, "cveStatusPto");
            return (Criteria) this;
        }

        public Criteria andCveStatusPtoNotBetween(Integer value1, Integer value2) {
            addCriterion("cve_status_pto not between", value1, value2, "cveStatusPto");
            return (Criteria) this;
        }

        public Criteria andCveTpoPdoIsNull() {
            addCriterion("cve_tpo_pdo is null");
            return (Criteria) this;
        }

        public Criteria andCveTpoPdoIsNotNull() {
            addCriterion("cve_tpo_pdo is not null");
            return (Criteria) this;
        }

        public Criteria andCveTpoPdoEqualTo(Integer value) {
            addCriterion("cve_tpo_pdo =", value, "cveTpoPdo");
            return (Criteria) this;
        }

        public Criteria andCveTpoPdoNotEqualTo(Integer value) {
            addCriterion("cve_tpo_pdo <>", value, "cveTpoPdo");
            return (Criteria) this;
        }

        public Criteria andCveTpoPdoGreaterThan(Integer value) {
            addCriterion("cve_tpo_pdo >", value, "cveTpoPdo");
            return (Criteria) this;
        }

        public Criteria andCveTpoPdoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cve_tpo_pdo >=", value, "cveTpoPdo");
            return (Criteria) this;
        }

        public Criteria andCveTpoPdoLessThan(Integer value) {
            addCriterion("cve_tpo_pdo <", value, "cveTpoPdo");
            return (Criteria) this;
        }

        public Criteria andCveTpoPdoLessThanOrEqualTo(Integer value) {
            addCriterion("cve_tpo_pdo <=", value, "cveTpoPdo");
            return (Criteria) this;
        }

        public Criteria andCveTpoPdoIn(List<Integer> values) {
            addCriterion("cve_tpo_pdo in", values, "cveTpoPdo");
            return (Criteria) this;
        }

        public Criteria andCveTpoPdoNotIn(List<Integer> values) {
            addCriterion("cve_tpo_pdo not in", values, "cveTpoPdo");
            return (Criteria) this;
        }

        public Criteria andCveTpoPdoBetween(Integer value1, Integer value2) {
            addCriterion("cve_tpo_pdo between", value1, value2, "cveTpoPdo");
            return (Criteria) this;
        }

        public Criteria andCveTpoPdoNotBetween(Integer value1, Integer value2) {
            addCriterion("cve_tpo_pdo not between", value1, value2, "cveTpoPdo");
            return (Criteria) this;
        }

        public Criteria andCveStatusPdoIsNull() {
            addCriterion("cve_status_pdo is null");
            return (Criteria) this;
        }

        public Criteria andCveStatusPdoIsNotNull() {
            addCriterion("cve_status_pdo is not null");
            return (Criteria) this;
        }

        public Criteria andCveStatusPdoEqualTo(Integer value) {
            addCriterion("cve_status_pdo =", value, "cveStatusPdo");
            return (Criteria) this;
        }

        public Criteria andCveStatusPdoNotEqualTo(Integer value) {
            addCriterion("cve_status_pdo <>", value, "cveStatusPdo");
            return (Criteria) this;
        }

        public Criteria andCveStatusPdoGreaterThan(Integer value) {
            addCriterion("cve_status_pdo >", value, "cveStatusPdo");
            return (Criteria) this;
        }

        public Criteria andCveStatusPdoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cve_status_pdo >=", value, "cveStatusPdo");
            return (Criteria) this;
        }

        public Criteria andCveStatusPdoLessThan(Integer value) {
            addCriterion("cve_status_pdo <", value, "cveStatusPdo");
            return (Criteria) this;
        }

        public Criteria andCveStatusPdoLessThanOrEqualTo(Integer value) {
            addCriterion("cve_status_pdo <=", value, "cveStatusPdo");
            return (Criteria) this;
        }

        public Criteria andCveStatusPdoIn(List<Integer> values) {
            addCriterion("cve_status_pdo in", values, "cveStatusPdo");
            return (Criteria) this;
        }

        public Criteria andCveStatusPdoNotIn(List<Integer> values) {
            addCriterion("cve_status_pdo not in", values, "cveStatusPdo");
            return (Criteria) this;
        }

        public Criteria andCveStatusPdoBetween(Integer value1, Integer value2) {
            addCriterion("cve_status_pdo between", value1, value2, "cveStatusPdo");
            return (Criteria) this;
        }

        public Criteria andCveStatusPdoNotBetween(Integer value1, Integer value2) {
            addCriterion("cve_status_pdo not between", value1, value2, "cveStatusPdo");
            return (Criteria) this;
        }

        public Criteria andObservacionesIsNull() {
            addCriterion("observaciones is null");
            return (Criteria) this;
        }

        public Criteria andObservacionesIsNotNull() {
            addCriterion("observaciones is not null");
            return (Criteria) this;
        }

        public Criteria andObservacionesEqualTo(String value) {
            addCriterion("observaciones =", value, "observaciones");
            return (Criteria) this;
        }

        public Criteria andObservacionesNotEqualTo(String value) {
            addCriterion("observaciones <>", value, "observaciones");
            return (Criteria) this;
        }

        public Criteria andObservacionesGreaterThan(String value) {
            addCriterion("observaciones >", value, "observaciones");
            return (Criteria) this;
        }

        public Criteria andObservacionesGreaterThanOrEqualTo(String value) {
            addCriterion("observaciones >=", value, "observaciones");
            return (Criteria) this;
        }

        public Criteria andObservacionesLessThan(String value) {
            addCriterion("observaciones <", value, "observaciones");
            return (Criteria) this;
        }

        public Criteria andObservacionesLessThanOrEqualTo(String value) {
            addCriterion("observaciones <=", value, "observaciones");
            return (Criteria) this;
        }

        public Criteria andObservacionesLike(String value) {
            addCriterion("observaciones like", value, "observaciones");
            return (Criteria) this;
        }

        public Criteria andObservacionesNotLike(String value) {
            addCriterion("observaciones not like", value, "observaciones");
            return (Criteria) this;
        }

        public Criteria andObservacionesIn(List<String> values) {
            addCriterion("observaciones in", values, "observaciones");
            return (Criteria) this;
        }

        public Criteria andObservacionesNotIn(List<String> values) {
            addCriterion("observaciones not in", values, "observaciones");
            return (Criteria) this;
        }

        public Criteria andObservacionesBetween(String value1, String value2) {
            addCriterion("observaciones between", value1, value2, "observaciones");
            return (Criteria) this;
        }

        public Criteria andObservacionesNotBetween(String value1, String value2) {
            addCriterion("observaciones not between", value1, value2, "observaciones");
            return (Criteria) this;
        }

        public Criteria andNuQuincIniIsNull() {
            addCriterion("nu_quinc_ini is null");
            return (Criteria) this;
        }

        public Criteria andNuQuincIniIsNotNull() {
            addCriterion("nu_quinc_ini is not null");
            return (Criteria) this;
        }

        public Criteria andNuQuincIniEqualTo(Short value) {
            addCriterion("nu_quinc_ini =", value, "nuQuincIni");
            return (Criteria) this;
        }

        public Criteria andNuQuincIniNotEqualTo(Short value) {
            addCriterion("nu_quinc_ini <>", value, "nuQuincIni");
            return (Criteria) this;
        }

        public Criteria andNuQuincIniGreaterThan(Short value) {
            addCriterion("nu_quinc_ini >", value, "nuQuincIni");
            return (Criteria) this;
        }

        public Criteria andNuQuincIniGreaterThanOrEqualTo(Short value) {
            addCriterion("nu_quinc_ini >=", value, "nuQuincIni");
            return (Criteria) this;
        }

        public Criteria andNuQuincIniLessThan(Short value) {
            addCriterion("nu_quinc_ini <", value, "nuQuincIni");
            return (Criteria) this;
        }

        public Criteria andNuQuincIniLessThanOrEqualTo(Short value) {
            addCriterion("nu_quinc_ini <=", value, "nuQuincIni");
            return (Criteria) this;
        }

        public Criteria andNuQuincIniIn(List<Short> values) {
            addCriterion("nu_quinc_ini in", values, "nuQuincIni");
            return (Criteria) this;
        }

        public Criteria andNuQuincIniNotIn(List<Short> values) {
            addCriterion("nu_quinc_ini not in", values, "nuQuincIni");
            return (Criteria) this;
        }

        public Criteria andNuQuincIniBetween(Short value1, Short value2) {
            addCriterion("nu_quinc_ini between", value1, value2, "nuQuincIni");
            return (Criteria) this;
        }

        public Criteria andNuQuincIniNotBetween(Short value1, Short value2) {
            addCriterion("nu_quinc_ini not between", value1, value2, "nuQuincIni");
            return (Criteria) this;
        }

        public Criteria andCveProductoIsNull() {
            addCriterion("cve_producto is null");
            return (Criteria) this;
        }

        public Criteria andCveProductoIsNotNull() {
            addCriterion("cve_producto is not null");
            return (Criteria) this;
        }

        public Criteria andCveProductoEqualTo(Integer value) {
            addCriterion("cve_producto =", value, "cveProducto");
            return (Criteria) this;
        }

        public Criteria andCveProductoNotEqualTo(Integer value) {
            addCriterion("cve_producto <>", value, "cveProducto");
            return (Criteria) this;
        }

        public Criteria andCveProductoGreaterThan(Integer value) {
            addCriterion("cve_producto >", value, "cveProducto");
            return (Criteria) this;
        }

        public Criteria andCveProductoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cve_producto >=", value, "cveProducto");
            return (Criteria) this;
        }

        public Criteria andCveProductoLessThan(Integer value) {
            addCriterion("cve_producto <", value, "cveProducto");
            return (Criteria) this;
        }

        public Criteria andCveProductoLessThanOrEqualTo(Integer value) {
            addCriterion("cve_producto <=", value, "cveProducto");
            return (Criteria) this;
        }

        public Criteria andCveProductoIn(List<Integer> values) {
            addCriterion("cve_producto in", values, "cveProducto");
            return (Criteria) this;
        }

        public Criteria andCveProductoNotIn(List<Integer> values) {
            addCriterion("cve_producto not in", values, "cveProducto");
            return (Criteria) this;
        }

        public Criteria andCveProductoBetween(Integer value1, Integer value2) {
            addCriterion("cve_producto between", value1, value2, "cveProducto");
            return (Criteria) this;
        }

        public Criteria andCveProductoNotBetween(Integer value1, Integer value2) {
            addCriterion("cve_producto not between", value1, value2, "cveProducto");
            return (Criteria) this;
        }

        public Criteria andCveTpoActividadIsNull() {
            addCriterion("cve_tpo_actividad is null");
            return (Criteria) this;
        }

        public Criteria andCveTpoActividadIsNotNull() {
            addCriterion("cve_tpo_actividad is not null");
            return (Criteria) this;
        }

        public Criteria andCveTpoActividadEqualTo(Integer value) {
            addCriterion("cve_tpo_actividad =", value, "cveTpoActividad");
            return (Criteria) this;
        }

        public Criteria andCveTpoActividadNotEqualTo(Integer value) {
            addCriterion("cve_tpo_actividad <>", value, "cveTpoActividad");
            return (Criteria) this;
        }

        public Criteria andCveTpoActividadGreaterThan(Integer value) {
            addCriterion("cve_tpo_actividad >", value, "cveTpoActividad");
            return (Criteria) this;
        }

        public Criteria andCveTpoActividadGreaterThanOrEqualTo(Integer value) {
            addCriterion("cve_tpo_actividad >=", value, "cveTpoActividad");
            return (Criteria) this;
        }

        public Criteria andCveTpoActividadLessThan(Integer value) {
            addCriterion("cve_tpo_actividad <", value, "cveTpoActividad");
            return (Criteria) this;
        }

        public Criteria andCveTpoActividadLessThanOrEqualTo(Integer value) {
            addCriterion("cve_tpo_actividad <=", value, "cveTpoActividad");
            return (Criteria) this;
        }

        public Criteria andCveTpoActividadIn(List<Integer> values) {
            addCriterion("cve_tpo_actividad in", values, "cveTpoActividad");
            return (Criteria) this;
        }

        public Criteria andCveTpoActividadNotIn(List<Integer> values) {
            addCriterion("cve_tpo_actividad not in", values, "cveTpoActividad");
            return (Criteria) this;
        }

        public Criteria andCveTpoActividadBetween(Integer value1, Integer value2) {
            addCriterion("cve_tpo_actividad between", value1, value2, "cveTpoActividad");
            return (Criteria) this;
        }

        public Criteria andCveTpoActividadNotBetween(Integer value1, Integer value2) {
            addCriterion("cve_tpo_actividad not between", value1, value2, "cveTpoActividad");
            return (Criteria) this;
        }

        public Criteria andCveTpoRecursosIsNull() {
            addCriterion("cve_tpo_recursos is null");
            return (Criteria) this;
        }

        public Criteria andCveTpoRecursosIsNotNull() {
            addCriterion("cve_tpo_recursos is not null");
            return (Criteria) this;
        }

        public Criteria andCveTpoRecursosEqualTo(Integer value) {
            addCriterion("cve_tpo_recursos =", value, "cveTpoRecursos");
            return (Criteria) this;
        }

        public Criteria andCveTpoRecursosNotEqualTo(Integer value) {
            addCriterion("cve_tpo_recursos <>", value, "cveTpoRecursos");
            return (Criteria) this;
        }

        public Criteria andCveTpoRecursosGreaterThan(Integer value) {
            addCriterion("cve_tpo_recursos >", value, "cveTpoRecursos");
            return (Criteria) this;
        }

        public Criteria andCveTpoRecursosGreaterThanOrEqualTo(Integer value) {
            addCriterion("cve_tpo_recursos >=", value, "cveTpoRecursos");
            return (Criteria) this;
        }

        public Criteria andCveTpoRecursosLessThan(Integer value) {
            addCriterion("cve_tpo_recursos <", value, "cveTpoRecursos");
            return (Criteria) this;
        }

        public Criteria andCveTpoRecursosLessThanOrEqualTo(Integer value) {
            addCriterion("cve_tpo_recursos <=", value, "cveTpoRecursos");
            return (Criteria) this;
        }

        public Criteria andCveTpoRecursosIn(List<Integer> values) {
            addCriterion("cve_tpo_recursos in", values, "cveTpoRecursos");
            return (Criteria) this;
        }

        public Criteria andCveTpoRecursosNotIn(List<Integer> values) {
            addCriterion("cve_tpo_recursos not in", values, "cveTpoRecursos");
            return (Criteria) this;
        }

        public Criteria andCveTpoRecursosBetween(Integer value1, Integer value2) {
            addCriterion("cve_tpo_recursos between", value1, value2, "cveTpoRecursos");
            return (Criteria) this;
        }

        public Criteria andCveTpoRecursosNotBetween(Integer value1, Integer value2) {
            addCriterion("cve_tpo_recursos not between", value1, value2, "cveTpoRecursos");
            return (Criteria) this;
        }

        public Criteria andImTotalNetoIsNull() {
            addCriterion("im_total_neto is null");
            return (Criteria) this;
        }

        public Criteria andImTotalNetoIsNotNull() {
            addCriterion("im_total_neto is not null");
            return (Criteria) this;
        }

        public Criteria andImTotalNetoEqualTo(BigDecimal value) {
            addCriterion("im_total_neto =", value, "imTotalNeto");
            return (Criteria) this;
        }

        public Criteria andImTotalNetoNotEqualTo(BigDecimal value) {
            addCriterion("im_total_neto <>", value, "imTotalNeto");
            return (Criteria) this;
        }

        public Criteria andImTotalNetoGreaterThan(BigDecimal value) {
            addCriterion("im_total_neto >", value, "imTotalNeto");
            return (Criteria) this;
        }

        public Criteria andImTotalNetoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("im_total_neto >=", value, "imTotalNeto");
            return (Criteria) this;
        }

        public Criteria andImTotalNetoLessThan(BigDecimal value) {
            addCriterion("im_total_neto <", value, "imTotalNeto");
            return (Criteria) this;
        }

        public Criteria andImTotalNetoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("im_total_neto <=", value, "imTotalNeto");
            return (Criteria) this;
        }

        public Criteria andImTotalNetoIn(List<BigDecimal> values) {
            addCriterion("im_total_neto in", values, "imTotalNeto");
            return (Criteria) this;
        }

        public Criteria andImTotalNetoNotIn(List<BigDecimal> values) {
            addCriterion("im_total_neto not in", values, "imTotalNeto");
            return (Criteria) this;
        }

        public Criteria andImTotalNetoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("im_total_neto between", value1, value2, "imTotalNeto");
            return (Criteria) this;
        }

        public Criteria andImTotalNetoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("im_total_neto not between", value1, value2, "imTotalNeto");
            return (Criteria) this;
        }

        public Criteria andNbRechazoIsNull() {
            addCriterion("nb_rechazo is null");
            return (Criteria) this;
        }

        public Criteria andNbRechazoIsNotNull() {
            addCriterion("nb_rechazo is not null");
            return (Criteria) this;
        }

        public Criteria andNbRechazoEqualTo(String value) {
            addCriterion("nb_rechazo =", value, "nbRechazo");
            return (Criteria) this;
        }

        public Criteria andNbRechazoNotEqualTo(String value) {
            addCriterion("nb_rechazo <>", value, "nbRechazo");
            return (Criteria) this;
        }

        public Criteria andNbRechazoGreaterThan(String value) {
            addCriterion("nb_rechazo >", value, "nbRechazo");
            return (Criteria) this;
        }

        public Criteria andNbRechazoGreaterThanOrEqualTo(String value) {
            addCriterion("nb_rechazo >=", value, "nbRechazo");
            return (Criteria) this;
        }

        public Criteria andNbRechazoLessThan(String value) {
            addCriterion("nb_rechazo <", value, "nbRechazo");
            return (Criteria) this;
        }

        public Criteria andNbRechazoLessThanOrEqualTo(String value) {
            addCriterion("nb_rechazo <=", value, "nbRechazo");
            return (Criteria) this;
        }

        public Criteria andNbRechazoLike(String value) {
            addCriterion("nb_rechazo like", value, "nbRechazo");
            return (Criteria) this;
        }

        public Criteria andNbRechazoNotLike(String value) {
            addCriterion("nb_rechazo not like", value, "nbRechazo");
            return (Criteria) this;
        }

        public Criteria andNbRechazoIn(List<String> values) {
            addCriterion("nb_rechazo in", values, "nbRechazo");
            return (Criteria) this;
        }

        public Criteria andNbRechazoNotIn(List<String> values) {
            addCriterion("nb_rechazo not in", values, "nbRechazo");
            return (Criteria) this;
        }

        public Criteria andNbRechazoBetween(String value1, String value2) {
            addCriterion("nb_rechazo between", value1, value2, "nbRechazo");
            return (Criteria) this;
        }

        public Criteria andNbRechazoNotBetween(String value1, String value2) {
            addCriterion("nb_rechazo not between", value1, value2, "nbRechazo");
            return (Criteria) this;
        }

        public Criteria andImAguinaldoRealIsNull() {
            addCriterion("im_aguinaldo_real is null");
            return (Criteria) this;
        }

        public Criteria andImAguinaldoRealIsNotNull() {
            addCriterion("im_aguinaldo_real is not null");
            return (Criteria) this;
        }

        public Criteria andImAguinaldoRealEqualTo(BigDecimal value) {
            addCriterion("im_aguinaldo_real =", value, "imAguinaldoReal");
            return (Criteria) this;
        }

        public Criteria andImAguinaldoRealNotEqualTo(BigDecimal value) {
            addCriterion("im_aguinaldo_real <>", value, "imAguinaldoReal");
            return (Criteria) this;
        }

        public Criteria andImAguinaldoRealGreaterThan(BigDecimal value) {
            addCriterion("im_aguinaldo_real >", value, "imAguinaldoReal");
            return (Criteria) this;
        }

        public Criteria andImAguinaldoRealGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("im_aguinaldo_real >=", value, "imAguinaldoReal");
            return (Criteria) this;
        }

        public Criteria andImAguinaldoRealLessThan(BigDecimal value) {
            addCriterion("im_aguinaldo_real <", value, "imAguinaldoReal");
            return (Criteria) this;
        }

        public Criteria andImAguinaldoRealLessThanOrEqualTo(BigDecimal value) {
            addCriterion("im_aguinaldo_real <=", value, "imAguinaldoReal");
            return (Criteria) this;
        }

        public Criteria andImAguinaldoRealIn(List<BigDecimal> values) {
            addCriterion("im_aguinaldo_real in", values, "imAguinaldoReal");
            return (Criteria) this;
        }

        public Criteria andImAguinaldoRealNotIn(List<BigDecimal> values) {
            addCriterion("im_aguinaldo_real not in", values, "imAguinaldoReal");
            return (Criteria) this;
        }

        public Criteria andImAguinaldoRealBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("im_aguinaldo_real between", value1, value2, "imAguinaldoReal");
            return (Criteria) this;
        }

        public Criteria andImAguinaldoRealNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("im_aguinaldo_real not between", value1, value2, "imAguinaldoReal");
            return (Criteria) this;
        }

        public Criteria andCveTpoUnidadIsNull() {
            addCriterion("cve_tpo_unidad is null");
            return (Criteria) this;
        }

        public Criteria andCveTpoUnidadIsNotNull() {
            addCriterion("cve_tpo_unidad is not null");
            return (Criteria) this;
        }

        public Criteria andCveTpoUnidadEqualTo(Integer value) {
            addCriterion("cve_tpo_unidad =", value, "cveTpoUnidad");
            return (Criteria) this;
        }

        public Criteria andCveTpoUnidadNotEqualTo(Integer value) {
            addCriterion("cve_tpo_unidad <>", value, "cveTpoUnidad");
            return (Criteria) this;
        }

        public Criteria andCveTpoUnidadGreaterThan(Integer value) {
            addCriterion("cve_tpo_unidad >", value, "cveTpoUnidad");
            return (Criteria) this;
        }

        public Criteria andCveTpoUnidadGreaterThanOrEqualTo(Integer value) {
            addCriterion("cve_tpo_unidad >=", value, "cveTpoUnidad");
            return (Criteria) this;
        }

        public Criteria andCveTpoUnidadLessThan(Integer value) {
            addCriterion("cve_tpo_unidad <", value, "cveTpoUnidad");
            return (Criteria) this;
        }

        public Criteria andCveTpoUnidadLessThanOrEqualTo(Integer value) {
            addCriterion("cve_tpo_unidad <=", value, "cveTpoUnidad");
            return (Criteria) this;
        }

        public Criteria andCveTpoUnidadIn(List<Integer> values) {
            addCriterion("cve_tpo_unidad in", values, "cveTpoUnidad");
            return (Criteria) this;
        }

        public Criteria andCveTpoUnidadNotIn(List<Integer> values) {
            addCriterion("cve_tpo_unidad not in", values, "cveTpoUnidad");
            return (Criteria) this;
        }

        public Criteria andCveTpoUnidadBetween(Integer value1, Integer value2) {
            addCriterion("cve_tpo_unidad between", value1, value2, "cveTpoUnidad");
            return (Criteria) this;
        }

        public Criteria andCveTpoUnidadNotBetween(Integer value1, Integer value2) {
            addCriterion("cve_tpo_unidad not between", value1, value2, "cveTpoUnidad");
            return (Criteria) this;
        }

        public Criteria andCurpIsNull() {
            addCriterion("curp is null");
            return (Criteria) this;
        }

        public Criteria andCurpIsNotNull() {
            addCriterion("curp is not null");
            return (Criteria) this;
        }

        public Criteria andCurpEqualTo(String value) {
            addCriterion("curp =", value, "curp");
            return (Criteria) this;
        }

        public Criteria andCurpNotEqualTo(String value) {
            addCriterion("curp <>", value, "curp");
            return (Criteria) this;
        }

        public Criteria andCurpGreaterThan(String value) {
            addCriterion("curp >", value, "curp");
            return (Criteria) this;
        }

        public Criteria andCurpGreaterThanOrEqualTo(String value) {
            addCriterion("curp >=", value, "curp");
            return (Criteria) this;
        }

        public Criteria andCurpLessThan(String value) {
            addCriterion("curp <", value, "curp");
            return (Criteria) this;
        }

        public Criteria andCurpLessThanOrEqualTo(String value) {
            addCriterion("curp <=", value, "curp");
            return (Criteria) this;
        }

        public Criteria andCurpLike(String value) {
            addCriterion("curp like", value, "curp");
            return (Criteria) this;
        }

        public Criteria andCurpNotLike(String value) {
            addCriterion("curp not like", value, "curp");
            return (Criteria) this;
        }

        public Criteria andCurpIn(List<String> values) {
            addCriterion("curp in", values, "curp");
            return (Criteria) this;
        }

        public Criteria andCurpNotIn(List<String> values) {
            addCriterion("curp not in", values, "curp");
            return (Criteria) this;
        }

        public Criteria andCurpBetween(String value1, String value2) {
            addCriterion("curp between", value1, value2, "curp");
            return (Criteria) this;
        }

        public Criteria andCurpNotBetween(String value1, String value2) {
            addCriterion("curp not between", value1, value2, "curp");
            return (Criteria) this;
        }

        public Criteria andCveStatusProgIsNull() {
            addCriterion("cve_status_prog is null");
            return (Criteria) this;
        }

        public Criteria andCveStatusProgIsNotNull() {
            addCriterion("cve_status_prog is not null");
            return (Criteria) this;
        }

        public Criteria andCveStatusProgEqualTo(Integer value) {
            addCriterion("cve_status_prog =", value, "cveStatusProg");
            return (Criteria) this;
        }

        public Criteria andCveStatusProgNotEqualTo(Integer value) {
            addCriterion("cve_status_prog <>", value, "cveStatusProg");
            return (Criteria) this;
        }

        public Criteria andCveStatusProgGreaterThan(Integer value) {
            addCriterion("cve_status_prog >", value, "cveStatusProg");
            return (Criteria) this;
        }

        public Criteria andCveStatusProgGreaterThanOrEqualTo(Integer value) {
            addCriterion("cve_status_prog >=", value, "cveStatusProg");
            return (Criteria) this;
        }

        public Criteria andCveStatusProgLessThan(Integer value) {
            addCriterion("cve_status_prog <", value, "cveStatusProg");
            return (Criteria) this;
        }

        public Criteria andCveStatusProgLessThanOrEqualTo(Integer value) {
            addCriterion("cve_status_prog <=", value, "cveStatusProg");
            return (Criteria) this;
        }

        public Criteria andCveStatusProgIn(List<Integer> values) {
            addCriterion("cve_status_prog in", values, "cveStatusProg");
            return (Criteria) this;
        }

        public Criteria andCveStatusProgNotIn(List<Integer> values) {
            addCriterion("cve_status_prog not in", values, "cveStatusProg");
            return (Criteria) this;
        }

        public Criteria andCveStatusProgBetween(Integer value1, Integer value2) {
            addCriterion("cve_status_prog between", value1, value2, "cveStatusProg");
            return (Criteria) this;
        }

        public Criteria andCveStatusProgNotBetween(Integer value1, Integer value2) {
            addCriterion("cve_status_prog not between", value1, value2, "cveStatusProg");
            return (Criteria) this;
        }

        public Criteria andCveStatusTpoUIsNull() {
            addCriterion("cve_status_tpo_u is null");
            return (Criteria) this;
        }

        public Criteria andCveStatusTpoUIsNotNull() {
            addCriterion("cve_status_tpo_u is not null");
            return (Criteria) this;
        }

        public Criteria andCveStatusTpoUEqualTo(Integer value) {
            addCriterion("cve_status_tpo_u =", value, "cveStatusTpoU");
            return (Criteria) this;
        }

        public Criteria andCveStatusTpoUNotEqualTo(Integer value) {
            addCriterion("cve_status_tpo_u <>", value, "cveStatusTpoU");
            return (Criteria) this;
        }

        public Criteria andCveStatusTpoUGreaterThan(Integer value) {
            addCriterion("cve_status_tpo_u >", value, "cveStatusTpoU");
            return (Criteria) this;
        }

        public Criteria andCveStatusTpoUGreaterThanOrEqualTo(Integer value) {
            addCriterion("cve_status_tpo_u >=", value, "cveStatusTpoU");
            return (Criteria) this;
        }

        public Criteria andCveStatusTpoULessThan(Integer value) {
            addCriterion("cve_status_tpo_u <", value, "cveStatusTpoU");
            return (Criteria) this;
        }

        public Criteria andCveStatusTpoULessThanOrEqualTo(Integer value) {
            addCriterion("cve_status_tpo_u <=", value, "cveStatusTpoU");
            return (Criteria) this;
        }

        public Criteria andCveStatusTpoUIn(List<Integer> values) {
            addCriterion("cve_status_tpo_u in", values, "cveStatusTpoU");
            return (Criteria) this;
        }

        public Criteria andCveStatusTpoUNotIn(List<Integer> values) {
            addCriterion("cve_status_tpo_u not in", values, "cveStatusTpoU");
            return (Criteria) this;
        }

        public Criteria andCveStatusTpoUBetween(Integer value1, Integer value2) {
            addCriterion("cve_status_tpo_u between", value1, value2, "cveStatusTpoU");
            return (Criteria) this;
        }

        public Criteria andCveStatusTpoUNotBetween(Integer value1, Integer value2) {
            addCriterion("cve_status_tpo_u not between", value1, value2, "cveStatusTpoU");
            return (Criteria) this;
        }

        public Criteria andNuEmpIsNull() {
            addCriterion("nu_emp is null");
            return (Criteria) this;
        }

        public Criteria andNuEmpIsNotNull() {
            addCriterion("nu_emp is not null");
            return (Criteria) this;
        }

        public Criteria andNuEmpEqualTo(Integer value) {
            addCriterion("nu_emp =", value, "nuEmp");
            return (Criteria) this;
        }

        public Criteria andNuEmpNotEqualTo(Integer value) {
            addCriterion("nu_emp <>", value, "nuEmp");
            return (Criteria) this;
        }

        public Criteria andNuEmpGreaterThan(Integer value) {
            addCriterion("nu_emp >", value, "nuEmp");
            return (Criteria) this;
        }

        public Criteria andNuEmpGreaterThanOrEqualTo(Integer value) {
            addCriterion("nu_emp >=", value, "nuEmp");
            return (Criteria) this;
        }

        public Criteria andNuEmpLessThan(Integer value) {
            addCriterion("nu_emp <", value, "nuEmp");
            return (Criteria) this;
        }

        public Criteria andNuEmpLessThanOrEqualTo(Integer value) {
            addCriterion("nu_emp <=", value, "nuEmp");
            return (Criteria) this;
        }

        public Criteria andNuEmpIn(List<Integer> values) {
            addCriterion("nu_emp in", values, "nuEmp");
            return (Criteria) this;
        }

        public Criteria andNuEmpNotIn(List<Integer> values) {
            addCriterion("nu_emp not in", values, "nuEmp");
            return (Criteria) this;
        }

        public Criteria andNuEmpBetween(Integer value1, Integer value2) {
            addCriterion("nu_emp between", value1, value2, "nuEmp");
            return (Criteria) this;
        }

        public Criteria andNuEmpNotBetween(Integer value1, Integer value2) {
            addCriterion("nu_emp not between", value1, value2, "nuEmp");
            return (Criteria) this;
        }

        public Criteria andCveNacionalidadIsNull() {
            addCriterion("cve_nacionalidad is null");
            return (Criteria) this;
        }

        public Criteria andCveNacionalidadIsNotNull() {
            addCriterion("cve_nacionalidad is not null");
            return (Criteria) this;
        }

        public Criteria andCveNacionalidadEqualTo(Integer value) {
            addCriterion("cve_nacionalidad =", value, "cveNacionalidad");
            return (Criteria) this;
        }

        public Criteria andCveNacionalidadNotEqualTo(Integer value) {
            addCriterion("cve_nacionalidad <>", value, "cveNacionalidad");
            return (Criteria) this;
        }

        public Criteria andCveNacionalidadGreaterThan(Integer value) {
            addCriterion("cve_nacionalidad >", value, "cveNacionalidad");
            return (Criteria) this;
        }

        public Criteria andCveNacionalidadGreaterThanOrEqualTo(Integer value) {
            addCriterion("cve_nacionalidad >=", value, "cveNacionalidad");
            return (Criteria) this;
        }

        public Criteria andCveNacionalidadLessThan(Integer value) {
            addCriterion("cve_nacionalidad <", value, "cveNacionalidad");
            return (Criteria) this;
        }

        public Criteria andCveNacionalidadLessThanOrEqualTo(Integer value) {
            addCriterion("cve_nacionalidad <=", value, "cveNacionalidad");
            return (Criteria) this;
        }

        public Criteria andCveNacionalidadIn(List<Integer> values) {
            addCriterion("cve_nacionalidad in", values, "cveNacionalidad");
            return (Criteria) this;
        }

        public Criteria andCveNacionalidadNotIn(List<Integer> values) {
            addCriterion("cve_nacionalidad not in", values, "cveNacionalidad");
            return (Criteria) this;
        }

        public Criteria andCveNacionalidadBetween(Integer value1, Integer value2) {
            addCriterion("cve_nacionalidad between", value1, value2, "cveNacionalidad");
            return (Criteria) this;
        }

        public Criteria andCveNacionalidadNotBetween(Integer value1, Integer value2) {
            addCriterion("cve_nacionalidad not between", value1, value2, "cveNacionalidad");
            return (Criteria) this;
        }

        public Criteria andDomicilioIsNull() {
            addCriterion("domicilio is null");
            return (Criteria) this;
        }

        public Criteria andDomicilioIsNotNull() {
            addCriterion("domicilio is not null");
            return (Criteria) this;
        }

        public Criteria andDomicilioEqualTo(String value) {
            addCriterion("domicilio =", value, "domicilio");
            return (Criteria) this;
        }

        public Criteria andDomicilioNotEqualTo(String value) {
            addCriterion("domicilio <>", value, "domicilio");
            return (Criteria) this;
        }

        public Criteria andDomicilioGreaterThan(String value) {
            addCriterion("domicilio >", value, "domicilio");
            return (Criteria) this;
        }

        public Criteria andDomicilioGreaterThanOrEqualTo(String value) {
            addCriterion("domicilio >=", value, "domicilio");
            return (Criteria) this;
        }

        public Criteria andDomicilioLessThan(String value) {
            addCriterion("domicilio <", value, "domicilio");
            return (Criteria) this;
        }

        public Criteria andDomicilioLessThanOrEqualTo(String value) {
            addCriterion("domicilio <=", value, "domicilio");
            return (Criteria) this;
        }

        public Criteria andDomicilioLike(String value) {
            addCriterion("domicilio like", value, "domicilio");
            return (Criteria) this;
        }

        public Criteria andDomicilioNotLike(String value) {
            addCriterion("domicilio not like", value, "domicilio");
            return (Criteria) this;
        }

        public Criteria andDomicilioIn(List<String> values) {
            addCriterion("domicilio in", values, "domicilio");
            return (Criteria) this;
        }

        public Criteria andDomicilioNotIn(List<String> values) {
            addCriterion("domicilio not in", values, "domicilio");
            return (Criteria) this;
        }

        public Criteria andDomicilioBetween(String value1, String value2) {
            addCriterion("domicilio between", value1, value2, "domicilio");
            return (Criteria) this;
        }

        public Criteria andDomicilioNotBetween(String value1, String value2) {
            addCriterion("domicilio not between", value1, value2, "domicilio");
            return (Criteria) this;
        }

        public Criteria andNuCedulaIsNull() {
            addCriterion("nu_cedula is null");
            return (Criteria) this;
        }

        public Criteria andNuCedulaIsNotNull() {
            addCriterion("nu_cedula is not null");
            return (Criteria) this;
        }

        public Criteria andNuCedulaEqualTo(String value) {
            addCriterion("nu_cedula =", value, "nuCedula");
            return (Criteria) this;
        }

        public Criteria andNuCedulaNotEqualTo(String value) {
            addCriterion("nu_cedula <>", value, "nuCedula");
            return (Criteria) this;
        }

        public Criteria andNuCedulaGreaterThan(String value) {
            addCriterion("nu_cedula >", value, "nuCedula");
            return (Criteria) this;
        }

        public Criteria andNuCedulaGreaterThanOrEqualTo(String value) {
            addCriterion("nu_cedula >=", value, "nuCedula");
            return (Criteria) this;
        }

        public Criteria andNuCedulaLessThan(String value) {
            addCriterion("nu_cedula <", value, "nuCedula");
            return (Criteria) this;
        }

        public Criteria andNuCedulaLessThanOrEqualTo(String value) {
            addCriterion("nu_cedula <=", value, "nuCedula");
            return (Criteria) this;
        }

        public Criteria andNuCedulaLike(String value) {
            addCriterion("nu_cedula like", value, "nuCedula");
            return (Criteria) this;
        }

        public Criteria andNuCedulaNotLike(String value) {
            addCriterion("nu_cedula not like", value, "nuCedula");
            return (Criteria) this;
        }

        public Criteria andNuCedulaIn(List<String> values) {
            addCriterion("nu_cedula in", values, "nuCedula");
            return (Criteria) this;
        }

        public Criteria andNuCedulaNotIn(List<String> values) {
            addCriterion("nu_cedula not in", values, "nuCedula");
            return (Criteria) this;
        }

        public Criteria andNuCedulaBetween(String value1, String value2) {
            addCriterion("nu_cedula between", value1, value2, "nuCedula");
            return (Criteria) this;
        }

        public Criteria andNuCedulaNotBetween(String value1, String value2) {
            addCriterion("nu_cedula not between", value1, value2, "nuCedula");
            return (Criteria) this;
        }

        public Criteria andImgContratoIsNull() {
            addCriterion("img_contrato is null");
            return (Criteria) this;
        }

        public Criteria andImgContratoIsNotNull() {
            addCriterion("img_contrato is not null");
            return (Criteria) this;
        }

        public Criteria andImgContratoEqualTo(String value) {
            addCriterion("img_contrato =", value, "imgContrato");
            return (Criteria) this;
        }

        public Criteria andImgContratoNotEqualTo(String value) {
            addCriterion("img_contrato <>", value, "imgContrato");
            return (Criteria) this;
        }

        public Criteria andImgContratoGreaterThan(String value) {
            addCriterion("img_contrato >", value, "imgContrato");
            return (Criteria) this;
        }

        public Criteria andImgContratoGreaterThanOrEqualTo(String value) {
            addCriterion("img_contrato >=", value, "imgContrato");
            return (Criteria) this;
        }

        public Criteria andImgContratoLessThan(String value) {
            addCriterion("img_contrato <", value, "imgContrato");
            return (Criteria) this;
        }

        public Criteria andImgContratoLessThanOrEqualTo(String value) {
            addCriterion("img_contrato <=", value, "imgContrato");
            return (Criteria) this;
        }

        public Criteria andImgContratoLike(String value) {
            addCriterion("img_contrato like", value, "imgContrato");
            return (Criteria) this;
        }

        public Criteria andImgContratoNotLike(String value) {
            addCriterion("img_contrato not like", value, "imgContrato");
            return (Criteria) this;
        }

        public Criteria andImgContratoIn(List<String> values) {
            addCriterion("img_contrato in", values, "imgContrato");
            return (Criteria) this;
        }

        public Criteria andImgContratoNotIn(List<String> values) {
            addCriterion("img_contrato not in", values, "imgContrato");
            return (Criteria) this;
        }

        public Criteria andImgContratoBetween(String value1, String value2) {
            addCriterion("img_contrato between", value1, value2, "imgContrato");
            return (Criteria) this;
        }

        public Criteria andImgContratoNotBetween(String value1, String value2) {
            addCriterion("img_contrato not between", value1, value2, "imgContrato");
            return (Criteria) this;
        }

        public Criteria andCveStatusImpIsNull() {
            addCriterion("cve_status_imp is null");
            return (Criteria) this;
        }

        public Criteria andCveStatusImpIsNotNull() {
            addCriterion("cve_status_imp is not null");
            return (Criteria) this;
        }

        public Criteria andCveStatusImpEqualTo(Integer value) {
            addCriterion("cve_status_imp =", value, "cveStatusImp");
            return (Criteria) this;
        }

        public Criteria andCveStatusImpNotEqualTo(Integer value) {
            addCriterion("cve_status_imp <>", value, "cveStatusImp");
            return (Criteria) this;
        }

        public Criteria andCveStatusImpGreaterThan(Integer value) {
            addCriterion("cve_status_imp >", value, "cveStatusImp");
            return (Criteria) this;
        }

        public Criteria andCveStatusImpGreaterThanOrEqualTo(Integer value) {
            addCriterion("cve_status_imp >=", value, "cveStatusImp");
            return (Criteria) this;
        }

        public Criteria andCveStatusImpLessThan(Integer value) {
            addCriterion("cve_status_imp <", value, "cveStatusImp");
            return (Criteria) this;
        }

        public Criteria andCveStatusImpLessThanOrEqualTo(Integer value) {
            addCriterion("cve_status_imp <=", value, "cveStatusImp");
            return (Criteria) this;
        }

        public Criteria andCveStatusImpIn(List<Integer> values) {
            addCriterion("cve_status_imp in", values, "cveStatusImp");
            return (Criteria) this;
        }

        public Criteria andCveStatusImpNotIn(List<Integer> values) {
            addCriterion("cve_status_imp not in", values, "cveStatusImp");
            return (Criteria) this;
        }

        public Criteria andCveStatusImpBetween(Integer value1, Integer value2) {
            addCriterion("cve_status_imp between", value1, value2, "cveStatusImp");
            return (Criteria) this;
        }

        public Criteria andCveStatusImpNotBetween(Integer value1, Integer value2) {
            addCriterion("cve_status_imp not between", value1, value2, "cveStatusImp");
            return (Criteria) this;
        }

        public Criteria andNuOficioEnvUrIsNull() {
            addCriterion("nu_oficio_env_ur is null");
            return (Criteria) this;
        }

        public Criteria andNuOficioEnvUrIsNotNull() {
            addCriterion("nu_oficio_env_ur is not null");
            return (Criteria) this;
        }

        public Criteria andNuOficioEnvUrEqualTo(String value) {
            addCriterion("nu_oficio_env_ur =", value, "nuOficioEnvUr");
            return (Criteria) this;
        }

        public Criteria andNuOficioEnvUrNotEqualTo(String value) {
            addCriterion("nu_oficio_env_ur <>", value, "nuOficioEnvUr");
            return (Criteria) this;
        }

        public Criteria andNuOficioEnvUrGreaterThan(String value) {
            addCriterion("nu_oficio_env_ur >", value, "nuOficioEnvUr");
            return (Criteria) this;
        }

        public Criteria andNuOficioEnvUrGreaterThanOrEqualTo(String value) {
            addCriterion("nu_oficio_env_ur >=", value, "nuOficioEnvUr");
            return (Criteria) this;
        }

        public Criteria andNuOficioEnvUrLessThan(String value) {
            addCriterion("nu_oficio_env_ur <", value, "nuOficioEnvUr");
            return (Criteria) this;
        }

        public Criteria andNuOficioEnvUrLessThanOrEqualTo(String value) {
            addCriterion("nu_oficio_env_ur <=", value, "nuOficioEnvUr");
            return (Criteria) this;
        }

        public Criteria andNuOficioEnvUrLike(String value) {
            addCriterion("nu_oficio_env_ur like", value, "nuOficioEnvUr");
            return (Criteria) this;
        }

        public Criteria andNuOficioEnvUrNotLike(String value) {
            addCriterion("nu_oficio_env_ur not like", value, "nuOficioEnvUr");
            return (Criteria) this;
        }

        public Criteria andNuOficioEnvUrIn(List<String> values) {
            addCriterion("nu_oficio_env_ur in", values, "nuOficioEnvUr");
            return (Criteria) this;
        }

        public Criteria andNuOficioEnvUrNotIn(List<String> values) {
            addCriterion("nu_oficio_env_ur not in", values, "nuOficioEnvUr");
            return (Criteria) this;
        }

        public Criteria andNuOficioEnvUrBetween(String value1, String value2) {
            addCriterion("nu_oficio_env_ur between", value1, value2, "nuOficioEnvUr");
            return (Criteria) this;
        }

        public Criteria andNuOficioEnvUrNotBetween(String value1, String value2) {
            addCriterion("nu_oficio_env_ur not between", value1, value2, "nuOficioEnvUr");
            return (Criteria) this;
        }

        public Criteria andCveSubprogramaIsNull() {
            addCriterion("cve_subprograma is null");
            return (Criteria) this;
        }

        public Criteria andCveSubprogramaIsNotNull() {
            addCriterion("cve_subprograma is not null");
            return (Criteria) this;
        }

        public Criteria andCveSubprogramaEqualTo(String value) {
            addCriterion("cve_subprograma =", value, "cveSubprograma");
            return (Criteria) this;
        }

        public Criteria andCveSubprogramaNotEqualTo(String value) {
            addCriterion("cve_subprograma <>", value, "cveSubprograma");
            return (Criteria) this;
        }

        public Criteria andCveSubprogramaGreaterThan(String value) {
            addCriterion("cve_subprograma >", value, "cveSubprograma");
            return (Criteria) this;
        }

        public Criteria andCveSubprogramaGreaterThanOrEqualTo(String value) {
            addCriterion("cve_subprograma >=", value, "cveSubprograma");
            return (Criteria) this;
        }

        public Criteria andCveSubprogramaLessThan(String value) {
            addCriterion("cve_subprograma <", value, "cveSubprograma");
            return (Criteria) this;
        }

        public Criteria andCveSubprogramaLessThanOrEqualTo(String value) {
            addCriterion("cve_subprograma <=", value, "cveSubprograma");
            return (Criteria) this;
        }

        public Criteria andCveSubprogramaLike(String value) {
            addCriterion("cve_subprograma like", value, "cveSubprograma");
            return (Criteria) this;
        }

        public Criteria andCveSubprogramaNotLike(String value) {
            addCriterion("cve_subprograma not like", value, "cveSubprograma");
            return (Criteria) this;
        }

        public Criteria andCveSubprogramaIn(List<String> values) {
            addCriterion("cve_subprograma in", values, "cveSubprograma");
            return (Criteria) this;
        }

        public Criteria andCveSubprogramaNotIn(List<String> values) {
            addCriterion("cve_subprograma not in", values, "cveSubprograma");
            return (Criteria) this;
        }

        public Criteria andCveSubprogramaBetween(String value1, String value2) {
            addCriterion("cve_subprograma between", value1, value2, "cveSubprograma");
            return (Criteria) this;
        }

        public Criteria andCveSubprogramaNotBetween(String value1, String value2) {
            addCriterion("cve_subprograma not between", value1, value2, "cveSubprograma");
            return (Criteria) this;
        }

        public Criteria andCveTpoFmIsNull() {
            addCriterion("cve_tpo_fm is null");
            return (Criteria) this;
        }

        public Criteria andCveTpoFmIsNotNull() {
            addCriterion("cve_tpo_fm is not null");
            return (Criteria) this;
        }

        public Criteria andCveTpoFmEqualTo(Integer value) {
            addCriterion("cve_tpo_fm =", value, "cveTpoFm");
            return (Criteria) this;
        }

        public Criteria andCveTpoFmNotEqualTo(Integer value) {
            addCriterion("cve_tpo_fm <>", value, "cveTpoFm");
            return (Criteria) this;
        }

        public Criteria andCveTpoFmGreaterThan(Integer value) {
            addCriterion("cve_tpo_fm >", value, "cveTpoFm");
            return (Criteria) this;
        }

        public Criteria andCveTpoFmGreaterThanOrEqualTo(Integer value) {
            addCriterion("cve_tpo_fm >=", value, "cveTpoFm");
            return (Criteria) this;
        }

        public Criteria andCveTpoFmLessThan(Integer value) {
            addCriterion("cve_tpo_fm <", value, "cveTpoFm");
            return (Criteria) this;
        }

        public Criteria andCveTpoFmLessThanOrEqualTo(Integer value) {
            addCriterion("cve_tpo_fm <=", value, "cveTpoFm");
            return (Criteria) this;
        }

        public Criteria andCveTpoFmIn(List<Integer> values) {
            addCriterion("cve_tpo_fm in", values, "cveTpoFm");
            return (Criteria) this;
        }

        public Criteria andCveTpoFmNotIn(List<Integer> values) {
            addCriterion("cve_tpo_fm not in", values, "cveTpoFm");
            return (Criteria) this;
        }

        public Criteria andCveTpoFmBetween(Integer value1, Integer value2) {
            addCriterion("cve_tpo_fm between", value1, value2, "cveTpoFm");
            return (Criteria) this;
        }

        public Criteria andCveTpoFmNotBetween(Integer value1, Integer value2) {
            addCriterion("cve_tpo_fm not between", value1, value2, "cveTpoFm");
            return (Criteria) this;
        }

        public Criteria andDescPerfilIsNull() {
            addCriterion("desc_perfil is null");
            return (Criteria) this;
        }

        public Criteria andDescPerfilIsNotNull() {
            addCriterion("desc_perfil is not null");
            return (Criteria) this;
        }

        public Criteria andDescPerfilEqualTo(String value) {
            addCriterion("desc_perfil =", value, "descPerfil");
            return (Criteria) this;
        }

        public Criteria andDescPerfilNotEqualTo(String value) {
            addCriterion("desc_perfil <>", value, "descPerfil");
            return (Criteria) this;
        }

        public Criteria andDescPerfilGreaterThan(String value) {
            addCriterion("desc_perfil >", value, "descPerfil");
            return (Criteria) this;
        }

        public Criteria andDescPerfilGreaterThanOrEqualTo(String value) {
            addCriterion("desc_perfil >=", value, "descPerfil");
            return (Criteria) this;
        }

        public Criteria andDescPerfilLessThan(String value) {
            addCriterion("desc_perfil <", value, "descPerfil");
            return (Criteria) this;
        }

        public Criteria andDescPerfilLessThanOrEqualTo(String value) {
            addCriterion("desc_perfil <=", value, "descPerfil");
            return (Criteria) this;
        }

        public Criteria andDescPerfilLike(String value) {
            addCriterion("desc_perfil like", value, "descPerfil");
            return (Criteria) this;
        }

        public Criteria andDescPerfilNotLike(String value) {
            addCriterion("desc_perfil not like", value, "descPerfil");
            return (Criteria) this;
        }

        public Criteria andDescPerfilIn(List<String> values) {
            addCriterion("desc_perfil in", values, "descPerfil");
            return (Criteria) this;
        }

        public Criteria andDescPerfilNotIn(List<String> values) {
            addCriterion("desc_perfil not in", values, "descPerfil");
            return (Criteria) this;
        }

        public Criteria andDescPerfilBetween(String value1, String value2) {
            addCriterion("desc_perfil between", value1, value2, "descPerfil");
            return (Criteria) this;
        }

        public Criteria andDescPerfilNotBetween(String value1, String value2) {
            addCriterion("desc_perfil not between", value1, value2, "descPerfil");
            return (Criteria) this;
        }

        public Criteria andDescExperienciaIsNull() {
            addCriterion("desc_experiencia is null");
            return (Criteria) this;
        }

        public Criteria andDescExperienciaIsNotNull() {
            addCriterion("desc_experiencia is not null");
            return (Criteria) this;
        }

        public Criteria andDescExperienciaEqualTo(String value) {
            addCriterion("desc_experiencia =", value, "descExperiencia");
            return (Criteria) this;
        }

        public Criteria andDescExperienciaNotEqualTo(String value) {
            addCriterion("desc_experiencia <>", value, "descExperiencia");
            return (Criteria) this;
        }

        public Criteria andDescExperienciaGreaterThan(String value) {
            addCriterion("desc_experiencia >", value, "descExperiencia");
            return (Criteria) this;
        }

        public Criteria andDescExperienciaGreaterThanOrEqualTo(String value) {
            addCriterion("desc_experiencia >=", value, "descExperiencia");
            return (Criteria) this;
        }

        public Criteria andDescExperienciaLessThan(String value) {
            addCriterion("desc_experiencia <", value, "descExperiencia");
            return (Criteria) this;
        }

        public Criteria andDescExperienciaLessThanOrEqualTo(String value) {
            addCriterion("desc_experiencia <=", value, "descExperiencia");
            return (Criteria) this;
        }

        public Criteria andDescExperienciaLike(String value) {
            addCriterion("desc_experiencia like", value, "descExperiencia");
            return (Criteria) this;
        }

        public Criteria andDescExperienciaNotLike(String value) {
            addCriterion("desc_experiencia not like", value, "descExperiencia");
            return (Criteria) this;
        }

        public Criteria andDescExperienciaIn(List<String> values) {
            addCriterion("desc_experiencia in", values, "descExperiencia");
            return (Criteria) this;
        }

        public Criteria andDescExperienciaNotIn(List<String> values) {
            addCriterion("desc_experiencia not in", values, "descExperiencia");
            return (Criteria) this;
        }

        public Criteria andDescExperienciaBetween(String value1, String value2) {
            addCriterion("desc_experiencia between", value1, value2, "descExperiencia");
            return (Criteria) this;
        }

        public Criteria andDescExperienciaNotBetween(String value1, String value2) {
            addCriterion("desc_experiencia not between", value1, value2, "descExperiencia");
            return (Criteria) this;
        }

        public Criteria andImTotalRealIsNull() {
            addCriterion("im_total_real is null");
            return (Criteria) this;
        }

        public Criteria andImTotalRealIsNotNull() {
            addCriterion("im_total_real is not null");
            return (Criteria) this;
        }

        public Criteria andImTotalRealEqualTo(BigDecimal value) {
            addCriterion("im_total_real =", value, "imTotalReal");
            return (Criteria) this;
        }

        public Criteria andImTotalRealNotEqualTo(BigDecimal value) {
            addCriterion("im_total_real <>", value, "imTotalReal");
            return (Criteria) this;
        }

        public Criteria andImTotalRealGreaterThan(BigDecimal value) {
            addCriterion("im_total_real >", value, "imTotalReal");
            return (Criteria) this;
        }

        public Criteria andImTotalRealGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("im_total_real >=", value, "imTotalReal");
            return (Criteria) this;
        }

        public Criteria andImTotalRealLessThan(BigDecimal value) {
            addCriterion("im_total_real <", value, "imTotalReal");
            return (Criteria) this;
        }

        public Criteria andImTotalRealLessThanOrEqualTo(BigDecimal value) {
            addCriterion("im_total_real <=", value, "imTotalReal");
            return (Criteria) this;
        }

        public Criteria andImTotalRealIn(List<BigDecimal> values) {
            addCriterion("im_total_real in", values, "imTotalReal");
            return (Criteria) this;
        }

        public Criteria andImTotalRealNotIn(List<BigDecimal> values) {
            addCriterion("im_total_real not in", values, "imTotalReal");
            return (Criteria) this;
        }

        public Criteria andImTotalRealBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("im_total_real between", value1, value2, "imTotalReal");
            return (Criteria) this;
        }

        public Criteria andImTotalRealNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("im_total_real not between", value1, value2, "imTotalReal");
            return (Criteria) this;
        }

        public Criteria andNotaIsNull() {
            addCriterion("nota is null");
            return (Criteria) this;
        }

        public Criteria andNotaIsNotNull() {
            addCriterion("nota is not null");
            return (Criteria) this;
        }

        public Criteria andNotaEqualTo(String value) {
            addCriterion("nota =", value, "nota");
            return (Criteria) this;
        }

        public Criteria andNotaNotEqualTo(String value) {
            addCriterion("nota <>", value, "nota");
            return (Criteria) this;
        }

        public Criteria andNotaGreaterThan(String value) {
            addCriterion("nota >", value, "nota");
            return (Criteria) this;
        }

        public Criteria andNotaGreaterThanOrEqualTo(String value) {
            addCriterion("nota >=", value, "nota");
            return (Criteria) this;
        }

        public Criteria andNotaLessThan(String value) {
            addCriterion("nota <", value, "nota");
            return (Criteria) this;
        }

        public Criteria andNotaLessThanOrEqualTo(String value) {
            addCriterion("nota <=", value, "nota");
            return (Criteria) this;
        }

        public Criteria andNotaLike(String value) {
            addCriterion("nota like", value, "nota");
            return (Criteria) this;
        }

        public Criteria andNotaNotLike(String value) {
            addCriterion("nota not like", value, "nota");
            return (Criteria) this;
        }

        public Criteria andNotaIn(List<String> values) {
            addCriterion("nota in", values, "nota");
            return (Criteria) this;
        }

        public Criteria andNotaNotIn(List<String> values) {
            addCriterion("nota not in", values, "nota");
            return (Criteria) this;
        }

        public Criteria andNotaBetween(String value1, String value2) {
            addCriterion("nota between", value1, value2, "nota");
            return (Criteria) this;
        }

        public Criteria andNotaNotBetween(String value1, String value2) {
            addCriterion("nota not between", value1, value2, "nota");
            return (Criteria) this;
        }

        public Criteria andCveTpoContratoIsNull() {
            addCriterion("cve_tpo_contrato is null");
            return (Criteria) this;
        }

        public Criteria andCveTpoContratoIsNotNull() {
            addCriterion("cve_tpo_contrato is not null");
            return (Criteria) this;
        }

        public Criteria andCveTpoContratoEqualTo(Integer value) {
            addCriterion("cve_tpo_contrato =", value, "cveTpoContrato");
            return (Criteria) this;
        }

        public Criteria andCveTpoContratoNotEqualTo(Integer value) {
            addCriterion("cve_tpo_contrato <>", value, "cveTpoContrato");
            return (Criteria) this;
        }

        public Criteria andCveTpoContratoGreaterThan(Integer value) {
            addCriterion("cve_tpo_contrato >", value, "cveTpoContrato");
            return (Criteria) this;
        }

        public Criteria andCveTpoContratoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cve_tpo_contrato >=", value, "cveTpoContrato");
            return (Criteria) this;
        }

        public Criteria andCveTpoContratoLessThan(Integer value) {
            addCriterion("cve_tpo_contrato <", value, "cveTpoContrato");
            return (Criteria) this;
        }

        public Criteria andCveTpoContratoLessThanOrEqualTo(Integer value) {
            addCriterion("cve_tpo_contrato <=", value, "cveTpoContrato");
            return (Criteria) this;
        }

        public Criteria andCveTpoContratoIn(List<Integer> values) {
            addCriterion("cve_tpo_contrato in", values, "cveTpoContrato");
            return (Criteria) this;
        }

        public Criteria andCveTpoContratoNotIn(List<Integer> values) {
            addCriterion("cve_tpo_contrato not in", values, "cveTpoContrato");
            return (Criteria) this;
        }

        public Criteria andCveTpoContratoBetween(Integer value1, Integer value2) {
            addCriterion("cve_tpo_contrato between", value1, value2, "cveTpoContrato");
            return (Criteria) this;
        }

        public Criteria andCveTpoContratoNotBetween(Integer value1, Integer value2) {
            addCriterion("cve_tpo_contrato not between", value1, value2, "cveTpoContrato");
            return (Criteria) this;
        }

        public Criteria andCveStatusRegSfpIsNull() {
            addCriterion("cve_status_reg_sfp is null");
            return (Criteria) this;
        }

        public Criteria andCveStatusRegSfpIsNotNull() {
            addCriterion("cve_status_reg_sfp is not null");
            return (Criteria) this;
        }

        public Criteria andCveStatusRegSfpEqualTo(Integer value) {
            addCriterion("cve_status_reg_sfp =", value, "cveStatusRegSfp");
            return (Criteria) this;
        }

        public Criteria andCveStatusRegSfpNotEqualTo(Integer value) {
            addCriterion("cve_status_reg_sfp <>", value, "cveStatusRegSfp");
            return (Criteria) this;
        }

        public Criteria andCveStatusRegSfpGreaterThan(Integer value) {
            addCriterion("cve_status_reg_sfp >", value, "cveStatusRegSfp");
            return (Criteria) this;
        }

        public Criteria andCveStatusRegSfpGreaterThanOrEqualTo(Integer value) {
            addCriterion("cve_status_reg_sfp >=", value, "cveStatusRegSfp");
            return (Criteria) this;
        }

        public Criteria andCveStatusRegSfpLessThan(Integer value) {
            addCriterion("cve_status_reg_sfp <", value, "cveStatusRegSfp");
            return (Criteria) this;
        }

        public Criteria andCveStatusRegSfpLessThanOrEqualTo(Integer value) {
            addCriterion("cve_status_reg_sfp <=", value, "cveStatusRegSfp");
            return (Criteria) this;
        }

        public Criteria andCveStatusRegSfpIn(List<Integer> values) {
            addCriterion("cve_status_reg_sfp in", values, "cveStatusRegSfp");
            return (Criteria) this;
        }

        public Criteria andCveStatusRegSfpNotIn(List<Integer> values) {
            addCriterion("cve_status_reg_sfp not in", values, "cveStatusRegSfp");
            return (Criteria) this;
        }

        public Criteria andCveStatusRegSfpBetween(Integer value1, Integer value2) {
            addCriterion("cve_status_reg_sfp between", value1, value2, "cveStatusRegSfp");
            return (Criteria) this;
        }

        public Criteria andCveStatusRegSfpNotBetween(Integer value1, Integer value2) {
            addCriterion("cve_status_reg_sfp not between", value1, value2, "cveStatusRegSfp");
            return (Criteria) this;
        }

        public Criteria andFhStatusRegSfpIsNull() {
            addCriterion("fh_status_reg_sfp is null");
            return (Criteria) this;
        }

        public Criteria andFhStatusRegSfpIsNotNull() {
            addCriterion("fh_status_reg_sfp is not null");
            return (Criteria) this;
        }

        public Criteria andFhStatusRegSfpEqualTo(Date value) {
            addCriterionForJDBCDate("fh_status_reg_sfp =", value, "fhStatusRegSfp");
            return (Criteria) this;
        }

        public Criteria andFhStatusRegSfpNotEqualTo(Date value) {
            addCriterionForJDBCDate("fh_status_reg_sfp <>", value, "fhStatusRegSfp");
            return (Criteria) this;
        }

        public Criteria andFhStatusRegSfpGreaterThan(Date value) {
            addCriterionForJDBCDate("fh_status_reg_sfp >", value, "fhStatusRegSfp");
            return (Criteria) this;
        }

        public Criteria andFhStatusRegSfpGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fh_status_reg_sfp >=", value, "fhStatusRegSfp");
            return (Criteria) this;
        }

        public Criteria andFhStatusRegSfpLessThan(Date value) {
            addCriterionForJDBCDate("fh_status_reg_sfp <", value, "fhStatusRegSfp");
            return (Criteria) this;
        }

        public Criteria andFhStatusRegSfpLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fh_status_reg_sfp <=", value, "fhStatusRegSfp");
            return (Criteria) this;
        }

        public Criteria andFhStatusRegSfpIn(List<Date> values) {
            addCriterionForJDBCDate("fh_status_reg_sfp in", values, "fhStatusRegSfp");
            return (Criteria) this;
        }

        public Criteria andFhStatusRegSfpNotIn(List<Date> values) {
            addCriterionForJDBCDate("fh_status_reg_sfp not in", values, "fhStatusRegSfp");
            return (Criteria) this;
        }

        public Criteria andFhStatusRegSfpBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fh_status_reg_sfp between", value1, value2, "fhStatusRegSfp");
            return (Criteria) this;
        }

        public Criteria andFhStatusRegSfpNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fh_status_reg_sfp not between", value1, value2, "fhStatusRegSfp");
            return (Criteria) this;
        }

        public Criteria andCvePenAlimIsNull() {
            addCriterion("cve_pen_alim is null");
            return (Criteria) this;
        }

        public Criteria andCvePenAlimIsNotNull() {
            addCriterion("cve_pen_alim is not null");
            return (Criteria) this;
        }

        public Criteria andCvePenAlimEqualTo(Integer value) {
            addCriterion("cve_pen_alim =", value, "cvePenAlim");
            return (Criteria) this;
        }

        public Criteria andCvePenAlimNotEqualTo(Integer value) {
            addCriterion("cve_pen_alim <>", value, "cvePenAlim");
            return (Criteria) this;
        }

        public Criteria andCvePenAlimGreaterThan(Integer value) {
            addCriterion("cve_pen_alim >", value, "cvePenAlim");
            return (Criteria) this;
        }

        public Criteria andCvePenAlimGreaterThanOrEqualTo(Integer value) {
            addCriterion("cve_pen_alim >=", value, "cvePenAlim");
            return (Criteria) this;
        }

        public Criteria andCvePenAlimLessThan(Integer value) {
            addCriterion("cve_pen_alim <", value, "cvePenAlim");
            return (Criteria) this;
        }

        public Criteria andCvePenAlimLessThanOrEqualTo(Integer value) {
            addCriterion("cve_pen_alim <=", value, "cvePenAlim");
            return (Criteria) this;
        }

        public Criteria andCvePenAlimIn(List<Integer> values) {
            addCriterion("cve_pen_alim in", values, "cvePenAlim");
            return (Criteria) this;
        }

        public Criteria andCvePenAlimNotIn(List<Integer> values) {
            addCriterion("cve_pen_alim not in", values, "cvePenAlim");
            return (Criteria) this;
        }

        public Criteria andCvePenAlimBetween(Integer value1, Integer value2) {
            addCriterion("cve_pen_alim between", value1, value2, "cvePenAlim");
            return (Criteria) this;
        }

        public Criteria andCvePenAlimNotBetween(Integer value1, Integer value2) {
            addCriterion("cve_pen_alim not between", value1, value2, "cvePenAlim");
            return (Criteria) this;
        }

        public Criteria andCveExpensaIsNull() {
            addCriterion("cve_expensa is null");
            return (Criteria) this;
        }

        public Criteria andCveExpensaIsNotNull() {
            addCriterion("cve_expensa is not null");
            return (Criteria) this;
        }

        public Criteria andCveExpensaEqualTo(Integer value) {
            addCriterion("cve_expensa =", value, "cveExpensa");
            return (Criteria) this;
        }

        public Criteria andCveExpensaNotEqualTo(Integer value) {
            addCriterion("cve_expensa <>", value, "cveExpensa");
            return (Criteria) this;
        }

        public Criteria andCveExpensaGreaterThan(Integer value) {
            addCriterion("cve_expensa >", value, "cveExpensa");
            return (Criteria) this;
        }

        public Criteria andCveExpensaGreaterThanOrEqualTo(Integer value) {
            addCriterion("cve_expensa >=", value, "cveExpensa");
            return (Criteria) this;
        }

        public Criteria andCveExpensaLessThan(Integer value) {
            addCriterion("cve_expensa <", value, "cveExpensa");
            return (Criteria) this;
        }

        public Criteria andCveExpensaLessThanOrEqualTo(Integer value) {
            addCriterion("cve_expensa <=", value, "cveExpensa");
            return (Criteria) this;
        }

        public Criteria andCveExpensaIn(List<Integer> values) {
            addCriterion("cve_expensa in", values, "cveExpensa");
            return (Criteria) this;
        }

        public Criteria andCveExpensaNotIn(List<Integer> values) {
            addCriterion("cve_expensa not in", values, "cveExpensa");
            return (Criteria) this;
        }

        public Criteria andCveExpensaBetween(Integer value1, Integer value2) {
            addCriterion("cve_expensa between", value1, value2, "cveExpensa");
            return (Criteria) this;
        }

        public Criteria andCveExpensaNotBetween(Integer value1, Integer value2) {
            addCriterion("cve_expensa not between", value1, value2, "cveExpensa");
            return (Criteria) this;
        }

        public Criteria andCveImpFiniqIsNull() {
            addCriterion("cve_imp_finiq is null");
            return (Criteria) this;
        }

        public Criteria andCveImpFiniqIsNotNull() {
            addCriterion("cve_imp_finiq is not null");
            return (Criteria) this;
        }

        public Criteria andCveImpFiniqEqualTo(Integer value) {
            addCriterion("cve_imp_finiq =", value, "cveImpFiniq");
            return (Criteria) this;
        }

        public Criteria andCveImpFiniqNotEqualTo(Integer value) {
            addCriterion("cve_imp_finiq <>", value, "cveImpFiniq");
            return (Criteria) this;
        }

        public Criteria andCveImpFiniqGreaterThan(Integer value) {
            addCriterion("cve_imp_finiq >", value, "cveImpFiniq");
            return (Criteria) this;
        }

        public Criteria andCveImpFiniqGreaterThanOrEqualTo(Integer value) {
            addCriterion("cve_imp_finiq >=", value, "cveImpFiniq");
            return (Criteria) this;
        }

        public Criteria andCveImpFiniqLessThan(Integer value) {
            addCriterion("cve_imp_finiq <", value, "cveImpFiniq");
            return (Criteria) this;
        }

        public Criteria andCveImpFiniqLessThanOrEqualTo(Integer value) {
            addCriterion("cve_imp_finiq <=", value, "cveImpFiniq");
            return (Criteria) this;
        }

        public Criteria andCveImpFiniqIn(List<Integer> values) {
            addCriterion("cve_imp_finiq in", values, "cveImpFiniq");
            return (Criteria) this;
        }

        public Criteria andCveImpFiniqNotIn(List<Integer> values) {
            addCriterion("cve_imp_finiq not in", values, "cveImpFiniq");
            return (Criteria) this;
        }

        public Criteria andCveImpFiniqBetween(Integer value1, Integer value2) {
            addCriterion("cve_imp_finiq between", value1, value2, "cveImpFiniq");
            return (Criteria) this;
        }

        public Criteria andCveImpFiniqNotBetween(Integer value1, Integer value2) {
            addCriterion("cve_imp_finiq not between", value1, value2, "cveImpFiniq");
            return (Criteria) this;
        }

        public Criteria andCveReqCompIsNull() {
            addCriterion("cve_req_comp is null");
            return (Criteria) this;
        }

        public Criteria andCveReqCompIsNotNull() {
            addCriterion("cve_req_comp is not null");
            return (Criteria) this;
        }

        public Criteria andCveReqCompEqualTo(Integer value) {
            addCriterion("cve_req_comp =", value, "cveReqComp");
            return (Criteria) this;
        }

        public Criteria andCveReqCompNotEqualTo(Integer value) {
            addCriterion("cve_req_comp <>", value, "cveReqComp");
            return (Criteria) this;
        }

        public Criteria andCveReqCompGreaterThan(Integer value) {
            addCriterion("cve_req_comp >", value, "cveReqComp");
            return (Criteria) this;
        }

        public Criteria andCveReqCompGreaterThanOrEqualTo(Integer value) {
            addCriterion("cve_req_comp >=", value, "cveReqComp");
            return (Criteria) this;
        }

        public Criteria andCveReqCompLessThan(Integer value) {
            addCriterion("cve_req_comp <", value, "cveReqComp");
            return (Criteria) this;
        }

        public Criteria andCveReqCompLessThanOrEqualTo(Integer value) {
            addCriterion("cve_req_comp <=", value, "cveReqComp");
            return (Criteria) this;
        }

        public Criteria andCveReqCompIn(List<Integer> values) {
            addCriterion("cve_req_comp in", values, "cveReqComp");
            return (Criteria) this;
        }

        public Criteria andCveReqCompNotIn(List<Integer> values) {
            addCriterion("cve_req_comp not in", values, "cveReqComp");
            return (Criteria) this;
        }

        public Criteria andCveReqCompBetween(Integer value1, Integer value2) {
            addCriterion("cve_req_comp between", value1, value2, "cveReqComp");
            return (Criteria) this;
        }

        public Criteria andCveReqCompNotBetween(Integer value1, Integer value2) {
            addCriterion("cve_req_comp not between", value1, value2, "cveReqComp");
            return (Criteria) this;
        }

        public Criteria andCveFlujoSfpIsNull() {
            addCriterion("cve_flujo_sfp is null");
            return (Criteria) this;
        }

        public Criteria andCveFlujoSfpIsNotNull() {
            addCriterion("cve_flujo_sfp is not null");
            return (Criteria) this;
        }

        public Criteria andCveFlujoSfpEqualTo(Integer value) {
            addCriterion("cve_flujo_sfp =", value, "cveFlujoSfp");
            return (Criteria) this;
        }

        public Criteria andCveFlujoSfpNotEqualTo(Integer value) {
            addCriterion("cve_flujo_sfp <>", value, "cveFlujoSfp");
            return (Criteria) this;
        }

        public Criteria andCveFlujoSfpGreaterThan(Integer value) {
            addCriterion("cve_flujo_sfp >", value, "cveFlujoSfp");
            return (Criteria) this;
        }

        public Criteria andCveFlujoSfpGreaterThanOrEqualTo(Integer value) {
            addCriterion("cve_flujo_sfp >=", value, "cveFlujoSfp");
            return (Criteria) this;
        }

        public Criteria andCveFlujoSfpLessThan(Integer value) {
            addCriterion("cve_flujo_sfp <", value, "cveFlujoSfp");
            return (Criteria) this;
        }

        public Criteria andCveFlujoSfpLessThanOrEqualTo(Integer value) {
            addCriterion("cve_flujo_sfp <=", value, "cveFlujoSfp");
            return (Criteria) this;
        }

        public Criteria andCveFlujoSfpIn(List<Integer> values) {
            addCriterion("cve_flujo_sfp in", values, "cveFlujoSfp");
            return (Criteria) this;
        }

        public Criteria andCveFlujoSfpNotIn(List<Integer> values) {
            addCriterion("cve_flujo_sfp not in", values, "cveFlujoSfp");
            return (Criteria) this;
        }

        public Criteria andCveFlujoSfpBetween(Integer value1, Integer value2) {
            addCriterion("cve_flujo_sfp between", value1, value2, "cveFlujoSfp");
            return (Criteria) this;
        }

        public Criteria andCveFlujoSfpNotBetween(Integer value1, Integer value2) {
            addCriterion("cve_flujo_sfp not between", value1, value2, "cveFlujoSfp");
            return (Criteria) this;
        }

        public Criteria andCveEdoCivilIsNull() {
            addCriterion("cve_edo_civil is null");
            return (Criteria) this;
        }

        public Criteria andCveEdoCivilIsNotNull() {
            addCriterion("cve_edo_civil is not null");
            return (Criteria) this;
        }

        public Criteria andCveEdoCivilEqualTo(Short value) {
            addCriterion("cve_edo_civil =", value, "cveEdoCivil");
            return (Criteria) this;
        }

        public Criteria andCveEdoCivilNotEqualTo(Short value) {
            addCriterion("cve_edo_civil <>", value, "cveEdoCivil");
            return (Criteria) this;
        }

        public Criteria andCveEdoCivilGreaterThan(Short value) {
            addCriterion("cve_edo_civil >", value, "cveEdoCivil");
            return (Criteria) this;
        }

        public Criteria andCveEdoCivilGreaterThanOrEqualTo(Short value) {
            addCriterion("cve_edo_civil >=", value, "cveEdoCivil");
            return (Criteria) this;
        }

        public Criteria andCveEdoCivilLessThan(Short value) {
            addCriterion("cve_edo_civil <", value, "cveEdoCivil");
            return (Criteria) this;
        }

        public Criteria andCveEdoCivilLessThanOrEqualTo(Short value) {
            addCriterion("cve_edo_civil <=", value, "cveEdoCivil");
            return (Criteria) this;
        }

        public Criteria andCveEdoCivilIn(List<Short> values) {
            addCriterion("cve_edo_civil in", values, "cveEdoCivil");
            return (Criteria) this;
        }

        public Criteria andCveEdoCivilNotIn(List<Short> values) {
            addCriterion("cve_edo_civil not in", values, "cveEdoCivil");
            return (Criteria) this;
        }

        public Criteria andCveEdoCivilBetween(Short value1, Short value2) {
            addCriterion("cve_edo_civil between", value1, value2, "cveEdoCivil");
            return (Criteria) this;
        }

        public Criteria andCveEdoCivilNotBetween(Short value1, Short value2) {
            addCriterion("cve_edo_civil not between", value1, value2, "cveEdoCivil");
            return (Criteria) this;
        }

        public Criteria andCveReqIsssteIsNull() {
            addCriterion("cve_req_issste is null");
            return (Criteria) this;
        }

        public Criteria andCveReqIsssteIsNotNull() {
            addCriterion("cve_req_issste is not null");
            return (Criteria) this;
        }

        public Criteria andCveReqIsssteEqualTo(Short value) {
            addCriterion("cve_req_issste =", value, "cveReqIssste");
            return (Criteria) this;
        }

        public Criteria andCveReqIsssteNotEqualTo(Short value) {
            addCriterion("cve_req_issste <>", value, "cveReqIssste");
            return (Criteria) this;
        }

        public Criteria andCveReqIsssteGreaterThan(Short value) {
            addCriterion("cve_req_issste >", value, "cveReqIssste");
            return (Criteria) this;
        }

        public Criteria andCveReqIsssteGreaterThanOrEqualTo(Short value) {
            addCriterion("cve_req_issste >=", value, "cveReqIssste");
            return (Criteria) this;
        }

        public Criteria andCveReqIsssteLessThan(Short value) {
            addCriterion("cve_req_issste <", value, "cveReqIssste");
            return (Criteria) this;
        }

        public Criteria andCveReqIsssteLessThanOrEqualTo(Short value) {
            addCriterion("cve_req_issste <=", value, "cveReqIssste");
            return (Criteria) this;
        }

        public Criteria andCveReqIsssteIn(List<Short> values) {
            addCriterion("cve_req_issste in", values, "cveReqIssste");
            return (Criteria) this;
        }

        public Criteria andCveReqIsssteNotIn(List<Short> values) {
            addCriterion("cve_req_issste not in", values, "cveReqIssste");
            return (Criteria) this;
        }

        public Criteria andCveReqIsssteBetween(Short value1, Short value2) {
            addCriterion("cve_req_issste between", value1, value2, "cveReqIssste");
            return (Criteria) this;
        }

        public Criteria andCveReqIsssteNotBetween(Short value1, Short value2) {
            addCriterion("cve_req_issste not between", value1, value2, "cveReqIssste");
            return (Criteria) this;
        }

        public Criteria andFhIniAntIsNull() {
            addCriterion("fh_ini_ant is null");
            return (Criteria) this;
        }

        public Criteria andFhIniAntIsNotNull() {
            addCriterion("fh_ini_ant is not null");
            return (Criteria) this;
        }

        public Criteria andFhIniAntEqualTo(Date value) {
            addCriterionForJDBCDate("fh_ini_ant =", value, "fhIniAnt");
            return (Criteria) this;
        }

        public Criteria andFhIniAntNotEqualTo(Date value) {
            addCriterionForJDBCDate("fh_ini_ant <>", value, "fhIniAnt");
            return (Criteria) this;
        }

        public Criteria andFhIniAntGreaterThan(Date value) {
            addCriterionForJDBCDate("fh_ini_ant >", value, "fhIniAnt");
            return (Criteria) this;
        }

        public Criteria andFhIniAntGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fh_ini_ant >=", value, "fhIniAnt");
            return (Criteria) this;
        }

        public Criteria andFhIniAntLessThan(Date value) {
            addCriterionForJDBCDate("fh_ini_ant <", value, "fhIniAnt");
            return (Criteria) this;
        }

        public Criteria andFhIniAntLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fh_ini_ant <=", value, "fhIniAnt");
            return (Criteria) this;
        }

        public Criteria andFhIniAntIn(List<Date> values) {
            addCriterionForJDBCDate("fh_ini_ant in", values, "fhIniAnt");
            return (Criteria) this;
        }

        public Criteria andFhIniAntNotIn(List<Date> values) {
            addCriterionForJDBCDate("fh_ini_ant not in", values, "fhIniAnt");
            return (Criteria) this;
        }

        public Criteria andFhIniAntBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fh_ini_ant between", value1, value2, "fhIniAnt");
            return (Criteria) this;
        }

        public Criteria andFhIniAntNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fh_ini_ant not between", value1, value2, "fhIniAnt");
            return (Criteria) this;
        }

        public Criteria andCveEntidadCapIsNull() {
            addCriterion("cve_entidad_cap is null");
            return (Criteria) this;
        }

        public Criteria andCveEntidadCapIsNotNull() {
            addCriterion("cve_entidad_cap is not null");
            return (Criteria) this;
        }

        public Criteria andCveEntidadCapEqualTo(Short value) {
            addCriterion("cve_entidad_cap =", value, "cveEntidadCap");
            return (Criteria) this;
        }

        public Criteria andCveEntidadCapNotEqualTo(Short value) {
            addCriterion("cve_entidad_cap <>", value, "cveEntidadCap");
            return (Criteria) this;
        }

        public Criteria andCveEntidadCapGreaterThan(Short value) {
            addCriterion("cve_entidad_cap >", value, "cveEntidadCap");
            return (Criteria) this;
        }

        public Criteria andCveEntidadCapGreaterThanOrEqualTo(Short value) {
            addCriterion("cve_entidad_cap >=", value, "cveEntidadCap");
            return (Criteria) this;
        }

        public Criteria andCveEntidadCapLessThan(Short value) {
            addCriterion("cve_entidad_cap <", value, "cveEntidadCap");
            return (Criteria) this;
        }

        public Criteria andCveEntidadCapLessThanOrEqualTo(Short value) {
            addCriterion("cve_entidad_cap <=", value, "cveEntidadCap");
            return (Criteria) this;
        }

        public Criteria andCveEntidadCapIn(List<Short> values) {
            addCriterion("cve_entidad_cap in", values, "cveEntidadCap");
            return (Criteria) this;
        }

        public Criteria andCveEntidadCapNotIn(List<Short> values) {
            addCriterion("cve_entidad_cap not in", values, "cveEntidadCap");
            return (Criteria) this;
        }

        public Criteria andCveEntidadCapBetween(Short value1, Short value2) {
            addCriterion("cve_entidad_cap between", value1, value2, "cveEntidadCap");
            return (Criteria) this;
        }

        public Criteria andCveEntidadCapNotBetween(Short value1, Short value2) {
            addCriterion("cve_entidad_cap not between", value1, value2, "cveEntidadCap");
            return (Criteria) this;
        }

        public Criteria andCveMpioCapIsNull() {
            addCriterion("cve_mpio_cap is null");
            return (Criteria) this;
        }

        public Criteria andCveMpioCapIsNotNull() {
            addCriterion("cve_mpio_cap is not null");
            return (Criteria) this;
        }

        public Criteria andCveMpioCapEqualTo(Short value) {
            addCriterion("cve_mpio_cap =", value, "cveMpioCap");
            return (Criteria) this;
        }

        public Criteria andCveMpioCapNotEqualTo(Short value) {
            addCriterion("cve_mpio_cap <>", value, "cveMpioCap");
            return (Criteria) this;
        }

        public Criteria andCveMpioCapGreaterThan(Short value) {
            addCriterion("cve_mpio_cap >", value, "cveMpioCap");
            return (Criteria) this;
        }

        public Criteria andCveMpioCapGreaterThanOrEqualTo(Short value) {
            addCriterion("cve_mpio_cap >=", value, "cveMpioCap");
            return (Criteria) this;
        }

        public Criteria andCveMpioCapLessThan(Short value) {
            addCriterion("cve_mpio_cap <", value, "cveMpioCap");
            return (Criteria) this;
        }

        public Criteria andCveMpioCapLessThanOrEqualTo(Short value) {
            addCriterion("cve_mpio_cap <=", value, "cveMpioCap");
            return (Criteria) this;
        }

        public Criteria andCveMpioCapIn(List<Short> values) {
            addCriterion("cve_mpio_cap in", values, "cveMpioCap");
            return (Criteria) this;
        }

        public Criteria andCveMpioCapNotIn(List<Short> values) {
            addCriterion("cve_mpio_cap not in", values, "cveMpioCap");
            return (Criteria) this;
        }

        public Criteria andCveMpioCapBetween(Short value1, Short value2) {
            addCriterion("cve_mpio_cap between", value1, value2, "cveMpioCap");
            return (Criteria) this;
        }

        public Criteria andCveMpioCapNotBetween(Short value1, Short value2) {
            addCriterion("cve_mpio_cap not between", value1, value2, "cveMpioCap");
            return (Criteria) this;
        }

        public Criteria andCtaBancariaIsNull() {
            addCriterion("cta_bancaria is null");
            return (Criteria) this;
        }

        public Criteria andCtaBancariaIsNotNull() {
            addCriterion("cta_bancaria is not null");
            return (Criteria) this;
        }

        public Criteria andCtaBancariaEqualTo(String value) {
            addCriterion("cta_bancaria =", value, "ctaBancaria");
            return (Criteria) this;
        }

        public Criteria andCtaBancariaNotEqualTo(String value) {
            addCriterion("cta_bancaria <>", value, "ctaBancaria");
            return (Criteria) this;
        }

        public Criteria andCtaBancariaGreaterThan(String value) {
            addCriterion("cta_bancaria >", value, "ctaBancaria");
            return (Criteria) this;
        }

        public Criteria andCtaBancariaGreaterThanOrEqualTo(String value) {
            addCriterion("cta_bancaria >=", value, "ctaBancaria");
            return (Criteria) this;
        }

        public Criteria andCtaBancariaLessThan(String value) {
            addCriterion("cta_bancaria <", value, "ctaBancaria");
            return (Criteria) this;
        }

        public Criteria andCtaBancariaLessThanOrEqualTo(String value) {
            addCriterion("cta_bancaria <=", value, "ctaBancaria");
            return (Criteria) this;
        }

        public Criteria andCtaBancariaLike(String value) {
            addCriterion("cta_bancaria like", value, "ctaBancaria");
            return (Criteria) this;
        }

        public Criteria andCtaBancariaNotLike(String value) {
            addCriterion("cta_bancaria not like", value, "ctaBancaria");
            return (Criteria) this;
        }

        public Criteria andCtaBancariaIn(List<String> values) {
            addCriterion("cta_bancaria in", values, "ctaBancaria");
            return (Criteria) this;
        }

        public Criteria andCtaBancariaNotIn(List<String> values) {
            addCriterion("cta_bancaria not in", values, "ctaBancaria");
            return (Criteria) this;
        }

        public Criteria andCtaBancariaBetween(String value1, String value2) {
            addCriterion("cta_bancaria between", value1, value2, "ctaBancaria");
            return (Criteria) this;
        }

        public Criteria andCtaBancariaNotBetween(String value1, String value2) {
            addCriterion("cta_bancaria not between", value1, value2, "ctaBancaria");
            return (Criteria) this;
        }

        public Criteria andProcesoCapturaIsNull() {
            addCriterion("proceso_captura is null");
            return (Criteria) this;
        }

        public Criteria andProcesoCapturaIsNotNull() {
            addCriterion("proceso_captura is not null");
            return (Criteria) this;
        }

        public Criteria andProcesoCapturaEqualTo(Short value) {
            addCriterion("proceso_captura =", value, "procesoCaptura");
            return (Criteria) this;
        }

        public Criteria andProcesoCapturaNotEqualTo(Short value) {
            addCriterion("proceso_captura <>", value, "procesoCaptura");
            return (Criteria) this;
        }

        public Criteria andProcesoCapturaGreaterThan(Short value) {
            addCriterion("proceso_captura >", value, "procesoCaptura");
            return (Criteria) this;
        }

        public Criteria andProcesoCapturaGreaterThanOrEqualTo(Short value) {
            addCriterion("proceso_captura >=", value, "procesoCaptura");
            return (Criteria) this;
        }

        public Criteria andProcesoCapturaLessThan(Short value) {
            addCriterion("proceso_captura <", value, "procesoCaptura");
            return (Criteria) this;
        }

        public Criteria andProcesoCapturaLessThanOrEqualTo(Short value) {
            addCriterion("proceso_captura <=", value, "procesoCaptura");
            return (Criteria) this;
        }

        public Criteria andProcesoCapturaIn(List<Short> values) {
            addCriterion("proceso_captura in", values, "procesoCaptura");
            return (Criteria) this;
        }

        public Criteria andProcesoCapturaNotIn(List<Short> values) {
            addCriterion("proceso_captura not in", values, "procesoCaptura");
            return (Criteria) this;
        }

        public Criteria andProcesoCapturaBetween(Short value1, Short value2) {
            addCriterion("proceso_captura between", value1, value2, "procesoCaptura");
            return (Criteria) this;
        }

        public Criteria andProcesoCapturaNotBetween(Short value1, Short value2) {
            addCriterion("proceso_captura not between", value1, value2, "procesoCaptura");
            return (Criteria) this;
        }

        public Criteria andCveAreaGralIsNull() {
            addCriterion("cve_area_gral is null");
            return (Criteria) this;
        }

        public Criteria andCveAreaGralIsNotNull() {
            addCriterion("cve_area_gral is not null");
            return (Criteria) this;
        }

        public Criteria andCveAreaGralEqualTo(Short value) {
            addCriterion("cve_area_gral =", value, "cveAreaGral");
            return (Criteria) this;
        }

        public Criteria andCveAreaGralNotEqualTo(Short value) {
            addCriterion("cve_area_gral <>", value, "cveAreaGral");
            return (Criteria) this;
        }

        public Criteria andCveAreaGralGreaterThan(Short value) {
            addCriterion("cve_area_gral >", value, "cveAreaGral");
            return (Criteria) this;
        }

        public Criteria andCveAreaGralGreaterThanOrEqualTo(Short value) {
            addCriterion("cve_area_gral >=", value, "cveAreaGral");
            return (Criteria) this;
        }

        public Criteria andCveAreaGralLessThan(Short value) {
            addCriterion("cve_area_gral <", value, "cveAreaGral");
            return (Criteria) this;
        }

        public Criteria andCveAreaGralLessThanOrEqualTo(Short value) {
            addCriterion("cve_area_gral <=", value, "cveAreaGral");
            return (Criteria) this;
        }

        public Criteria andCveAreaGralIn(List<Short> values) {
            addCriterion("cve_area_gral in", values, "cveAreaGral");
            return (Criteria) this;
        }

        public Criteria andCveAreaGralNotIn(List<Short> values) {
            addCriterion("cve_area_gral not in", values, "cveAreaGral");
            return (Criteria) this;
        }

        public Criteria andCveAreaGralBetween(Short value1, Short value2) {
            addCriterion("cve_area_gral between", value1, value2, "cveAreaGral");
            return (Criteria) this;
        }

        public Criteria andCveAreaGralNotBetween(Short value1, Short value2) {
            addCriterion("cve_area_gral not between", value1, value2, "cveAreaGral");
            return (Criteria) this;
        }

        public Criteria andOtraAreaGralIsNull() {
            addCriterion("otra_area_gral is null");
            return (Criteria) this;
        }

        public Criteria andOtraAreaGralIsNotNull() {
            addCriterion("otra_area_gral is not null");
            return (Criteria) this;
        }

        public Criteria andOtraAreaGralEqualTo(String value) {
            addCriterion("otra_area_gral =", value, "otraAreaGral");
            return (Criteria) this;
        }

        public Criteria andOtraAreaGralNotEqualTo(String value) {
            addCriterion("otra_area_gral <>", value, "otraAreaGral");
            return (Criteria) this;
        }

        public Criteria andOtraAreaGralGreaterThan(String value) {
            addCriterion("otra_area_gral >", value, "otraAreaGral");
            return (Criteria) this;
        }

        public Criteria andOtraAreaGralGreaterThanOrEqualTo(String value) {
            addCriterion("otra_area_gral >=", value, "otraAreaGral");
            return (Criteria) this;
        }

        public Criteria andOtraAreaGralLessThan(String value) {
            addCriterion("otra_area_gral <", value, "otraAreaGral");
            return (Criteria) this;
        }

        public Criteria andOtraAreaGralLessThanOrEqualTo(String value) {
            addCriterion("otra_area_gral <=", value, "otraAreaGral");
            return (Criteria) this;
        }

        public Criteria andOtraAreaGralLike(String value) {
            addCriterion("otra_area_gral like", value, "otraAreaGral");
            return (Criteria) this;
        }

        public Criteria andOtraAreaGralNotLike(String value) {
            addCriterion("otra_area_gral not like", value, "otraAreaGral");
            return (Criteria) this;
        }

        public Criteria andOtraAreaGralIn(List<String> values) {
            addCriterion("otra_area_gral in", values, "otraAreaGral");
            return (Criteria) this;
        }

        public Criteria andOtraAreaGralNotIn(List<String> values) {
            addCriterion("otra_area_gral not in", values, "otraAreaGral");
            return (Criteria) this;
        }

        public Criteria andOtraAreaGralBetween(String value1, String value2) {
            addCriterion("otra_area_gral between", value1, value2, "otraAreaGral");
            return (Criteria) this;
        }

        public Criteria andOtraAreaGralNotBetween(String value1, String value2) {
            addCriterion("otra_area_gral not between", value1, value2, "otraAreaGral");
            return (Criteria) this;
        }

        public Criteria andCveConocReqIsNull() {
            addCriterion("cve_conoc_req is null");
            return (Criteria) this;
        }

        public Criteria andCveConocReqIsNotNull() {
            addCriterion("cve_conoc_req is not null");
            return (Criteria) this;
        }

        public Criteria andCveConocReqEqualTo(Short value) {
            addCriterion("cve_conoc_req =", value, "cveConocReq");
            return (Criteria) this;
        }

        public Criteria andCveConocReqNotEqualTo(Short value) {
            addCriterion("cve_conoc_req <>", value, "cveConocReq");
            return (Criteria) this;
        }

        public Criteria andCveConocReqGreaterThan(Short value) {
            addCriterion("cve_conoc_req >", value, "cveConocReq");
            return (Criteria) this;
        }

        public Criteria andCveConocReqGreaterThanOrEqualTo(Short value) {
            addCriterion("cve_conoc_req >=", value, "cveConocReq");
            return (Criteria) this;
        }

        public Criteria andCveConocReqLessThan(Short value) {
            addCriterion("cve_conoc_req <", value, "cveConocReq");
            return (Criteria) this;
        }

        public Criteria andCveConocReqLessThanOrEqualTo(Short value) {
            addCriterion("cve_conoc_req <=", value, "cveConocReq");
            return (Criteria) this;
        }

        public Criteria andCveConocReqIn(List<Short> values) {
            addCriterion("cve_conoc_req in", values, "cveConocReq");
            return (Criteria) this;
        }

        public Criteria andCveConocReqNotIn(List<Short> values) {
            addCriterion("cve_conoc_req not in", values, "cveConocReq");
            return (Criteria) this;
        }

        public Criteria andCveConocReqBetween(Short value1, Short value2) {
            addCriterion("cve_conoc_req between", value1, value2, "cveConocReq");
            return (Criteria) this;
        }

        public Criteria andCveConocReqNotBetween(Short value1, Short value2) {
            addCriterion("cve_conoc_req not between", value1, value2, "cveConocReq");
            return (Criteria) this;
        }

        public Criteria andOtroConocReqIsNull() {
            addCriterion("otro_conoc_req is null");
            return (Criteria) this;
        }

        public Criteria andOtroConocReqIsNotNull() {
            addCriterion("otro_conoc_req is not null");
            return (Criteria) this;
        }

        public Criteria andOtroConocReqEqualTo(String value) {
            addCriterion("otro_conoc_req =", value, "otroConocReq");
            return (Criteria) this;
        }

        public Criteria andOtroConocReqNotEqualTo(String value) {
            addCriterion("otro_conoc_req <>", value, "otroConocReq");
            return (Criteria) this;
        }

        public Criteria andOtroConocReqGreaterThan(String value) {
            addCriterion("otro_conoc_req >", value, "otroConocReq");
            return (Criteria) this;
        }

        public Criteria andOtroConocReqGreaterThanOrEqualTo(String value) {
            addCriterion("otro_conoc_req >=", value, "otroConocReq");
            return (Criteria) this;
        }

        public Criteria andOtroConocReqLessThan(String value) {
            addCriterion("otro_conoc_req <", value, "otroConocReq");
            return (Criteria) this;
        }

        public Criteria andOtroConocReqLessThanOrEqualTo(String value) {
            addCriterion("otro_conoc_req <=", value, "otroConocReq");
            return (Criteria) this;
        }

        public Criteria andOtroConocReqLike(String value) {
            addCriterion("otro_conoc_req like", value, "otroConocReq");
            return (Criteria) this;
        }

        public Criteria andOtroConocReqNotLike(String value) {
            addCriterion("otro_conoc_req not like", value, "otroConocReq");
            return (Criteria) this;
        }

        public Criteria andOtroConocReqIn(List<String> values) {
            addCriterion("otro_conoc_req in", values, "otroConocReq");
            return (Criteria) this;
        }

        public Criteria andOtroConocReqNotIn(List<String> values) {
            addCriterion("otro_conoc_req not in", values, "otroConocReq");
            return (Criteria) this;
        }

        public Criteria andOtroConocReqBetween(String value1, String value2) {
            addCriterion("otro_conoc_req between", value1, value2, "otroConocReq");
            return (Criteria) this;
        }

        public Criteria andOtroConocReqNotBetween(String value1, String value2) {
            addCriterion("otro_conoc_req not between", value1, value2, "otroConocReq");
            return (Criteria) this;
        }

        public Criteria andAnniosExpIsNull() {
            addCriterion("annios_exp is null");
            return (Criteria) this;
        }

        public Criteria andAnniosExpIsNotNull() {
            addCriterion("annios_exp is not null");
            return (Criteria) this;
        }

        public Criteria andAnniosExpEqualTo(Short value) {
            addCriterion("annios_exp =", value, "anniosExp");
            return (Criteria) this;
        }

        public Criteria andAnniosExpNotEqualTo(Short value) {
            addCriterion("annios_exp <>", value, "anniosExp");
            return (Criteria) this;
        }

        public Criteria andAnniosExpGreaterThan(Short value) {
            addCriterion("annios_exp >", value, "anniosExp");
            return (Criteria) this;
        }

        public Criteria andAnniosExpGreaterThanOrEqualTo(Short value) {
            addCriterion("annios_exp >=", value, "anniosExp");
            return (Criteria) this;
        }

        public Criteria andAnniosExpLessThan(Short value) {
            addCriterion("annios_exp <", value, "anniosExp");
            return (Criteria) this;
        }

        public Criteria andAnniosExpLessThanOrEqualTo(Short value) {
            addCriterion("annios_exp <=", value, "anniosExp");
            return (Criteria) this;
        }

        public Criteria andAnniosExpIn(List<Short> values) {
            addCriterion("annios_exp in", values, "anniosExp");
            return (Criteria) this;
        }

        public Criteria andAnniosExpNotIn(List<Short> values) {
            addCriterion("annios_exp not in", values, "anniosExp");
            return (Criteria) this;
        }

        public Criteria andAnniosExpBetween(Short value1, Short value2) {
            addCriterion("annios_exp between", value1, value2, "anniosExp");
            return (Criteria) this;
        }

        public Criteria andAnniosExpNotBetween(Short value1, Short value2) {
            addCriterion("annios_exp not between", value1, value2, "anniosExp");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andExtensionIsNull() {
            addCriterion("extension is null");
            return (Criteria) this;
        }

        public Criteria andExtensionIsNotNull() {
            addCriterion("extension is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionEqualTo(String value) {
            addCriterion("extension =", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionNotEqualTo(String value) {
            addCriterion("extension <>", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionGreaterThan(String value) {
            addCriterion("extension >", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionGreaterThanOrEqualTo(String value) {
            addCriterion("extension >=", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionLessThan(String value) {
            addCriterion("extension <", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionLessThanOrEqualTo(String value) {
            addCriterion("extension <=", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionLike(String value) {
            addCriterion("extension like", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionNotLike(String value) {
            addCriterion("extension not like", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionIn(List<String> values) {
            addCriterion("extension in", values, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionNotIn(List<String> values) {
            addCriterion("extension not in", values, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionBetween(String value1, String value2) {
            addCriterion("extension between", value1, value2, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionNotBetween(String value1, String value2) {
            addCriterion("extension not between", value1, value2, "extension");
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