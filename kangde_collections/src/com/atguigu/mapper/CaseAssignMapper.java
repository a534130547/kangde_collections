package com.atguigu.mapper;

import com.atguigu.bean.CaseAssign;

public interface CaseAssignMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_assign
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_assign
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int insert(CaseAssign record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_assign
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int insertSelective(CaseAssign record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_assign
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    CaseAssign selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_assign
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int updateByPrimaryKeySelective(CaseAssign record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_assign
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int updateByPrimaryKey(CaseAssign record);
}