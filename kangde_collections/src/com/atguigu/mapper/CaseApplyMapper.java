package com.atguigu.mapper;

import com.atguigu.bean.CaseApply;
import com.atguigu.bean.CaseApplyWithBLOBs;

public interface CaseApplyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_apply
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_apply
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int insert(CaseApplyWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_apply
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int insertSelective(CaseApplyWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_apply
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    CaseApplyWithBLOBs selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_apply
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int updateByPrimaryKeySelective(CaseApplyWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_apply
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(CaseApplyWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_apply
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int updateByPrimaryKey(CaseApply record);
}