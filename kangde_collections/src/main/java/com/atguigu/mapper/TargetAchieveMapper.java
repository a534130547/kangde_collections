package com.atguigu.mapper;

import com.atguigu.bean.TargetAchieve;

public interface TargetAchieveMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table target_achieve
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table target_achieve
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int insert(TargetAchieve record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table target_achieve
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int insertSelective(TargetAchieve record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table target_achieve
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    TargetAchieve selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table target_achieve
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int updateByPrimaryKeySelective(TargetAchieve record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table target_achieve
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int updateByPrimaryKey(TargetAchieve record);
}