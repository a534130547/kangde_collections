package com.atguigu.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.bean.SysOrganization;
import com.atguigu.mapper.SysOrganizationMapper;

@Service
public class SysOrganizationServiceImpl implements SysOrganizationService {
	@Autowired
	SysOrganizationMapper sysOrganizationMapper;

	@Override
	public void add(SysOrganization SysOrganization) {
		sysOrganizationMapper.insert(SysOrganization);

	}

	@Override
	public void deleteById(int id) {
		sysOrganizationMapper.deleteByPrimaryKey(id);

	}

	@Override
	public void update(SysOrganization SysOrganization) {
		sysOrganizationMapper.updateByPrimaryKey(SysOrganization);
	}

	@Override
	public List<SysOrganization> selectAll() {
		return sysOrganizationMapper.selectAll();

	}

	@Override
	public SysOrganization getSysOrganizationById(int id) {
		return sysOrganizationMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<SysOrganization> selectChildren(int id) {
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("id", id);
		return sysOrganizationMapper.selectChildren(map);
	}

	@Override
	public List<Integer> select_parentId() {
		return sysOrganizationMapper.select_parentId();

	}

}
