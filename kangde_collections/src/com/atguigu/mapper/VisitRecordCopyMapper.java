package com.atguigu.mapper;

import com.atguigu.bean.VisitRecordCopy;
import com.atguigu.bean.VisitRecordCopyWithBLOBs;

public interface VisitRecordCopyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_record_copy
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_record_copy
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int insert(VisitRecordCopyWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_record_copy
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int insertSelective(VisitRecordCopyWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_record_copy
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    VisitRecordCopyWithBLOBs selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_record_copy
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int updateByPrimaryKeySelective(VisitRecordCopyWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_record_copy
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(VisitRecordCopyWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_record_copy
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int updateByPrimaryKey(VisitRecordCopy record);
}