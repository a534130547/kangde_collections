package com.atguigu.mapper;

import com.atguigu.bean.SocialSecurity;

public interface SocialSecurityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table social_security
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table social_security
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int insert(SocialSecurity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table social_security
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int insertSelective(SocialSecurity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table social_security
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    SocialSecurity selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table social_security
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int updateByPrimaryKeySelective(SocialSecurity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table social_security
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(SocialSecurity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table social_security
     *
     * @mbggenerated Sat Apr 21 11:25:08 CST 2018
     */
    int updateByPrimaryKey(SocialSecurity record);
}