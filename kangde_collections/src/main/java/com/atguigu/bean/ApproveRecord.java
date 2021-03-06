package com.atguigu.bean;

import java.util.Date;

public class ApproveRecord {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column approve_record.id
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column approve_record.case_id
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    private String caseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column approve_record.apply_reason
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    private String applyReason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column approve_record.approve_state
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    private Integer approveState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column approve_record.approve_opinion
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    private String approveOpinion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column approve_record.create_emp_id
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    private String createEmpId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column approve_record.create_time
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column approve_record.apply_emp_id
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    private String applyEmpId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column approve_record.apply_time
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    private Date applyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column approve_record.stay_reason
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    private String stayReason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column approve_record.stay_time
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    private Date stayTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column approve_record.stay_period
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    private Date stayPeriod;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column approve_record.modify_time
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column approve_record.remark
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column approve_record.id
     *
     * @return the value of approve_record.id
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column approve_record.id
     *
     * @param id the value for approve_record.id
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column approve_record.case_id
     *
     * @return the value of approve_record.case_id
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public String getCaseId() {
        return caseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column approve_record.case_id
     *
     * @param caseId the value for approve_record.case_id
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public void setCaseId(String caseId) {
        this.caseId = caseId == null ? null : caseId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column approve_record.apply_reason
     *
     * @return the value of approve_record.apply_reason
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public String getApplyReason() {
        return applyReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column approve_record.apply_reason
     *
     * @param applyReason the value for approve_record.apply_reason
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason == null ? null : applyReason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column approve_record.approve_state
     *
     * @return the value of approve_record.approve_state
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public Integer getApproveState() {
        return approveState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column approve_record.approve_state
     *
     * @param approveState the value for approve_record.approve_state
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public void setApproveState(Integer approveState) {
        this.approveState = approveState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column approve_record.approve_opinion
     *
     * @return the value of approve_record.approve_opinion
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public String getApproveOpinion() {
        return approveOpinion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column approve_record.approve_opinion
     *
     * @param approveOpinion the value for approve_record.approve_opinion
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public void setApproveOpinion(String approveOpinion) {
        this.approveOpinion = approveOpinion == null ? null : approveOpinion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column approve_record.create_emp_id
     *
     * @return the value of approve_record.create_emp_id
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public String getCreateEmpId() {
        return createEmpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column approve_record.create_emp_id
     *
     * @param createEmpId the value for approve_record.create_emp_id
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public void setCreateEmpId(String createEmpId) {
        this.createEmpId = createEmpId == null ? null : createEmpId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column approve_record.create_time
     *
     * @return the value of approve_record.create_time
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column approve_record.create_time
     *
     * @param createTime the value for approve_record.create_time
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column approve_record.apply_emp_id
     *
     * @return the value of approve_record.apply_emp_id
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public String getApplyEmpId() {
        return applyEmpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column approve_record.apply_emp_id
     *
     * @param applyEmpId the value for approve_record.apply_emp_id
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public void setApplyEmpId(String applyEmpId) {
        this.applyEmpId = applyEmpId == null ? null : applyEmpId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column approve_record.apply_time
     *
     * @return the value of approve_record.apply_time
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public Date getApplyTime() {
        return applyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column approve_record.apply_time
     *
     * @param applyTime the value for approve_record.apply_time
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column approve_record.stay_reason
     *
     * @return the value of approve_record.stay_reason
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public String getStayReason() {
        return stayReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column approve_record.stay_reason
     *
     * @param stayReason the value for approve_record.stay_reason
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public void setStayReason(String stayReason) {
        this.stayReason = stayReason == null ? null : stayReason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column approve_record.stay_time
     *
     * @return the value of approve_record.stay_time
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public Date getStayTime() {
        return stayTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column approve_record.stay_time
     *
     * @param stayTime the value for approve_record.stay_time
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public void setStayTime(Date stayTime) {
        this.stayTime = stayTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column approve_record.stay_period
     *
     * @return the value of approve_record.stay_period
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public Date getStayPeriod() {
        return stayPeriod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column approve_record.stay_period
     *
     * @param stayPeriod the value for approve_record.stay_period
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public void setStayPeriod(Date stayPeriod) {
        this.stayPeriod = stayPeriod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column approve_record.modify_time
     *
     * @return the value of approve_record.modify_time
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column approve_record.modify_time
     *
     * @param modifyTime the value for approve_record.modify_time
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column approve_record.remark
     *
     * @return the value of approve_record.remark
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column approve_record.remark
     *
     * @param remark the value for approve_record.remark
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}