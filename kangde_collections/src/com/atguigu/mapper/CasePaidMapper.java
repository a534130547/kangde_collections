package com.atguigu.mapper;

import com.atguigu.bean.CasePaid;

public interface CasePaidMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_paid
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_paid
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int insert(CasePaid record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_paid
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int insertSelective(CasePaid record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_paid
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    CasePaid selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_paid
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int updateByPrimaryKeySelective(CasePaid record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_paid
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(CasePaid record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_paid
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int updateByPrimaryKey(CasePaid record);
}