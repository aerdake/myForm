package com.example.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysActExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysActExample() {
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

        public Criteria andActNameIsNull() {
            addCriterion("act_name is null");
            return (Criteria) this;
        }

        public Criteria andActNameIsNotNull() {
            addCriterion("act_name is not null");
            return (Criteria) this;
        }

        public Criteria andActNameEqualTo(String value) {
            addCriterion("act_name =", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameNotEqualTo(String value) {
            addCriterion("act_name <>", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameGreaterThan(String value) {
            addCriterion("act_name >", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameGreaterThanOrEqualTo(String value) {
            addCriterion("act_name >=", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameLessThan(String value) {
            addCriterion("act_name <", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameLessThanOrEqualTo(String value) {
            addCriterion("act_name <=", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameLike(String value) {
            addCriterion("act_name like", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameNotLike(String value) {
            addCriterion("act_name not like", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameIn(List<String> values) {
            addCriterion("act_name in", values, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameNotIn(List<String> values) {
            addCriterion("act_name not in", values, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameBetween(String value1, String value2) {
            addCriterion("act_name between", value1, value2, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameNotBetween(String value1, String value2) {
            addCriterion("act_name not between", value1, value2, "actName");
            return (Criteria) this;
        }

        public Criteria andDiscripeIsNull() {
            addCriterion("discripe is null");
            return (Criteria) this;
        }

        public Criteria andDiscripeIsNotNull() {
            addCriterion("discripe is not null");
            return (Criteria) this;
        }

        public Criteria andDiscripeEqualTo(String value) {
            addCriterion("discripe =", value, "discripe");
            return (Criteria) this;
        }

        public Criteria andDiscripeNotEqualTo(String value) {
            addCriterion("discripe <>", value, "discripe");
            return (Criteria) this;
        }

        public Criteria andDiscripeGreaterThan(String value) {
            addCriterion("discripe >", value, "discripe");
            return (Criteria) this;
        }

        public Criteria andDiscripeGreaterThanOrEqualTo(String value) {
            addCriterion("discripe >=", value, "discripe");
            return (Criteria) this;
        }

        public Criteria andDiscripeLessThan(String value) {
            addCriterion("discripe <", value, "discripe");
            return (Criteria) this;
        }

        public Criteria andDiscripeLessThanOrEqualTo(String value) {
            addCriterion("discripe <=", value, "discripe");
            return (Criteria) this;
        }

        public Criteria andDiscripeLike(String value) {
            addCriterion("discripe like", value, "discripe");
            return (Criteria) this;
        }

        public Criteria andDiscripeNotLike(String value) {
            addCriterion("discripe not like", value, "discripe");
            return (Criteria) this;
        }

        public Criteria andDiscripeIn(List<String> values) {
            addCriterion("discripe in", values, "discripe");
            return (Criteria) this;
        }

        public Criteria andDiscripeNotIn(List<String> values) {
            addCriterion("discripe not in", values, "discripe");
            return (Criteria) this;
        }

        public Criteria andDiscripeBetween(String value1, String value2) {
            addCriterion("discripe between", value1, value2, "discripe");
            return (Criteria) this;
        }

        public Criteria andDiscripeNotBetween(String value1, String value2) {
            addCriterion("discripe not between", value1, value2, "discripe");
            return (Criteria) this;
        }

        public Criteria andApplyUserRangeIsNull() {
            addCriterion("apply_user_range is null");
            return (Criteria) this;
        }

        public Criteria andApplyUserRangeIsNotNull() {
            addCriterion("apply_user_range is not null");
            return (Criteria) this;
        }

        public Criteria andApplyUserRangeEqualTo(String value) {
            addCriterion("apply_user_range =", value, "applyUserRange");
            return (Criteria) this;
        }

        public Criteria andApplyUserRangeNotEqualTo(String value) {
            addCriterion("apply_user_range <>", value, "applyUserRange");
            return (Criteria) this;
        }

        public Criteria andApplyUserRangeGreaterThan(String value) {
            addCriterion("apply_user_range >", value, "applyUserRange");
            return (Criteria) this;
        }

        public Criteria andApplyUserRangeGreaterThanOrEqualTo(String value) {
            addCriterion("apply_user_range >=", value, "applyUserRange");
            return (Criteria) this;
        }

        public Criteria andApplyUserRangeLessThan(String value) {
            addCriterion("apply_user_range <", value, "applyUserRange");
            return (Criteria) this;
        }

        public Criteria andApplyUserRangeLessThanOrEqualTo(String value) {
            addCriterion("apply_user_range <=", value, "applyUserRange");
            return (Criteria) this;
        }

        public Criteria andApplyUserRangeLike(String value) {
            addCriterion("apply_user_range like", value, "applyUserRange");
            return (Criteria) this;
        }

        public Criteria andApplyUserRangeNotLike(String value) {
            addCriterion("apply_user_range not like", value, "applyUserRange");
            return (Criteria) this;
        }

        public Criteria andApplyUserRangeIn(List<String> values) {
            addCriterion("apply_user_range in", values, "applyUserRange");
            return (Criteria) this;
        }

        public Criteria andApplyUserRangeNotIn(List<String> values) {
            addCriterion("apply_user_range not in", values, "applyUserRange");
            return (Criteria) this;
        }

        public Criteria andApplyUserRangeBetween(String value1, String value2) {
            addCriterion("apply_user_range between", value1, value2, "applyUserRange");
            return (Criteria) this;
        }

        public Criteria andApplyUserRangeNotBetween(String value1, String value2) {
            addCriterion("apply_user_range not between", value1, value2, "applyUserRange");
            return (Criteria) this;
        }

        public Criteria andOfficeIdsIsNull() {
            addCriterion("office_ids is null");
            return (Criteria) this;
        }

        public Criteria andOfficeIdsIsNotNull() {
            addCriterion("office_ids is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeIdsEqualTo(String value) {
            addCriterion("office_ids =", value, "officeIds");
            return (Criteria) this;
        }

        public Criteria andOfficeIdsNotEqualTo(String value) {
            addCriterion("office_ids <>", value, "officeIds");
            return (Criteria) this;
        }

        public Criteria andOfficeIdsGreaterThan(String value) {
            addCriterion("office_ids >", value, "officeIds");
            return (Criteria) this;
        }

        public Criteria andOfficeIdsGreaterThanOrEqualTo(String value) {
            addCriterion("office_ids >=", value, "officeIds");
            return (Criteria) this;
        }

        public Criteria andOfficeIdsLessThan(String value) {
            addCriterion("office_ids <", value, "officeIds");
            return (Criteria) this;
        }

        public Criteria andOfficeIdsLessThanOrEqualTo(String value) {
            addCriterion("office_ids <=", value, "officeIds");
            return (Criteria) this;
        }

        public Criteria andOfficeIdsLike(String value) {
            addCriterion("office_ids like", value, "officeIds");
            return (Criteria) this;
        }

        public Criteria andOfficeIdsNotLike(String value) {
            addCriterion("office_ids not like", value, "officeIds");
            return (Criteria) this;
        }

        public Criteria andOfficeIdsIn(List<String> values) {
            addCriterion("office_ids in", values, "officeIds");
            return (Criteria) this;
        }

        public Criteria andOfficeIdsNotIn(List<String> values) {
            addCriterion("office_ids not in", values, "officeIds");
            return (Criteria) this;
        }

        public Criteria andOfficeIdsBetween(String value1, String value2) {
            addCriterion("office_ids between", value1, value2, "officeIds");
            return (Criteria) this;
        }

        public Criteria andOfficeIdsNotBetween(String value1, String value2) {
            addCriterion("office_ids not between", value1, value2, "officeIds");
            return (Criteria) this;
        }

        public Criteria andUserIdsIsNull() {
            addCriterion("user_ids is null");
            return (Criteria) this;
        }

        public Criteria andUserIdsIsNotNull() {
            addCriterion("user_ids is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdsEqualTo(String value) {
            addCriterion("user_ids =", value, "userIds");
            return (Criteria) this;
        }

        public Criteria andUserIdsNotEqualTo(String value) {
            addCriterion("user_ids <>", value, "userIds");
            return (Criteria) this;
        }

        public Criteria andUserIdsGreaterThan(String value) {
            addCriterion("user_ids >", value, "userIds");
            return (Criteria) this;
        }

        public Criteria andUserIdsGreaterThanOrEqualTo(String value) {
            addCriterion("user_ids >=", value, "userIds");
            return (Criteria) this;
        }

        public Criteria andUserIdsLessThan(String value) {
            addCriterion("user_ids <", value, "userIds");
            return (Criteria) this;
        }

        public Criteria andUserIdsLessThanOrEqualTo(String value) {
            addCriterion("user_ids <=", value, "userIds");
            return (Criteria) this;
        }

        public Criteria andUserIdsLike(String value) {
            addCriterion("user_ids like", value, "userIds");
            return (Criteria) this;
        }

        public Criteria andUserIdsNotLike(String value) {
            addCriterion("user_ids not like", value, "userIds");
            return (Criteria) this;
        }

        public Criteria andUserIdsIn(List<String> values) {
            addCriterion("user_ids in", values, "userIds");
            return (Criteria) this;
        }

        public Criteria andUserIdsNotIn(List<String> values) {
            addCriterion("user_ids not in", values, "userIds");
            return (Criteria) this;
        }

        public Criteria andUserIdsBetween(String value1, String value2) {
            addCriterion("user_ids between", value1, value2, "userIds");
            return (Criteria) this;
        }

        public Criteria andUserIdsNotBetween(String value1, String value2) {
            addCriterion("user_ids not between", value1, value2, "userIds");
            return (Criteria) this;
        }

        public Criteria andFormHtmlIsNull() {
            addCriterion("form_html is null");
            return (Criteria) this;
        }

        public Criteria andFormHtmlIsNotNull() {
            addCriterion("form_html is not null");
            return (Criteria) this;
        }

        public Criteria andFormHtmlEqualTo(String value) {
            addCriterion("form_html =", value, "formHtml");
            return (Criteria) this;
        }

        public Criteria andFormHtmlNotEqualTo(String value) {
            addCriterion("form_html <>", value, "formHtml");
            return (Criteria) this;
        }

        public Criteria andFormHtmlGreaterThan(String value) {
            addCriterion("form_html >", value, "formHtml");
            return (Criteria) this;
        }

        public Criteria andFormHtmlGreaterThanOrEqualTo(String value) {
            addCriterion("form_html >=", value, "formHtml");
            return (Criteria) this;
        }

        public Criteria andFormHtmlLessThan(String value) {
            addCriterion("form_html <", value, "formHtml");
            return (Criteria) this;
        }

        public Criteria andFormHtmlLessThanOrEqualTo(String value) {
            addCriterion("form_html <=", value, "formHtml");
            return (Criteria) this;
        }

        public Criteria andFormHtmlLike(String value) {
            addCriterion("form_html like", value, "formHtml");
            return (Criteria) this;
        }

        public Criteria andFormHtmlNotLike(String value) {
            addCriterion("form_html not like", value, "formHtml");
            return (Criteria) this;
        }

        public Criteria andFormHtmlIn(List<String> values) {
            addCriterion("form_html in", values, "formHtml");
            return (Criteria) this;
        }

        public Criteria andFormHtmlNotIn(List<String> values) {
            addCriterion("form_html not in", values, "formHtml");
            return (Criteria) this;
        }

        public Criteria andFormHtmlBetween(String value1, String value2) {
            addCriterion("form_html between", value1, value2, "formHtml");
            return (Criteria) this;
        }

        public Criteria andFormHtmlNotBetween(String value1, String value2) {
            addCriterion("form_html not between", value1, value2, "formHtml");
            return (Criteria) this;
        }

        public Criteria andFormFieldIdIsNull() {
            addCriterion("form_field_id is null");
            return (Criteria) this;
        }

        public Criteria andFormFieldIdIsNotNull() {
            addCriterion("form_field_id is not null");
            return (Criteria) this;
        }

        public Criteria andFormFieldIdEqualTo(String value) {
            addCriterion("form_field_id =", value, "formFieldId");
            return (Criteria) this;
        }

        public Criteria andFormFieldIdNotEqualTo(String value) {
            addCriterion("form_field_id <>", value, "formFieldId");
            return (Criteria) this;
        }

        public Criteria andFormFieldIdGreaterThan(String value) {
            addCriterion("form_field_id >", value, "formFieldId");
            return (Criteria) this;
        }

        public Criteria andFormFieldIdGreaterThanOrEqualTo(String value) {
            addCriterion("form_field_id >=", value, "formFieldId");
            return (Criteria) this;
        }

        public Criteria andFormFieldIdLessThan(String value) {
            addCriterion("form_field_id <", value, "formFieldId");
            return (Criteria) this;
        }

        public Criteria andFormFieldIdLessThanOrEqualTo(String value) {
            addCriterion("form_field_id <=", value, "formFieldId");
            return (Criteria) this;
        }

        public Criteria andFormFieldIdLike(String value) {
            addCriterion("form_field_id like", value, "formFieldId");
            return (Criteria) this;
        }

        public Criteria andFormFieldIdNotLike(String value) {
            addCriterion("form_field_id not like", value, "formFieldId");
            return (Criteria) this;
        }

        public Criteria andFormFieldIdIn(List<String> values) {
            addCriterion("form_field_id in", values, "formFieldId");
            return (Criteria) this;
        }

        public Criteria andFormFieldIdNotIn(List<String> values) {
            addCriterion("form_field_id not in", values, "formFieldId");
            return (Criteria) this;
        }

        public Criteria andFormFieldIdBetween(String value1, String value2) {
            addCriterion("form_field_id between", value1, value2, "formFieldId");
            return (Criteria) this;
        }

        public Criteria andFormFieldIdNotBetween(String value1, String value2) {
            addCriterion("form_field_id not between", value1, value2, "formFieldId");
            return (Criteria) this;
        }

        public Criteria andTbNameIsNull() {
            addCriterion("tb_name is null");
            return (Criteria) this;
        }

        public Criteria andTbNameIsNotNull() {
            addCriterion("tb_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbNameEqualTo(String value) {
            addCriterion("tb_name =", value, "tbName");
            return (Criteria) this;
        }

        public Criteria andTbNameNotEqualTo(String value) {
            addCriterion("tb_name <>", value, "tbName");
            return (Criteria) this;
        }

        public Criteria andTbNameGreaterThan(String value) {
            addCriterion("tb_name >", value, "tbName");
            return (Criteria) this;
        }

        public Criteria andTbNameGreaterThanOrEqualTo(String value) {
            addCriterion("tb_name >=", value, "tbName");
            return (Criteria) this;
        }

        public Criteria andTbNameLessThan(String value) {
            addCriterion("tb_name <", value, "tbName");
            return (Criteria) this;
        }

        public Criteria andTbNameLessThanOrEqualTo(String value) {
            addCriterion("tb_name <=", value, "tbName");
            return (Criteria) this;
        }

        public Criteria andTbNameLike(String value) {
            addCriterion("tb_name like", value, "tbName");
            return (Criteria) this;
        }

        public Criteria andTbNameNotLike(String value) {
            addCriterion("tb_name not like", value, "tbName");
            return (Criteria) this;
        }

        public Criteria andTbNameIn(List<String> values) {
            addCriterion("tb_name in", values, "tbName");
            return (Criteria) this;
        }

        public Criteria andTbNameNotIn(List<String> values) {
            addCriterion("tb_name not in", values, "tbName");
            return (Criteria) this;
        }

        public Criteria andTbNameBetween(String value1, String value2) {
            addCriterion("tb_name between", value1, value2, "tbName");
            return (Criteria) this;
        }

        public Criteria andTbNameNotBetween(String value1, String value2) {
            addCriterion("tb_name not between", value1, value2, "tbName");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNull() {
            addCriterion("menu_name is null");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNotNull() {
            addCriterion("menu_name is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("menu_name =", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("menu_name <>", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("menu_name >", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("menu_name >=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThan(String value) {
            addCriterion("menu_name <", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("menu_name <=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLike(String value) {
            addCriterion("menu_name like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotLike(String value) {
            addCriterion("menu_name not like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("menu_name in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("menu_name not in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("menu_name between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("menu_name not between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuPidIsNull() {
            addCriterion("menu_pid is null");
            return (Criteria) this;
        }

        public Criteria andMenuPidIsNotNull() {
            addCriterion("menu_pid is not null");
            return (Criteria) this;
        }

        public Criteria andMenuPidEqualTo(Long value) {
            addCriterion("menu_pid =", value, "menuPid");
            return (Criteria) this;
        }

        public Criteria andMenuPidNotEqualTo(Long value) {
            addCriterion("menu_pid <>", value, "menuPid");
            return (Criteria) this;
        }

        public Criteria andMenuPidGreaterThan(Long value) {
            addCriterion("menu_pid >", value, "menuPid");
            return (Criteria) this;
        }

        public Criteria andMenuPidGreaterThanOrEqualTo(Long value) {
            addCriterion("menu_pid >=", value, "menuPid");
            return (Criteria) this;
        }

        public Criteria andMenuPidLessThan(Long value) {
            addCriterion("menu_pid <", value, "menuPid");
            return (Criteria) this;
        }

        public Criteria andMenuPidLessThanOrEqualTo(Long value) {
            addCriterion("menu_pid <=", value, "menuPid");
            return (Criteria) this;
        }

        public Criteria andMenuPidIn(List<Long> values) {
            addCriterion("menu_pid in", values, "menuPid");
            return (Criteria) this;
        }

        public Criteria andMenuPidNotIn(List<Long> values) {
            addCriterion("menu_pid not in", values, "menuPid");
            return (Criteria) this;
        }

        public Criteria andMenuPidBetween(Long value1, Long value2) {
            addCriterion("menu_pid between", value1, value2, "menuPid");
            return (Criteria) this;
        }

        public Criteria andMenuPidNotBetween(Long value1, Long value2) {
            addCriterion("menu_pid not between", value1, value2, "menuPid");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
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

        public Criteria andCreatePersonIsNull() {
            addCriterion("create_person is null");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIsNotNull() {
            addCriterion("create_person is not null");
            return (Criteria) this;
        }

        public Criteria andCreatePersonEqualTo(String value) {
            addCriterion("create_person =", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNotEqualTo(String value) {
            addCriterion("create_person <>", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonGreaterThan(String value) {
            addCriterion("create_person >", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonGreaterThanOrEqualTo(String value) {
            addCriterion("create_person >=", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonLessThan(String value) {
            addCriterion("create_person <", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonLessThanOrEqualTo(String value) {
            addCriterion("create_person <=", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonLike(String value) {
            addCriterion("create_person like", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNotLike(String value) {
            addCriterion("create_person not like", value, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIn(List<String> values) {
            addCriterion("create_person in", values, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNotIn(List<String> values) {
            addCriterion("create_person not in", values, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonBetween(String value1, String value2) {
            addCriterion("create_person between", value1, value2, "createPerson");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNotBetween(String value1, String value2) {
            addCriterion("create_person not between", value1, value2, "createPerson");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIsNull() {
            addCriterion("update_person is null");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIsNotNull() {
            addCriterion("update_person is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonEqualTo(String value) {
            addCriterion("update_person =", value, "updatePerson");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNotEqualTo(String value) {
            addCriterion("update_person <>", value, "updatePerson");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonGreaterThan(String value) {
            addCriterion("update_person >", value, "updatePerson");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonGreaterThanOrEqualTo(String value) {
            addCriterion("update_person >=", value, "updatePerson");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonLessThan(String value) {
            addCriterion("update_person <", value, "updatePerson");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonLessThanOrEqualTo(String value) {
            addCriterion("update_person <=", value, "updatePerson");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonLike(String value) {
            addCriterion("update_person like", value, "updatePerson");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNotLike(String value) {
            addCriterion("update_person not like", value, "updatePerson");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIn(List<String> values) {
            addCriterion("update_person in", values, "updatePerson");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNotIn(List<String> values) {
            addCriterion("update_person not in", values, "updatePerson");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonBetween(String value1, String value2) {
            addCriterion("update_person between", value1, value2, "updatePerson");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNotBetween(String value1, String value2) {
            addCriterion("update_person not between", value1, value2, "updatePerson");
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