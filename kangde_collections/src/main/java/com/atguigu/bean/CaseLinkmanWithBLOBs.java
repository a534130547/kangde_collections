package com.atguigu.bean;

public class CaseLinkmanWithBLOBs extends CaseLinkman {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_linkman.address
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_linkman.remark
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_linkman.address
     *
     * @return the value of case_linkman.address
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_linkman.address
     *
     * @param address the value for case_linkman.address
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_linkman.remark
     *
     * @return the value of case_linkman.remark
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_linkman.remark
     *
     * @param remark the value for case_linkman.remark
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}