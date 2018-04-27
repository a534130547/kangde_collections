package com.atguigu.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atguigu.bean.Datas;
import com.atguigu.bean.SysOrganization;
import com.atguigu.service.SysOrganizationService;

@Controller
public class SysOrganizationController {

	@Autowired
	SysOrganizationService sysOrganizationService;

	@RequestMapping("get_SysOrganization_by_id")
	@ResponseBody
	public SysOrganization getSysOrganizationById(int id) {

		SysOrganization sys = sysOrganizationService.getSysOrganizationById(id);

		return sys;
	}

	@RequestMapping("select_parentId")
	@ResponseBody
	public List<Integer> select_parentId() {

		List<Integer> parent_Ids = sysOrganizationService.select_parentId();

		return parent_Ids;
	}

	@RequestMapping("get_SysOrganization")
	@ResponseBody
	public List<SysOrganization> get_SysOrganization() {

		List<SysOrganization> all = sysOrganizationService.selectAll();
		Map<Integer, SysOrganization> map = new HashMap<Integer, SysOrganization>();

		// 将得到的结果放到一个key为id的集合中
		for (SysOrganization sysOrganization : all) {
			map.put(sysOrganization.getId(), sysOrganization);
		}

		// 封装父节点的集合
		List<SysOrganization> list = new ArrayList<SysOrganization>();
		for (SysOrganization sysOrganization : all) {

			// 遍历集合，找到父节点和子节点
			if (0 == sysOrganization.getParentId()) {

				// 此节点为父节点
				list.add(sysOrganization);
			} else {

				// 不是父节点，找到该节点的父节点
				SysOrganization sysOrganizationParent = map.get(sysOrganization.getParentId());
				sysOrganizationParent.getChildren().add(sysOrganization);
			}
		}
		return list;
	}

	@RequestMapping("goto_sys_organization")
	public String goto_zuzhijigou(ModelMap map) {

		List<SysOrganization> list = sysOrganizationService.selectAll();

		map.put("SysOrganizationlist", list);

		return "sys_organization";
	}

	@RequestMapping("add_SysOrganization")
	public String addSysOrganization(SysOrganization SysOrganization) {
		// 设置创建时间
		SysOrganization.setCreateTime(new Date());
		// 设置更新时间
		SysOrganization.setModifyTime(new Date());

		// 设置status
		SysOrganization.setStatus(1);

		// 设置当前版本
		SysOrganization.setVersion(1);

		sysOrganizationService.add(SysOrganization);

		return "redirect:/get_SysOrganization.do";
	}

	@RequestMapping("delete_SysOrganization")
	public String deleteSysOrganization(int id) {

		sysOrganizationService.deleteById(id);

		List<SysOrganization> list = sysOrganizationService.selectChildren(id);

		for (SysOrganization sysOrganization : list) {
			sysOrganizationService.deleteById(sysOrganization.getId());
		}

		return "redirect:/get_SysOrganization.do";

	}

	// 批量删除，从前端传的参数为字符串
	@RequestMapping("delete_SysOrganizationBatch")
	public boolean delete_SysOrganizationBatch(String ds) {
		System.out.println(ds);
		String[] split = ds.split("_");
		for (int i = 1; i < split.length; i++) {
			System.out.println(split[i]);
			int id = Integer.parseInt(split[i]);
			deleteSysOrganization(id);
		}
		return true;
	}

	@RequestMapping("update_SysOrganization")
	public String updateSysOrganization(SysOrganization SysOrganization) {
		// 更新修改时间
		SysOrganization.setModifyTime(new Date());

		// 查询SysOrganization
		SysOrganization sysOrganizationById = sysOrganizationService.getSysOrganizationById(SysOrganization.getId());
		// 如果地址为空，将原地址设置为
		if (SysOrganization.getAddress() == null) {

			SysOrganization.setAddress(sysOrganizationById.getAddress());
		}

		System.out.println(SysOrganization.getPhone());
		// 如果phone为空，将原地址设置为
		if (SysOrganization.getPhone() == null) {

			SysOrganization.setPhone(sysOrganizationById.getPhone());

			System.out.println(SysOrganization.getPhone());
		}

		// 设置code
		if (SysOrganization.getCode() == null) {

			SysOrganization.setCode(sysOrganizationById.getCode());
		}
		// 设置创建时间
		if (SysOrganization.getCreateTime() == null) {

			SysOrganization.setCreateTime(sysOrganizationById.getCreateTime());
		}
		// 设置fax
		if (SysOrganization.getFax() == null) {

			SysOrganization.setFax(sysOrganizationById.getFax());
		}
		// 设置修改时间
		if (SysOrganization.getModifyTime() == null) {

			SysOrganization.setModifyTime(new Date());
		}
		// 设置
		if (SysOrganization.getName() == null) {

			SysOrganization.setName(sysOrganizationById.getName());
		}
		// 设置orderNo
		if (SysOrganization.getOrderNo() == null) {

			SysOrganization.setOrderNo(sysOrganizationById.getOrderNo());
		}
		// 设置上级id
		if (SysOrganization.getParentId() == null) {

			SysOrganization.setParentId(sysOrganizationById.getParentId());
		}
		// 设置path
		if (SysOrganization.getPath() == null) {

			SysOrganization.setPath(sysOrganizationById.getPath());
		}
		// 设置postcode
		if (SysOrganization.getPostCode() == null) {

			SysOrganization.setPostCode(sysOrganizationById.getPostCode());
		}

		// 设置负责人id
		if (SysOrganization.getPrincipalId() == null) {

			SysOrganization.setParentId(sysOrganizationById.getParentId());
		}

		// 设置status
		if (SysOrganization.getStatus() == null) {

			SysOrganization.setStatus(sysOrganizationById.getStatus());
		}

		// 设置type
		if (SysOrganization.getType() == null) {

			SysOrganization.setType(sysOrganizationById.getType());
		}

		// 设置版本

		SysOrganization.setVersion(sysOrganizationById.getVersion() + 1);

		sysOrganizationService.update(SysOrganization);

		return "redirect:/get_SysOrganization.do";
	}

}