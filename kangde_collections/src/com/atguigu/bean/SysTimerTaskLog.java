package com.atguigu.bean;

import java.util.Date;

public class SysTimerTaskLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_timer_task_log.id
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_timer_task_log.task_name
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    private String taskName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_timer_task_log.state
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    private Boolean state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_timer_task_log.time_consuming
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    private Integer timeConsuming;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_timer_task_log.server_host_name
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    private String serverHostName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_timer_task_log.server_host_addr
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    private String serverHostAddr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_timer_task_log.create_time
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_timer_task_log.start_time
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    private Date startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_timer_task_log.previous_fire_time
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    private Date previousFireTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_timer_task_log.next_fire_time
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    private Date nextFireTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_timer_task_log.exception_info
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    private String exceptionInfo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_timer_task_log.id
     *
     * @return the value of sys_timer_task_log.id
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_timer_task_log.id
     *
     * @param id the value for sys_timer_task_log.id
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_timer_task_log.task_name
     *
     * @return the value of sys_timer_task_log.task_name
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_timer_task_log.task_name
     *
     * @param taskName the value for sys_timer_task_log.task_name
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_timer_task_log.state
     *
     * @return the value of sys_timer_task_log.state
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public Boolean getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_timer_task_log.state
     *
     * @param state the value for sys_timer_task_log.state
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public void setState(Boolean state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_timer_task_log.time_consuming
     *
     * @return the value of sys_timer_task_log.time_consuming
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public Integer getTimeConsuming() {
        return timeConsuming;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_timer_task_log.time_consuming
     *
     * @param timeConsuming the value for sys_timer_task_log.time_consuming
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public void setTimeConsuming(Integer timeConsuming) {
        this.timeConsuming = timeConsuming;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_timer_task_log.server_host_name
     *
     * @return the value of sys_timer_task_log.server_host_name
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public String getServerHostName() {
        return serverHostName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_timer_task_log.server_host_name
     *
     * @param serverHostName the value for sys_timer_task_log.server_host_name
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public void setServerHostName(String serverHostName) {
        this.serverHostName = serverHostName == null ? null : serverHostName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_timer_task_log.server_host_addr
     *
     * @return the value of sys_timer_task_log.server_host_addr
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public String getServerHostAddr() {
        return serverHostAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_timer_task_log.server_host_addr
     *
     * @param serverHostAddr the value for sys_timer_task_log.server_host_addr
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public void setServerHostAddr(String serverHostAddr) {
        this.serverHostAddr = serverHostAddr == null ? null : serverHostAddr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_timer_task_log.create_time
     *
     * @return the value of sys_timer_task_log.create_time
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_timer_task_log.create_time
     *
     * @param createTime the value for sys_timer_task_log.create_time
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_timer_task_log.start_time
     *
     * @return the value of sys_timer_task_log.start_time
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_timer_task_log.start_time
     *
     * @param startTime the value for sys_timer_task_log.start_time
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_timer_task_log.previous_fire_time
     *
     * @return the value of sys_timer_task_log.previous_fire_time
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public Date getPreviousFireTime() {
        return previousFireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_timer_task_log.previous_fire_time
     *
     * @param previousFireTime the value for sys_timer_task_log.previous_fire_time
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public void setPreviousFireTime(Date previousFireTime) {
        this.previousFireTime = previousFireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_timer_task_log.next_fire_time
     *
     * @return the value of sys_timer_task_log.next_fire_time
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public Date getNextFireTime() {
        return nextFireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_timer_task_log.next_fire_time
     *
     * @param nextFireTime the value for sys_timer_task_log.next_fire_time
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public void setNextFireTime(Date nextFireTime) {
        this.nextFireTime = nextFireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_timer_task_log.exception_info
     *
     * @return the value of sys_timer_task_log.exception_info
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public String getExceptionInfo() {
        return exceptionInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_timer_task_log.exception_info
     *
     * @param exceptionInfo the value for sys_timer_task_log.exception_info
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    public void setExceptionInfo(String exceptionInfo) {
        this.exceptionInfo = exceptionInfo == null ? null : exceptionInfo.trim();
    }
}