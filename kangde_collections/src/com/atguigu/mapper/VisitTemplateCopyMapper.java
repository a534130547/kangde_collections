package com.atguigu.mapper;

import com.atguigu.bean.VisitTemplateCopy;

public interface VisitTemplateCopyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_template_copy
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_template_copy
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int insert(VisitTemplateCopy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_template_copy
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int insertSelective(VisitTemplateCopy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_template_copy
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    VisitTemplateCopy selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_template_copy
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int updateByPrimaryKeySelective(VisitTemplateCopy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_template_copy
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(VisitTemplateCopy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_template_copy
     *
     * @mbggenerated Sat Apr 21 08:53:52 CST 2018
     */
    int updateByPrimaryKey(VisitTemplateCopy record);
}