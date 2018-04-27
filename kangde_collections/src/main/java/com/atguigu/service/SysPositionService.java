package com.atguigu.service;

import java.util.List;

import com.atguigu.bean.SysPosition;

public interface SysPositionService {

	SysPosition getSysPositionById(int id);

	List<SysPosition> selectAll();

	void add(SysPosition sysPosition);

	void deleteById(int id);

	List<SysPosition> selectChildren(int id);

	void update(SysPosition sysPosition);

}
