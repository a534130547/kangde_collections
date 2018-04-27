package com.atguigu.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atguigu.bean.SysPosition;

import com.atguigu.service.SysPositionService;

@Controller
public class SysPositionController {

	@Autowired
	SysPositionService sysPositionService;

	@RequestMapping("get_SysPosition_by_id")
	@ResponseBody
	public SysPosition getSysPositionById(int id) {

		SysPosition sys = sysPositionService.getSysPositionById(id);

		return sys;
	}

	@RequestMapping("get_SysPosition")
	@ResponseBody
	public List<SysPosition> get_SysPosition() {

		List<SysPosition> all = sysPositionService.selectAll();

		return all;
	}

	@RequestMapping("goto_sys_position")
	public String goto_sys_position(ModelMap map) {

		List<SysPosition> list = sysPositionService.selectAll();

		map.put("SysPositionlist", list);

		return "sys_position";
	}

	@RequestMapping("add_SysPosition")
	public String addSysPosition(SysPosition SysPosition) {
		// 设置创建时间
		SysPosition.setCreateTime(new Date());
		// 设置更新时间
		SysPosition.setModifyTime(new Date());

		sysPositionService.add(SysPosition);

		return "redirect:/index.do";
	}

	@RequestMapping("delete_SysPosition")
	public String deleteSysPosition(int id) {

		sysPositionService.deleteById(id);
         //查到子职位
		List<SysPosition> selectChildren = sysPositionService.selectChildren(id);
		//遍历子职位，全部删除
		for (SysPosition sysPosition : selectChildren) {
			sysPositionService.deleteById(sysPosition.getId());
		}
		return "redirect:/index.do";
	}

	@RequestMapping("update_SysPosition")
	public String updateSysPosition(SysPosition SysPosition) {
		// 更新修改时间
		SysPosition.setModifyTime(new Date());

		// 查询SysPosition
		SysPosition SysPositionById = sysPositionService.getSysPositionById(SysPosition.getId());

		// 设置创建时间
		if (SysPosition.getCreateTime() == null) {

			SysPosition.setCreateTime(SysPositionById.getCreateTime());
		}

		
		// 设置描述信息
		if (SysPosition.getDescription() == null) {

			SysPosition.setDescription(SysPositionById.getDescription());
		}

		// 设置修改时间
		if (SysPosition.getModifyTime() == null) {

			SysPosition.setModifyTime(new Date());
		}
		// 设置
		if (SysPosition.getName() == null) {

			SysPosition.setName(SysPositionById.getName());
		}
		// 设置orderNo
		if (SysPosition.getOrderNo() == null) {

			SysPosition.setOrderNo(SysPositionById.getOrderNo());
		}
		// 设置上级id
		if (SysPosition.getParentId() == null) {

			SysPosition.setParentId(SysPositionById.getParentId());
		}
		// 设置path
		if (SysPosition.getPath() == null) {

			SysPosition.setPath(SysPositionById.getPath());
		}

		// 设置type
		if (SysPosition.getType() == null) {

			SysPosition.setType(SysPositionById.getType());
		}

		sysPositionService.update(SysPosition);

		return "redirect:/index.do";
	}

}