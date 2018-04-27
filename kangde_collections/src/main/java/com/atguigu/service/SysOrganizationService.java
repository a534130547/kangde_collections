package com.atguigu.service;

import java.util.List;

import com.atguigu.bean.SysOrganization;


public interface SysOrganizationService {

	void add(SysOrganization SysOrganization);

	void deleteById(int id);

	void update(SysOrganization SysOrganization);

	List<SysOrganization> selectAll();

	SysOrganization getSysOrganizationById(int id);

	List<SysOrganization> selectChildren(int id);

	List<Integer> select_parentId();

}
