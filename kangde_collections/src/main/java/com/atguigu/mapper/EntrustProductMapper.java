package com.atguigu.mapper;

import com.atguigu.bean.EntrustProduct;

public interface EntrustProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entrust_product
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entrust_product
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int insert(EntrustProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entrust_product
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int insertSelective(EntrustProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entrust_product
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    EntrustProduct selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entrust_product
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int updateByPrimaryKeySelective(EntrustProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entrust_product
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int updateByPrimaryKey(EntrustProduct record);
}