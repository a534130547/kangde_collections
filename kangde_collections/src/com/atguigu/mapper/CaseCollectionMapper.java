package com.atguigu.mapper;

import com.atguigu.bean.CaseCollection;

public interface CaseCollectionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_collection
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_collection
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int insert(CaseCollection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_collection
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int insertSelective(CaseCollection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_collection
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    CaseCollection selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_collection
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int updateByPrimaryKeySelective(CaseCollection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_collection
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(CaseCollection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_collection
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int updateByPrimaryKey(CaseCollection record);
}