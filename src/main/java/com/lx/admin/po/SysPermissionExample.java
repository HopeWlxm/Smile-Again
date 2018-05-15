package com.lx.admin.po;

import java.util.ArrayList;
import java.util.List;

public class SysPermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysPermissionExample() {
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

        public Criteria andPeridIsNull() {
            addCriterion("perid is null");
            return (Criteria) this;
        }

        public Criteria andPeridIsNotNull() {
            addCriterion("perid is not null");
            return (Criteria) this;
        }

        public Criteria andPeridEqualTo(Long value) {
            addCriterion("perid =", value, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridNotEqualTo(Long value) {
            addCriterion("perid <>", value, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridGreaterThan(Long value) {
            addCriterion("perid >", value, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridGreaterThanOrEqualTo(Long value) {
            addCriterion("perid >=", value, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridLessThan(Long value) {
            addCriterion("perid <", value, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridLessThanOrEqualTo(Long value) {
            addCriterion("perid <=", value, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridIn(List<Long> values) {
            addCriterion("perid in", values, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridNotIn(List<Long> values) {
            addCriterion("perid not in", values, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridBetween(Long value1, Long value2) {
            addCriterion("perid between", value1, value2, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridNotBetween(Long value1, Long value2) {
            addCriterion("perid not between", value1, value2, "perid");
            return (Criteria) this;
        }

        public Criteria andPernameIsNull() {
            addCriterion("pername is null");
            return (Criteria) this;
        }

        public Criteria andPernameIsNotNull() {
            addCriterion("pername is not null");
            return (Criteria) this;
        }

        public Criteria andPernameEqualTo(String value) {
            addCriterion("pername =", value, "pername");
            return (Criteria) this;
        }

        public Criteria andPernameNotEqualTo(String value) {
            addCriterion("pername <>", value, "pername");
            return (Criteria) this;
        }

        public Criteria andPernameGreaterThan(String value) {
            addCriterion("pername >", value, "pername");
            return (Criteria) this;
        }

        public Criteria andPernameGreaterThanOrEqualTo(String value) {
            addCriterion("pername >=", value, "pername");
            return (Criteria) this;
        }

        public Criteria andPernameLessThan(String value) {
            addCriterion("pername <", value, "pername");
            return (Criteria) this;
        }

        public Criteria andPernameLessThanOrEqualTo(String value) {
            addCriterion("pername <=", value, "pername");
            return (Criteria) this;
        }

        public Criteria andPernameLike(String value) {
            addCriterion("pername like", value, "pername");
            return (Criteria) this;
        }

        public Criteria andPernameNotLike(String value) {
            addCriterion("pername not like", value, "pername");
            return (Criteria) this;
        }

        public Criteria andPernameIn(List<String> values) {
            addCriterion("pername in", values, "pername");
            return (Criteria) this;
        }

        public Criteria andPernameNotIn(List<String> values) {
            addCriterion("pername not in", values, "pername");
            return (Criteria) this;
        }

        public Criteria andPernameBetween(String value1, String value2) {
            addCriterion("pername between", value1, value2, "pername");
            return (Criteria) this;
        }

        public Criteria andPernameNotBetween(String value1, String value2) {
            addCriterion("pername not between", value1, value2, "pername");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andPercodeIsNull() {
            addCriterion("percode is null");
            return (Criteria) this;
        }

        public Criteria andPercodeIsNotNull() {
            addCriterion("percode is not null");
            return (Criteria) this;
        }

        public Criteria andPercodeEqualTo(String value) {
            addCriterion("percode =", value, "percode");
            return (Criteria) this;
        }

        public Criteria andPercodeNotEqualTo(String value) {
            addCriterion("percode <>", value, "percode");
            return (Criteria) this;
        }

        public Criteria andPercodeGreaterThan(String value) {
            addCriterion("percode >", value, "percode");
            return (Criteria) this;
        }

        public Criteria andPercodeGreaterThanOrEqualTo(String value) {
            addCriterion("percode >=", value, "percode");
            return (Criteria) this;
        }

        public Criteria andPercodeLessThan(String value) {
            addCriterion("percode <", value, "percode");
            return (Criteria) this;
        }

        public Criteria andPercodeLessThanOrEqualTo(String value) {
            addCriterion("percode <=", value, "percode");
            return (Criteria) this;
        }

        public Criteria andPercodeLike(String value) {
            addCriterion("percode like", value, "percode");
            return (Criteria) this;
        }

        public Criteria andPercodeNotLike(String value) {
            addCriterion("percode not like", value, "percode");
            return (Criteria) this;
        }

        public Criteria andPercodeIn(List<String> values) {
            addCriterion("percode in", values, "percode");
            return (Criteria) this;
        }

        public Criteria andPercodeNotIn(List<String> values) {
            addCriterion("percode not in", values, "percode");
            return (Criteria) this;
        }

        public Criteria andPercodeBetween(String value1, String value2) {
            addCriterion("percode between", value1, value2, "percode");
            return (Criteria) this;
        }

        public Criteria andPercodeNotBetween(String value1, String value2) {
            addCriterion("percode not between", value1, value2, "percode");
            return (Criteria) this;
        }

        public Criteria andAvailableIsNull() {
            addCriterion("available is null");
            return (Criteria) this;
        }

        public Criteria andAvailableIsNotNull() {
            addCriterion("available is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableEqualTo(String value) {
            addCriterion("available =", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableNotEqualTo(String value) {
            addCriterion("available <>", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableGreaterThan(String value) {
            addCriterion("available >", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableGreaterThanOrEqualTo(String value) {
            addCriterion("available >=", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableLessThan(String value) {
            addCriterion("available <", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableLessThanOrEqualTo(String value) {
            addCriterion("available <=", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableLike(String value) {
            addCriterion("available like", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableNotLike(String value) {
            addCriterion("available not like", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableIn(List<String> values) {
            addCriterion("available in", values, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableNotIn(List<String> values) {
            addCriterion("available not in", values, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableBetween(String value1, String value2) {
            addCriterion("available between", value1, value2, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableNotBetween(String value1, String value2) {
            addCriterion("available not between", value1, value2, "available");
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