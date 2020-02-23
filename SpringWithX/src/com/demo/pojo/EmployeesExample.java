package com.demo.pojo;

import java.util.ArrayList;
import java.util.List;

public class EmployeesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeesExample() {
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

        public Criteria andEmployeenumberIsNull() {
            addCriterion("employeeNumber is null");
            return (Criteria) this;
        }

        public Criteria andEmployeenumberIsNotNull() {
            addCriterion("employeeNumber is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeenumberEqualTo(Integer value) {
            addCriterion("employeeNumber =", value, "employeenumber");
            return (Criteria) this;
        }

        public Criteria andEmployeenumberNotEqualTo(Integer value) {
            addCriterion("employeeNumber <>", value, "employeenumber");
            return (Criteria) this;
        }

        public Criteria andEmployeenumberGreaterThan(Integer value) {
            addCriterion("employeeNumber >", value, "employeenumber");
            return (Criteria) this;
        }

        public Criteria andEmployeenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("employeeNumber >=", value, "employeenumber");
            return (Criteria) this;
        }

        public Criteria andEmployeenumberLessThan(Integer value) {
            addCriterion("employeeNumber <", value, "employeenumber");
            return (Criteria) this;
        }

        public Criteria andEmployeenumberLessThanOrEqualTo(Integer value) {
            addCriterion("employeeNumber <=", value, "employeenumber");
            return (Criteria) this;
        }

        public Criteria andEmployeenumberIn(List<Integer> values) {
            addCriterion("employeeNumber in", values, "employeenumber");
            return (Criteria) this;
        }

        public Criteria andEmployeenumberNotIn(List<Integer> values) {
            addCriterion("employeeNumber not in", values, "employeenumber");
            return (Criteria) this;
        }

        public Criteria andEmployeenumberBetween(Integer value1, Integer value2) {
            addCriterion("employeeNumber between", value1, value2, "employeenumber");
            return (Criteria) this;
        }

        public Criteria andEmployeenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("employeeNumber not between", value1, value2, "employeenumber");
            return (Criteria) this;
        }

        public Criteria andLastnameIsNull() {
            addCriterion("lastName is null");
            return (Criteria) this;
        }

        public Criteria andLastnameIsNotNull() {
            addCriterion("lastName is not null");
            return (Criteria) this;
        }

        public Criteria andLastnameEqualTo(String value) {
            addCriterion("lastName =", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotEqualTo(String value) {
            addCriterion("lastName <>", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameGreaterThan(String value) {
            addCriterion("lastName >", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameGreaterThanOrEqualTo(String value) {
            addCriterion("lastName >=", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLessThan(String value) {
            addCriterion("lastName <", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLessThanOrEqualTo(String value) {
            addCriterion("lastName <=", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLike(String value) {
            addCriterion("lastName like", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotLike(String value) {
            addCriterion("lastName not like", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameIn(List<String> values) {
            addCriterion("lastName in", values, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotIn(List<String> values) {
            addCriterion("lastName not in", values, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameBetween(String value1, String value2) {
            addCriterion("lastName between", value1, value2, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotBetween(String value1, String value2) {
            addCriterion("lastName not between", value1, value2, "lastname");
            return (Criteria) this;
        }

        public Criteria andFirstnameIsNull() {
            addCriterion("firstName is null");
            return (Criteria) this;
        }

        public Criteria andFirstnameIsNotNull() {
            addCriterion("firstName is not null");
            return (Criteria) this;
        }

        public Criteria andFirstnameEqualTo(String value) {
            addCriterion("firstName =", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotEqualTo(String value) {
            addCriterion("firstName <>", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameGreaterThan(String value) {
            addCriterion("firstName >", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameGreaterThanOrEqualTo(String value) {
            addCriterion("firstName >=", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLessThan(String value) {
            addCriterion("firstName <", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLessThanOrEqualTo(String value) {
            addCriterion("firstName <=", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLike(String value) {
            addCriterion("firstName like", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotLike(String value) {
            addCriterion("firstName not like", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameIn(List<String> values) {
            addCriterion("firstName in", values, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotIn(List<String> values) {
            addCriterion("firstName not in", values, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameBetween(String value1, String value2) {
            addCriterion("firstName between", value1, value2, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotBetween(String value1, String value2) {
            addCriterion("firstName not between", value1, value2, "firstname");
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

        public Criteria andOfficecodeIsNull() {
            addCriterion("officeCode is null");
            return (Criteria) this;
        }

        public Criteria andOfficecodeIsNotNull() {
            addCriterion("officeCode is not null");
            return (Criteria) this;
        }

        public Criteria andOfficecodeEqualTo(String value) {
            addCriterion("officeCode =", value, "officecode");
            return (Criteria) this;
        }

        public Criteria andOfficecodeNotEqualTo(String value) {
            addCriterion("officeCode <>", value, "officecode");
            return (Criteria) this;
        }

        public Criteria andOfficecodeGreaterThan(String value) {
            addCriterion("officeCode >", value, "officecode");
            return (Criteria) this;
        }

        public Criteria andOfficecodeGreaterThanOrEqualTo(String value) {
            addCriterion("officeCode >=", value, "officecode");
            return (Criteria) this;
        }

        public Criteria andOfficecodeLessThan(String value) {
            addCriterion("officeCode <", value, "officecode");
            return (Criteria) this;
        }

        public Criteria andOfficecodeLessThanOrEqualTo(String value) {
            addCriterion("officeCode <=", value, "officecode");
            return (Criteria) this;
        }

        public Criteria andOfficecodeLike(String value) {
            addCriterion("officeCode like", value, "officecode");
            return (Criteria) this;
        }

        public Criteria andOfficecodeNotLike(String value) {
            addCriterion("officeCode not like", value, "officecode");
            return (Criteria) this;
        }

        public Criteria andOfficecodeIn(List<String> values) {
            addCriterion("officeCode in", values, "officecode");
            return (Criteria) this;
        }

        public Criteria andOfficecodeNotIn(List<String> values) {
            addCriterion("officeCode not in", values, "officecode");
            return (Criteria) this;
        }

        public Criteria andOfficecodeBetween(String value1, String value2) {
            addCriterion("officeCode between", value1, value2, "officecode");
            return (Criteria) this;
        }

        public Criteria andOfficecodeNotBetween(String value1, String value2) {
            addCriterion("officeCode not between", value1, value2, "officecode");
            return (Criteria) this;
        }

        public Criteria andReportstoIsNull() {
            addCriterion("reportsTo is null");
            return (Criteria) this;
        }

        public Criteria andReportstoIsNotNull() {
            addCriterion("reportsTo is not null");
            return (Criteria) this;
        }

        public Criteria andReportstoEqualTo(Integer value) {
            addCriterion("reportsTo =", value, "reportsto");
            return (Criteria) this;
        }

        public Criteria andReportstoNotEqualTo(Integer value) {
            addCriterion("reportsTo <>", value, "reportsto");
            return (Criteria) this;
        }

        public Criteria andReportstoGreaterThan(Integer value) {
            addCriterion("reportsTo >", value, "reportsto");
            return (Criteria) this;
        }

        public Criteria andReportstoGreaterThanOrEqualTo(Integer value) {
            addCriterion("reportsTo >=", value, "reportsto");
            return (Criteria) this;
        }

        public Criteria andReportstoLessThan(Integer value) {
            addCriterion("reportsTo <", value, "reportsto");
            return (Criteria) this;
        }

        public Criteria andReportstoLessThanOrEqualTo(Integer value) {
            addCriterion("reportsTo <=", value, "reportsto");
            return (Criteria) this;
        }

        public Criteria andReportstoIn(List<Integer> values) {
            addCriterion("reportsTo in", values, "reportsto");
            return (Criteria) this;
        }

        public Criteria andReportstoNotIn(List<Integer> values) {
            addCriterion("reportsTo not in", values, "reportsto");
            return (Criteria) this;
        }

        public Criteria andReportstoBetween(Integer value1, Integer value2) {
            addCriterion("reportsTo between", value1, value2, "reportsto");
            return (Criteria) this;
        }

        public Criteria andReportstoNotBetween(Integer value1, Integer value2) {
            addCriterion("reportsTo not between", value1, value2, "reportsto");
            return (Criteria) this;
        }

        public Criteria andJobtitleIsNull() {
            addCriterion("jobTitle is null");
            return (Criteria) this;
        }

        public Criteria andJobtitleIsNotNull() {
            addCriterion("jobTitle is not null");
            return (Criteria) this;
        }

        public Criteria andJobtitleEqualTo(String value) {
            addCriterion("jobTitle =", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleNotEqualTo(String value) {
            addCriterion("jobTitle <>", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleGreaterThan(String value) {
            addCriterion("jobTitle >", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleGreaterThanOrEqualTo(String value) {
            addCriterion("jobTitle >=", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleLessThan(String value) {
            addCriterion("jobTitle <", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleLessThanOrEqualTo(String value) {
            addCriterion("jobTitle <=", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleLike(String value) {
            addCriterion("jobTitle like", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleNotLike(String value) {
            addCriterion("jobTitle not like", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleIn(List<String> values) {
            addCriterion("jobTitle in", values, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleNotIn(List<String> values) {
            addCriterion("jobTitle not in", values, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleBetween(String value1, String value2) {
            addCriterion("jobTitle between", value1, value2, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleNotBetween(String value1, String value2) {
            addCriterion("jobTitle not between", value1, value2, "jobtitle");
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