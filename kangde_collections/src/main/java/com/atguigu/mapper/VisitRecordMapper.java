package com.atguigu.mapper;

import com.atguigu.bean.VisitRecord;
import com.atguigu.bean.VisitRecordWithBLOBs;

public interface VisitRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_record
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_record
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int insert(VisitRecordWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_record
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int insertSelective(VisitRecordWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_record
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    VisitRecordWithBLOBs selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_record
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int updateByPrimaryKeySelective(VisitRecordWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_record
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(VisitRecordWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_record
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int updateByPrimaryKey(VisitRecord record);
}