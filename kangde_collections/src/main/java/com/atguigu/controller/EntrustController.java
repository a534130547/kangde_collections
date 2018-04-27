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

import com.atguigu.bean.Entrust;
import com.atguigu.bean.EntrustWithBLOBs;
import com.atguigu.bean.EntrustWithCustomerStatus;
import com.atguigu.bean.SearchEntrust;
import com.atguigu.service.EntrustService;

@Controller
public class EntrustController {

	@Autowired
	EntrustService entrustService;

	@RequestMapping("get_Entrust_by_id")
	@ResponseBody
	public Entrust getEntrustById(int id) {

		Entrust ent = entrustService.getEntrustById(id);

		return ent;
	}

	@RequestMapping("get_Entrust")
	@ResponseBody
	public List<EntrustWithCustomerStatus> get_Entrust() {

		List<EntrustWithCustomerStatus> all = entrustService.selectAllWithCustomerStatus();

		// EntrustWithEmployeeStatus

		for (EntrustWithCustomerStatus entrustWithEmployeeStatus : all) {

			if (1 == entrustWithEmployeeStatus.getState()) {
				entrustWithEmployeeStatus.setCustomerStatus("正在使用");

			} else {
				entrustWithEmployeeStatus.setCustomerStatus("停止使用");

			}

		}

		return all;

	}

	@RequestMapping("get_SearchEntrust")
	@ResponseBody
	public List<EntrustWithCustomerStatus> get_SearchEntrust(SearchEntrust searchEntrust) {

		Map<Object, Object> map = new HashMap<Object, Object>();

		String name = searchEntrust.getName();

		String endTime = searchEntrust.getEndTime();

		String startTime = searchEntrust.getStartTime();

		if ("" == name) {
			name = null;
		}
		if (name != null) {
			if (name.indexOf("\\") != -1) {
				name = name.replaceAll("\\\\", "\\\\\\\\");
			}
			if (name.indexOf("%") != -1) {
				name = name.replaceAll("%", "\\\\%");
			}
			if (name.indexOf("_") != -1) {
				name = name.replaceAll("_", "\\\\_");
			}
		}
		map.put("name", name);
		map.put("endTime", endTime);
		map.put("startTime", startTime);
		List<EntrustWithCustomerStatus> all = entrustService.selectSerchEntrust(map);

		for (EntrustWithCustomerStatus emp : all) {

			if (1 == emp.getState()) {
				emp.setCustomerStatus("正在使用");
			} else {
				emp.setCustomerStatus("停止使用");
			}
		}
		return all;
	}

	@RequestMapping("goto_Entrust")
	public String goto_sys_position(ModelMap map) {

		List<Entrust> list = entrustService.selectAll();

		map.put("Entrustlist", list);

		return "entrust";
	}

	@RequestMapping("add_Entrust")
	public String addEntrust(EntrustWithBLOBs entrust) {
		// 设置创建时间
		entrust.setCreateTime(new Date());
		// 设置更新时间
		entrust.setModifyTime(new Date());

		entrust.setState(1);

		entrustService.add(entrust);

		return "redirect:/index.do";
	}

	@RequestMapping("delete_Entrust")
	public String deleteEntrust(int id) {

		entrustService.deleteById(id);

		return "redirect:/index.do";
	}

	@RequestMapping("update_Entrust")
	public String updateEntrust(EntrustWithBLOBs entrust) {

		System.out.println(entrust.getAddress());

		// 更新修改时间
		entrust.setModifyTime(new Date());

		// 查询Entrust
		Entrust entrustById = entrustService.getEntrustById(entrust.getId());

		// 设置创建时间
		if (entrust.getCreateTime() == null) {

			entrust.setCreateTime(entrustById.getCreateTime());
		}

		// 设置修改时间
		if (entrust.getModifyTime() == null) {

			entrust.setModifyTime(new Date());
		}
		// 设置
		if (entrust.getName() == null) {

			entrust.setName(entrustById.getName());
		}

		entrustService.update(entrust);

		return "redirect:/index.do";
	}

	@RequestMapping("end_entrust")
	public String end_entrust(Integer id) {

		entrustService.endEntrustCustomerStatusById(id);

		return "redirect:/goto_Entrust.do";
	}

	@RequestMapping("start_entrust")
	public String start_entrust(Integer id) {

		entrustService.startEntrustCustomerStatusById(id);

		return "redirect:/goto_Entrust.do";
	}

}