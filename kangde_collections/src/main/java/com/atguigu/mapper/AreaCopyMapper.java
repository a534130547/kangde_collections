package com.atguigu.mapper;

import com.atguigu.bean.AreaCopy;

public interface AreaCopyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area_copy
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area_copy
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int insert(AreaCopy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area_copy
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int insertSelective(AreaCopy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area_copy
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    AreaCopy selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area_copy
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int updateByPrimaryKeySelective(AreaCopy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area_copy
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int updateByPrimaryKey(AreaCopy record);
}