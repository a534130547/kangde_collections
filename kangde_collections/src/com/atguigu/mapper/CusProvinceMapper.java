package com.atguigu.mapper;

import com.atguigu.bean.CusProvince;

public interface CusProvinceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cus_province
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int deleteByPrimaryKey(Long prvId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cus_province
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int insert(CusProvince record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cus_province
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int insertSelective(CusProvince record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cus_province
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    CusProvince selectByPrimaryKey(Long prvId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cus_province
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int updateByPrimaryKeySelective(CusProvince record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cus_province
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int updateByPrimaryKey(CusProvince record);
}