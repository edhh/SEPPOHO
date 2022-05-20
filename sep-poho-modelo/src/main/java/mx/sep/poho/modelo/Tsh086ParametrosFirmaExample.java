package mx.sep.poho.modelo;

import java.util.ArrayList;
import java.util.List;

public class Tsh086ParametrosFirmaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tsh086ParametrosFirmaExample() {
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

        public Criteria andNidParametroFirmaIsNull() {
            addCriterion("nid_parametro_firma is null");
            return (Criteria) this;
        }

        public Criteria andNidParametroFirmaIsNotNull() {
            addCriterion("nid_parametro_firma is not null");
            return (Criteria) this;
        }

        public Criteria andNidParametroFirmaEqualTo(Integer value) {
            addCriterion("nid_parametro_firma =", value, "nidParametroFirma");
            return (Criteria) this;
        }

        public Criteria andNidParametroFirmaNotEqualTo(Integer value) {
            addCriterion("nid_parametro_firma <>", value, "nidParametroFirma");
            return (Criteria) this;
        }

        public Criteria andNidParametroFirmaGreaterThan(Integer value) {
            addCriterion("nid_parametro_firma >", value, "nidParametroFirma");
            return (Criteria) this;
        }

        public Criteria andNidParametroFirmaGreaterThanOrEqualTo(Integer value) {
            addCriterion("nid_parametro_firma >=", value, "nidParametroFirma");
            return (Criteria) this;
        }

        public Criteria andNidParametroFirmaLessThan(Integer value) {
            addCriterion("nid_parametro_firma <", value, "nidParametroFirma");
            return (Criteria) this;
        }

        public Criteria andNidParametroFirmaLessThanOrEqualTo(Integer value) {
            addCriterion("nid_parametro_firma <=", value, "nidParametroFirma");
            return (Criteria) this;
        }

        public Criteria andNidParametroFirmaIn(List<Integer> values) {
            addCriterion("nid_parametro_firma in", values, "nidParametroFirma");
            return (Criteria) this;
        }

        public Criteria andNidParametroFirmaNotIn(List<Integer> values) {
            addCriterion("nid_parametro_firma not in", values, "nidParametroFirma");
            return (Criteria) this;
        }

        public Criteria andNidParametroFirmaBetween(Integer value1, Integer value2) {
            addCriterion("nid_parametro_firma between", value1, value2, "nidParametroFirma");
            return (Criteria) this;
        }

        public Criteria andNidParametroFirmaNotBetween(Integer value1, Integer value2) {
            addCriterion("nid_parametro_firma not between", value1, value2, "nidParametroFirma");
            return (Criteria) this;
        }

        public Criteria andCparametroFirmaIsNull() {
            addCriterion("cparametro_firma is null");
            return (Criteria) this;
        }

        public Criteria andCparametroFirmaIsNotNull() {
            addCriterion("cparametro_firma is not null");
            return (Criteria) this;
        }

        public Criteria andCparametroFirmaEqualTo(String value) {
            addCriterion("cparametro_firma =", value, "cparametroFirma");
            return (Criteria) this;
        }

        public Criteria andCparametroFirmaNotEqualTo(String value) {
            addCriterion("cparametro_firma <>", value, "cparametroFirma");
            return (Criteria) this;
        }

        public Criteria andCparametroFirmaGreaterThan(String value) {
            addCriterion("cparametro_firma >", value, "cparametroFirma");
            return (Criteria) this;
        }

        public Criteria andCparametroFirmaGreaterThanOrEqualTo(String value) {
            addCriterion("cparametro_firma >=", value, "cparametroFirma");
            return (Criteria) this;
        }

        public Criteria andCparametroFirmaLessThan(String value) {
            addCriterion("cparametro_firma <", value, "cparametroFirma");
            return (Criteria) this;
        }

        public Criteria andCparametroFirmaLessThanOrEqualTo(String value) {
            addCriterion("cparametro_firma <=", value, "cparametroFirma");
            return (Criteria) this;
        }

        public Criteria andCparametroFirmaLike(String value) {
            addCriterion("cparametro_firma like", value, "cparametroFirma");
            return (Criteria) this;
        }

        public Criteria andCparametroFirmaNotLike(String value) {
            addCriterion("cparametro_firma not like", value, "cparametroFirma");
            return (Criteria) this;
        }

        public Criteria andCparametroFirmaIn(List<String> values) {
            addCriterion("cparametro_firma in", values, "cparametroFirma");
            return (Criteria) this;
        }

        public Criteria andCparametroFirmaNotIn(List<String> values) {
            addCriterion("cparametro_firma not in", values, "cparametroFirma");
            return (Criteria) this;
        }

        public Criteria andCparametroFirmaBetween(String value1, String value2) {
            addCriterion("cparametro_firma between", value1, value2, "cparametroFirma");
            return (Criteria) this;
        }

        public Criteria andCparametroFirmaNotBetween(String value1, String value2) {
            addCriterion("cparametro_firma not between", value1, value2, "cparametroFirma");
            return (Criteria) this;
        }

        public Criteria andCvalorParametroFirmaIsNull() {
            addCriterion("cvalor_parametro_firma is null");
            return (Criteria) this;
        }

        public Criteria andCvalorParametroFirmaIsNotNull() {
            addCriterion("cvalor_parametro_firma is not null");
            return (Criteria) this;
        }

        public Criteria andCvalorParametroFirmaEqualTo(String value) {
            addCriterion("cvalor_parametro_firma =", value, "cvalorParametroFirma");
            return (Criteria) this;
        }

        public Criteria andCvalorParametroFirmaNotEqualTo(String value) {
            addCriterion("cvalor_parametro_firma <>", value, "cvalorParametroFirma");
            return (Criteria) this;
        }

        public Criteria andCvalorParametroFirmaGreaterThan(String value) {
            addCriterion("cvalor_parametro_firma >", value, "cvalorParametroFirma");
            return (Criteria) this;
        }

        public Criteria andCvalorParametroFirmaGreaterThanOrEqualTo(String value) {
            addCriterion("cvalor_parametro_firma >=", value, "cvalorParametroFirma");
            return (Criteria) this;
        }

        public Criteria andCvalorParametroFirmaLessThan(String value) {
            addCriterion("cvalor_parametro_firma <", value, "cvalorParametroFirma");
            return (Criteria) this;
        }

        public Criteria andCvalorParametroFirmaLessThanOrEqualTo(String value) {
            addCriterion("cvalor_parametro_firma <=", value, "cvalorParametroFirma");
            return (Criteria) this;
        }

        public Criteria andCvalorParametroFirmaLike(String value) {
            addCriterion("cvalor_parametro_firma like", value, "cvalorParametroFirma");
            return (Criteria) this;
        }

        public Criteria andCvalorParametroFirmaNotLike(String value) {
            addCriterion("cvalor_parametro_firma not like", value, "cvalorParametroFirma");
            return (Criteria) this;
        }

        public Criteria andCvalorParametroFirmaIn(List<String> values) {
            addCriterion("cvalor_parametro_firma in", values, "cvalorParametroFirma");
            return (Criteria) this;
        }

        public Criteria andCvalorParametroFirmaNotIn(List<String> values) {
            addCriterion("cvalor_parametro_firma not in", values, "cvalorParametroFirma");
            return (Criteria) this;
        }

        public Criteria andCvalorParametroFirmaBetween(String value1, String value2) {
            addCriterion("cvalor_parametro_firma between", value1, value2, "cvalorParametroFirma");
            return (Criteria) this;
        }

        public Criteria andCvalorParametroFirmaNotBetween(String value1, String value2) {
            addCriterion("cvalor_parametro_firma not between", value1, value2, "cvalorParametroFirma");
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