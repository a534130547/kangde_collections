package com.atguigu.mapper;

import com.atguigu.bean.SysResourceCopy;

public interface SysResourceCopyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resource_copy
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resource_copy
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int insert(SysResourceCopy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resource_copy
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int insertSelective(SysResourceCopy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resource_copy
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    SysResourceCopy selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resource_copy
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int updateByPrimaryKeySelective(SysResourceCopy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resource_copy
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int updateByPrimaryKey(SysResourceCopy record);
}