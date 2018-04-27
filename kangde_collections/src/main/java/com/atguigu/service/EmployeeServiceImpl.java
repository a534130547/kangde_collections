package com.atguigu.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.bean.EmployeeInfoWithBLOBs;
import com.atguigu.bean.SubjectEmployeeInfo;
import com.atguigu.mapper.EmployeeInfoMapper;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeInfoMapper employeeInfoMapper;

	@Override
	public EmployeeInfoWithBLOBs getEmployeeById(int id) {

		return employeeInfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<SubjectEmployeeInfo> selectAll() {

		return employeeInfoMapper.selectAll();
	}

	@Override
	public void add(EmployeeInfoWithBLOBs employeeInfo) {
		employeeInfoMapper.insert(employeeInfo);

	}

	@Override
	public void deleteById(int id) {
		employeeInfoMapper.deleteByPrimaryKey(id);

	}

	@Override
	public void update(EmployeeInfoWithBLOBs employeeInfo) {
		employeeInfoMapper.updateByPrimaryKey(employeeInfo);

	}

	@Override
	public void endEmployeeStatusById(Integer id) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("end", 0);

		map.put("id", id);
		employeeInfoMapper.endEmployeeStatusById(map);

	}

	@Override
	public void startEmployeeStatusById(Integer id) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("start", 1);

		map.put("id", id);
		employeeInfoMapper.startEmployeeStatusById(map);
	}

	@Override
	public List<SubjectEmployeeInfo> selectSerchEmployee(Map<Object, Object> map) {
	
		System.out.println(map.get("username"));
		
		return 	employeeInfoMapper.selectSerchEmployee(map);
		
	}


}