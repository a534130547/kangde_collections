package com.atguigu.mapper;

import com.atguigu.bean.CaseBatch;
import com.atguigu.bean.CaseBatchWithBLOBs;

public interface CaseBatchMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_batch
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_batch
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int insert(CaseBatchWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_batch
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int insertSelective(CaseBatchWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_batch
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    CaseBatchWithBLOBs selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_batch
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int updateByPrimaryKeySelective(CaseBatchWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_batch
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(CaseBatchWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_batch
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int updateByPrimaryKey(CaseBatch record);
}