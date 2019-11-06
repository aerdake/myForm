package com.example.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysActStepExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysActStepExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andActStepIdIsNull() {
            addCriterion("act_step_id is null");
            return (Criteria) this;
        }

        public Criteria andActStepIdIsNotNull() {
            addCriterion("act_step_id is not null");
            return (Criteria) this;
        }

        public Criteria andActStepIdEqualTo(Long value) {
            addCriterion("act_step_id =", value, "actStepId");
            return (Criteria) this;
        }

        public Criteria andActStepIdNotEqualTo(Long value) {
            addCriterion("act_step_id <>", value, "actStepId");
            return (Criteria) this;
        }

        public Criteria andActStepIdGreaterThan(Long value) {
            addCriterion("act_step_id >", value, "actStepId");
            return (Criteria) this;
        }

        public Criteria andActStepIdGreaterThanOrEqualTo(Long value) {
            addCriterion("act_step_id >=", value, "actStepId");
            return (Criteria) this;
        }

        public Criteria andActStepIdLessThan(Long value) {
            addCriterion("act_step_id <", value, "actStepId");
            return (Criteria) this;
        }

        public Criteria andActStepIdLessThanOrEqualTo(Long value) {
            addCriterion("act_step_id <=", value, "actStepId");
            return (Criteria) this;
        }

        public Criteria andActStepIdIn(List<Long> values) {
            addCriterion("act_step_id in", values, "actStepId");
            return (Criteria) this;
        }

        public Criteria andActStepIdNotIn(List<Long> values) {
            addCriterion("act_step_id not in", values, "actStepId");
            return (Criteria) this;
        }

        public Criteria andActStepIdBetween(Long value1, Long value2) {
            addCriterion("act_step_id between", value1, value2, "actStepId");
            return (Criteria) this;
        }

        public Criteria andActStepIdNotBetween(Long value1, Long value2) {
            addCriterion("act_step_id not between", value1, value2, "actStepId");
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

        public Criteria andStepNameIsNull() {
            addCriterion("step_name is null");
            return (Criteria) this;
        }

        public Criteria andStepNameIsNotNull() {
            addCriterion("step_name is not null");
            return (Criteria) this;
        }

        public Criteria andStepNameEqualTo(String value) {
            addCriterion("step_name =", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameNotEqualTo(String value) {
            addCriterion("step_name <>", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameGreaterThan(String value) {
            addCriterion("step_name >", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameGreaterThanOrEqualTo(String value) {
            addCriterion("step_name >=", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameLessThan(String value) {
            addCriterion("step_name <", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameLessThanOrEqualTo(String value) {
            addCriterion("step_name <=", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameLike(String value) {
            addCriterion("step_name like", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameNotLike(String value) {
            addCriterion("step_name not like", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameIn(List<String> values) {
            addCriterion("step_name in", values, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameNotIn(List<String> values) {
            addCriterion("step_name not in", values, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameBetween(String value1, String value2) {
            addCriterion("step_name between", value1, value2, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameNotBetween(String value1, String value2) {
            addCriterion("step_name not between", value1, value2, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNodeTypeIsNull() {
            addCriterion("step_node_type is null");
            return (Criteria) this;
        }

        public Criteria andStepNodeTypeIsNotNull() {
            addCriterion("step_node_type is not null");
            return (Criteria) this;
        }

        public Criteria andStepNodeTypeEqualTo(String value) {
            addCriterion("step_node_type =", value, "stepNodeType");
            return (Criteria) this;
        }

        public Criteria andStepNodeTypeNotEqualTo(String value) {
            addCriterion("step_node_type <>", value, "stepNodeType");
            return (Criteria) this;
        }

        public Criteria andStepNodeTypeGreaterThan(String value) {
            addCriterion("step_node_type >", value, "stepNodeType");
            return (Criteria) this;
        }

        public Criteria andStepNodeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("step_node_type >=", value, "stepNodeType");
            return (Criteria) this;
        }

        public Criteria andStepNodeTypeLessThan(String value) {
            addCriterion("step_node_type <", value, "stepNodeType");
            return (Criteria) this;
        }

        public Criteria andStepNodeTypeLessThanOrEqualTo(String value) {
            addCriterion("step_node_type <=", value, "stepNodeType");
            return (Criteria) this;
        }

        public Criteria andStepNodeTypeLike(String value) {
            addCriterion("step_node_type like", value, "stepNodeType");
            return (Criteria) this;
        }

        public Criteria andStepNodeTypeNotLike(String value) {
            addCriterion("step_node_type not like", value, "stepNodeType");
            return (Criteria) this;
        }

        public Criteria andStepNodeTypeIn(List<String> values) {
            addCriterion("step_node_type in", values, "stepNodeType");
            return (Criteria) this;
        }

        public Criteria andStepNodeTypeNotIn(List<String> values) {
            addCriterion("step_node_type not in", values, "stepNodeType");
            return (Criteria) this;
        }

        public Criteria andStepNodeTypeBetween(String value1, String value2) {
            addCriterion("step_node_type between", value1, value2, "stepNodeType");
            return (Criteria) this;
        }

        public Criteria andStepNodeTypeNotBetween(String value1, String value2) {
            addCriterion("step_node_type not between", value1, value2, "stepNodeType");
            return (Criteria) this;
        }

        public Criteria andApproveUserTypeIsNull() {
            addCriterion("approve_user_type is null");
            return (Criteria) this;
        }

        public Criteria andApproveUserTypeIsNotNull() {
            addCriterion("approve_user_type is not null");
            return (Criteria) this;
        }

        public Criteria andApproveUserTypeEqualTo(String value) {
            addCriterion("approve_user_type =", value, "approveUserType");
            return (Criteria) this;
        }

        public Criteria andApproveUserTypeNotEqualTo(String value) {
            addCriterion("approve_user_type <>", value, "approveUserType");
            return (Criteria) this;
        }

        public Criteria andApproveUserTypeGreaterThan(String value) {
            addCriterion("approve_user_type >", value, "approveUserType");
            return (Criteria) this;
        }

        public Criteria andApproveUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("approve_user_type >=", value, "approveUserType");
            return (Criteria) this;
        }

        public Criteria andApproveUserTypeLessThan(String value) {
            addCriterion("approve_user_type <", value, "approveUserType");
            return (Criteria) this;
        }

        public Criteria andApproveUserTypeLessThanOrEqualTo(String value) {
            addCriterion("approve_user_type <=", value, "approveUserType");
            return (Criteria) this;
        }

        public Criteria andApproveUserTypeLike(String value) {
            addCriterion("approve_user_type like", value, "approveUserType");
            return (Criteria) this;
        }

        public Criteria andApproveUserTypeNotLike(String value) {
            addCriterion("approve_user_type not like", value, "approveUserType");
            return (Criteria) this;
        }

        public Criteria andApproveUserTypeIn(List<String> values) {
            addCriterion("approve_user_type in", values, "approveUserType");
            return (Criteria) this;
        }

        public Criteria andApproveUserTypeNotIn(List<String> values) {
            addCriterion("approve_user_type not in", values, "approveUserType");
            return (Criteria) this;
        }

        public Criteria andApproveUserTypeBetween(String value1, String value2) {
            addCriterion("approve_user_type between", value1, value2, "approveUserType");
            return (Criteria) this;
        }

        public Criteria andApproveUserTypeNotBetween(String value1, String value2) {
            addCriterion("approve_user_type not between", value1, value2, "approveUserType");
            return (Criteria) this;
        }

        public Criteria andRolesApproveTypeIsNull() {
            addCriterion("roles_approve_type is null");
            return (Criteria) this;
        }

        public Criteria andRolesApproveTypeIsNotNull() {
            addCriterion("roles_approve_type is not null");
            return (Criteria) this;
        }

        public Criteria andRolesApproveTypeEqualTo(String value) {
            addCriterion("roles_approve_type =", value, "rolesApproveType");
            return (Criteria) this;
        }

        public Criteria andRolesApproveTypeNotEqualTo(String value) {
            addCriterion("roles_approve_type <>", value, "rolesApproveType");
            return (Criteria) this;
        }

        public Criteria andRolesApproveTypeGreaterThan(String value) {
            addCriterion("roles_approve_type >", value, "rolesApproveType");
            return (Criteria) this;
        }

        public Criteria andRolesApproveTypeGreaterThanOrEqualTo(String value) {
            addCriterion("roles_approve_type >=", value, "rolesApproveType");
            return (Criteria) this;
        }

        public Criteria andRolesApproveTypeLessThan(String value) {
            addCriterion("roles_approve_type <", value, "rolesApproveType");
            return (Criteria) this;
        }

        public Criteria andRolesApproveTypeLessThanOrEqualTo(String value) {
            addCriterion("roles_approve_type <=", value, "rolesApproveType");
            return (Criteria) this;
        }

        public Criteria andRolesApproveTypeLike(String value) {
            addCriterion("roles_approve_type like", value, "rolesApproveType");
            return (Criteria) this;
        }

        public Criteria andRolesApproveTypeNotLike(String value) {
            addCriterion("roles_approve_type not like", value, "rolesApproveType");
            return (Criteria) this;
        }

        public Criteria andRolesApproveTypeIn(List<String> values) {
            addCriterion("roles_approve_type in", values, "rolesApproveType");
            return (Criteria) this;
        }

        public Criteria andRolesApproveTypeNotIn(List<String> values) {
            addCriterion("roles_approve_type not in", values, "rolesApproveType");
            return (Criteria) this;
        }

        public Criteria andRolesApproveTypeBetween(String value1, String value2) {
            addCriterion("roles_approve_type between", value1, value2, "rolesApproveType");
            return (Criteria) this;
        }

        public Criteria andRolesApproveTypeNotBetween(String value1, String value2) {
            addCriterion("roles_approve_type not between", value1, value2, "rolesApproveType");
            return (Criteria) this;
        }

        public Criteria andApproveUserIsNull() {
            addCriterion("approve_user is null");
            return (Criteria) this;
        }

        public Criteria andApproveUserIsNotNull() {
            addCriterion("approve_user is not null");
            return (Criteria) this;
        }

        public Criteria andApproveUserEqualTo(String value) {
            addCriterion("approve_user =", value, "approveUser");
            return (Criteria) this;
        }

        public Criteria andApproveUserNotEqualTo(String value) {
            addCriterion("approve_user <>", value, "approveUser");
            return (Criteria) this;
        }

        public Criteria andApproveUserGreaterThan(String value) {
            addCriterion("approve_user >", value, "approveUser");
            return (Criteria) this;
        }

        public Criteria andApproveUserGreaterThanOrEqualTo(String value) {
            addCriterion("approve_user >=", value, "approveUser");
            return (Criteria) this;
        }

        public Criteria andApproveUserLessThan(String value) {
            addCriterion("approve_user <", value, "approveUser");
            return (Criteria) this;
        }

        public Criteria andApproveUserLessThanOrEqualTo(String value) {
            addCriterion("approve_user <=", value, "approveUser");
            return (Criteria) this;
        }

        public Criteria andApproveUserLike(String value) {
            addCriterion("approve_user like", value, "approveUser");
            return (Criteria) this;
        }

        public Criteria andApproveUserNotLike(String value) {
            addCriterion("approve_user not like", value, "approveUser");
            return (Criteria) this;
        }

        public Criteria andApproveUserIn(List<String> values) {
            addCriterion("approve_user in", values, "approveUser");
            return (Criteria) this;
        }

        public Criteria andApproveUserNotIn(List<String> values) {
            addCriterion("approve_user not in", values, "approveUser");
            return (Criteria) this;
        }

        public Criteria andApproveUserBetween(String value1, String value2) {
            addCriterion("approve_user between", value1, value2, "approveUser");
            return (Criteria) this;
        }

        public Criteria andApproveUserNotBetween(String value1, String value2) {
            addCriterion("approve_user not between", value1, value2, "approveUser");
            return (Criteria) this;
        }

        public Criteria andRoleUserIsNull() {
            addCriterion("role_user is null");
            return (Criteria) this;
        }

        public Criteria andRoleUserIsNotNull() {
            addCriterion("role_user is not null");
            return (Criteria) this;
        }

        public Criteria andRoleUserEqualTo(String value) {
            addCriterion("role_user =", value, "roleUser");
            return (Criteria) this;
        }

        public Criteria andRoleUserNotEqualTo(String value) {
            addCriterion("role_user <>", value, "roleUser");
            return (Criteria) this;
        }

        public Criteria andRoleUserGreaterThan(String value) {
            addCriterion("role_user >", value, "roleUser");
            return (Criteria) this;
        }

        public Criteria andRoleUserGreaterThanOrEqualTo(String value) {
            addCriterion("role_user >=", value, "roleUser");
            return (Criteria) this;
        }

        public Criteria andRoleUserLessThan(String value) {
            addCriterion("role_user <", value, "roleUser");
            return (Criteria) this;
        }

        public Criteria andRoleUserLessThanOrEqualTo(String value) {
            addCriterion("role_user <=", value, "roleUser");
            return (Criteria) this;
        }

        public Criteria andRoleUserLike(String value) {
            addCriterion("role_user like", value, "roleUser");
            return (Criteria) this;
        }

        public Criteria andRoleUserNotLike(String value) {
            addCriterion("role_user not like", value, "roleUser");
            return (Criteria) this;
        }

        public Criteria andRoleUserIn(List<String> values) {
            addCriterion("role_user in", values, "roleUser");
            return (Criteria) this;
        }

        public Criteria andRoleUserNotIn(List<String> values) {
            addCriterion("role_user not in", values, "roleUser");
            return (Criteria) this;
        }

        public Criteria andRoleUserBetween(String value1, String value2) {
            addCriterion("role_user between", value1, value2, "roleUser");
            return (Criteria) this;
        }

        public Criteria andRoleUserNotBetween(String value1, String value2) {
            addCriterion("role_user not between", value1, value2, "roleUser");
            return (Criteria) this;
        }

        public Criteria andRoleFormIsNull() {
            addCriterion("role_form is null");
            return (Criteria) this;
        }

        public Criteria andRoleFormIsNotNull() {
            addCriterion("role_form is not null");
            return (Criteria) this;
        }

        public Criteria andRoleFormEqualTo(String value) {
            addCriterion("role_form =", value, "roleForm");
            return (Criteria) this;
        }

        public Criteria andRoleFormNotEqualTo(String value) {
            addCriterion("role_form <>", value, "roleForm");
            return (Criteria) this;
        }

        public Criteria andRoleFormGreaterThan(String value) {
            addCriterion("role_form >", value, "roleForm");
            return (Criteria) this;
        }

        public Criteria andRoleFormGreaterThanOrEqualTo(String value) {
            addCriterion("role_form >=", value, "roleForm");
            return (Criteria) this;
        }

        public Criteria andRoleFormLessThan(String value) {
            addCriterion("role_form <", value, "roleForm");
            return (Criteria) this;
        }

        public Criteria andRoleFormLessThanOrEqualTo(String value) {
            addCriterion("role_form <=", value, "roleForm");
            return (Criteria) this;
        }

        public Criteria andRoleFormLike(String value) {
            addCriterion("role_form like", value, "roleForm");
            return (Criteria) this;
        }

        public Criteria andRoleFormNotLike(String value) {
            addCriterion("role_form not like", value, "roleForm");
            return (Criteria) this;
        }

        public Criteria andRoleFormIn(List<String> values) {
            addCriterion("role_form in", values, "roleForm");
            return (Criteria) this;
        }

        public Criteria andRoleFormNotIn(List<String> values) {
            addCriterion("role_form not in", values, "roleForm");
            return (Criteria) this;
        }

        public Criteria andRoleFormBetween(String value1, String value2) {
            addCriterion("role_form between", value1, value2, "roleForm");
            return (Criteria) this;
        }

        public Criteria andRoleFormNotBetween(String value1, String value2) {
            addCriterion("role_form not between", value1, value2, "roleForm");
            return (Criteria) this;
        }

        public Criteria andJudgeIsNull() {
            addCriterion("judge is null");
            return (Criteria) this;
        }

        public Criteria andJudgeIsNotNull() {
            addCriterion("judge is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeEqualTo(String value) {
            addCriterion("judge =", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeNotEqualTo(String value) {
            addCriterion("judge <>", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeGreaterThan(String value) {
            addCriterion("judge >", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeGreaterThanOrEqualTo(String value) {
            addCriterion("judge >=", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeLessThan(String value) {
            addCriterion("judge <", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeLessThanOrEqualTo(String value) {
            addCriterion("judge <=", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeLike(String value) {
            addCriterion("judge like", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeNotLike(String value) {
            addCriterion("judge not like", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeIn(List<String> values) {
            addCriterion("judge in", values, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeNotIn(List<String> values) {
            addCriterion("judge not in", values, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeBetween(String value1, String value2) {
            addCriterion("judge between", value1, value2, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeNotBetween(String value1, String value2) {
            addCriterion("judge not between", value1, value2, "judge");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Integer value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Integer value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Integer value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Integer value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Integer> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Integer> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Integer value1, Integer value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("priority not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andNextNodeIsNull() {
            addCriterion("next_node is null");
            return (Criteria) this;
        }

        public Criteria andNextNodeIsNotNull() {
            addCriterion("next_node is not null");
            return (Criteria) this;
        }

        public Criteria andNextNodeEqualTo(String value) {
            addCriterion("next_node =", value, "nextNode");
            return (Criteria) this;
        }

        public Criteria andNextNodeNotEqualTo(String value) {
            addCriterion("next_node <>", value, "nextNode");
            return (Criteria) this;
        }

        public Criteria andNextNodeGreaterThan(String value) {
            addCriterion("next_node >", value, "nextNode");
            return (Criteria) this;
        }

        public Criteria andNextNodeGreaterThanOrEqualTo(String value) {
            addCriterion("next_node >=", value, "nextNode");
            return (Criteria) this;
        }

        public Criteria andNextNodeLessThan(String value) {
            addCriterion("next_node <", value, "nextNode");
            return (Criteria) this;
        }

        public Criteria andNextNodeLessThanOrEqualTo(String value) {
            addCriterion("next_node <=", value, "nextNode");
            return (Criteria) this;
        }

        public Criteria andNextNodeLike(String value) {
            addCriterion("next_node like", value, "nextNode");
            return (Criteria) this;
        }

        public Criteria andNextNodeNotLike(String value) {
            addCriterion("next_node not like", value, "nextNode");
            return (Criteria) this;
        }

        public Criteria andNextNodeIn(List<String> values) {
            addCriterion("next_node in", values, "nextNode");
            return (Criteria) this;
        }

        public Criteria andNextNodeNotIn(List<String> values) {
            addCriterion("next_node not in", values, "nextNode");
            return (Criteria) this;
        }

        public Criteria andNextNodeBetween(String value1, String value2) {
            addCriterion("next_node between", value1, value2, "nextNode");
            return (Criteria) this;
        }

        public Criteria andNextNodeNotBetween(String value1, String value2) {
            addCriterion("next_node not between", value1, value2, "nextNode");
            return (Criteria) this;
        }

        public Criteria andDisagreeSelectIsNull() {
            addCriterion("disagree_select is null");
            return (Criteria) this;
        }

        public Criteria andDisagreeSelectIsNotNull() {
            addCriterion("disagree_select is not null");
            return (Criteria) this;
        }

        public Criteria andDisagreeSelectEqualTo(String value) {
            addCriterion("disagree_select =", value, "disagreeSelect");
            return (Criteria) this;
        }

        public Criteria andDisagreeSelectNotEqualTo(String value) {
            addCriterion("disagree_select <>", value, "disagreeSelect");
            return (Criteria) this;
        }

        public Criteria andDisagreeSelectGreaterThan(String value) {
            addCriterion("disagree_select >", value, "disagreeSelect");
            return (Criteria) this;
        }

        public Criteria andDisagreeSelectGreaterThanOrEqualTo(String value) {
            addCriterion("disagree_select >=", value, "disagreeSelect");
            return (Criteria) this;
        }

        public Criteria andDisagreeSelectLessThan(String value) {
            addCriterion("disagree_select <", value, "disagreeSelect");
            return (Criteria) this;
        }

        public Criteria andDisagreeSelectLessThanOrEqualTo(String value) {
            addCriterion("disagree_select <=", value, "disagreeSelect");
            return (Criteria) this;
        }

        public Criteria andDisagreeSelectLike(String value) {
            addCriterion("disagree_select like", value, "disagreeSelect");
            return (Criteria) this;
        }

        public Criteria andDisagreeSelectNotLike(String value) {
            addCriterion("disagree_select not like", value, "disagreeSelect");
            return (Criteria) this;
        }

        public Criteria andDisagreeSelectIn(List<String> values) {
            addCriterion("disagree_select in", values, "disagreeSelect");
            return (Criteria) this;
        }

        public Criteria andDisagreeSelectNotIn(List<String> values) {
            addCriterion("disagree_select not in", values, "disagreeSelect");
            return (Criteria) this;
        }

        public Criteria andDisagreeSelectBetween(String value1, String value2) {
            addCriterion("disagree_select between", value1, value2, "disagreeSelect");
            return (Criteria) this;
        }

        public Criteria andDisagreeSelectNotBetween(String value1, String value2) {
            addCriterion("disagree_select not between", value1, value2, "disagreeSelect");
            return (Criteria) this;
        }

        public Criteria andDisagreeNodeIsNull() {
            addCriterion("disagree_node is null");
            return (Criteria) this;
        }

        public Criteria andDisagreeNodeIsNotNull() {
            addCriterion("disagree_node is not null");
            return (Criteria) this;
        }

        public Criteria andDisagreeNodeEqualTo(String value) {
            addCriterion("disagree_node =", value, "disagreeNode");
            return (Criteria) this;
        }

        public Criteria andDisagreeNodeNotEqualTo(String value) {
            addCriterion("disagree_node <>", value, "disagreeNode");
            return (Criteria) this;
        }

        public Criteria andDisagreeNodeGreaterThan(String value) {
            addCriterion("disagree_node >", value, "disagreeNode");
            return (Criteria) this;
        }

        public Criteria andDisagreeNodeGreaterThanOrEqualTo(String value) {
            addCriterion("disagree_node >=", value, "disagreeNode");
            return (Criteria) this;
        }

        public Criteria andDisagreeNodeLessThan(String value) {
            addCriterion("disagree_node <", value, "disagreeNode");
            return (Criteria) this;
        }

        public Criteria andDisagreeNodeLessThanOrEqualTo(String value) {
            addCriterion("disagree_node <=", value, "disagreeNode");
            return (Criteria) this;
        }

        public Criteria andDisagreeNodeLike(String value) {
            addCriterion("disagree_node like", value, "disagreeNode");
            return (Criteria) this;
        }

        public Criteria andDisagreeNodeNotLike(String value) {
            addCriterion("disagree_node not like", value, "disagreeNode");
            return (Criteria) this;
        }

        public Criteria andDisagreeNodeIn(List<String> values) {
            addCriterion("disagree_node in", values, "disagreeNode");
            return (Criteria) this;
        }

        public Criteria andDisagreeNodeNotIn(List<String> values) {
            addCriterion("disagree_node not in", values, "disagreeNode");
            return (Criteria) this;
        }

        public Criteria andDisagreeNodeBetween(String value1, String value2) {
            addCriterion("disagree_node between", value1, value2, "disagreeNode");
            return (Criteria) this;
        }

        public Criteria andDisagreeNodeNotBetween(String value1, String value2) {
            addCriterion("disagree_node not between", value1, value2, "disagreeNode");
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