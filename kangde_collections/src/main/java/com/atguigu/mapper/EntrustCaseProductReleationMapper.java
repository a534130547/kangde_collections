package com.atguigu.mapper;

import com.atguigu.bean.EntrustCaseProductReleation;

public interface EntrustCaseProductReleationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entrust_case_product_releation
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entrust_case_product_releation
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int insert(EntrustCaseProductReleation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entrust_case_product_releation
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int insertSelective(EntrustCaseProductReleation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entrust_case_product_releation
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    EntrustCaseProductReleation selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entrust_case_product_releation
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int updateByPrimaryKeySelective(EntrustCaseProductReleation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entrust_case_product_releation
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int updateByPrimaryKey(EntrustCaseProductReleation record);
}