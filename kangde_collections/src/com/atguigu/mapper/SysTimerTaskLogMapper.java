package com.atguigu.mapper;

import com.atguigu.bean.SysTimerTaskLog;

public interface SysTimerTaskLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_timer_task_log
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_timer_task_log
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int insert(SysTimerTaskLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_timer_task_log
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int insertSelective(SysTimerTaskLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_timer_task_log
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    SysTimerTaskLog selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_timer_task_log
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int updateByPrimaryKeySelective(SysTimerTaskLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_timer_task_log
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(SysTimerTaskLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_timer_task_log
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int updateByPrimaryKey(SysTimerTaskLog record);
}