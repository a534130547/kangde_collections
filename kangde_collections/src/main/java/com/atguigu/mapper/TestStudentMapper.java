package com.atguigu.mapper;

import com.atguigu.bean.TestStudent;

public interface TestStudentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_student
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_student
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int insert(TestStudent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_student
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int insertSelective(TestStudent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_student
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    TestStudent selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_student
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int updateByPrimaryKeySelective(TestStudent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_student
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int updateByPrimaryKey(TestStudent record);
}