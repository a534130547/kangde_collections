package com.atguigu.service;

import java.util.List;
import java.util.Map;

import com.atguigu.bean.EmployeeInfoWithBLOBs;
import com.atguigu.bean.SubjectEmployeeInfo;

public interface EmployeeService {

	EmployeeInfoWithBLOBs getEmployeeById(int id);

	List<SubjectEmployeeInfo> selectAll();

	void add(EmployeeInfoWithBLOBs employeeInfo);

	void deleteById(int id);

	void update(EmployeeInfoWithBLOBs employeeInfo);

	void endEmployeeStatusById(Integer id);

	void startEmployeeStatusById(Integer id);

	List<SubjectEmployeeInfo> selectSerchEmployee(Map<Object, Object> map);


}
