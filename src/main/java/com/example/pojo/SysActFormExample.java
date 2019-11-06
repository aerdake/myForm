package com.example.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysActFormExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysActFormExample() {
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

        public Criteria andActFormIdIsNull() {
            addCriterion("act_form_id is null");
            return (Criteria) this;
        }

        public Criteria andActFormIdIsNotNull() {
            addCriterion("act_form_id is not null");
            return (Criteria) this;
        }

        public Criteria andActFormIdEqualTo(Long value) {
            addCriterion("act_form_id =", value, "actFormId");
            return (Criteria) this;
        }

        public Criteria andActFormIdNotEqualTo(Long value) {
            addCriterion("act_form_id <>", value, "actFormId");
            return (Criteria) this;
        }

        public Criteria andActFormIdGreaterThan(Long value) {
            addCriterion("act_form_id >", value, "actFormId");
            return (Criteria) this;
        }

        public Criteria andActFormIdGreaterThanOrEqualTo(Long value) {
            addCriterion("act_form_id >=", value, "actFormId");
            return (Criteria) this;
        }

        public Criteria andActFormIdLessThan(Long value) {
            addCriterion("act_form_id <", value, "actFormId");
            return (Criteria) this;
        }

        public Criteria andActFormIdLessThanOrEqualTo(Long value) {
            addCriterion("act_form_id <=", value, "actFormId");
            return (Criteria) this;
        }

        public Criteria andActFormIdIn(List<Long> values) {
            addCriterion("act_form_id in", values, "actFormId");
            return (Criteria) this;
        }

        public Criteria andActFormIdNotIn(List<Long> values) {
            addCriterion("act_form_id not in", values, "actFormId");
            return (Criteria) this;
        }

        public Criteria andActFormIdBetween(Long value1, Long value2) {
            addCriterion("act_form_id between", value1, value2, "actFormId");
            return (Criteria) this;
        }

        public Criteria andActFormIdNotBetween(Long value1, Long value2) {
            addCriterion("act_form_id not between", value1, value2, "actFormId");
            return (Criteria) this;
        }

        public Criteria andActIdIsNull() {
            addCriterion("act_id is null");
            return (Criteria) this;
        }

        public Criteria andActIdIsNotNull() {
            addCriterion("act_id is not null");
            return (Criteria) this;
        }

        public Criteria andActIdEqualTo(Long value) {
            addCriterion("act_id =", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotEqualTo(Long value) {
            addCriterion("act_id <>", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdGreaterThan(Long value) {
            addCriterion("act_id >", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdGreaterThanOrEqualTo(Long value) {
            addCriterion("act_id >=", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdLessThan(Long value) {
            addCriterion("act_id <", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdLessThanOrEqualTo(Long value) {
            addCriterion("act_id <=", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdIn(List<Long> values) {
            addCriterion("act_id in", values, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotIn(List<Long> values) {
            addCriterion("act_id not in", values, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdBetween(Long value1, Long value2) {
            addCriterion("act_id between", value1, value2, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotBetween(Long value1, Long value2) {
            addCriterion("act_id not between", value1, value2, "actId");
            return (Criteria) this;
        }

        public Criteria andFieldIdIsNull() {
            addCriterion("field_id is null");
            return (Criteria) this;
        }

        public Criteria andFieldIdIsNotNull() {
            addCriterion("field_id is not null");
            return (Criteria) this;
        }

        public Criteria andFieldIdEqualTo(String value) {
            addCriterion("field_id =", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdNotEqualTo(String value) {
            addCriterion("field_id <>", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdGreaterThan(String value) {
            addCriterion("field_id >", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdGreaterThanOrEqualTo(String value) {
            addCriterion("field_id >=", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdLessThan(String value) {
            addCriterion("field_id <", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdLessThanOrEqualTo(String value) {
            addCriterion("field_id <=", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdLike(String value) {
            addCriterion("field_id like", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdNotLike(String value) {
            addCriterion("field_id not like", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdIn(List<String> values) {
            addCriterion("field_id in", values, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdNotIn(List<String> values) {
            addCriterion("field_id not in", values, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdBetween(String value1, String value2) {
            addCriterion("field_id between", value1, value2, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdNotBetween(String value1, String value2) {
            addCriterion("field_id not between", value1, value2, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldClassIsNull() {
            addCriterion("field_class is null");
            return (Criteria) this;
        }

        public Criteria andFieldClassIsNotNull() {
            addCriterion("field_class is not null");
            return (Criteria) this;
        }

        public Criteria andFieldClassEqualTo(String value) {
            addCriterion("field_class =", value, "fieldClass");
            return (Criteria) this;
        }

        public Criteria andFieldClassNotEqualTo(String value) {
            addCriterion("field_class <>", value, "fieldClass");
            return (Criteria) this;
        }

        public Criteria andFieldClassGreaterThan(String value) {
            addCriterion("field_class >", value, "fieldClass");
            return (Criteria) this;
        }

        public Criteria andFieldClassGreaterThanOrEqualTo(String value) {
            addCriterion("field_class >=", value, "fieldClass");
            return (Criteria) this;
        }

        public Criteria andFieldClassLessThan(String value) {
            addCriterion("field_class <", value, "fieldClass");
            return (Criteria) this;
        }

        public Criteria andFieldClassLessThanOrEqualTo(String value) {
            addCriterion("field_class <=", value, "fieldClass");
            return (Criteria) this;
        }

        public Criteria andFieldClassLike(String value) {
            addCriterion("field_class like", value, "fieldClass");
            return (Criteria) this;
        }

        public Criteria andFieldClassNotLike(String value) {
            addCriterion("field_class not like", value, "fieldClass");
            return (Criteria) this;
        }

        public Criteria andFieldClassIn(List<String> values) {
            addCriterion("field_class in", values, "fieldClass");
            return (Criteria) this;
        }

        public Criteria andFieldClassNotIn(List<String> values) {
            addCriterion("field_class not in", values, "fieldClass");
            return (Criteria) this;
        }

        public Criteria andFieldClassBetween(String value1, String value2) {
            addCriterion("field_class between", value1, value2, "fieldClass");
            return (Criteria) this;
        }

        public Criteria andFieldClassNotBetween(String value1, String value2) {
            addCriterion("field_class not between", value1, value2, "fieldClass");
            return (Criteria) this;
        }

        public Criteria andFieldDatakeyIsNull() {
            addCriterion("field_datakey is null");
            return (Criteria) this;
        }

        public Criteria andFieldDatakeyIsNotNull() {
            addCriterion("field_datakey is not null");
            return (Criteria) this;
        }

        public Criteria andFieldDatakeyEqualTo(String value) {
            addCriterion("field_datakey =", value, "fieldDatakey");
            return (Criteria) this;
        }

        public Criteria andFieldDatakeyNotEqualTo(String value) {
            addCriterion("field_datakey <>", value, "fieldDatakey");
            return (Criteria) this;
        }

        public Criteria andFieldDatakeyGreaterThan(String value) {
            addCriterion("field_datakey >", value, "fieldDatakey");
            return (Criteria) this;
        }

        public Criteria andFieldDatakeyGreaterThanOrEqualTo(String value) {
            addCriterion("field_datakey >=", value, "fieldDatakey");
            return (Criteria) this;
        }

        public Criteria andFieldDatakeyLessThan(String value) {
            addCriterion("field_datakey <", value, "fieldDatakey");
            return (Criteria) this;
        }

        public Criteria andFieldDatakeyLessThanOrEqualTo(String value) {
            addCriterion("field_datakey <=", value, "fieldDatakey");
            return (Criteria) this;
        }

        public Criteria andFieldDatakeyLike(String value) {
            addCriterion("field_datakey like", value, "fieldDatakey");
            return (Criteria) this;
        }

        public Criteria andFieldDatakeyNotLike(String value) {
            addCriterion("field_datakey not like", value, "fieldDatakey");
            return (Criteria) this;
        }

        public Criteria andFieldDatakeyIn(List<String> values) {
            addCriterion("field_datakey in", values, "fieldDatakey");
            return (Criteria) this;
        }

        public Criteria andFieldDatakeyNotIn(List<String> values) {
            addCriterion("field_datakey not in", values, "fieldDatakey");
            return (Criteria) this;
        }

        public Criteria andFieldDatakeyBetween(String value1, String value2) {
            addCriterion("field_datakey between", value1, value2, "fieldDatakey");
            return (Criteria) this;
        }

        public Criteria andFieldDatakeyNotBetween(String value1, String value2) {
            addCriterion("field_datakey not between", value1, value2, "fieldDatakey");
            return (Criteria) this;
        }

        public Criteria andFieldFilterIsNull() {
            addCriterion("field_filter is null");
            return (Criteria) this;
        }

        public Criteria andFieldFilterIsNotNull() {
            addCriterion("field_filter is not null");
            return (Criteria) this;
        }

        public Criteria andFieldFilterEqualTo(String value) {
            addCriterion("field_filter =", value, "fieldFilter");
            return (Criteria) this;
        }

        public Criteria andFieldFilterNotEqualTo(String value) {
            addCriterion("field_filter <>", value, "fieldFilter");
            return (Criteria) this;
        }

        public Criteria andFieldFilterGreaterThan(String value) {
            addCriterion("field_filter >", value, "fieldFilter");
            return (Criteria) this;
        }

        public Criteria andFieldFilterGreaterThanOrEqualTo(String value) {
            addCriterion("field_filter >=", value, "fieldFilter");
            return (Criteria) this;
        }

        public Criteria andFieldFilterLessThan(String value) {
            addCriterion("field_filter <", value, "fieldFilter");
            return (Criteria) this;
        }

        public Criteria andFieldFilterLessThanOrEqualTo(String value) {
            addCriterion("field_filter <=", value, "fieldFilter");
            return (Criteria) this;
        }

        public Criteria andFieldFilterLike(String value) {
            addCriterion("field_filter like", value, "fieldFilter");
            return (Criteria) this;
        }

        public Criteria andFieldFilterNotLike(String value) {
            addCriterion("field_filter not like", value, "fieldFilter");
            return (Criteria) this;
        }

        public Criteria andFieldFilterIn(List<String> values) {
            addCriterion("field_filter in", values, "fieldFilter");
            return (Criteria) this;
        }

        public Criteria andFieldFilterNotIn(List<String> values) {
            addCriterion("field_filter not in", values, "fieldFilter");
            return (Criteria) this;
        }

        public Criteria andFieldFilterBetween(String value1, String value2) {
            addCriterion("field_filter between", value1, value2, "fieldFilter");
            return (Criteria) this;
        }

        public Criteria andFieldFilterNotBetween(String value1, String value2) {
            addCriterion("field_filter not between", value1, value2, "fieldFilter");
            return (Criteria) this;
        }

        public Criteria andFieldLabelIsNull() {
            addCriterion("field_label is null");
            return (Criteria) this;
        }

        public Criteria andFieldLabelIsNotNull() {
            addCriterion("field_label is not null");
            return (Criteria) this;
        }

        public Criteria andFieldLabelEqualTo(String value) {
            addCriterion("field_label =", value, "fieldLabel");
            return (Criteria) this;
        }

        public Criteria andFieldLabelNotEqualTo(String value) {
            addCriterion("field_label <>", value, "fieldLabel");
            return (Criteria) this;
        }

        public Criteria andFieldLabelGreaterThan(String value) {
            addCriterion("field_label >", value, "fieldLabel");
            return (Criteria) this;
        }

        public Criteria andFieldLabelGreaterThanOrEqualTo(String value) {
            addCriterion("field_label >=", value, "fieldLabel");
            return (Criteria) this;
        }

        public Criteria andFieldLabelLessThan(String value) {
            addCriterion("field_label <", value, "fieldLabel");
            return (Criteria) this;
        }

        public Criteria andFieldLabelLessThanOrEqualTo(String value) {
            addCriterion("field_label <=", value, "fieldLabel");
            return (Criteria) this;
        }

        public Criteria andFieldLabelLike(String value) {
            addCriterion("field_label like", value, "fieldLabel");
            return (Criteria) this;
        }

        public Criteria andFieldLabelNotLike(String value) {
            addCriterion("field_label not like", value, "fieldLabel");
            return (Criteria) this;
        }

        public Criteria andFieldLabelIn(List<String> values) {
            addCriterion("field_label in", values, "fieldLabel");
            return (Criteria) this;
        }

        public Criteria andFieldLabelNotIn(List<String> values) {
            addCriterion("field_label not in", values, "fieldLabel");
            return (Criteria) this;
        }

        public Criteria andFieldLabelBetween(String value1, String value2) {
            addCriterion("field_label between", value1, value2, "fieldLabel");
            return (Criteria) this;
        }

        public Criteria andFieldLabelNotBetween(String value1, String value2) {
            addCriterion("field_label not between", value1, value2, "fieldLabel");
            return (Criteria) this;
        }

        public Criteria andFieldTagIsNull() {
            addCriterion("field_tag is null");
            return (Criteria) this;
        }

        public Criteria andFieldTagIsNotNull() {
            addCriterion("field_tag is not null");
            return (Criteria) this;
        }

        public Criteria andFieldTagEqualTo(String value) {
            addCriterion("field_tag =", value, "fieldTag");
            return (Criteria) this;
        }

        public Criteria andFieldTagNotEqualTo(String value) {
            addCriterion("field_tag <>", value, "fieldTag");
            return (Criteria) this;
        }

        public Criteria andFieldTagGreaterThan(String value) {
            addCriterion("field_tag >", value, "fieldTag");
            return (Criteria) this;
        }

        public Criteria andFieldTagGreaterThanOrEqualTo(String value) {
            addCriterion("field_tag >=", value, "fieldTag");
            return (Criteria) this;
        }

        public Criteria andFieldTagLessThan(String value) {
            addCriterion("field_tag <", value, "fieldTag");
            return (Criteria) this;
        }

        public Criteria andFieldTagLessThanOrEqualTo(String value) {
            addCriterion("field_tag <=", value, "fieldTag");
            return (Criteria) this;
        }

        public Criteria andFieldTagLike(String value) {
            addCriterion("field_tag like", value, "fieldTag");
            return (Criteria) this;
        }

        public Criteria andFieldTagNotLike(String value) {
            addCriterion("field_tag not like", value, "fieldTag");
            return (Criteria) this;
        }

        public Criteria andFieldTagIn(List<String> values) {
            addCriterion("field_tag in", values, "fieldTag");
            return (Criteria) this;
        }

        public Criteria andFieldTagNotIn(List<String> values) {
            addCriterion("field_tag not in", values, "fieldTag");
            return (Criteria) this;
        }

        public Criteria andFieldTagBetween(String value1, String value2) {
            addCriterion("field_tag between", value1, value2, "fieldTag");
            return (Criteria) this;
        }

        public Criteria andFieldTagNotBetween(String value1, String value2) {
            addCriterion("field_tag not between", value1, value2, "fieldTag");
            return (Criteria) this;
        }

        public Criteria andFieldTypeIsNull() {
            addCriterion("field_type is null");
            return (Criteria) this;
        }

        public Criteria andFieldTypeIsNotNull() {
            addCriterion("field_type is not null");
            return (Criteria) this;
        }

        public Criteria andFieldTypeEqualTo(String value) {
            addCriterion("field_type =", value, "fieldType");
            return (Criteria) this;
        }

        public Criteria andFieldTypeNotEqualTo(String value) {
            addCriterion("field_type <>", value, "fieldType");
            return (Criteria) this;
        }

        public Criteria andFieldTypeGreaterThan(String value) {
            addCriterion("field_type >", value, "fieldType");
            return (Criteria) this;
        }

        public Criteria andFieldTypeGreaterThanOrEqualTo(String value) {
            addCriterion("field_type >=", value, "fieldType");
            return (Criteria) this;
        }

        public Criteria andFieldTypeLessThan(String value) {
            addCriterion("field_type <", value, "fieldType");
            return (Criteria) this;
        }

        public Criteria andFieldTypeLessThanOrEqualTo(String value) {
            addCriterion("field_type <=", value, "fieldType");
            return (Criteria) this;
        }

        public Criteria andFieldTypeLike(String value) {
            addCriterion("field_type like", value, "fieldType");
            return (Criteria) this;
        }

        public Criteria andFieldTypeNotLike(String value) {
            addCriterion("field_type not like", value, "fieldType");
            return (Criteria) this;
        }

        public Criteria andFieldTypeIn(List<String> values) {
            addCriterion("field_type in", values, "fieldType");
            return (Criteria) this;
        }

        public Criteria andFieldTypeNotIn(List<String> values) {
            addCriterion("field_type not in", values, "fieldType");
            return (Criteria) this;
        }

        public Criteria andFieldTypeBetween(String value1, String value2) {
            addCriterion("field_type between", value1, value2, "fieldType");
            return (Criteria) this;
        }

        public Criteria andFieldTypeNotBetween(String value1, String value2) {
            addCriterion("field_type not between", value1, value2, "fieldType");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNull() {
            addCriterion("data_type is null");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNotNull() {
            addCriterion("data_type is not null");
            return (Criteria) this;
        }

        public Criteria andDataTypeEqualTo(String value) {
            addCriterion("data_type =", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotEqualTo(String value) {
            addCriterion("data_type <>", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThan(String value) {
            addCriterion("data_type >", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("data_type >=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThan(String value) {
            addCriterion("data_type <", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThanOrEqualTo(String value) {
            addCriterion("data_type <=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLike(String value) {
            addCriterion("data_type like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotLike(String value) {
            addCriterion("data_type not like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeIn(List<String> values) {
            addCriterion("data_type in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotIn(List<String> values) {
            addCriterion("data_type not in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeBetween(String value1, String value2) {
            addCriterion("data_type between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotBetween(String value1, String value2) {
            addCriterion("data_type not between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andFieldPlaceholderIsNull() {
            addCriterion("field_placeholder is null");
            return (Criteria) this;
        }

        public Criteria andFieldPlaceholderIsNotNull() {
            addCriterion("field_placeholder is not null");
            return (Criteria) this;
        }

        public Criteria andFieldPlaceholderEqualTo(String value) {
            addCriterion("field_placeholder =", value, "fieldPlaceholder");
            return (Criteria) this;
        }

        public Criteria andFieldPlaceholderNotEqualTo(String value) {
            addCriterion("field_placeholder <>", value, "fieldPlaceholder");
            return (Criteria) this;
        }

        public Criteria andFieldPlaceholderGreaterThan(String value) {
            addCriterion("field_placeholder >", value, "fieldPlaceholder");
            return (Criteria) this;
        }

        public Criteria andFieldPlaceholderGreaterThanOrEqualTo(String value) {
            addCriterion("field_placeholder >=", value, "fieldPlaceholder");
            return (Criteria) this;
        }

        public Criteria andFieldPlaceholderLessThan(String value) {
            addCriterion("field_placeholder <", value, "fieldPlaceholder");
            return (Criteria) this;
        }

        public Criteria andFieldPlaceholderLessThanOrEqualTo(String value) {
            addCriterion("field_placeholder <=", value, "fieldPlaceholder");
            return (Criteria) this;
        }

        public Criteria andFieldPlaceholderLike(String value) {
            addCriterion("field_placeholder like", value, "fieldPlaceholder");
            return (Criteria) this;
        }

        public Criteria andFieldPlaceholderNotLike(String value) {
            addCriterion("field_placeholder not like", value, "fieldPlaceholder");
            return (Criteria) this;
        }

        public Criteria andFieldPlaceholderIn(List<String> values) {
            addCriterion("field_placeholder in", values, "fieldPlaceholder");
            return (Criteria) this;
        }

        public Criteria andFieldPlaceholderNotIn(List<String> values) {
            addCriterion("field_placeholder not in", values, "fieldPlaceholder");
            return (Criteria) this;
        }

        public Criteria andFieldPlaceholderBetween(String value1, String value2) {
            addCriterion("field_placeholder between", value1, value2, "fieldPlaceholder");
            return (Criteria) this;
        }

        public Criteria andFieldPlaceholderNotBetween(String value1, String value2) {
            addCriterion("field_placeholder not between", value1, value2, "fieldPlaceholder");
            return (Criteria) this;
        }

        public Criteria andFieldLengthIsNull() {
            addCriterion("field_length is null");
            return (Criteria) this;
        }

        public Criteria andFieldLengthIsNotNull() {
            addCriterion("field_length is not null");
            return (Criteria) this;
        }

        public Criteria andFieldLengthEqualTo(Integer value) {
            addCriterion("field_length =", value, "fieldLength");
            return (Criteria) this;
        }

        public Criteria andFieldLengthNotEqualTo(Integer value) {
            addCriterion("field_length <>", value, "fieldLength");
            return (Criteria) this;
        }

        public Criteria andFieldLengthGreaterThan(Integer value) {
            addCriterion("field_length >", value, "fieldLength");
            return (Criteria) this;
        }

        public Criteria andFieldLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("field_length >=", value, "fieldLength");
            return (Criteria) this;
        }

        public Criteria andFieldLengthLessThan(Integer value) {
            addCriterion("field_length <", value, "fieldLength");
            return (Criteria) this;
        }

        public Criteria andFieldLengthLessThanOrEqualTo(Integer value) {
            addCriterion("field_length <=", value, "fieldLength");
            return (Criteria) this;
        }

        public Criteria andFieldLengthIn(List<Integer> values) {
            addCriterion("field_length in", values, "fieldLength");
            return (Criteria) this;
        }

        public Criteria andFieldLengthNotIn(List<Integer> values) {
            addCriterion("field_length not in", values, "fieldLength");
            return (Criteria) this;
        }

        public Criteria andFieldLengthBetween(Integer value1, Integer value2) {
            addCriterion("field_length between", value1, value2, "fieldLength");
            return (Criteria) this;
        }

        public Criteria andFieldLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("field_length not between", value1, value2, "fieldLength");
            return (Criteria) this;
        }

        public Criteria andIsHiddenIsNull() {
            addCriterion("is_hidden is null");
            return (Criteria) this;
        }

        public Criteria andIsHiddenIsNotNull() {
            addCriterion("is_hidden is not null");
            return (Criteria) this;
        }

        public Criteria andIsHiddenEqualTo(String value) {
            addCriterion("is_hidden =", value, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenNotEqualTo(String value) {
            addCriterion("is_hidden <>", value, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenGreaterThan(String value) {
            addCriterion("is_hidden >", value, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenGreaterThanOrEqualTo(String value) {
            addCriterion("is_hidden >=", value, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenLessThan(String value) {
            addCriterion("is_hidden <", value, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenLessThanOrEqualTo(String value) {
            addCriterion("is_hidden <=", value, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenLike(String value) {
            addCriterion("is_hidden like", value, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenNotLike(String value) {
            addCriterion("is_hidden not like", value, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenIn(List<String> values) {
            addCriterion("is_hidden in", values, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenNotIn(List<String> values) {
            addCriterion("is_hidden not in", values, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenBetween(String value1, String value2) {
            addCriterion("is_hidden between", value1, value2, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenNotBetween(String value1, String value2) {
            addCriterion("is_hidden not between", value1, value2, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsRequiredIsNull() {
            addCriterion("is_required is null");
            return (Criteria) this;
        }

        public Criteria andIsRequiredIsNotNull() {
            addCriterion("is_required is not null");
            return (Criteria) this;
        }

        public Criteria andIsRequiredEqualTo(String value) {
            addCriterion("is_required =", value, "isRequired");
            return (Criteria) this;
        }

        public Criteria andIsRequiredNotEqualTo(String value) {
            addCriterion("is_required <>", value, "isRequired");
            return (Criteria) this;
        }

        public Criteria andIsRequiredGreaterThan(String value) {
            addCriterion("is_required >", value, "isRequired");
            return (Criteria) this;
        }

        public Criteria andIsRequiredGreaterThanOrEqualTo(String value) {
            addCriterion("is_required >=", value, "isRequired");
            return (Criteria) this;
        }

        public Criteria andIsRequiredLessThan(String value) {
            addCriterion("is_required <", value, "isRequired");
            return (Criteria) this;
        }

        public Criteria andIsRequiredLessThanOrEqualTo(String value) {
            addCriterion("is_required <=", value, "isRequired");
            return (Criteria) this;
        }

        public Criteria andIsRequiredLike(String value) {
            addCriterion("is_required like", value, "isRequired");
            return (Criteria) this;
        }

        public Criteria andIsRequiredNotLike(String value) {
            addCriterion("is_required not like", value, "isRequired");
            return (Criteria) this;
        }

        public Criteria andIsRequiredIn(List<String> values) {
            addCriterion("is_required in", values, "isRequired");
            return (Criteria) this;
        }

        public Criteria andIsRequiredNotIn(List<String> values) {
            addCriterion("is_required not in", values, "isRequired");
            return (Criteria) this;
        }

        public Criteria andIsRequiredBetween(String value1, String value2) {
            addCriterion("is_required between", value1, value2, "isRequired");
            return (Criteria) this;
        }

        public Criteria andIsRequiredNotBetween(String value1, String value2) {
            addCriterion("is_required not between", value1, value2, "isRequired");
            return (Criteria) this;
        }

        public Criteria andValidateIsNull() {
            addCriterion("`validate` is null");
            return (Criteria) this;
        }

        public Criteria andValidateIsNotNull() {
            addCriterion("`validate` is not null");
            return (Criteria) this;
        }

        public Criteria andValidateEqualTo(String value) {
            addCriterion("`validate` =", value, "validate");
            return (Criteria) this;
        }

        public Criteria andValidateNotEqualTo(String value) {
            addCriterion("`validate` <>", value, "validate");
            return (Criteria) this;
        }

        public Criteria andValidateGreaterThan(String value) {
            addCriterion("`validate` >", value, "validate");
            return (Criteria) this;
        }

        public Criteria andValidateGreaterThanOrEqualTo(String value) {
            addCriterion("`validate` >=", value, "validate");
            return (Criteria) this;
        }

        public Criteria andValidateLessThan(String value) {
            addCriterion("`validate` <", value, "validate");
            return (Criteria) this;
        }

        public Criteria andValidateLessThanOrEqualTo(String value) {
            addCriterion("`validate` <=", value, "validate");
            return (Criteria) this;
        }

        public Criteria andValidateLike(String value) {
            addCriterion("`validate` like", value, "validate");
            return (Criteria) this;
        }

        public Criteria andValidateNotLike(String value) {
            addCriterion("`validate` not like", value, "validate");
            return (Criteria) this;
        }

        public Criteria andValidateIn(List<String> values) {
            addCriterion("`validate` in", values, "validate");
            return (Criteria) this;
        }

        public Criteria andValidateNotIn(List<String> values) {
            addCriterion("`validate` not in", values, "validate");
            return (Criteria) this;
        }

        public Criteria andValidateBetween(String value1, String value2) {
            addCriterion("`validate` between", value1, value2, "validate");
            return (Criteria) this;
        }

        public Criteria andValidateNotBetween(String value1, String value2) {
            addCriterion("`validate` not between", value1, value2, "validate");
            return (Criteria) this;
        }

        public Criteria andFieldStyleIsNull() {
            addCriterion("field_style is null");
            return (Criteria) this;
        }

        public Criteria andFieldStyleIsNotNull() {
            addCriterion("field_style is not null");
            return (Criteria) this;
        }

        public Criteria andFieldStyleEqualTo(String value) {
            addCriterion("field_style =", value, "fieldStyle");
            return (Criteria) this;
        }

        public Criteria andFieldStyleNotEqualTo(String value) {
            addCriterion("field_style <>", value, "fieldStyle");
            return (Criteria) this;
        }

        public Criteria andFieldStyleGreaterThan(String value) {
            addCriterion("field_style >", value, "fieldStyle");
            return (Criteria) this;
        }

        public Criteria andFieldStyleGreaterThanOrEqualTo(String value) {
            addCriterion("field_style >=", value, "fieldStyle");
            return (Criteria) this;
        }

        public Criteria andFieldStyleLessThan(String value) {
            addCriterion("field_style <", value, "fieldStyle");
            return (Criteria) this;
        }

        public Criteria andFieldStyleLessThanOrEqualTo(String value) {
            addCriterion("field_style <=", value, "fieldStyle");
            return (Criteria) this;
        }

        public Criteria andFieldStyleLike(String value) {
            addCriterion("field_style like", value, "fieldStyle");
            return (Criteria) this;
        }

        public Criteria andFieldStyleNotLike(String value) {
            addCriterion("field_style not like", value, "fieldStyle");
            return (Criteria) this;
        }

        public Criteria andFieldStyleIn(List<String> values) {
            addCriterion("field_style in", values, "fieldStyle");
            return (Criteria) this;
        }

        public Criteria andFieldStyleNotIn(List<String> values) {
            addCriterion("field_style not in", values, "fieldStyle");
            return (Criteria) this;
        }

        public Criteria andFieldStyleBetween(String value1, String value2) {
            addCriterion("field_style between", value1, value2, "fieldStyle");
            return (Criteria) this;
        }

        public Criteria andFieldStyleNotBetween(String value1, String value2) {
            addCriterion("field_style not between", value1, value2, "fieldStyle");
            return (Criteria) this;
        }

        public Criteria andFieldAttributeIsNull() {
            addCriterion("field_attribute is null");
            return (Criteria) this;
        }

        public Criteria andFieldAttributeIsNotNull() {
            addCriterion("field_attribute is not null");
            return (Criteria) this;
        }

        public Criteria andFieldAttributeEqualTo(String value) {
            addCriterion("field_attribute =", value, "fieldAttribute");
            return (Criteria) this;
        }

        public Criteria andFieldAttributeNotEqualTo(String value) {
            addCriterion("field_attribute <>", value, "fieldAttribute");
            return (Criteria) this;
        }

        public Criteria andFieldAttributeGreaterThan(String value) {
            addCriterion("field_attribute >", value, "fieldAttribute");
            return (Criteria) this;
        }

        public Criteria andFieldAttributeGreaterThanOrEqualTo(String value) {
            addCriterion("field_attribute >=", value, "fieldAttribute");
            return (Criteria) this;
        }

        public Criteria andFieldAttributeLessThan(String value) {
            addCriterion("field_attribute <", value, "fieldAttribute");
            return (Criteria) this;
        }

        public Criteria andFieldAttributeLessThanOrEqualTo(String value) {
            addCriterion("field_attribute <=", value, "fieldAttribute");
            return (Criteria) this;
        }

        public Criteria andFieldAttributeLike(String value) {
            addCriterion("field_attribute like", value, "fieldAttribute");
            return (Criteria) this;
        }

        public Criteria andFieldAttributeNotLike(String value) {
            addCriterion("field_attribute not like", value, "fieldAttribute");
            return (Criteria) this;
        }

        public Criteria andFieldAttributeIn(List<String> values) {
            addCriterion("field_attribute in", values, "fieldAttribute");
            return (Criteria) this;
        }

        public Criteria andFieldAttributeNotIn(List<String> values) {
            addCriterion("field_attribute not in", values, "fieldAttribute");
            return (Criteria) this;
        }

        public Criteria andFieldAttributeBetween(String value1, String value2) {
            addCriterion("field_attribute between", value1, value2, "fieldAttribute");
            return (Criteria) this;
        }

        public Criteria andFieldAttributeNotBetween(String value1, String value2) {
            addCriterion("field_attribute not between", value1, value2, "fieldAttribute");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("`status` like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("`status` not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRecycleIsNull() {
            addCriterion("recycle is null");
            return (Criteria) this;
        }

        public Criteria andRecycleIsNotNull() {
            addCriterion("recycle is not null");
            return (Criteria) this;
        }

        public Criteria andRecycleEqualTo(String value) {
            addCriterion("recycle =", value, "recycle");
            return (Criteria) this;
        }

        public Criteria andRecycleNotEqualTo(String value) {
            addCriterion("recycle <>", value, "recycle");
            return (Criteria) this;
        }

        public Criteria andRecycleGreaterThan(String value) {
            addCriterion("recycle >", value, "recycle");
            return (Criteria) this;
        }

        public Criteria andRecycleGreaterThanOrEqualTo(String value) {
            addCriterion("recycle >=", value, "recycle");
            return (Criteria) this;
        }

        public Criteria andRecycleLessThan(String value) {
            addCriterion("recycle <", value, "recycle");
            return (Criteria) this;
        }

        public Criteria andRecycleLessThanOrEqualTo(String value) {
            addCriterion("recycle <=", value, "recycle");
            return (Criteria) this;
        }

        public Criteria andRecycleLike(String value) {
            addCriterion("recycle like", value, "recycle");
            return (Criteria) this;
        }

        public Criteria andRecycleNotLike(String value) {
            addCriterion("recycle not like", value, "recycle");
            return (Criteria) this;
        }

        public Criteria andRecycleIn(List<String> values) {
            addCriterion("recycle in", values, "recycle");
            return (Criteria) this;
        }

        public Criteria andRecycleNotIn(List<String> values) {
            addCriterion("recycle not in", values, "recycle");
            return (Criteria) this;
        }

        public Criteria andRecycleBetween(String value1, String value2) {
            addCriterion("recycle between", value1, value2, "recycle");
            return (Criteria) this;
        }

        public Criteria andRecycleNotBetween(String value1, String value2) {
            addCriterion("recycle not between", value1, value2, "recycle");
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