package com.atguigu.mapper;

import com.atguigu.bean.CaseRate;

public interface CaseRateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_rate
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_rate
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int insert(CaseRate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_rate
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int insertSelective(CaseRate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_rate
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    CaseRate selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_rate
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int updateByPrimaryKeySelective(CaseRate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_rate
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int updateByPrimaryKey(CaseRate record);
}