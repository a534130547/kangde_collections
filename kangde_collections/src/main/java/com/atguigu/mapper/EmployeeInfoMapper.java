package com.atguigu.mapper;

import java.util.List;
import java.util.Map;

import com.atguigu.bean.EmployeeInfo;
import com.atguigu.bean.EmployeeInfoWithBLOBs;
import com.atguigu.bean.SubjectEmployeeInfo;

public interface EmployeeInfoMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee_info
	 *
	 * @mbggenerated Sat Apr 21 11:25:08 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee_info
	 *
	 * @mbggenerated Sat Apr 21 11:25:08 CST 2018
	 */
	int insert(EmployeeInfoWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee_info
	 *
	 * @mbggenerated Sat Apr 21 11:25:08 CST 2018
	 */
	int insertSelective(EmployeeInfoWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee_info
	 *
	 * @mbggenerated Sat Apr 21 11:25:08 CST 2018
	 */
	EmployeeInfoWithBLOBs selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee_info
	 *
	 * @mbggenerated Sat Apr 21 11:25:08 CST 2018
	 */
	int updateByPrimaryKeySelective(EmployeeInfoWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee_info
	 *
	 * @mbggenerated Sat Apr 21 11:25:08 CST 2018
	 */
	int updateByPrimaryKeyWithBLOBs(EmployeeInfoWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table employee_info
	 *
	 * @mbggenerated Sat Apr 21 11:25:08 CST 2018
	 */
	int updateByPrimaryKey(EmployeeInfo record);

	List<SubjectEmployeeInfo> selectAll();

	void endEmployeeStatusById(Map<String,Integer> map);

	void startEmployeeStatusById(Map<String,Integer> map);

	List<SubjectEmployeeInfo> selectSerchEmployee(Map<Object, Object> map);
}