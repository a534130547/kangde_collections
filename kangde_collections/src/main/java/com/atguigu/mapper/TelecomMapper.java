package com.atguigu.mapper;

import com.atguigu.bean.Telecom;

public interface TelecomMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table telecom
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table telecom
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int insert(Telecom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table telecom
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int insertSelective(Telecom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table telecom
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    Telecom selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table telecom
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int updateByPrimaryKeySelective(Telecom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table telecom
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(Telecom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table telecom
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int updateByPrimaryKey(Telecom record);
}