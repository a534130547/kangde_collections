package com.atguigu.bean;

public class CusArea {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cus_area.are_id
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    private Long areId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cus_area.are_name
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    private String areName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cus_area.are_isenabled
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    private String areIsenabled;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cus_area.are_id
     *
     * @return the value of cus_area.are_id
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public Long getAreId() {
        return areId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cus_area.are_id
     *
     * @param areId the value for cus_area.are_id
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public void setAreId(Long areId) {
        this.areId = areId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cus_area.are_name
     *
     * @return the value of cus_area.are_name
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public String getAreName() {
        return areName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cus_area.are_name
     *
     * @param areName the value for cus_area.are_name
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public void setAreName(String areName) {
        this.areName = areName == null ? null : areName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cus_area.are_isenabled
     *
     * @return the value of cus_area.are_isenabled
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public String getAreIsenabled() {
        return areIsenabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cus_area.are_isenabled
     *
     * @param areIsenabled the value for cus_area.are_isenabled
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public void setAreIsenabled(String areIsenabled) {
        this.areIsenabled = areIsenabled == null ? null : areIsenabled.trim();
    }
}