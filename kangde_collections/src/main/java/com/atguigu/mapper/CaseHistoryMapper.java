package com.atguigu.mapper;

import com.atguigu.bean.CaseHistory;
import com.atguigu.bean.CaseHistoryWithBLOBs;

public interface CaseHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_history
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_history
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int insert(CaseHistoryWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_history
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int insertSelective(CaseHistoryWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_history
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    CaseHistoryWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_history
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int updateByPrimaryKeySelective(CaseHistoryWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_history
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(CaseHistoryWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_history
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int updateByPrimaryKey(CaseHistory record);
}