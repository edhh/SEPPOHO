package mx.sep.poho.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Tsh82ConfigModeloContratoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tsh82ConfigModeloContratoExample() {
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

        public Criteria andVigInicioIsNull() {
            addCriterion("vig_inicio is null");
            return (Criteria) this;
        }

        public Criteria andVigInicioIsNotNull() {
            addCriterion("vig_inicio is not null");
            return (Criteria) this;
        }

        public Criteria andVigInicioEqualTo(Date value) {
            addCriterionForJDBCDate("vig_inicio =", value, "vigInicio");
            return (Criteria) this;
        }

        public Criteria andVigInicioNotEqualTo(Date value) {
            addCriterionForJDBCDate("vig_inicio <>", value, "vigInicio");
            return (Criteria) this;
        }

        public Criteria andVigInicioGreaterThan(Date value) {
            addCriterionForJDBCDate("vig_inicio >", value, "vigInicio");
            return (Criteria) this;
        }

        public Criteria andVigInicioGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vig_inicio >=", value, "vigInicio");
            return (Criteria) this;
        }

        public Criteria andVigInicioLessThan(Date value) {
            addCriterionForJDBCDate("vig_inicio <", value, "vigInicio");
            return (Criteria) this;
        }

        public Criteria andVigInicioLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vig_inicio <=", value, "vigInicio");
            return (Criteria) this;
        }

        public Criteria andVigInicioIn(List<Date> values) {
            addCriterionForJDBCDate("vig_inicio in", values, "vigInicio");
            return (Criteria) this;
        }

        public Criteria andVigInicioNotIn(List<Date> values) {
            addCriterionForJDBCDate("vig_inicio not in", values, "vigInicio");
            return (Criteria) this;
        }

        public Criteria andVigInicioBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vig_inicio between", value1, value2, "vigInicio");
            return (Criteria) this;
        }

        public Criteria andVigInicioNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vig_inicio not between", value1, value2, "vigInicio");
            return (Criteria) this;
        }

        public Criteria andVigFinalIsNull() {
            addCriterion("vig_final is null");
            return (Criteria) this;
        }

        public Criteria andVigFinalIsNotNull() {
            addCriterion("vig_final is not null");
            return (Criteria) this;
        }

        public Criteria andVigFinalEqualTo(Date value) {
            addCriterionForJDBCDate("vig_final =", value, "vigFinal");
            return (Criteria) this;
        }

        public Criteria andVigFinalNotEqualTo(Date value) {
            addCriterionForJDBCDate("vig_final <>", value, "vigFinal");
            return (Criteria) this;
        }

        public Criteria andVigFinalGreaterThan(Date value) {
            addCriterionForJDBCDate("vig_final >", value, "vigFinal");
            return (Criteria) this;
        }

        public Criteria andVigFinalGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vig_final >=", value, "vigFinal");
            return (Criteria) this;
        }

        public Criteria andVigFinalLessThan(Date value) {
            addCriterionForJDBCDate("vig_final <", value, "vigFinal");
            return (Criteria) this;
        }

        public Criteria andVigFinalLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vig_final <=", value, "vigFinal");
            return (Criteria) this;
        }

        public Criteria andVigFinalIn(List<Date> values) {
            addCriterionForJDBCDate("vig_final in", values, "vigFinal");
            return (Criteria) this;
        }

        public Criteria andVigFinalNotIn(List<Date> values) {
            addCriterionForJDBCDate("vig_final not in", values, "vigFinal");
            return (Criteria) this;
        }

        public Criteria andVigFinalBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vig_final between", value1, value2, "vigFinal");
            return (Criteria) this;
        }

        public Criteria andVigFinalNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vig_final not between", value1, value2, "vigFinal");
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

        public Criteria andNombreModeloIsNull() {
            addCriterion("nombre_modelo is null");
            return (Criteria) this;
        }

        public Criteria andNombreModeloIsNotNull() {
            addCriterion("nombre_modelo is not null");
            return (Criteria) this;
        }

        public Criteria andNombreModeloEqualTo(String value) {
            addCriterion("nombre_modelo =", value, "nombreModelo");
            return (Criteria) this;
        }

        public Criteria andNombreModeloNotEqualTo(String value) {
            addCriterion("nombre_modelo <>", value, "nombreModelo");
            return (Criteria) this;
        }

        public Criteria andNombreModeloGreaterThan(String value) {
            addCriterion("nombre_modelo >", value, "nombreModelo");
            return (Criteria) this;
        }

        public Criteria andNombreModeloGreaterThanOrEqualTo(String value) {
            addCriterion("nombre_modelo >=", value, "nombreModelo");
            return (Criteria) this;
        }

        public Criteria andNombreModeloLessThan(String value) {
            addCriterion("nombre_modelo <", value, "nombreModelo");
            return (Criteria) this;
        }

        public Criteria andNombreModeloLessThanOrEqualTo(String value) {
            addCriterion("nombre_modelo <=", value, "nombreModelo");
            return (Criteria) this;
        }

        public Criteria andNombreModeloLike(String value) {
            addCriterion("nombre_modelo like", value, "nombreModelo");
            return (Criteria) this;
        }

        public Criteria andNombreModeloNotLike(String value) {
            addCriterion("nombre_modelo not like", value, "nombreModelo");
            return (Criteria) this;
        }

        public Criteria andNombreModeloIn(List<String> values) {
            addCriterion("nombre_modelo in", values, "nombreModelo");
            return (Criteria) this;
        }

        public Criteria andNombreModeloNotIn(List<String> values) {
            addCriterion("nombre_modelo not in", values, "nombreModelo");
            return (Criteria) this;
        }

        public Criteria andNombreModeloBetween(String value1, String value2) {
            addCriterion("nombre_modelo between", value1, value2, "nombreModelo");
            return (Criteria) this;
        }

        public Criteria andNombreModeloNotBetween(String value1, String value2) {
            addCriterion("nombre_modelo not between", value1, value2, "nombreModelo");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Short value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Short value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Short value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Short value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Short value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Short value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Short> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Short> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Short value1, Short value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Short value1, Short value2) {
            addCriterion("id not between", value1, value2, "id");
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