package com.atguigu.mapper;

import com.atguigu.bean.ApproveRecord;

public interface ApproveRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approve_record
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approve_record
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int insert(ApproveRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approve_record
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int insertSelective(ApproveRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approve_record
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    ApproveRecord selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approve_record
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int updateByPrimaryKeySelective(ApproveRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approve_record
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(ApproveRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approve_record
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int updateByPrimaryKey(ApproveRecord record);
}