package com.atguigu.bean;

import java.math.BigDecimal;
import java.util.Date;

public class CasePerson {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_person.id
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_person.version
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    private Integer version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_person.status
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_person.case_id
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    private String caseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_person.case_name
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    private String caseName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_person.case_money
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    private BigDecimal caseMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_person.create_emp_id
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    private String createEmpId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_person.modify_emp_id
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    private String modifyEmpId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_person.modify_time
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_person.create_time
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_person.id
     *
     * @return the value of case_person.id
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_person.id
     *
     * @param id the value for case_person.id
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_person.version
     *
     * @return the value of case_person.version
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_person.version
     *
     * @param version the value for case_person.version
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_person.status
     *
     * @return the value of case_person.status
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_person.status
     *
     * @param status the value for case_person.status
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_person.case_id
     *
     * @return the value of case_person.case_id
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public String getCaseId() {
        return caseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_person.case_id
     *
     * @param caseId the value for case_person.case_id
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public void setCaseId(String caseId) {
        this.caseId = caseId == null ? null : caseId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_person.case_name
     *
     * @return the value of case_person.case_name
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public String getCaseName() {
        return caseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_person.case_name
     *
     * @param caseName the value for case_person.case_name
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public void setCaseName(String caseName) {
        this.caseName = caseName == null ? null : caseName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_person.case_money
     *
     * @return the value of case_person.case_money
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public BigDecimal getCaseMoney() {
        return caseMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_person.case_money
     *
     * @param caseMoney the value for case_person.case_money
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public void setCaseMoney(BigDecimal caseMoney) {
        this.caseMoney = caseMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_person.create_emp_id
     *
     * @return the value of case_person.create_emp_id
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public String getCreateEmpId() {
        return createEmpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_person.create_emp_id
     *
     * @param createEmpId the value for case_person.create_emp_id
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public void setCreateEmpId(String createEmpId) {
        this.createEmpId = createEmpId == null ? null : createEmpId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_person.modify_emp_id
     *
     * @return the value of case_person.modify_emp_id
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public String getModifyEmpId() {
        return modifyEmpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_person.modify_emp_id
     *
     * @param modifyEmpId the value for case_person.modify_emp_id
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public void setModifyEmpId(String modifyEmpId) {
        this.modifyEmpId = modifyEmpId == null ? null : modifyEmpId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_person.modify_time
     *
     * @return the value of case_person.modify_time
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_person.modify_time
     *
     * @param modifyTime the value for case_person.modify_time
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_person.create_time
     *
     * @return the value of case_person.create_time
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_person.create_time
     *
     * @param createTime the value for case_person.create_time
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}