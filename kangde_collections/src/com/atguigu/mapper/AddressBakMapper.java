package com.atguigu.mapper;

import com.atguigu.bean.AddressBak;

public interface AddressBakMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address_bak
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address_bak
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int insert(AddressBak record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address_bak
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int insertSelective(AddressBak record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address_bak
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    AddressBak selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address_bak
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int updateByPrimaryKeySelective(AddressBak record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address_bak
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(AddressBak record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address_bak
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int updateByPrimaryKey(AddressBak record);
}