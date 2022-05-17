package mx.sep.poho.modelo;

import java.util.ArrayList;
import java.util.List;

public class Tsh088DatosContratosDefExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tsh088DatosContratosDefExample() {
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

        public Criteria andAnnioIsNull() {
            addCriterion("annio is null");
            return (Criteria) this;
        }

        public Criteria andAnnioIsNotNull() {
            addCriterion("annio is not null");
            return (Criteria) this;
        }

        public Criteria andAnnioEqualTo(String value) {
            addCriterion("annio =", value, "annio");
            return (Criteria) this;
        }

        public Criteria andAnnioNotEqualTo(String value) {
            addCriterion("annio <>", value, "annio");
            return (Criteria) this;
        }

        public Criteria andAnnioGreaterThan(String value) {
            addCriterion("annio >", value, "annio");
            return (Criteria) this;
        }

        public Criteria andAnnioGreaterThanOrEqualTo(String value) {
            addCriterion("annio >=", value, "annio");
            return (Criteria) this;
        }

        public Criteria andAnnioLessThan(String value) {
            addCriterion("annio <", value, "annio");
            return (Criteria) this;
        }

        public Criteria andAnnioLessThanOrEqualTo(String value) {
            addCriterion("annio <=", value, "annio");
            return (Criteria) this;
        }

        public Criteria andAnnioLike(String value) {
            addCriterion("annio like", value, "annio");
            return (Criteria) this;
        }

        public Criteria andAnnioNotLike(String value) {
            addCriterion("annio not like", value, "annio");
            return (Criteria) this;
        }

        public Criteria andAnnioIn(List<String> values) {
            addCriterion("annio in", values, "annio");
            return (Criteria) this;
        }

        public Criteria andAnnioNotIn(List<String> values) {
            addCriterion("annio not in", values, "annio");
            return (Criteria) this;
        }

        public Criteria andAnnioBetween(String value1, String value2) {
            addCriterion("annio between", value1, value2, "annio");
            return (Criteria) this;
        }

        public Criteria andAnnioNotBetween(String value1, String value2) {
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

        public Criteria andNuTramiteEqualTo(String value) {
            addCriterion("nu_tramite =", value, "nuTramite");
            return (Criteria) this;
        }

        public Criteria andNuTramiteNotEqualTo(String value) {
            addCriterion("nu_tramite <>", value, "nuTramite");
            return (Criteria) this;
        }

        public Criteria andNuTramiteGreaterThan(String value) {
            addCriterion("nu_tramite >", value, "nuTramite");
            return (Criteria) this;
        }

        public Criteria andNuTramiteGreaterThanOrEqualTo(String value) {
            addCriterion("nu_tramite >=", value, "nuTramite");
            return (Criteria) this;
        }

        public Criteria andNuTramiteLessThan(String value) {
            addCriterion("nu_tramite <", value, "nuTramite");
            return (Criteria) this;
        }

        public Criteria andNuTramiteLessThanOrEqualTo(String value) {
            addCriterion("nu_tramite <=", value, "nuTramite");
            return (Criteria) this;
        }

        public Criteria andNuTramiteLike(String value) {
            addCriterion("nu_tramite like", value, "nuTramite");
            return (Criteria) this;
        }

        public Criteria andNuTramiteNotLike(String value) {
            addCriterion("nu_tramite not like", value, "nuTramite");
            return (Criteria) this;
        }

        public Criteria andNuTramiteIn(List<String> values) {
            addCriterion("nu_tramite in", values, "nuTramite");
            return (Criteria) this;
        }

        public Criteria andNuTramiteNotIn(List<String> values) {
            addCriterion("nu_tramite not in", values, "nuTramite");
            return (Criteria) this;
        }

        public Criteria andNuTramiteBetween(String value1, String value2) {
            addCriterion("nu_tramite between", value1, value2, "nuTramite");
            return (Criteria) this;
        }

        public Criteria andNuTramiteNotBetween(String value1, String value2) {
            addCriterion("nu_tramite not between", value1, value2, "nuTramite");
            return (Criteria) this;
        }

        public Criteria andUrIsNull() {
            addCriterion("ur is null");
            return (Criteria) this;
        }

        public Criteria andUrIsNotNull() {
            addCriterion("ur is not null");
            return (Criteria) this;
        }

        public Criteria andUrEqualTo(String value) {
            addCriterion("ur =", value, "ur");
            return (Criteria) this;
        }

        public Criteria andUrNotEqualTo(String value) {
            addCriterion("ur <>", value, "ur");
            return (Criteria) this;
        }

        public Criteria andUrGreaterThan(String value) {
            addCriterion("ur >", value, "ur");
            return (Criteria) this;
        }

        public Criteria andUrGreaterThanOrEqualTo(String value) {
            addCriterion("ur >=", value, "ur");
            return (Criteria) this;
        }

        public Criteria andUrLessThan(String value) {
            addCriterion("ur <", value, "ur");
            return (Criteria) this;
        }

        public Criteria andUrLessThanOrEqualTo(String value) {
            addCriterion("ur <=", value, "ur");
            return (Criteria) this;
        }

        public Criteria andUrLike(String value) {
            addCriterion("ur like", value, "ur");
            return (Criteria) this;
        }

        public Criteria andUrNotLike(String value) {
            addCriterion("ur not like", value, "ur");
            return (Criteria) this;
        }

        public Criteria andUrIn(List<String> values) {
            addCriterion("ur in", values, "ur");
            return (Criteria) this;
        }

        public Criteria andUrNotIn(List<String> values) {
            addCriterion("ur not in", values, "ur");
            return (Criteria) this;
        }

        public Criteria andUrBetween(String value1, String value2) {
            addCriterion("ur between", value1, value2, "ur");
            return (Criteria) this;
        }

        public Criteria andUrNotBetween(String value1, String value2) {
            addCriterion("ur not between", value1, value2, "ur");
            return (Criteria) this;
        }

        public Criteria andNombreUrIsNull() {
            addCriterion("nombre_ur is null");
            return (Criteria) this;
        }

        public Criteria andNombreUrIsNotNull() {
            addCriterion("nombre_ur is not null");
            return (Criteria) this;
        }

        public Criteria andNombreUrEqualTo(String value) {
            addCriterion("nombre_ur =", value, "nombreUr");
            return (Criteria) this;
        }

        public Criteria andNombreUrNotEqualTo(String value) {
            addCriterion("nombre_ur <>", value, "nombreUr");
            return (Criteria) this;
        }

        public Criteria andNombreUrGreaterThan(String value) {
            addCriterion("nombre_ur >", value, "nombreUr");
            return (Criteria) this;
        }

        public Criteria andNombreUrGreaterThanOrEqualTo(String value) {
            addCriterion("nombre_ur >=", value, "nombreUr");
            return (Criteria) this;
        }

        public Criteria andNombreUrLessThan(String value) {
            addCriterion("nombre_ur <", value, "nombreUr");
            return (Criteria) this;
        }

        public Criteria andNombreUrLessThanOrEqualTo(String value) {
            addCriterion("nombre_ur <=", value, "nombreUr");
            return (Criteria) this;
        }

        public Criteria andNombreUrLike(String value) {
            addCriterion("nombre_ur like", value, "nombreUr");
            return (Criteria) this;
        }

        public Criteria andNombreUrNotLike(String value) {
            addCriterion("nombre_ur not like", value, "nombreUr");
            return (Criteria) this;
        }

        public Criteria andNombreUrIn(List<String> values) {
            addCriterion("nombre_ur in", values, "nombreUr");
            return (Criteria) this;
        }

        public Criteria andNombreUrNotIn(List<String> values) {
            addCriterion("nombre_ur not in", values, "nombreUr");
            return (Criteria) this;
        }

        public Criteria andNombreUrBetween(String value1, String value2) {
            addCriterion("nombre_ur between", value1, value2, "nombreUr");
            return (Criteria) this;
        }

        public Criteria andNombreUrNotBetween(String value1, String value2) {
            addCriterion("nombre_ur not between", value1, value2, "nombreUr");
            return (Criteria) this;
        }

        public Criteria andPrevioDefinitivoIsNull() {
            addCriterion("previo_definitivo is null");
            return (Criteria) this;
        }

        public Criteria andPrevioDefinitivoIsNotNull() {
            addCriterion("previo_definitivo is not null");
            return (Criteria) this;
        }

        public Criteria andPrevioDefinitivoEqualTo(String value) {
            addCriterion("previo_definitivo =", value, "previoDefinitivo");
            return (Criteria) this;
        }

        public Criteria andPrevioDefinitivoNotEqualTo(String value) {
            addCriterion("previo_definitivo <>", value, "previoDefinitivo");
            return (Criteria) this;
        }

        public Criteria andPrevioDefinitivoGreaterThan(String value) {
            addCriterion("previo_definitivo >", value, "previoDefinitivo");
            return (Criteria) this;
        }

        public Criteria andPrevioDefinitivoGreaterThanOrEqualTo(String value) {
            addCriterion("previo_definitivo >=", value, "previoDefinitivo");
            return (Criteria) this;
        }

        public Criteria andPrevioDefinitivoLessThan(String value) {
            addCriterion("previo_definitivo <", value, "previoDefinitivo");
            return (Criteria) this;
        }

        public Criteria andPrevioDefinitivoLessThanOrEqualTo(String value) {
            addCriterion("previo_definitivo <=", value, "previoDefinitivo");
            return (Criteria) this;
        }

        public Criteria andPrevioDefinitivoLike(String value) {
            addCriterion("previo_definitivo like", value, "previoDefinitivo");
            return (Criteria) this;
        }

        public Criteria andPrevioDefinitivoNotLike(String value) {
            addCriterion("previo_definitivo not like", value, "previoDefinitivo");
            return (Criteria) this;
        }

        public Criteria andPrevioDefinitivoIn(List<String> values) {
            addCriterion("previo_definitivo in", values, "previoDefinitivo");
            return (Criteria) this;
        }

        public Criteria andPrevioDefinitivoNotIn(List<String> values) {
            addCriterion("previo_definitivo not in", values, "previoDefinitivo");
            return (Criteria) this;
        }

        public Criteria andPrevioDefinitivoBetween(String value1, String value2) {
            addCriterion("previo_definitivo between", value1, value2, "previoDefinitivo");
            return (Criteria) this;
        }

        public Criteria andPrevioDefinitivoNotBetween(String value1, String value2) {
            addCriterion("previo_definitivo not between", value1, value2, "previoDefinitivo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaPrefijoIsNull() {
            addCriterion("firma_rep_area_prefijo is null");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaPrefijoIsNotNull() {
            addCriterion("firma_rep_area_prefijo is not null");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaPrefijoEqualTo(String value) {
            addCriterion("firma_rep_area_prefijo =", value, "firmaRepAreaPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaPrefijoNotEqualTo(String value) {
            addCriterion("firma_rep_area_prefijo <>", value, "firmaRepAreaPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaPrefijoGreaterThan(String value) {
            addCriterion("firma_rep_area_prefijo >", value, "firmaRepAreaPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaPrefijoGreaterThanOrEqualTo(String value) {
            addCriterion("firma_rep_area_prefijo >=", value, "firmaRepAreaPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaPrefijoLessThan(String value) {
            addCriterion("firma_rep_area_prefijo <", value, "firmaRepAreaPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaPrefijoLessThanOrEqualTo(String value) {
            addCriterion("firma_rep_area_prefijo <=", value, "firmaRepAreaPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaPrefijoLike(String value) {
            addCriterion("firma_rep_area_prefijo like", value, "firmaRepAreaPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaPrefijoNotLike(String value) {
            addCriterion("firma_rep_area_prefijo not like", value, "firmaRepAreaPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaPrefijoIn(List<String> values) {
            addCriterion("firma_rep_area_prefijo in", values, "firmaRepAreaPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaPrefijoNotIn(List<String> values) {
            addCriterion("firma_rep_area_prefijo not in", values, "firmaRepAreaPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaPrefijoBetween(String value1, String value2) {
            addCriterion("firma_rep_area_prefijo between", value1, value2, "firmaRepAreaPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaPrefijoNotBetween(String value1, String value2) {
            addCriterion("firma_rep_area_prefijo not between", value1, value2, "firmaRepAreaPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaNombreIsNull() {
            addCriterion("firma_rep_area_nombre is null");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaNombreIsNotNull() {
            addCriterion("firma_rep_area_nombre is not null");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaNombreEqualTo(String value) {
            addCriterion("firma_rep_area_nombre =", value, "firmaRepAreaNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaNombreNotEqualTo(String value) {
            addCriterion("firma_rep_area_nombre <>", value, "firmaRepAreaNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaNombreGreaterThan(String value) {
            addCriterion("firma_rep_area_nombre >", value, "firmaRepAreaNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaNombreGreaterThanOrEqualTo(String value) {
            addCriterion("firma_rep_area_nombre >=", value, "firmaRepAreaNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaNombreLessThan(String value) {
            addCriterion("firma_rep_area_nombre <", value, "firmaRepAreaNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaNombreLessThanOrEqualTo(String value) {
            addCriterion("firma_rep_area_nombre <=", value, "firmaRepAreaNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaNombreLike(String value) {
            addCriterion("firma_rep_area_nombre like", value, "firmaRepAreaNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaNombreNotLike(String value) {
            addCriterion("firma_rep_area_nombre not like", value, "firmaRepAreaNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaNombreIn(List<String> values) {
            addCriterion("firma_rep_area_nombre in", values, "firmaRepAreaNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaNombreNotIn(List<String> values) {
            addCriterion("firma_rep_area_nombre not in", values, "firmaRepAreaNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaNombreBetween(String value1, String value2) {
            addCriterion("firma_rep_area_nombre between", value1, value2, "firmaRepAreaNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaNombreNotBetween(String value1, String value2) {
            addCriterion("firma_rep_area_nombre not between", value1, value2, "firmaRepAreaNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaPuestoIsNull() {
            addCriterion("firma_rep_area_puesto is null");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaPuestoIsNotNull() {
            addCriterion("firma_rep_area_puesto is not null");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaPuestoEqualTo(String value) {
            addCriterion("firma_rep_area_puesto =", value, "firmaRepAreaPuesto");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaPuestoNotEqualTo(String value) {
            addCriterion("firma_rep_area_puesto <>", value, "firmaRepAreaPuesto");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaPuestoGreaterThan(String value) {
            addCriterion("firma_rep_area_puesto >", value, "firmaRepAreaPuesto");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaPuestoGreaterThanOrEqualTo(String value) {
            addCriterion("firma_rep_area_puesto >=", value, "firmaRepAreaPuesto");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaPuestoLessThan(String value) {
            addCriterion("firma_rep_area_puesto <", value, "firmaRepAreaPuesto");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaPuestoLessThanOrEqualTo(String value) {
            addCriterion("firma_rep_area_puesto <=", value, "firmaRepAreaPuesto");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaPuestoLike(String value) {
            addCriterion("firma_rep_area_puesto like", value, "firmaRepAreaPuesto");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaPuestoNotLike(String value) {
            addCriterion("firma_rep_area_puesto not like", value, "firmaRepAreaPuesto");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaPuestoIn(List<String> values) {
            addCriterion("firma_rep_area_puesto in", values, "firmaRepAreaPuesto");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaPuestoNotIn(List<String> values) {
            addCriterion("firma_rep_area_puesto not in", values, "firmaRepAreaPuesto");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaPuestoBetween(String value1, String value2) {
            addCriterion("firma_rep_area_puesto between", value1, value2, "firmaRepAreaPuesto");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaPuestoNotBetween(String value1, String value2) {
            addCriterion("firma_rep_area_puesto not between", value1, value2, "firmaRepAreaPuesto");
            return (Criteria) this;
        }

        public Criteria andDescPerfilContratadoIsNull() {
            addCriterion("desc_perfil_contratado is null");
            return (Criteria) this;
        }

        public Criteria andDescPerfilContratadoIsNotNull() {
            addCriterion("desc_perfil_contratado is not null");
            return (Criteria) this;
        }

        public Criteria andDescPerfilContratadoEqualTo(String value) {
            addCriterion("desc_perfil_contratado =", value, "descPerfilContratado");
            return (Criteria) this;
        }

        public Criteria andDescPerfilContratadoNotEqualTo(String value) {
            addCriterion("desc_perfil_contratado <>", value, "descPerfilContratado");
            return (Criteria) this;
        }

        public Criteria andDescPerfilContratadoGreaterThan(String value) {
            addCriterion("desc_perfil_contratado >", value, "descPerfilContratado");
            return (Criteria) this;
        }

        public Criteria andDescPerfilContratadoGreaterThanOrEqualTo(String value) {
            addCriterion("desc_perfil_contratado >=", value, "descPerfilContratado");
            return (Criteria) this;
        }

        public Criteria andDescPerfilContratadoLessThan(String value) {
            addCriterion("desc_perfil_contratado <", value, "descPerfilContratado");
            return (Criteria) this;
        }

        public Criteria andDescPerfilContratadoLessThanOrEqualTo(String value) {
            addCriterion("desc_perfil_contratado <=", value, "descPerfilContratado");
            return (Criteria) this;
        }

        public Criteria andDescPerfilContratadoLike(String value) {
            addCriterion("desc_perfil_contratado like", value, "descPerfilContratado");
            return (Criteria) this;
        }

        public Criteria andDescPerfilContratadoNotLike(String value) {
            addCriterion("desc_perfil_contratado not like", value, "descPerfilContratado");
            return (Criteria) this;
        }

        public Criteria andDescPerfilContratadoIn(List<String> values) {
            addCriterion("desc_perfil_contratado in", values, "descPerfilContratado");
            return (Criteria) this;
        }

        public Criteria andDescPerfilContratadoNotIn(List<String> values) {
            addCriterion("desc_perfil_contratado not in", values, "descPerfilContratado");
            return (Criteria) this;
        }

        public Criteria andDescPerfilContratadoBetween(String value1, String value2) {
            addCriterion("desc_perfil_contratado between", value1, value2, "descPerfilContratado");
            return (Criteria) this;
        }

        public Criteria andDescPerfilContratadoNotBetween(String value1, String value2) {
            addCriterion("desc_perfil_contratado not between", value1, value2, "descPerfilContratado");
            return (Criteria) this;
        }

        public Criteria andDescNacContratadoIsNull() {
            addCriterion("desc_nac_contratado is null");
            return (Criteria) this;
        }

        public Criteria andDescNacContratadoIsNotNull() {
            addCriterion("desc_nac_contratado is not null");
            return (Criteria) this;
        }

        public Criteria andDescNacContratadoEqualTo(String value) {
            addCriterion("desc_nac_contratado =", value, "descNacContratado");
            return (Criteria) this;
        }

        public Criteria andDescNacContratadoNotEqualTo(String value) {
            addCriterion("desc_nac_contratado <>", value, "descNacContratado");
            return (Criteria) this;
        }

        public Criteria andDescNacContratadoGreaterThan(String value) {
            addCriterion("desc_nac_contratado >", value, "descNacContratado");
            return (Criteria) this;
        }

        public Criteria andDescNacContratadoGreaterThanOrEqualTo(String value) {
            addCriterion("desc_nac_contratado >=", value, "descNacContratado");
            return (Criteria) this;
        }

        public Criteria andDescNacContratadoLessThan(String value) {
            addCriterion("desc_nac_contratado <", value, "descNacContratado");
            return (Criteria) this;
        }

        public Criteria andDescNacContratadoLessThanOrEqualTo(String value) {
            addCriterion("desc_nac_contratado <=", value, "descNacContratado");
            return (Criteria) this;
        }

        public Criteria andDescNacContratadoLike(String value) {
            addCriterion("desc_nac_contratado like", value, "descNacContratado");
            return (Criteria) this;
        }

        public Criteria andDescNacContratadoNotLike(String value) {
            addCriterion("desc_nac_contratado not like", value, "descNacContratado");
            return (Criteria) this;
        }

        public Criteria andDescNacContratadoIn(List<String> values) {
            addCriterion("desc_nac_contratado in", values, "descNacContratado");
            return (Criteria) this;
        }

        public Criteria andDescNacContratadoNotIn(List<String> values) {
            addCriterion("desc_nac_contratado not in", values, "descNacContratado");
            return (Criteria) this;
        }

        public Criteria andDescNacContratadoBetween(String value1, String value2) {
            addCriterion("desc_nac_contratado between", value1, value2, "descNacContratado");
            return (Criteria) this;
        }

        public Criteria andDescNacContratadoNotBetween(String value1, String value2) {
            addCriterion("desc_nac_contratado not between", value1, value2, "descNacContratado");
            return (Criteria) this;
        }

        public Criteria andRfcContratadoIsNull() {
            addCriterion("rfc_contratado is null");
            return (Criteria) this;
        }

        public Criteria andRfcContratadoIsNotNull() {
            addCriterion("rfc_contratado is not null");
            return (Criteria) this;
        }

        public Criteria andRfcContratadoEqualTo(String value) {
            addCriterion("rfc_contratado =", value, "rfcContratado");
            return (Criteria) this;
        }

        public Criteria andRfcContratadoNotEqualTo(String value) {
            addCriterion("rfc_contratado <>", value, "rfcContratado");
            return (Criteria) this;
        }

        public Criteria andRfcContratadoGreaterThan(String value) {
            addCriterion("rfc_contratado >", value, "rfcContratado");
            return (Criteria) this;
        }

        public Criteria andRfcContratadoGreaterThanOrEqualTo(String value) {
            addCriterion("rfc_contratado >=", value, "rfcContratado");
            return (Criteria) this;
        }

        public Criteria andRfcContratadoLessThan(String value) {
            addCriterion("rfc_contratado <", value, "rfcContratado");
            return (Criteria) this;
        }

        public Criteria andRfcContratadoLessThanOrEqualTo(String value) {
            addCriterion("rfc_contratado <=", value, "rfcContratado");
            return (Criteria) this;
        }

        public Criteria andRfcContratadoLike(String value) {
            addCriterion("rfc_contratado like", value, "rfcContratado");
            return (Criteria) this;
        }

        public Criteria andRfcContratadoNotLike(String value) {
            addCriterion("rfc_contratado not like", value, "rfcContratado");
            return (Criteria) this;
        }

        public Criteria andRfcContratadoIn(List<String> values) {
            addCriterion("rfc_contratado in", values, "rfcContratado");
            return (Criteria) this;
        }

        public Criteria andRfcContratadoNotIn(List<String> values) {
            addCriterion("rfc_contratado not in", values, "rfcContratado");
            return (Criteria) this;
        }

        public Criteria andRfcContratadoBetween(String value1, String value2) {
            addCriterion("rfc_contratado between", value1, value2, "rfcContratado");
            return (Criteria) this;
        }

        public Criteria andRfcContratadoNotBetween(String value1, String value2) {
            addCriterion("rfc_contratado not between", value1, value2, "rfcContratado");
            return (Criteria) this;
        }

        public Criteria andExperienciaContratadoIsNull() {
            addCriterion("experiencia_contratado is null");
            return (Criteria) this;
        }

        public Criteria andExperienciaContratadoIsNotNull() {
            addCriterion("experiencia_contratado is not null");
            return (Criteria) this;
        }

        public Criteria andExperienciaContratadoEqualTo(String value) {
            addCriterion("experiencia_contratado =", value, "experienciaContratado");
            return (Criteria) this;
        }

        public Criteria andExperienciaContratadoNotEqualTo(String value) {
            addCriterion("experiencia_contratado <>", value, "experienciaContratado");
            return (Criteria) this;
        }

        public Criteria andExperienciaContratadoGreaterThan(String value) {
            addCriterion("experiencia_contratado >", value, "experienciaContratado");
            return (Criteria) this;
        }

        public Criteria andExperienciaContratadoGreaterThanOrEqualTo(String value) {
            addCriterion("experiencia_contratado >=", value, "experienciaContratado");
            return (Criteria) this;
        }

        public Criteria andExperienciaContratadoLessThan(String value) {
            addCriterion("experiencia_contratado <", value, "experienciaContratado");
            return (Criteria) this;
        }

        public Criteria andExperienciaContratadoLessThanOrEqualTo(String value) {
            addCriterion("experiencia_contratado <=", value, "experienciaContratado");
            return (Criteria) this;
        }

        public Criteria andExperienciaContratadoLike(String value) {
            addCriterion("experiencia_contratado like", value, "experienciaContratado");
            return (Criteria) this;
        }

        public Criteria andExperienciaContratadoNotLike(String value) {
            addCriterion("experiencia_contratado not like", value, "experienciaContratado");
            return (Criteria) this;
        }

        public Criteria andExperienciaContratadoIn(List<String> values) {
            addCriterion("experiencia_contratado in", values, "experienciaContratado");
            return (Criteria) this;
        }

        public Criteria andExperienciaContratadoNotIn(List<String> values) {
            addCriterion("experiencia_contratado not in", values, "experienciaContratado");
            return (Criteria) this;
        }

        public Criteria andExperienciaContratadoBetween(String value1, String value2) {
            addCriterion("experiencia_contratado between", value1, value2, "experienciaContratado");
            return (Criteria) this;
        }

        public Criteria andExperienciaContratadoNotBetween(String value1, String value2) {
            addCriterion("experiencia_contratado not between", value1, value2, "experienciaContratado");
            return (Criteria) this;
        }

        public Criteria andDomicilioContratadoIsNull() {
            addCriterion("domicilio_contratado is null");
            return (Criteria) this;
        }

        public Criteria andDomicilioContratadoIsNotNull() {
            addCriterion("domicilio_contratado is not null");
            return (Criteria) this;
        }

        public Criteria andDomicilioContratadoEqualTo(String value) {
            addCriterion("domicilio_contratado =", value, "domicilioContratado");
            return (Criteria) this;
        }

        public Criteria andDomicilioContratadoNotEqualTo(String value) {
            addCriterion("domicilio_contratado <>", value, "domicilioContratado");
            return (Criteria) this;
        }

        public Criteria andDomicilioContratadoGreaterThan(String value) {
            addCriterion("domicilio_contratado >", value, "domicilioContratado");
            return (Criteria) this;
        }

        public Criteria andDomicilioContratadoGreaterThanOrEqualTo(String value) {
            addCriterion("domicilio_contratado >=", value, "domicilioContratado");
            return (Criteria) this;
        }

        public Criteria andDomicilioContratadoLessThan(String value) {
            addCriterion("domicilio_contratado <", value, "domicilioContratado");
            return (Criteria) this;
        }

        public Criteria andDomicilioContratadoLessThanOrEqualTo(String value) {
            addCriterion("domicilio_contratado <=", value, "domicilioContratado");
            return (Criteria) this;
        }

        public Criteria andDomicilioContratadoLike(String value) {
            addCriterion("domicilio_contratado like", value, "domicilioContratado");
            return (Criteria) this;
        }

        public Criteria andDomicilioContratadoNotLike(String value) {
            addCriterion("domicilio_contratado not like", value, "domicilioContratado");
            return (Criteria) this;
        }

        public Criteria andDomicilioContratadoIn(List<String> values) {
            addCriterion("domicilio_contratado in", values, "domicilioContratado");
            return (Criteria) this;
        }

        public Criteria andDomicilioContratadoNotIn(List<String> values) {
            addCriterion("domicilio_contratado not in", values, "domicilioContratado");
            return (Criteria) this;
        }

        public Criteria andDomicilioContratadoBetween(String value1, String value2) {
            addCriterion("domicilio_contratado between", value1, value2, "domicilioContratado");
            return (Criteria) this;
        }

        public Criteria andDomicilioContratadoNotBetween(String value1, String value2) {
            addCriterion("domicilio_contratado not between", value1, value2, "domicilioContratado");
            return (Criteria) this;
        }

        public Criteria andDescFuncionesIsNull() {
            addCriterion("desc_funciones is null");
            return (Criteria) this;
        }

        public Criteria andDescFuncionesIsNotNull() {
            addCriterion("desc_funciones is not null");
            return (Criteria) this;
        }

        public Criteria andDescFuncionesEqualTo(String value) {
            addCriterion("desc_funciones =", value, "descFunciones");
            return (Criteria) this;
        }

        public Criteria andDescFuncionesNotEqualTo(String value) {
            addCriterion("desc_funciones <>", value, "descFunciones");
            return (Criteria) this;
        }

        public Criteria andDescFuncionesGreaterThan(String value) {
            addCriterion("desc_funciones >", value, "descFunciones");
            return (Criteria) this;
        }

        public Criteria andDescFuncionesGreaterThanOrEqualTo(String value) {
            addCriterion("desc_funciones >=", value, "descFunciones");
            return (Criteria) this;
        }

        public Criteria andDescFuncionesLessThan(String value) {
            addCriterion("desc_funciones <", value, "descFunciones");
            return (Criteria) this;
        }

        public Criteria andDescFuncionesLessThanOrEqualTo(String value) {
            addCriterion("desc_funciones <=", value, "descFunciones");
            return (Criteria) this;
        }

        public Criteria andDescFuncionesLike(String value) {
            addCriterion("desc_funciones like", value, "descFunciones");
            return (Criteria) this;
        }

        public Criteria andDescFuncionesNotLike(String value) {
            addCriterion("desc_funciones not like", value, "descFunciones");
            return (Criteria) this;
        }

        public Criteria andDescFuncionesIn(List<String> values) {
            addCriterion("desc_funciones in", values, "descFunciones");
            return (Criteria) this;
        }

        public Criteria andDescFuncionesNotIn(List<String> values) {
            addCriterion("desc_funciones not in", values, "descFunciones");
            return (Criteria) this;
        }

        public Criteria andDescFuncionesBetween(String value1, String value2) {
            addCriterion("desc_funciones between", value1, value2, "descFunciones");
            return (Criteria) this;
        }

        public Criteria andDescFuncionesNotBetween(String value1, String value2) {
            addCriterion("desc_funciones not between", value1, value2, "descFunciones");
            return (Criteria) this;
        }

        public Criteria andSumImBrutoRecibidosIsNull() {
            addCriterion("sum_im_bruto_recibidos is null");
            return (Criteria) this;
        }

        public Criteria andSumImBrutoRecibidosIsNotNull() {
            addCriterion("sum_im_bruto_recibidos is not null");
            return (Criteria) this;
        }

        public Criteria andSumImBrutoRecibidosEqualTo(String value) {
            addCriterion("sum_im_bruto_recibidos =", value, "sumImBrutoRecibidos");
            return (Criteria) this;
        }

        public Criteria andSumImBrutoRecibidosNotEqualTo(String value) {
            addCriterion("sum_im_bruto_recibidos <>", value, "sumImBrutoRecibidos");
            return (Criteria) this;
        }

        public Criteria andSumImBrutoRecibidosGreaterThan(String value) {
            addCriterion("sum_im_bruto_recibidos >", value, "sumImBrutoRecibidos");
            return (Criteria) this;
        }

        public Criteria andSumImBrutoRecibidosGreaterThanOrEqualTo(String value) {
            addCriterion("sum_im_bruto_recibidos >=", value, "sumImBrutoRecibidos");
            return (Criteria) this;
        }

        public Criteria andSumImBrutoRecibidosLessThan(String value) {
            addCriterion("sum_im_bruto_recibidos <", value, "sumImBrutoRecibidos");
            return (Criteria) this;
        }

        public Criteria andSumImBrutoRecibidosLessThanOrEqualTo(String value) {
            addCriterion("sum_im_bruto_recibidos <=", value, "sumImBrutoRecibidos");
            return (Criteria) this;
        }

        public Criteria andSumImBrutoRecibidosLike(String value) {
            addCriterion("sum_im_bruto_recibidos like", value, "sumImBrutoRecibidos");
            return (Criteria) this;
        }

        public Criteria andSumImBrutoRecibidosNotLike(String value) {
            addCriterion("sum_im_bruto_recibidos not like", value, "sumImBrutoRecibidos");
            return (Criteria) this;
        }

        public Criteria andSumImBrutoRecibidosIn(List<String> values) {
            addCriterion("sum_im_bruto_recibidos in", values, "sumImBrutoRecibidos");
            return (Criteria) this;
        }

        public Criteria andSumImBrutoRecibidosNotIn(List<String> values) {
            addCriterion("sum_im_bruto_recibidos not in", values, "sumImBrutoRecibidos");
            return (Criteria) this;
        }

        public Criteria andSumImBrutoRecibidosBetween(String value1, String value2) {
            addCriterion("sum_im_bruto_recibidos between", value1, value2, "sumImBrutoRecibidos");
            return (Criteria) this;
        }

        public Criteria andSumImBrutoRecibidosNotBetween(String value1, String value2) {
            addCriterion("sum_im_bruto_recibidos not between", value1, value2, "sumImBrutoRecibidos");
            return (Criteria) this;
        }

        public Criteria andImporteLetraIsNull() {
            addCriterion("importe_letra is null");
            return (Criteria) this;
        }

        public Criteria andImporteLetraIsNotNull() {
            addCriterion("importe_letra is not null");
            return (Criteria) this;
        }

        public Criteria andImporteLetraEqualTo(String value) {
            addCriterion("importe_letra =", value, "importeLetra");
            return (Criteria) this;
        }

        public Criteria andImporteLetraNotEqualTo(String value) {
            addCriterion("importe_letra <>", value, "importeLetra");
            return (Criteria) this;
        }

        public Criteria andImporteLetraGreaterThan(String value) {
            addCriterion("importe_letra >", value, "importeLetra");
            return (Criteria) this;
        }

        public Criteria andImporteLetraGreaterThanOrEqualTo(String value) {
            addCriterion("importe_letra >=", value, "importeLetra");
            return (Criteria) this;
        }

        public Criteria andImporteLetraLessThan(String value) {
            addCriterion("importe_letra <", value, "importeLetra");
            return (Criteria) this;
        }

        public Criteria andImporteLetraLessThanOrEqualTo(String value) {
            addCriterion("importe_letra <=", value, "importeLetra");
            return (Criteria) this;
        }

        public Criteria andImporteLetraLike(String value) {
            addCriterion("importe_letra like", value, "importeLetra");
            return (Criteria) this;
        }

        public Criteria andImporteLetraNotLike(String value) {
            addCriterion("importe_letra not like", value, "importeLetra");
            return (Criteria) this;
        }

        public Criteria andImporteLetraIn(List<String> values) {
            addCriterion("importe_letra in", values, "importeLetra");
            return (Criteria) this;
        }

        public Criteria andImporteLetraNotIn(List<String> values) {
            addCriterion("importe_letra not in", values, "importeLetra");
            return (Criteria) this;
        }

        public Criteria andImporteLetraBetween(String value1, String value2) {
            addCriterion("importe_letra between", value1, value2, "importeLetra");
            return (Criteria) this;
        }

        public Criteria andImporteLetraNotBetween(String value1, String value2) {
            addCriterion("importe_letra not between", value1, value2, "importeLetra");
            return (Criteria) this;
        }

        public Criteria andNuExhibicionesIsNull() {
            addCriterion("nu_exhibiciones is null");
            return (Criteria) this;
        }

        public Criteria andNuExhibicionesIsNotNull() {
            addCriterion("nu_exhibiciones is not null");
            return (Criteria) this;
        }

        public Criteria andNuExhibicionesEqualTo(String value) {
            addCriterion("nu_exhibiciones =", value, "nuExhibiciones");
            return (Criteria) this;
        }

        public Criteria andNuExhibicionesNotEqualTo(String value) {
            addCriterion("nu_exhibiciones <>", value, "nuExhibiciones");
            return (Criteria) this;
        }

        public Criteria andNuExhibicionesGreaterThan(String value) {
            addCriterion("nu_exhibiciones >", value, "nuExhibiciones");
            return (Criteria) this;
        }

        public Criteria andNuExhibicionesGreaterThanOrEqualTo(String value) {
            addCriterion("nu_exhibiciones >=", value, "nuExhibiciones");
            return (Criteria) this;
        }

        public Criteria andNuExhibicionesLessThan(String value) {
            addCriterion("nu_exhibiciones <", value, "nuExhibiciones");
            return (Criteria) this;
        }

        public Criteria andNuExhibicionesLessThanOrEqualTo(String value) {
            addCriterion("nu_exhibiciones <=", value, "nuExhibiciones");
            return (Criteria) this;
        }

        public Criteria andNuExhibicionesLike(String value) {
            addCriterion("nu_exhibiciones like", value, "nuExhibiciones");
            return (Criteria) this;
        }

        public Criteria andNuExhibicionesNotLike(String value) {
            addCriterion("nu_exhibiciones not like", value, "nuExhibiciones");
            return (Criteria) this;
        }

        public Criteria andNuExhibicionesIn(List<String> values) {
            addCriterion("nu_exhibiciones in", values, "nuExhibiciones");
            return (Criteria) this;
        }

        public Criteria andNuExhibicionesNotIn(List<String> values) {
            addCriterion("nu_exhibiciones not in", values, "nuExhibiciones");
            return (Criteria) this;
        }

        public Criteria andNuExhibicionesBetween(String value1, String value2) {
            addCriterion("nu_exhibiciones between", value1, value2, "nuExhibiciones");
            return (Criteria) this;
        }

        public Criteria andNuExhibicionesNotBetween(String value1, String value2) {
            addCriterion("nu_exhibiciones not between", value1, value2, "nuExhibiciones");
            return (Criteria) this;
        }

        public Criteria andFhVigenciaInicialIsNull() {
            addCriterion("fh_vigencia_inicial is null");
            return (Criteria) this;
        }

        public Criteria andFhVigenciaInicialIsNotNull() {
            addCriterion("fh_vigencia_inicial is not null");
            return (Criteria) this;
        }

        public Criteria andFhVigenciaInicialEqualTo(String value) {
            addCriterion("fh_vigencia_inicial =", value, "fhVigenciaInicial");
            return (Criteria) this;
        }

        public Criteria andFhVigenciaInicialNotEqualTo(String value) {
            addCriterion("fh_vigencia_inicial <>", value, "fhVigenciaInicial");
            return (Criteria) this;
        }

        public Criteria andFhVigenciaInicialGreaterThan(String value) {
            addCriterion("fh_vigencia_inicial >", value, "fhVigenciaInicial");
            return (Criteria) this;
        }

        public Criteria andFhVigenciaInicialGreaterThanOrEqualTo(String value) {
            addCriterion("fh_vigencia_inicial >=", value, "fhVigenciaInicial");
            return (Criteria) this;
        }

        public Criteria andFhVigenciaInicialLessThan(String value) {
            addCriterion("fh_vigencia_inicial <", value, "fhVigenciaInicial");
            return (Criteria) this;
        }

        public Criteria andFhVigenciaInicialLessThanOrEqualTo(String value) {
            addCriterion("fh_vigencia_inicial <=", value, "fhVigenciaInicial");
            return (Criteria) this;
        }

        public Criteria andFhVigenciaInicialLike(String value) {
            addCriterion("fh_vigencia_inicial like", value, "fhVigenciaInicial");
            return (Criteria) this;
        }

        public Criteria andFhVigenciaInicialNotLike(String value) {
            addCriterion("fh_vigencia_inicial not like", value, "fhVigenciaInicial");
            return (Criteria) this;
        }

        public Criteria andFhVigenciaInicialIn(List<String> values) {
            addCriterion("fh_vigencia_inicial in", values, "fhVigenciaInicial");
            return (Criteria) this;
        }

        public Criteria andFhVigenciaInicialNotIn(List<String> values) {
            addCriterion("fh_vigencia_inicial not in", values, "fhVigenciaInicial");
            return (Criteria) this;
        }

        public Criteria andFhVigenciaInicialBetween(String value1, String value2) {
            addCriterion("fh_vigencia_inicial between", value1, value2, "fhVigenciaInicial");
            return (Criteria) this;
        }

        public Criteria andFhVigenciaInicialNotBetween(String value1, String value2) {
            addCriterion("fh_vigencia_inicial not between", value1, value2, "fhVigenciaInicial");
            return (Criteria) this;
        }

        public Criteria andFhVigenciaFinalIsNull() {
            addCriterion("fh_vigencia_final is null");
            return (Criteria) this;
        }

        public Criteria andFhVigenciaFinalIsNotNull() {
            addCriterion("fh_vigencia_final is not null");
            return (Criteria) this;
        }

        public Criteria andFhVigenciaFinalEqualTo(String value) {
            addCriterion("fh_vigencia_final =", value, "fhVigenciaFinal");
            return (Criteria) this;
        }

        public Criteria andFhVigenciaFinalNotEqualTo(String value) {
            addCriterion("fh_vigencia_final <>", value, "fhVigenciaFinal");
            return (Criteria) this;
        }

        public Criteria andFhVigenciaFinalGreaterThan(String value) {
            addCriterion("fh_vigencia_final >", value, "fhVigenciaFinal");
            return (Criteria) this;
        }

        public Criteria andFhVigenciaFinalGreaterThanOrEqualTo(String value) {
            addCriterion("fh_vigencia_final >=", value, "fhVigenciaFinal");
            return (Criteria) this;
        }

        public Criteria andFhVigenciaFinalLessThan(String value) {
            addCriterion("fh_vigencia_final <", value, "fhVigenciaFinal");
            return (Criteria) this;
        }

        public Criteria andFhVigenciaFinalLessThanOrEqualTo(String value) {
            addCriterion("fh_vigencia_final <=", value, "fhVigenciaFinal");
            return (Criteria) this;
        }

        public Criteria andFhVigenciaFinalLike(String value) {
            addCriterion("fh_vigencia_final like", value, "fhVigenciaFinal");
            return (Criteria) this;
        }

        public Criteria andFhVigenciaFinalNotLike(String value) {
            addCriterion("fh_vigencia_final not like", value, "fhVigenciaFinal");
            return (Criteria) this;
        }

        public Criteria andFhVigenciaFinalIn(List<String> values) {
            addCriterion("fh_vigencia_final in", values, "fhVigenciaFinal");
            return (Criteria) this;
        }

        public Criteria andFhVigenciaFinalNotIn(List<String> values) {
            addCriterion("fh_vigencia_final not in", values, "fhVigenciaFinal");
            return (Criteria) this;
        }

        public Criteria andFhVigenciaFinalBetween(String value1, String value2) {
            addCriterion("fh_vigencia_final between", value1, value2, "fhVigenciaFinal");
            return (Criteria) this;
        }

        public Criteria andFhVigenciaFinalNotBetween(String value1, String value2) {
            addCriterion("fh_vigencia_final not between", value1, value2, "fhVigenciaFinal");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActPrefijoIsNull() {
            addCriterion("firma_recep_rep_act_prefijo is null");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActPrefijoIsNotNull() {
            addCriterion("firma_recep_rep_act_prefijo is not null");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActPrefijoEqualTo(String value) {
            addCriterion("firma_recep_rep_act_prefijo =", value, "firmaRecepRepActPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActPrefijoNotEqualTo(String value) {
            addCriterion("firma_recep_rep_act_prefijo <>", value, "firmaRecepRepActPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActPrefijoGreaterThan(String value) {
            addCriterion("firma_recep_rep_act_prefijo >", value, "firmaRecepRepActPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActPrefijoGreaterThanOrEqualTo(String value) {
            addCriterion("firma_recep_rep_act_prefijo >=", value, "firmaRecepRepActPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActPrefijoLessThan(String value) {
            addCriterion("firma_recep_rep_act_prefijo <", value, "firmaRecepRepActPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActPrefijoLessThanOrEqualTo(String value) {
            addCriterion("firma_recep_rep_act_prefijo <=", value, "firmaRecepRepActPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActPrefijoLike(String value) {
            addCriterion("firma_recep_rep_act_prefijo like", value, "firmaRecepRepActPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActPrefijoNotLike(String value) {
            addCriterion("firma_recep_rep_act_prefijo not like", value, "firmaRecepRepActPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActPrefijoIn(List<String> values) {
            addCriterion("firma_recep_rep_act_prefijo in", values, "firmaRecepRepActPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActPrefijoNotIn(List<String> values) {
            addCriterion("firma_recep_rep_act_prefijo not in", values, "firmaRecepRepActPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActPrefijoBetween(String value1, String value2) {
            addCriterion("firma_recep_rep_act_prefijo between", value1, value2, "firmaRecepRepActPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActPrefijoNotBetween(String value1, String value2) {
            addCriterion("firma_recep_rep_act_prefijo not between", value1, value2, "firmaRecepRepActPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActNombreIsNull() {
            addCriterion("firma_recep_rep_act_nombre is null");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActNombreIsNotNull() {
            addCriterion("firma_recep_rep_act_nombre is not null");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActNombreEqualTo(String value) {
            addCriterion("firma_recep_rep_act_nombre =", value, "firmaRecepRepActNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActNombreNotEqualTo(String value) {
            addCriterion("firma_recep_rep_act_nombre <>", value, "firmaRecepRepActNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActNombreGreaterThan(String value) {
            addCriterion("firma_recep_rep_act_nombre >", value, "firmaRecepRepActNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActNombreGreaterThanOrEqualTo(String value) {
            addCriterion("firma_recep_rep_act_nombre >=", value, "firmaRecepRepActNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActNombreLessThan(String value) {
            addCriterion("firma_recep_rep_act_nombre <", value, "firmaRecepRepActNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActNombreLessThanOrEqualTo(String value) {
            addCriterion("firma_recep_rep_act_nombre <=", value, "firmaRecepRepActNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActNombreLike(String value) {
            addCriterion("firma_recep_rep_act_nombre like", value, "firmaRecepRepActNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActNombreNotLike(String value) {
            addCriterion("firma_recep_rep_act_nombre not like", value, "firmaRecepRepActNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActNombreIn(List<String> values) {
            addCriterion("firma_recep_rep_act_nombre in", values, "firmaRecepRepActNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActNombreNotIn(List<String> values) {
            addCriterion("firma_recep_rep_act_nombre not in", values, "firmaRecepRepActNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActNombreBetween(String value1, String value2) {
            addCriterion("firma_recep_rep_act_nombre between", value1, value2, "firmaRecepRepActNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActNombreNotBetween(String value1, String value2) {
            addCriterion("firma_recep_rep_act_nombre not between", value1, value2, "firmaRecepRepActNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActPuestoIsNull() {
            addCriterion("firma_recep_rep_act_puesto is null");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActPuestoIsNotNull() {
            addCriterion("firma_recep_rep_act_puesto is not null");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActPuestoEqualTo(String value) {
            addCriterion("firma_recep_rep_act_puesto =", value, "firmaRecepRepActPuesto");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActPuestoNotEqualTo(String value) {
            addCriterion("firma_recep_rep_act_puesto <>", value, "firmaRecepRepActPuesto");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActPuestoGreaterThan(String value) {
            addCriterion("firma_recep_rep_act_puesto >", value, "firmaRecepRepActPuesto");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActPuestoGreaterThanOrEqualTo(String value) {
            addCriterion("firma_recep_rep_act_puesto >=", value, "firmaRecepRepActPuesto");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActPuestoLessThan(String value) {
            addCriterion("firma_recep_rep_act_puesto <", value, "firmaRecepRepActPuesto");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActPuestoLessThanOrEqualTo(String value) {
            addCriterion("firma_recep_rep_act_puesto <=", value, "firmaRecepRepActPuesto");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActPuestoLike(String value) {
            addCriterion("firma_recep_rep_act_puesto like", value, "firmaRecepRepActPuesto");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActPuestoNotLike(String value) {
            addCriterion("firma_recep_rep_act_puesto not like", value, "firmaRecepRepActPuesto");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActPuestoIn(List<String> values) {
            addCriterion("firma_recep_rep_act_puesto in", values, "firmaRecepRepActPuesto");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActPuestoNotIn(List<String> values) {
            addCriterion("firma_recep_rep_act_puesto not in", values, "firmaRecepRepActPuesto");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActPuestoBetween(String value1, String value2) {
            addCriterion("firma_recep_rep_act_puesto between", value1, value2, "firmaRecepRepActPuesto");
            return (Criteria) this;
        }

        public Criteria andFirmaRecepRepActPuestoNotBetween(String value1, String value2) {
            addCriterion("firma_recep_rep_act_puesto not between", value1, value2, "firmaRecepRepActPuesto");
            return (Criteria) this;
        }

        public Criteria andFhFirmaContratoIsNull() {
            addCriterion("fh_firma_contrato is null");
            return (Criteria) this;
        }

        public Criteria andFhFirmaContratoIsNotNull() {
            addCriterion("fh_firma_contrato is not null");
            return (Criteria) this;
        }

        public Criteria andFhFirmaContratoEqualTo(String value) {
            addCriterion("fh_firma_contrato =", value, "fhFirmaContrato");
            return (Criteria) this;
        }

        public Criteria andFhFirmaContratoNotEqualTo(String value) {
            addCriterion("fh_firma_contrato <>", value, "fhFirmaContrato");
            return (Criteria) this;
        }

        public Criteria andFhFirmaContratoGreaterThan(String value) {
            addCriterion("fh_firma_contrato >", value, "fhFirmaContrato");
            return (Criteria) this;
        }

        public Criteria andFhFirmaContratoGreaterThanOrEqualTo(String value) {
            addCriterion("fh_firma_contrato >=", value, "fhFirmaContrato");
            return (Criteria) this;
        }

        public Criteria andFhFirmaContratoLessThan(String value) {
            addCriterion("fh_firma_contrato <", value, "fhFirmaContrato");
            return (Criteria) this;
        }

        public Criteria andFhFirmaContratoLessThanOrEqualTo(String value) {
            addCriterion("fh_firma_contrato <=", value, "fhFirmaContrato");
            return (Criteria) this;
        }

        public Criteria andFhFirmaContratoLike(String value) {
            addCriterion("fh_firma_contrato like", value, "fhFirmaContrato");
            return (Criteria) this;
        }

        public Criteria andFhFirmaContratoNotLike(String value) {
            addCriterion("fh_firma_contrato not like", value, "fhFirmaContrato");
            return (Criteria) this;
        }

        public Criteria andFhFirmaContratoIn(List<String> values) {
            addCriterion("fh_firma_contrato in", values, "fhFirmaContrato");
            return (Criteria) this;
        }

        public Criteria andFhFirmaContratoNotIn(List<String> values) {
            addCriterion("fh_firma_contrato not in", values, "fhFirmaContrato");
            return (Criteria) this;
        }

        public Criteria andFhFirmaContratoBetween(String value1, String value2) {
            addCriterion("fh_firma_contrato between", value1, value2, "fhFirmaContrato");
            return (Criteria) this;
        }

        public Criteria andFhFirmaContratoNotBetween(String value1, String value2) {
            addCriterion("fh_firma_contrato not between", value1, value2, "fhFirmaContrato");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaTituloIsNull() {
            addCriterion("firma_rep_area_titulo is null");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaTituloIsNotNull() {
            addCriterion("firma_rep_area_titulo is not null");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaTituloEqualTo(String value) {
            addCriterion("firma_rep_area_titulo =", value, "firmaRepAreaTitulo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaTituloNotEqualTo(String value) {
            addCriterion("firma_rep_area_titulo <>", value, "firmaRepAreaTitulo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaTituloGreaterThan(String value) {
            addCriterion("firma_rep_area_titulo >", value, "firmaRepAreaTitulo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaTituloGreaterThanOrEqualTo(String value) {
            addCriterion("firma_rep_area_titulo >=", value, "firmaRepAreaTitulo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaTituloLessThan(String value) {
            addCriterion("firma_rep_area_titulo <", value, "firmaRepAreaTitulo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaTituloLessThanOrEqualTo(String value) {
            addCriterion("firma_rep_area_titulo <=", value, "firmaRepAreaTitulo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaTituloLike(String value) {
            addCriterion("firma_rep_area_titulo like", value, "firmaRepAreaTitulo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaTituloNotLike(String value) {
            addCriterion("firma_rep_area_titulo not like", value, "firmaRepAreaTitulo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaTituloIn(List<String> values) {
            addCriterion("firma_rep_area_titulo in", values, "firmaRepAreaTitulo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaTituloNotIn(List<String> values) {
            addCriterion("firma_rep_area_titulo not in", values, "firmaRepAreaTitulo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaTituloBetween(String value1, String value2) {
            addCriterion("firma_rep_area_titulo between", value1, value2, "firmaRepAreaTitulo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepAreaTituloNotBetween(String value1, String value2) {
            addCriterion("firma_rep_area_titulo not between", value1, value2, "firmaRepAreaTitulo");
            return (Criteria) this;
        }

        public Criteria andPrefijoContratadoIsNull() {
            addCriterion("prefijo_contratado is null");
            return (Criteria) this;
        }

        public Criteria andPrefijoContratadoIsNotNull() {
            addCriterion("prefijo_contratado is not null");
            return (Criteria) this;
        }

        public Criteria andPrefijoContratadoEqualTo(String value) {
            addCriterion("prefijo_contratado =", value, "prefijoContratado");
            return (Criteria) this;
        }

        public Criteria andPrefijoContratadoNotEqualTo(String value) {
            addCriterion("prefijo_contratado <>", value, "prefijoContratado");
            return (Criteria) this;
        }

        public Criteria andPrefijoContratadoGreaterThan(String value) {
            addCriterion("prefijo_contratado >", value, "prefijoContratado");
            return (Criteria) this;
        }

        public Criteria andPrefijoContratadoGreaterThanOrEqualTo(String value) {
            addCriterion("prefijo_contratado >=", value, "prefijoContratado");
            return (Criteria) this;
        }

        public Criteria andPrefijoContratadoLessThan(String value) {
            addCriterion("prefijo_contratado <", value, "prefijoContratado");
            return (Criteria) this;
        }

        public Criteria andPrefijoContratadoLessThanOrEqualTo(String value) {
            addCriterion("prefijo_contratado <=", value, "prefijoContratado");
            return (Criteria) this;
        }

        public Criteria andPrefijoContratadoLike(String value) {
            addCriterion("prefijo_contratado like", value, "prefijoContratado");
            return (Criteria) this;
        }

        public Criteria andPrefijoContratadoNotLike(String value) {
            addCriterion("prefijo_contratado not like", value, "prefijoContratado");
            return (Criteria) this;
        }

        public Criteria andPrefijoContratadoIn(List<String> values) {
            addCriterion("prefijo_contratado in", values, "prefijoContratado");
            return (Criteria) this;
        }

        public Criteria andPrefijoContratadoNotIn(List<String> values) {
            addCriterion("prefijo_contratado not in", values, "prefijoContratado");
            return (Criteria) this;
        }

        public Criteria andPrefijoContratadoBetween(String value1, String value2) {
            addCriterion("prefijo_contratado between", value1, value2, "prefijoContratado");
            return (Criteria) this;
        }

        public Criteria andPrefijoContratadoNotBetween(String value1, String value2) {
            addCriterion("prefijo_contratado not between", value1, value2, "prefijoContratado");
            return (Criteria) this;
        }

        public Criteria andReqCompatibilidadIsNull() {
            addCriterion("req_compatibilidad is null");
            return (Criteria) this;
        }

        public Criteria andReqCompatibilidadIsNotNull() {
            addCriterion("req_compatibilidad is not null");
            return (Criteria) this;
        }

        public Criteria andReqCompatibilidadEqualTo(String value) {
            addCriterion("req_compatibilidad =", value, "reqCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andReqCompatibilidadNotEqualTo(String value) {
            addCriterion("req_compatibilidad <>", value, "reqCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andReqCompatibilidadGreaterThan(String value) {
            addCriterion("req_compatibilidad >", value, "reqCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andReqCompatibilidadGreaterThanOrEqualTo(String value) {
            addCriterion("req_compatibilidad >=", value, "reqCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andReqCompatibilidadLessThan(String value) {
            addCriterion("req_compatibilidad <", value, "reqCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andReqCompatibilidadLessThanOrEqualTo(String value) {
            addCriterion("req_compatibilidad <=", value, "reqCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andReqCompatibilidadLike(String value) {
            addCriterion("req_compatibilidad like", value, "reqCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andReqCompatibilidadNotLike(String value) {
            addCriterion("req_compatibilidad not like", value, "reqCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andReqCompatibilidadIn(List<String> values) {
            addCriterion("req_compatibilidad in", values, "reqCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andReqCompatibilidadNotIn(List<String> values) {
            addCriterion("req_compatibilidad not in", values, "reqCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andReqCompatibilidadBetween(String value1, String value2) {
            addCriterion("req_compatibilidad between", value1, value2, "reqCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andReqCompatibilidadNotBetween(String value1, String value2) {
            addCriterion("req_compatibilidad not between", value1, value2, "reqCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andNumReqCompatiblidadIsNull() {
            addCriterion("num_req_compatiblidad is null");
            return (Criteria) this;
        }

        public Criteria andNumReqCompatiblidadIsNotNull() {
            addCriterion("num_req_compatiblidad is not null");
            return (Criteria) this;
        }

        public Criteria andNumReqCompatiblidadEqualTo(String value) {
            addCriterion("num_req_compatiblidad =", value, "numReqCompatiblidad");
            return (Criteria) this;
        }

        public Criteria andNumReqCompatiblidadNotEqualTo(String value) {
            addCriterion("num_req_compatiblidad <>", value, "numReqCompatiblidad");
            return (Criteria) this;
        }

        public Criteria andNumReqCompatiblidadGreaterThan(String value) {
            addCriterion("num_req_compatiblidad >", value, "numReqCompatiblidad");
            return (Criteria) this;
        }

        public Criteria andNumReqCompatiblidadGreaterThanOrEqualTo(String value) {
            addCriterion("num_req_compatiblidad >=", value, "numReqCompatiblidad");
            return (Criteria) this;
        }

        public Criteria andNumReqCompatiblidadLessThan(String value) {
            addCriterion("num_req_compatiblidad <", value, "numReqCompatiblidad");
            return (Criteria) this;
        }

        public Criteria andNumReqCompatiblidadLessThanOrEqualTo(String value) {
            addCriterion("num_req_compatiblidad <=", value, "numReqCompatiblidad");
            return (Criteria) this;
        }

        public Criteria andNumReqCompatiblidadLike(String value) {
            addCriterion("num_req_compatiblidad like", value, "numReqCompatiblidad");
            return (Criteria) this;
        }

        public Criteria andNumReqCompatiblidadNotLike(String value) {
            addCriterion("num_req_compatiblidad not like", value, "numReqCompatiblidad");
            return (Criteria) this;
        }

        public Criteria andNumReqCompatiblidadIn(List<String> values) {
            addCriterion("num_req_compatiblidad in", values, "numReqCompatiblidad");
            return (Criteria) this;
        }

        public Criteria andNumReqCompatiblidadNotIn(List<String> values) {
            addCriterion("num_req_compatiblidad not in", values, "numReqCompatiblidad");
            return (Criteria) this;
        }

        public Criteria andNumReqCompatiblidadBetween(String value1, String value2) {
            addCriterion("num_req_compatiblidad between", value1, value2, "numReqCompatiblidad");
            return (Criteria) this;
        }

        public Criteria andNumReqCompatiblidadNotBetween(String value1, String value2) {
            addCriterion("num_req_compatiblidad not between", value1, value2, "numReqCompatiblidad");
            return (Criteria) this;
        }

        public Criteria andOficioFhCompatiblidadIsNull() {
            addCriterion("oficio_fh_compatiblidad is null");
            return (Criteria) this;
        }

        public Criteria andOficioFhCompatiblidadIsNotNull() {
            addCriterion("oficio_fh_compatiblidad is not null");
            return (Criteria) this;
        }

        public Criteria andOficioFhCompatiblidadEqualTo(String value) {
            addCriterion("oficio_fh_compatiblidad =", value, "oficioFhCompatiblidad");
            return (Criteria) this;
        }

        public Criteria andOficioFhCompatiblidadNotEqualTo(String value) {
            addCriterion("oficio_fh_compatiblidad <>", value, "oficioFhCompatiblidad");
            return (Criteria) this;
        }

        public Criteria andOficioFhCompatiblidadGreaterThan(String value) {
            addCriterion("oficio_fh_compatiblidad >", value, "oficioFhCompatiblidad");
            return (Criteria) this;
        }

        public Criteria andOficioFhCompatiblidadGreaterThanOrEqualTo(String value) {
            addCriterion("oficio_fh_compatiblidad >=", value, "oficioFhCompatiblidad");
            return (Criteria) this;
        }

        public Criteria andOficioFhCompatiblidadLessThan(String value) {
            addCriterion("oficio_fh_compatiblidad <", value, "oficioFhCompatiblidad");
            return (Criteria) this;
        }

        public Criteria andOficioFhCompatiblidadLessThanOrEqualTo(String value) {
            addCriterion("oficio_fh_compatiblidad <=", value, "oficioFhCompatiblidad");
            return (Criteria) this;
        }

        public Criteria andOficioFhCompatiblidadLike(String value) {
            addCriterion("oficio_fh_compatiblidad like", value, "oficioFhCompatiblidad");
            return (Criteria) this;
        }

        public Criteria andOficioFhCompatiblidadNotLike(String value) {
            addCriterion("oficio_fh_compatiblidad not like", value, "oficioFhCompatiblidad");
            return (Criteria) this;
        }

        public Criteria andOficioFhCompatiblidadIn(List<String> values) {
            addCriterion("oficio_fh_compatiblidad in", values, "oficioFhCompatiblidad");
            return (Criteria) this;
        }

        public Criteria andOficioFhCompatiblidadNotIn(List<String> values) {
            addCriterion("oficio_fh_compatiblidad not in", values, "oficioFhCompatiblidad");
            return (Criteria) this;
        }

        public Criteria andOficioFhCompatiblidadBetween(String value1, String value2) {
            addCriterion("oficio_fh_compatiblidad between", value1, value2, "oficioFhCompatiblidad");
            return (Criteria) this;
        }

        public Criteria andOficioFhCompatiblidadNotBetween(String value1, String value2) {
            addCriterion("oficio_fh_compatiblidad not between", value1, value2, "oficioFhCompatiblidad");
            return (Criteria) this;
        }

        public Criteria andReqOfRespSfpIsNull() {
            addCriterion("req_of_resp_sfp is null");
            return (Criteria) this;
        }

        public Criteria andReqOfRespSfpIsNotNull() {
            addCriterion("req_of_resp_sfp is not null");
            return (Criteria) this;
        }

        public Criteria andReqOfRespSfpEqualTo(String value) {
            addCriterion("req_of_resp_sfp =", value, "reqOfRespSfp");
            return (Criteria) this;
        }

        public Criteria andReqOfRespSfpNotEqualTo(String value) {
            addCriterion("req_of_resp_sfp <>", value, "reqOfRespSfp");
            return (Criteria) this;
        }

        public Criteria andReqOfRespSfpGreaterThan(String value) {
            addCriterion("req_of_resp_sfp >", value, "reqOfRespSfp");
            return (Criteria) this;
        }

        public Criteria andReqOfRespSfpGreaterThanOrEqualTo(String value) {
            addCriterion("req_of_resp_sfp >=", value, "reqOfRespSfp");
            return (Criteria) this;
        }

        public Criteria andReqOfRespSfpLessThan(String value) {
            addCriterion("req_of_resp_sfp <", value, "reqOfRespSfp");
            return (Criteria) this;
        }

        public Criteria andReqOfRespSfpLessThanOrEqualTo(String value) {
            addCriterion("req_of_resp_sfp <=", value, "reqOfRespSfp");
            return (Criteria) this;
        }

        public Criteria andReqOfRespSfpLike(String value) {
            addCriterion("req_of_resp_sfp like", value, "reqOfRespSfp");
            return (Criteria) this;
        }

        public Criteria andReqOfRespSfpNotLike(String value) {
            addCriterion("req_of_resp_sfp not like", value, "reqOfRespSfp");
            return (Criteria) this;
        }

        public Criteria andReqOfRespSfpIn(List<String> values) {
            addCriterion("req_of_resp_sfp in", values, "reqOfRespSfp");
            return (Criteria) this;
        }

        public Criteria andReqOfRespSfpNotIn(List<String> values) {
            addCriterion("req_of_resp_sfp not in", values, "reqOfRespSfp");
            return (Criteria) this;
        }

        public Criteria andReqOfRespSfpBetween(String value1, String value2) {
            addCriterion("req_of_resp_sfp between", value1, value2, "reqOfRespSfp");
            return (Criteria) this;
        }

        public Criteria andReqOfRespSfpNotBetween(String value1, String value2) {
            addCriterion("req_of_resp_sfp not between", value1, value2, "reqOfRespSfp");
            return (Criteria) this;
        }

        public Criteria andNumOfResSfpIsNull() {
            addCriterion("num_of_res_sfp is null");
            return (Criteria) this;
        }

        public Criteria andNumOfResSfpIsNotNull() {
            addCriterion("num_of_res_sfp is not null");
            return (Criteria) this;
        }

        public Criteria andNumOfResSfpEqualTo(String value) {
            addCriterion("num_of_res_sfp =", value, "numOfResSfp");
            return (Criteria) this;
        }

        public Criteria andNumOfResSfpNotEqualTo(String value) {
            addCriterion("num_of_res_sfp <>", value, "numOfResSfp");
            return (Criteria) this;
        }

        public Criteria andNumOfResSfpGreaterThan(String value) {
            addCriterion("num_of_res_sfp >", value, "numOfResSfp");
            return (Criteria) this;
        }

        public Criteria andNumOfResSfpGreaterThanOrEqualTo(String value) {
            addCriterion("num_of_res_sfp >=", value, "numOfResSfp");
            return (Criteria) this;
        }

        public Criteria andNumOfResSfpLessThan(String value) {
            addCriterion("num_of_res_sfp <", value, "numOfResSfp");
            return (Criteria) this;
        }

        public Criteria andNumOfResSfpLessThanOrEqualTo(String value) {
            addCriterion("num_of_res_sfp <=", value, "numOfResSfp");
            return (Criteria) this;
        }

        public Criteria andNumOfResSfpLike(String value) {
            addCriterion("num_of_res_sfp like", value, "numOfResSfp");
            return (Criteria) this;
        }

        public Criteria andNumOfResSfpNotLike(String value) {
            addCriterion("num_of_res_sfp not like", value, "numOfResSfp");
            return (Criteria) this;
        }

        public Criteria andNumOfResSfpIn(List<String> values) {
            addCriterion("num_of_res_sfp in", values, "numOfResSfp");
            return (Criteria) this;
        }

        public Criteria andNumOfResSfpNotIn(List<String> values) {
            addCriterion("num_of_res_sfp not in", values, "numOfResSfp");
            return (Criteria) this;
        }

        public Criteria andNumOfResSfpBetween(String value1, String value2) {
            addCriterion("num_of_res_sfp between", value1, value2, "numOfResSfp");
            return (Criteria) this;
        }

        public Criteria andNumOfResSfpNotBetween(String value1, String value2) {
            addCriterion("num_of_res_sfp not between", value1, value2, "numOfResSfp");
            return (Criteria) this;
        }

        public Criteria andOficioFhRespSfpIsNull() {
            addCriterion("oficio_fh_resp_sfp is null");
            return (Criteria) this;
        }

        public Criteria andOficioFhRespSfpIsNotNull() {
            addCriterion("oficio_fh_resp_sfp is not null");
            return (Criteria) this;
        }

        public Criteria andOficioFhRespSfpEqualTo(String value) {
            addCriterion("oficio_fh_resp_sfp =", value, "oficioFhRespSfp");
            return (Criteria) this;
        }

        public Criteria andOficioFhRespSfpNotEqualTo(String value) {
            addCriterion("oficio_fh_resp_sfp <>", value, "oficioFhRespSfp");
            return (Criteria) this;
        }

        public Criteria andOficioFhRespSfpGreaterThan(String value) {
            addCriterion("oficio_fh_resp_sfp >", value, "oficioFhRespSfp");
            return (Criteria) this;
        }

        public Criteria andOficioFhRespSfpGreaterThanOrEqualTo(String value) {
            addCriterion("oficio_fh_resp_sfp >=", value, "oficioFhRespSfp");
            return (Criteria) this;
        }

        public Criteria andOficioFhRespSfpLessThan(String value) {
            addCriterion("oficio_fh_resp_sfp <", value, "oficioFhRespSfp");
            return (Criteria) this;
        }

        public Criteria andOficioFhRespSfpLessThanOrEqualTo(String value) {
            addCriterion("oficio_fh_resp_sfp <=", value, "oficioFhRespSfp");
            return (Criteria) this;
        }

        public Criteria andOficioFhRespSfpLike(String value) {
            addCriterion("oficio_fh_resp_sfp like", value, "oficioFhRespSfp");
            return (Criteria) this;
        }

        public Criteria andOficioFhRespSfpNotLike(String value) {
            addCriterion("oficio_fh_resp_sfp not like", value, "oficioFhRespSfp");
            return (Criteria) this;
        }

        public Criteria andOficioFhRespSfpIn(List<String> values) {
            addCriterion("oficio_fh_resp_sfp in", values, "oficioFhRespSfp");
            return (Criteria) this;
        }

        public Criteria andOficioFhRespSfpNotIn(List<String> values) {
            addCriterion("oficio_fh_resp_sfp not in", values, "oficioFhRespSfp");
            return (Criteria) this;
        }

        public Criteria andOficioFhRespSfpBetween(String value1, String value2) {
            addCriterion("oficio_fh_resp_sfp between", value1, value2, "oficioFhRespSfp");
            return (Criteria) this;
        }

        public Criteria andOficioFhRespSfpNotBetween(String value1, String value2) {
            addCriterion("oficio_fh_resp_sfp not between", value1, value2, "oficioFhRespSfp");
            return (Criteria) this;
        }

        public Criteria andReqOfExisPzaVacIsNull() {
            addCriterion("req_of_exis_pza_vac is null");
            return (Criteria) this;
        }

        public Criteria andReqOfExisPzaVacIsNotNull() {
            addCriterion("req_of_exis_pza_vac is not null");
            return (Criteria) this;
        }

        public Criteria andReqOfExisPzaVacEqualTo(String value) {
            addCriterion("req_of_exis_pza_vac =", value, "reqOfExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andReqOfExisPzaVacNotEqualTo(String value) {
            addCriterion("req_of_exis_pza_vac <>", value, "reqOfExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andReqOfExisPzaVacGreaterThan(String value) {
            addCriterion("req_of_exis_pza_vac >", value, "reqOfExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andReqOfExisPzaVacGreaterThanOrEqualTo(String value) {
            addCriterion("req_of_exis_pza_vac >=", value, "reqOfExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andReqOfExisPzaVacLessThan(String value) {
            addCriterion("req_of_exis_pza_vac <", value, "reqOfExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andReqOfExisPzaVacLessThanOrEqualTo(String value) {
            addCriterion("req_of_exis_pza_vac <=", value, "reqOfExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andReqOfExisPzaVacLike(String value) {
            addCriterion("req_of_exis_pza_vac like", value, "reqOfExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andReqOfExisPzaVacNotLike(String value) {
            addCriterion("req_of_exis_pza_vac not like", value, "reqOfExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andReqOfExisPzaVacIn(List<String> values) {
            addCriterion("req_of_exis_pza_vac in", values, "reqOfExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andReqOfExisPzaVacNotIn(List<String> values) {
            addCriterion("req_of_exis_pza_vac not in", values, "reqOfExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andReqOfExisPzaVacBetween(String value1, String value2) {
            addCriterion("req_of_exis_pza_vac between", value1, value2, "reqOfExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andReqOfExisPzaVacNotBetween(String value1, String value2) {
            addCriterion("req_of_exis_pza_vac not between", value1, value2, "reqOfExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andNumOfExisPzaVacIsNull() {
            addCriterion("num_of_exis_pza_vac is null");
            return (Criteria) this;
        }

        public Criteria andNumOfExisPzaVacIsNotNull() {
            addCriterion("num_of_exis_pza_vac is not null");
            return (Criteria) this;
        }

        public Criteria andNumOfExisPzaVacEqualTo(String value) {
            addCriterion("num_of_exis_pza_vac =", value, "numOfExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andNumOfExisPzaVacNotEqualTo(String value) {
            addCriterion("num_of_exis_pza_vac <>", value, "numOfExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andNumOfExisPzaVacGreaterThan(String value) {
            addCriterion("num_of_exis_pza_vac >", value, "numOfExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andNumOfExisPzaVacGreaterThanOrEqualTo(String value) {
            addCriterion("num_of_exis_pza_vac >=", value, "numOfExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andNumOfExisPzaVacLessThan(String value) {
            addCriterion("num_of_exis_pza_vac <", value, "numOfExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andNumOfExisPzaVacLessThanOrEqualTo(String value) {
            addCriterion("num_of_exis_pza_vac <=", value, "numOfExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andNumOfExisPzaVacLike(String value) {
            addCriterion("num_of_exis_pza_vac like", value, "numOfExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andNumOfExisPzaVacNotLike(String value) {
            addCriterion("num_of_exis_pza_vac not like", value, "numOfExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andNumOfExisPzaVacIn(List<String> values) {
            addCriterion("num_of_exis_pza_vac in", values, "numOfExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andNumOfExisPzaVacNotIn(List<String> values) {
            addCriterion("num_of_exis_pza_vac not in", values, "numOfExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andNumOfExisPzaVacBetween(String value1, String value2) {
            addCriterion("num_of_exis_pza_vac between", value1, value2, "numOfExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andNumOfExisPzaVacNotBetween(String value1, String value2) {
            addCriterion("num_of_exis_pza_vac not between", value1, value2, "numOfExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andOficioFhExisPzaVacIsNull() {
            addCriterion("oficio_fh_exis_pza_vac is null");
            return (Criteria) this;
        }

        public Criteria andOficioFhExisPzaVacIsNotNull() {
            addCriterion("oficio_fh_exis_pza_vac is not null");
            return (Criteria) this;
        }

        public Criteria andOficioFhExisPzaVacEqualTo(String value) {
            addCriterion("oficio_fh_exis_pza_vac =", value, "oficioFhExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andOficioFhExisPzaVacNotEqualTo(String value) {
            addCriterion("oficio_fh_exis_pza_vac <>", value, "oficioFhExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andOficioFhExisPzaVacGreaterThan(String value) {
            addCriterion("oficio_fh_exis_pza_vac >", value, "oficioFhExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andOficioFhExisPzaVacGreaterThanOrEqualTo(String value) {
            addCriterion("oficio_fh_exis_pza_vac >=", value, "oficioFhExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andOficioFhExisPzaVacLessThan(String value) {
            addCriterion("oficio_fh_exis_pza_vac <", value, "oficioFhExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andOficioFhExisPzaVacLessThanOrEqualTo(String value) {
            addCriterion("oficio_fh_exis_pza_vac <=", value, "oficioFhExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andOficioFhExisPzaVacLike(String value) {
            addCriterion("oficio_fh_exis_pza_vac like", value, "oficioFhExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andOficioFhExisPzaVacNotLike(String value) {
            addCriterion("oficio_fh_exis_pza_vac not like", value, "oficioFhExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andOficioFhExisPzaVacIn(List<String> values) {
            addCriterion("oficio_fh_exis_pza_vac in", values, "oficioFhExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andOficioFhExisPzaVacNotIn(List<String> values) {
            addCriterion("oficio_fh_exis_pza_vac not in", values, "oficioFhExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andOficioFhExisPzaVacBetween(String value1, String value2) {
            addCriterion("oficio_fh_exis_pza_vac between", value1, value2, "oficioFhExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andOficioFhExisPzaVacNotBetween(String value1, String value2) {
            addCriterion("oficio_fh_exis_pza_vac not between", value1, value2, "oficioFhExisPzaVac");
            return (Criteria) this;
        }

        public Criteria andNbDepCompatibilidadIsNull() {
            addCriterion("nb_dep_compatibilidad is null");
            return (Criteria) this;
        }

        public Criteria andNbDepCompatibilidadIsNotNull() {
            addCriterion("nb_dep_compatibilidad is not null");
            return (Criteria) this;
        }

        public Criteria andNbDepCompatibilidadEqualTo(String value) {
            addCriterion("nb_dep_compatibilidad =", value, "nbDepCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andNbDepCompatibilidadNotEqualTo(String value) {
            addCriterion("nb_dep_compatibilidad <>", value, "nbDepCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andNbDepCompatibilidadGreaterThan(String value) {
            addCriterion("nb_dep_compatibilidad >", value, "nbDepCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andNbDepCompatibilidadGreaterThanOrEqualTo(String value) {
            addCriterion("nb_dep_compatibilidad >=", value, "nbDepCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andNbDepCompatibilidadLessThan(String value) {
            addCriterion("nb_dep_compatibilidad <", value, "nbDepCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andNbDepCompatibilidadLessThanOrEqualTo(String value) {
            addCriterion("nb_dep_compatibilidad <=", value, "nbDepCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andNbDepCompatibilidadLike(String value) {
            addCriterion("nb_dep_compatibilidad like", value, "nbDepCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andNbDepCompatibilidadNotLike(String value) {
            addCriterion("nb_dep_compatibilidad not like", value, "nbDepCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andNbDepCompatibilidadIn(List<String> values) {
            addCriterion("nb_dep_compatibilidad in", values, "nbDepCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andNbDepCompatibilidadNotIn(List<String> values) {
            addCriterion("nb_dep_compatibilidad not in", values, "nbDepCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andNbDepCompatibilidadBetween(String value1, String value2) {
            addCriterion("nb_dep_compatibilidad between", value1, value2, "nbDepCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andNbDepCompatibilidadNotBetween(String value1, String value2) {
            addCriterion("nb_dep_compatibilidad not between", value1, value2, "nbDepCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andDescEntregablesIsNull() {
            addCriterion("desc_entregables is null");
            return (Criteria) this;
        }

        public Criteria andDescEntregablesIsNotNull() {
            addCriterion("desc_entregables is not null");
            return (Criteria) this;
        }

        public Criteria andDescEntregablesEqualTo(String value) {
            addCriterion("desc_entregables =", value, "descEntregables");
            return (Criteria) this;
        }

        public Criteria andDescEntregablesNotEqualTo(String value) {
            addCriterion("desc_entregables <>", value, "descEntregables");
            return (Criteria) this;
        }

        public Criteria andDescEntregablesGreaterThan(String value) {
            addCriterion("desc_entregables >", value, "descEntregables");
            return (Criteria) this;
        }

        public Criteria andDescEntregablesGreaterThanOrEqualTo(String value) {
            addCriterion("desc_entregables >=", value, "descEntregables");
            return (Criteria) this;
        }

        public Criteria andDescEntregablesLessThan(String value) {
            addCriterion("desc_entregables <", value, "descEntregables");
            return (Criteria) this;
        }

        public Criteria andDescEntregablesLessThanOrEqualTo(String value) {
            addCriterion("desc_entregables <=", value, "descEntregables");
            return (Criteria) this;
        }

        public Criteria andDescEntregablesLike(String value) {
            addCriterion("desc_entregables like", value, "descEntregables");
            return (Criteria) this;
        }

        public Criteria andDescEntregablesNotLike(String value) {
            addCriterion("desc_entregables not like", value, "descEntregables");
            return (Criteria) this;
        }

        public Criteria andDescEntregablesIn(List<String> values) {
            addCriterion("desc_entregables in", values, "descEntregables");
            return (Criteria) this;
        }

        public Criteria andDescEntregablesNotIn(List<String> values) {
            addCriterion("desc_entregables not in", values, "descEntregables");
            return (Criteria) this;
        }

        public Criteria andDescEntregablesBetween(String value1, String value2) {
            addCriterion("desc_entregables between", value1, value2, "descEntregables");
            return (Criteria) this;
        }

        public Criteria andDescEntregablesNotBetween(String value1, String value2) {
            addCriterion("desc_entregables not between", value1, value2, "descEntregables");
            return (Criteria) this;
        }

        public Criteria andReqIsssteIsNull() {
            addCriterion("req_issste is null");
            return (Criteria) this;
        }

        public Criteria andReqIsssteIsNotNull() {
            addCriterion("req_issste is not null");
            return (Criteria) this;
        }

        public Criteria andReqIsssteEqualTo(String value) {
            addCriterion("req_issste =", value, "reqIssste");
            return (Criteria) this;
        }

        public Criteria andReqIsssteNotEqualTo(String value) {
            addCriterion("req_issste <>", value, "reqIssste");
            return (Criteria) this;
        }

        public Criteria andReqIsssteGreaterThan(String value) {
            addCriterion("req_issste >", value, "reqIssste");
            return (Criteria) this;
        }

        public Criteria andReqIsssteGreaterThanOrEqualTo(String value) {
            addCriterion("req_issste >=", value, "reqIssste");
            return (Criteria) this;
        }

        public Criteria andReqIsssteLessThan(String value) {
            addCriterion("req_issste <", value, "reqIssste");
            return (Criteria) this;
        }

        public Criteria andReqIsssteLessThanOrEqualTo(String value) {
            addCriterion("req_issste <=", value, "reqIssste");
            return (Criteria) this;
        }

        public Criteria andReqIsssteLike(String value) {
            addCriterion("req_issste like", value, "reqIssste");
            return (Criteria) this;
        }

        public Criteria andReqIsssteNotLike(String value) {
            addCriterion("req_issste not like", value, "reqIssste");
            return (Criteria) this;
        }

        public Criteria andReqIsssteIn(List<String> values) {
            addCriterion("req_issste in", values, "reqIssste");
            return (Criteria) this;
        }

        public Criteria andReqIsssteNotIn(List<String> values) {
            addCriterion("req_issste not in", values, "reqIssste");
            return (Criteria) this;
        }

        public Criteria andReqIsssteBetween(String value1, String value2) {
            addCriterion("req_issste between", value1, value2, "reqIssste");
            return (Criteria) this;
        }

        public Criteria andReqIsssteNotBetween(String value1, String value2) {
            addCriterion("req_issste not between", value1, value2, "reqIssste");
            return (Criteria) this;
        }

        public Criteria andNum2ReqCompatibilidadIsNull() {
            addCriterion("num2_req_compatibilidad is null");
            return (Criteria) this;
        }

        public Criteria andNum2ReqCompatibilidadIsNotNull() {
            addCriterion("num2_req_compatibilidad is not null");
            return (Criteria) this;
        }

        public Criteria andNum2ReqCompatibilidadEqualTo(String value) {
            addCriterion("num2_req_compatibilidad =", value, "num2ReqCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andNum2ReqCompatibilidadNotEqualTo(String value) {
            addCriterion("num2_req_compatibilidad <>", value, "num2ReqCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andNum2ReqCompatibilidadGreaterThan(String value) {
            addCriterion("num2_req_compatibilidad >", value, "num2ReqCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andNum2ReqCompatibilidadGreaterThanOrEqualTo(String value) {
            addCriterion("num2_req_compatibilidad >=", value, "num2ReqCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andNum2ReqCompatibilidadLessThan(String value) {
            addCriterion("num2_req_compatibilidad <", value, "num2ReqCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andNum2ReqCompatibilidadLessThanOrEqualTo(String value) {
            addCriterion("num2_req_compatibilidad <=", value, "num2ReqCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andNum2ReqCompatibilidadLike(String value) {
            addCriterion("num2_req_compatibilidad like", value, "num2ReqCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andNum2ReqCompatibilidadNotLike(String value) {
            addCriterion("num2_req_compatibilidad not like", value, "num2ReqCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andNum2ReqCompatibilidadIn(List<String> values) {
            addCriterion("num2_req_compatibilidad in", values, "num2ReqCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andNum2ReqCompatibilidadNotIn(List<String> values) {
            addCriterion("num2_req_compatibilidad not in", values, "num2ReqCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andNum2ReqCompatibilidadBetween(String value1, String value2) {
            addCriterion("num2_req_compatibilidad between", value1, value2, "num2ReqCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andNum2ReqCompatibilidadNotBetween(String value1, String value2) {
            addCriterion("num2_req_compatibilidad not between", value1, value2, "num2ReqCompatibilidad");
            return (Criteria) this;
        }

        public Criteria andDomDependenciaIsNull() {
            addCriterion("dom_dependencia is null");
            return (Criteria) this;
        }

        public Criteria andDomDependenciaIsNotNull() {
            addCriterion("dom_dependencia is not null");
            return (Criteria) this;
        }

        public Criteria andDomDependenciaEqualTo(String value) {
            addCriterion("dom_dependencia =", value, "domDependencia");
            return (Criteria) this;
        }

        public Criteria andDomDependenciaNotEqualTo(String value) {
            addCriterion("dom_dependencia <>", value, "domDependencia");
            return (Criteria) this;
        }

        public Criteria andDomDependenciaGreaterThan(String value) {
            addCriterion("dom_dependencia >", value, "domDependencia");
            return (Criteria) this;
        }

        public Criteria andDomDependenciaGreaterThanOrEqualTo(String value) {
            addCriterion("dom_dependencia >=", value, "domDependencia");
            return (Criteria) this;
        }

        public Criteria andDomDependenciaLessThan(String value) {
            addCriterion("dom_dependencia <", value, "domDependencia");
            return (Criteria) this;
        }

        public Criteria andDomDependenciaLessThanOrEqualTo(String value) {
            addCriterion("dom_dependencia <=", value, "domDependencia");
            return (Criteria) this;
        }

        public Criteria andDomDependenciaLike(String value) {
            addCriterion("dom_dependencia like", value, "domDependencia");
            return (Criteria) this;
        }

        public Criteria andDomDependenciaNotLike(String value) {
            addCriterion("dom_dependencia not like", value, "domDependencia");
            return (Criteria) this;
        }

        public Criteria andDomDependenciaIn(List<String> values) {
            addCriterion("dom_dependencia in", values, "domDependencia");
            return (Criteria) this;
        }

        public Criteria andDomDependenciaNotIn(List<String> values) {
            addCriterion("dom_dependencia not in", values, "domDependencia");
            return (Criteria) this;
        }

        public Criteria andDomDependenciaBetween(String value1, String value2) {
            addCriterion("dom_dependencia between", value1, value2, "domDependencia");
            return (Criteria) this;
        }

        public Criteria andDomDependenciaNotBetween(String value1, String value2) {
            addCriterion("dom_dependencia not between", value1, value2, "domDependencia");
            return (Criteria) this;
        }

        public Criteria andCiudadFirmaIsNull() {
            addCriterion("ciudad_firma is null");
            return (Criteria) this;
        }

        public Criteria andCiudadFirmaIsNotNull() {
            addCriterion("ciudad_firma is not null");
            return (Criteria) this;
        }

        public Criteria andCiudadFirmaEqualTo(String value) {
            addCriterion("ciudad_firma =", value, "ciudadFirma");
            return (Criteria) this;
        }

        public Criteria andCiudadFirmaNotEqualTo(String value) {
            addCriterion("ciudad_firma <>", value, "ciudadFirma");
            return (Criteria) this;
        }

        public Criteria andCiudadFirmaGreaterThan(String value) {
            addCriterion("ciudad_firma >", value, "ciudadFirma");
            return (Criteria) this;
        }

        public Criteria andCiudadFirmaGreaterThanOrEqualTo(String value) {
            addCriterion("ciudad_firma >=", value, "ciudadFirma");
            return (Criteria) this;
        }

        public Criteria andCiudadFirmaLessThan(String value) {
            addCriterion("ciudad_firma <", value, "ciudadFirma");
            return (Criteria) this;
        }

        public Criteria andCiudadFirmaLessThanOrEqualTo(String value) {
            addCriterion("ciudad_firma <=", value, "ciudadFirma");
            return (Criteria) this;
        }

        public Criteria andCiudadFirmaLike(String value) {
            addCriterion("ciudad_firma like", value, "ciudadFirma");
            return (Criteria) this;
        }

        public Criteria andCiudadFirmaNotLike(String value) {
            addCriterion("ciudad_firma not like", value, "ciudadFirma");
            return (Criteria) this;
        }

        public Criteria andCiudadFirmaIn(List<String> values) {
            addCriterion("ciudad_firma in", values, "ciudadFirma");
            return (Criteria) this;
        }

        public Criteria andCiudadFirmaNotIn(List<String> values) {
            addCriterion("ciudad_firma not in", values, "ciudadFirma");
            return (Criteria) this;
        }

        public Criteria andCiudadFirmaBetween(String value1, String value2) {
            addCriterion("ciudad_firma between", value1, value2, "ciudadFirma");
            return (Criteria) this;
        }

        public Criteria andCiudadFirmaNotBetween(String value1, String value2) {
            addCriterion("ciudad_firma not between", value1, value2, "ciudadFirma");
            return (Criteria) this;
        }

        public Criteria andPartidaIsNull() {
            addCriterion("partida is null");
            return (Criteria) this;
        }

        public Criteria andPartidaIsNotNull() {
            addCriterion("partida is not null");
            return (Criteria) this;
        }

        public Criteria andPartidaEqualTo(String value) {
            addCriterion("partida =", value, "partida");
            return (Criteria) this;
        }

        public Criteria andPartidaNotEqualTo(String value) {
            addCriterion("partida <>", value, "partida");
            return (Criteria) this;
        }

        public Criteria andPartidaGreaterThan(String value) {
            addCriterion("partida >", value, "partida");
            return (Criteria) this;
        }

        public Criteria andPartidaGreaterThanOrEqualTo(String value) {
            addCriterion("partida >=", value, "partida");
            return (Criteria) this;
        }

        public Criteria andPartidaLessThan(String value) {
            addCriterion("partida <", value, "partida");
            return (Criteria) this;
        }

        public Criteria andPartidaLessThanOrEqualTo(String value) {
            addCriterion("partida <=", value, "partida");
            return (Criteria) this;
        }

        public Criteria andPartidaLike(String value) {
            addCriterion("partida like", value, "partida");
            return (Criteria) this;
        }

        public Criteria andPartidaNotLike(String value) {
            addCriterion("partida not like", value, "partida");
            return (Criteria) this;
        }

        public Criteria andPartidaIn(List<String> values) {
            addCriterion("partida in", values, "partida");
            return (Criteria) this;
        }

        public Criteria andPartidaNotIn(List<String> values) {
            addCriterion("partida not in", values, "partida");
            return (Criteria) this;
        }

        public Criteria andPartidaBetween(String value1, String value2) {
            addCriterion("partida between", value1, value2, "partida");
            return (Criteria) this;
        }

        public Criteria andPartidaNotBetween(String value1, String value2) {
            addCriterion("partida not between", value1, value2, "partida");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepPrefijoIsNull() {
            addCriterion("firma_rep_sep_prefijo is null");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepPrefijoIsNotNull() {
            addCriterion("firma_rep_sep_prefijo is not null");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepPrefijoEqualTo(String value) {
            addCriterion("firma_rep_sep_prefijo =", value, "firmaRepSepPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepPrefijoNotEqualTo(String value) {
            addCriterion("firma_rep_sep_prefijo <>", value, "firmaRepSepPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepPrefijoGreaterThan(String value) {
            addCriterion("firma_rep_sep_prefijo >", value, "firmaRepSepPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepPrefijoGreaterThanOrEqualTo(String value) {
            addCriterion("firma_rep_sep_prefijo >=", value, "firmaRepSepPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepPrefijoLessThan(String value) {
            addCriterion("firma_rep_sep_prefijo <", value, "firmaRepSepPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepPrefijoLessThanOrEqualTo(String value) {
            addCriterion("firma_rep_sep_prefijo <=", value, "firmaRepSepPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepPrefijoLike(String value) {
            addCriterion("firma_rep_sep_prefijo like", value, "firmaRepSepPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepPrefijoNotLike(String value) {
            addCriterion("firma_rep_sep_prefijo not like", value, "firmaRepSepPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepPrefijoIn(List<String> values) {
            addCriterion("firma_rep_sep_prefijo in", values, "firmaRepSepPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepPrefijoNotIn(List<String> values) {
            addCriterion("firma_rep_sep_prefijo not in", values, "firmaRepSepPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepPrefijoBetween(String value1, String value2) {
            addCriterion("firma_rep_sep_prefijo between", value1, value2, "firmaRepSepPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepPrefijoNotBetween(String value1, String value2) {
            addCriterion("firma_rep_sep_prefijo not between", value1, value2, "firmaRepSepPrefijo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepTituloIsNull() {
            addCriterion("firma_rep_sep_titulo is null");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepTituloIsNotNull() {
            addCriterion("firma_rep_sep_titulo is not null");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepTituloEqualTo(String value) {
            addCriterion("firma_rep_sep_titulo =", value, "firmaRepSepTitulo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepTituloNotEqualTo(String value) {
            addCriterion("firma_rep_sep_titulo <>", value, "firmaRepSepTitulo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepTituloGreaterThan(String value) {
            addCriterion("firma_rep_sep_titulo >", value, "firmaRepSepTitulo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepTituloGreaterThanOrEqualTo(String value) {
            addCriterion("firma_rep_sep_titulo >=", value, "firmaRepSepTitulo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepTituloLessThan(String value) {
            addCriterion("firma_rep_sep_titulo <", value, "firmaRepSepTitulo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepTituloLessThanOrEqualTo(String value) {
            addCriterion("firma_rep_sep_titulo <=", value, "firmaRepSepTitulo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepTituloLike(String value) {
            addCriterion("firma_rep_sep_titulo like", value, "firmaRepSepTitulo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepTituloNotLike(String value) {
            addCriterion("firma_rep_sep_titulo not like", value, "firmaRepSepTitulo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepTituloIn(List<String> values) {
            addCriterion("firma_rep_sep_titulo in", values, "firmaRepSepTitulo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepTituloNotIn(List<String> values) {
            addCriterion("firma_rep_sep_titulo not in", values, "firmaRepSepTitulo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepTituloBetween(String value1, String value2) {
            addCriterion("firma_rep_sep_titulo between", value1, value2, "firmaRepSepTitulo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepTituloNotBetween(String value1, String value2) {
            addCriterion("firma_rep_sep_titulo not between", value1, value2, "firmaRepSepTitulo");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepNombreIsNull() {
            addCriterion("firma_rep_sep_nombre is null");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepNombreIsNotNull() {
            addCriterion("firma_rep_sep_nombre is not null");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepNombreEqualTo(String value) {
            addCriterion("firma_rep_sep_nombre =", value, "firmaRepSepNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepNombreNotEqualTo(String value) {
            addCriterion("firma_rep_sep_nombre <>", value, "firmaRepSepNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepNombreGreaterThan(String value) {
            addCriterion("firma_rep_sep_nombre >", value, "firmaRepSepNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepNombreGreaterThanOrEqualTo(String value) {
            addCriterion("firma_rep_sep_nombre >=", value, "firmaRepSepNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepNombreLessThan(String value) {
            addCriterion("firma_rep_sep_nombre <", value, "firmaRepSepNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepNombreLessThanOrEqualTo(String value) {
            addCriterion("firma_rep_sep_nombre <=", value, "firmaRepSepNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepNombreLike(String value) {
            addCriterion("firma_rep_sep_nombre like", value, "firmaRepSepNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepNombreNotLike(String value) {
            addCriterion("firma_rep_sep_nombre not like", value, "firmaRepSepNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepNombreIn(List<String> values) {
            addCriterion("firma_rep_sep_nombre in", values, "firmaRepSepNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepNombreNotIn(List<String> values) {
            addCriterion("firma_rep_sep_nombre not in", values, "firmaRepSepNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepNombreBetween(String value1, String value2) {
            addCriterion("firma_rep_sep_nombre between", value1, value2, "firmaRepSepNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepNombreNotBetween(String value1, String value2) {
            addCriterion("firma_rep_sep_nombre not between", value1, value2, "firmaRepSepNombre");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepPuestoIsNull() {
            addCriterion("firma_rep_sep_puesto is null");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepPuestoIsNotNull() {
            addCriterion("firma_rep_sep_puesto is not null");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepPuestoEqualTo(String value) {
            addCriterion("firma_rep_sep_puesto =", value, "firmaRepSepPuesto");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepPuestoNotEqualTo(String value) {
            addCriterion("firma_rep_sep_puesto <>", value, "firmaRepSepPuesto");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepPuestoGreaterThan(String value) {
            addCriterion("firma_rep_sep_puesto >", value, "firmaRepSepPuesto");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepPuestoGreaterThanOrEqualTo(String value) {
            addCriterion("firma_rep_sep_puesto >=", value, "firmaRepSepPuesto");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepPuestoLessThan(String value) {
            addCriterion("firma_rep_sep_puesto <", value, "firmaRepSepPuesto");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepPuestoLessThanOrEqualTo(String value) {
            addCriterion("firma_rep_sep_puesto <=", value, "firmaRepSepPuesto");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepPuestoLike(String value) {
            addCriterion("firma_rep_sep_puesto like", value, "firmaRepSepPuesto");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepPuestoNotLike(String value) {
            addCriterion("firma_rep_sep_puesto not like", value, "firmaRepSepPuesto");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepPuestoIn(List<String> values) {
            addCriterion("firma_rep_sep_puesto in", values, "firmaRepSepPuesto");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepPuestoNotIn(List<String> values) {
            addCriterion("firma_rep_sep_puesto not in", values, "firmaRepSepPuesto");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepPuestoBetween(String value1, String value2) {
            addCriterion("firma_rep_sep_puesto between", value1, value2, "firmaRepSepPuesto");
            return (Criteria) this;
        }

        public Criteria andFirmaRepSepPuestoNotBetween(String value1, String value2) {
            addCriterion("firma_rep_sep_puesto not between", value1, value2, "firmaRepSepPuesto");
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