package com.atguigu.bean;

public class SysRoleResourceRelationKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_resource_relation.role_id
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    private String roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_resource_relation.resource_id
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    private String resourceId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_resource_relation.role_id
     *
     * @return the value of sys_role_resource_relation.role_id
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_resource_relation.role_id
     *
     * @param roleId the value for sys_role_resource_relation.role_id
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_resource_relation.resource_id
     *
     * @return the value of sys_role_resource_relation.resource_id
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_resource_relation.resource_id
     *
     * @param resourceId the value for sys_role_resource_relation.resource_id
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId == null ? null : resourceId.trim();
    }
}