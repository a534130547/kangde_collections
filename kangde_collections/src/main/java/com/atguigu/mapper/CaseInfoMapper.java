package com.atguigu.mapper;

import com.atguigu.bean.CaseInfo;
import com.atguigu.bean.CaseInfoWithBLOBs;

public interface CaseInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_info
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_info
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int insert(CaseInfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_info
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int insertSelective(CaseInfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_info
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    CaseInfoWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_info
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int updateByPrimaryKeySelective(CaseInfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_info
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(CaseInfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_info
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int updateByPrimaryKey(CaseInfo record);
}