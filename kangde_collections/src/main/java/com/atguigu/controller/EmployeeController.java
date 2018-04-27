package com.atguigu.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atguigu.bean.EmployeeInfoWithBLOBs;
import com.atguigu.bean.SearchEmployee;
import com.atguigu.bean.SubjectEmployeeInfo;
import com.atguigu.bean.SysOrganization;
import com.atguigu.bean.SysPosition;
import com.atguigu.service.EmployeeService;
import com.atguigu.service.SysOrganizationService;
import com.atguigu.service.SysPositionService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	@Autowired
	SysOrganizationService sysOrganizationService;

	@Autowired
	SysPositionService sysPositionService;

	@RequestMapping("select_attachOrg")
	@ResponseBody
	public Object select_attachOrg(Integer attachOrgIdId) {

		SysOrganization sysOrganizationById = sysOrganizationService.getSysOrganizationById(attachOrgIdId);

		return sysOrganizationById;
	}

	@RequestMapping("select_positionIdId")
	@ResponseBody
	public Object select_positionIdId(Integer positionIdId) {

		SysPosition sysPositionById = sysPositionService.getSysPositionById(positionIdId);

		return sysPositionById;
	}

	@RequestMapping("get_Employee_by_id")
	@ResponseBody
	public EmployeeInfoWithBLOBs getEmployeeById(int id) {

		EmployeeInfoWithBLOBs emp = employeeService.getEmployeeById(id);

		return emp;
	}

	@RequestMapping("get_Employee")
	@ResponseBody
	public List<SubjectEmployeeInfo> get_Employee() {

		List<SubjectEmployeeInfo> all = employeeService.selectAll();

		for (SubjectEmployeeInfo emp : all) {

			if (1 == emp.getStatus()) {
				emp.setEmployeeStatus("正在使用");

			} else {
				emp.setEmployeeStatus("停止使用");

			}
		}
		return all;
	}

	@RequestMapping("get_SearchEmployee")
	@ResponseBody
	public List<SubjectEmployeeInfo> get_Employee(SearchEmployee searchEmployee) {

		Map<Object, Object> map = new HashMap<Object, Object>();

		String account = searchEmployee.getAccount();
		String userName = searchEmployee.getUserName();
		if ("" == searchEmployee.getUserName()) {
			userName = null;
		}
		if ("" == searchEmployee.getAccount()) {
			account = null;
		}
		if (account != null) {
			if (account.indexOf("\\") != -1) {
				account = account.replaceAll("\\\\", "\\\\\\\\");
			}
			if (account.indexOf("%") != -1) {
				account = account.replaceAll("%", "\\\\%");
			}
			if (account.indexOf("_") != -1) {
				account = account.replaceAll("_", "\\\\_");
			}
		}
		if (userName != null) {
			if (userName.indexOf("\\") != -1) {
				userName = userName.replaceAll("\\\\", "\\\\\\\\");
			}
			if (userName.indexOf("%") != -1) {
				userName = userName.replaceAll("%", "\\\\%");
			}
			if (userName.indexOf("_") != -1) {
				userName = userName.replaceAll("_", "\\\\_");
			}
		}
		map.put("account", account);
		map.put("employeeStatusId", searchEmployee.getEmployeeStatusId());
		map.put("orgSearchId", searchEmployee.getOrgSearchId());
		map.put("username", userName);
		List<SubjectEmployeeInfo> all = employeeService.selectSerchEmployee(map);

		for (SubjectEmployeeInfo emp : all) {

			if (1 == emp.getStatus()) {
				emp.setEmployeeStatus("正在使用");
			} else {
				emp.setEmployeeStatus("停止使用");
			}
		}
		return all;
	}

	@RequestMapping("goto_Employee")
	public String goto_sys_position(ModelMap map) {

		List<SysOrganization> all = sysOrganizationService.selectAll();

		List<SysPosition> selectAll = sysPositionService.selectAll();

		map.put("sysList", all);

		map.put("poList", selectAll);

		return "employee";
	}

	@RequestMapping("add_Employee")
	public String addEmployee(EmployeeInfoWithBLOBs employeeInfo) {

		employeeInfo.setStatus(1);

		employeeInfo.setModifyTime(new Date());

		employeeInfo.setCreateTime(new Date());
		employeeInfo.setVersion(1);

		employeeService.add(employeeInfo);

		return "redirect:/index.do";
	}

	@RequestMapping("delete_Employee")
	public String deleteEmployee(int id) {

		employeeService.deleteById(id);

		return "redirect:/index.do";
	}

	@RequestMapping("update_Employee")
	public String updateEmployee(EmployeeInfoWithBLOBs employeeInfo) {

		EmployeeInfoWithBLOBs employeeById = employeeService.getEmployeeById(employeeInfo.getId());

		employeeInfo.setModifyTime(new Date());

		employeeInfo.setVersion(employeeById.getVersion() + 1);

		employeeService.update(employeeInfo);

		return "redirect:/index.do";
	}

	@RequestMapping("end_employee")
	public String end_employee(Integer id) {

		employeeService.endEmployeeStatusById(id);

		return "redirect:/goto_Employee.do";
	}

	@RequestMapping("start_employee")
	public String start_employee(Integer id) {

		employeeService.startEmployeeStatusById(id);

		return "redirect:/goto_Employee.do";
	}
}