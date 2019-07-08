package com.iot.demo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TMallValueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMallValueExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andShxzhIsNull() {
            addCriterion("shxzh is null");
            return (Criteria) this;
        }

        public Criteria andShxzhIsNotNull() {
            addCriterion("shxzh is not null");
            return (Criteria) this;
        }

        public Criteria andShxzhEqualTo(String value) {
            addCriterion("shxzh =", value, "shxzh");
            return (Criteria) this;
        }

        public Criteria andShxzhNotEqualTo(String value) {
            addCriterion("shxzh <>", value, "shxzh");
            return (Criteria) this;
        }

        public Criteria andShxzhGreaterThan(String value) {
            addCriterion("shxzh >", value, "shxzh");
            return (Criteria) this;
        }

        public Criteria andShxzhGreaterThanOrEqualTo(String value) {
            addCriterion("shxzh >=", value, "shxzh");
            return (Criteria) this;
        }

        public Criteria andShxzhLessThan(String value) {
            addCriterion("shxzh <", value, "shxzh");
            return (Criteria) this;
        }

        public Criteria andShxzhLessThanOrEqualTo(String value) {
            addCriterion("shxzh <=", value, "shxzh");
            return (Criteria) this;
        }

        public Criteria andShxzhLike(String value) {
            addCriterion("shxzh like", value, "shxzh");
            return (Criteria) this;
        }

        public Criteria andShxzhNotLike(String value) {
            addCriterion("shxzh not like", value, "shxzh");
            return (Criteria) this;
        }

        public Criteria andShxzhIn(List<String> values) {
            addCriterion("shxzh in", values, "shxzh");
            return (Criteria) this;
        }

        public Criteria andShxzhNotIn(List<String> values) {
            addCriterion("shxzh not in", values, "shxzh");
            return (Criteria) this;
        }

        public Criteria andShxzhBetween(String value1, String value2) {
            addCriterion("shxzh between", value1, value2, "shxzh");
            return (Criteria) this;
        }

        public Criteria andShxzhNotBetween(String value1, String value2) {
            addCriterion("shxzh not between", value1, value2, "shxzh");
            return (Criteria) this;
        }

        public Criteria andShfqyIsNull() {
            addCriterion("shfqy is null");
            return (Criteria) this;
        }

        public Criteria andShfqyIsNotNull() {
            addCriterion("shfqy is not null");
            return (Criteria) this;
        }

        public Criteria andShfqyEqualTo(String value) {
            addCriterion("shfqy =", value, "shfqy");
            return (Criteria) this;
        }

        public Criteria andShfqyNotEqualTo(String value) {
            addCriterion("shfqy <>", value, "shfqy");
            return (Criteria) this;
        }

        public Criteria andShfqyGreaterThan(String value) {
            addCriterion("shfqy >", value, "shfqy");
            return (Criteria) this;
        }

        public Criteria andShfqyGreaterThanOrEqualTo(String value) {
            addCriterion("shfqy >=", value, "shfqy");
            return (Criteria) this;
        }

        public Criteria andShfqyLessThan(String value) {
            addCriterion("shfqy <", value, "shfqy");
            return (Criteria) this;
        }

        public Criteria andShfqyLessThanOrEqualTo(String value) {
            addCriterion("shfqy <=", value, "shfqy");
            return (Criteria) this;
        }

        public Criteria andShfqyLike(String value) {
            addCriterion("shfqy like", value, "shfqy");
            return (Criteria) this;
        }

        public Criteria andShfqyNotLike(String value) {
            addCriterion("shfqy not like", value, "shfqy");
            return (Criteria) this;
        }

        public Criteria andShfqyIn(List<String> values) {
            addCriterion("shfqy in", values, "shfqy");
            return (Criteria) this;
        }

        public Criteria andShfqyNotIn(List<String> values) {
            addCriterion("shfqy not in", values, "shfqy");
            return (Criteria) this;
        }

        public Criteria andShfqyBetween(String value1, String value2) {
            addCriterion("shfqy between", value1, value2, "shfqy");
            return (Criteria) this;
        }

        public Criteria andShfqyNotBetween(String value1, String value2) {
            addCriterion("shfqy not between", value1, value2, "shfqy");
            return (Criteria) this;
        }

        public Criteria andShxmIdIsNull() {
            addCriterion("shxm_id is null");
            return (Criteria) this;
        }

        public Criteria andShxmIdIsNotNull() {
            addCriterion("shxm_id is not null");
            return (Criteria) this;
        }

        public Criteria andShxmIdEqualTo(Integer value) {
            addCriterion("shxm_id =", value, "shxmId");
            return (Criteria) this;
        }

        public Criteria andShxmIdNotEqualTo(Integer value) {
            addCriterion("shxm_id <>", value, "shxmId");
            return (Criteria) this;
        }

        public Criteria andShxmIdGreaterThan(Integer value) {
            addCriterion("shxm_id >", value, "shxmId");
            return (Criteria) this;
        }

        public Criteria andShxmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shxm_id >=", value, "shxmId");
            return (Criteria) this;
        }

        public Criteria andShxmIdLessThan(Integer value) {
            addCriterion("shxm_id <", value, "shxmId");
            return (Criteria) this;
        }

        public Criteria andShxmIdLessThanOrEqualTo(Integer value) {
            addCriterion("shxm_id <=", value, "shxmId");
            return (Criteria) this;
        }

        public Criteria andShxmIdIn(List<Integer> values) {
            addCriterion("shxm_id in", values, "shxmId");
            return (Criteria) this;
        }

        public Criteria andShxmIdNotIn(List<Integer> values) {
            addCriterion("shxm_id not in", values, "shxmId");
            return (Criteria) this;
        }

        public Criteria andShxmIdBetween(Integer value1, Integer value2) {
            addCriterion("shxm_id between", value1, value2, "shxmId");
            return (Criteria) this;
        }

        public Criteria andShxmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shxm_id not between", value1, value2, "shxmId");
            return (Criteria) this;
        }

        public Criteria andShxzhMchIsNull() {
            addCriterion("shxzh_mch is null");
            return (Criteria) this;
        }

        public Criteria andShxzhMchIsNotNull() {
            addCriterion("shxzh_mch is not null");
            return (Criteria) this;
        }

        public Criteria andShxzhMchEqualTo(String value) {
            addCriterion("shxzh_mch =", value, "shxzhMch");
            return (Criteria) this;
        }

        public Criteria andShxzhMchNotEqualTo(String value) {
            addCriterion("shxzh_mch <>", value, "shxzhMch");
            return (Criteria) this;
        }

        public Criteria andShxzhMchGreaterThan(String value) {
            addCriterion("shxzh_mch >", value, "shxzhMch");
            return (Criteria) this;
        }

        public Criteria andShxzhMchGreaterThanOrEqualTo(String value) {
            addCriterion("shxzh_mch >=", value, "shxzhMch");
            return (Criteria) this;
        }

        public Criteria andShxzhMchLessThan(String value) {
            addCriterion("shxzh_mch <", value, "shxzhMch");
            return (Criteria) this;
        }

        public Criteria andShxzhMchLessThanOrEqualTo(String value) {
            addCriterion("shxzh_mch <=", value, "shxzhMch");
            return (Criteria) this;
        }

        public Criteria andShxzhMchLike(String value) {
            addCriterion("shxzh_mch like", value, "shxzhMch");
            return (Criteria) this;
        }

        public Criteria andShxzhMchNotLike(String value) {
            addCriterion("shxzh_mch not like", value, "shxzhMch");
            return (Criteria) this;
        }

        public Criteria andShxzhMchIn(List<String> values) {
            addCriterion("shxzh_mch in", values, "shxzhMch");
            return (Criteria) this;
        }

        public Criteria andShxzhMchNotIn(List<String> values) {
            addCriterion("shxzh_mch not in", values, "shxzhMch");
            return (Criteria) this;
        }

        public Criteria andShxzhMchBetween(String value1, String value2) {
            addCriterion("shxzh_mch between", value1, value2, "shxzhMch");
            return (Criteria) this;
        }

        public Criteria andShxzhMchNotBetween(String value1, String value2) {
            addCriterion("shxzh_mch not between", value1, value2, "shxzhMch");
            return (Criteria) this;
        }

        public Criteria andChjshjIsNull() {
            addCriterion("chjshj is null");
            return (Criteria) this;
        }

        public Criteria andChjshjIsNotNull() {
            addCriterion("chjshj is not null");
            return (Criteria) this;
        }

        public Criteria andChjshjEqualTo(Date value) {
            addCriterion("chjshj =", value, "chjshj");
            return (Criteria) this;
        }

        public Criteria andChjshjNotEqualTo(Date value) {
            addCriterion("chjshj <>", value, "chjshj");
            return (Criteria) this;
        }

        public Criteria andChjshjGreaterThan(Date value) {
            addCriterion("chjshj >", value, "chjshj");
            return (Criteria) this;
        }

        public Criteria andChjshjGreaterThanOrEqualTo(Date value) {
            addCriterion("chjshj >=", value, "chjshj");
            return (Criteria) this;
        }

        public Criteria andChjshjLessThan(Date value) {
            addCriterion("chjshj <", value, "chjshj");
            return (Criteria) this;
        }

        public Criteria andChjshjLessThanOrEqualTo(Date value) {
            addCriterion("chjshj <=", value, "chjshj");
            return (Criteria) this;
        }

        public Criteria andChjshjIn(List<Date> values) {
            addCriterion("chjshj in", values, "chjshj");
            return (Criteria) this;
        }

        public Criteria andChjshjNotIn(List<Date> values) {
            addCriterion("chjshj not in", values, "chjshj");
            return (Criteria) this;
        }

        public Criteria andChjshjBetween(Date value1, Date value2) {
            addCriterion("chjshj between", value1, value2, "chjshj");
            return (Criteria) this;
        }

        public Criteria andChjshjNotBetween(Date value1, Date value2) {
            addCriterion("chjshj not between", value1, value2, "chjshj");
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