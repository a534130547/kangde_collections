package com.atguigu.mapper;

import com.atguigu.bean.CasePaidCopy;

public interface CasePaidCopyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_paid_copy
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_paid_copy
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int insert(CasePaidCopy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_paid_copy
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int insertSelective(CasePaidCopy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_paid_copy
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    CasePaidCopy selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_paid_copy
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int updateByPrimaryKeySelective(CasePaidCopy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_paid_copy
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(CasePaidCopy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_paid_copy
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int updateByPrimaryKey(CasePaidCopy record);
}