package com.atguigu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.bean.SysPosition;
import com.atguigu.mapper.SysPositionMapper;

@Service
public class SysPositionServiceImpl implements SysPositionService {

	@Autowired
	SysPositionMapper sysPositionMapper;

	@Override
	public SysPosition getSysPositionById(int id) {
		return sysPositionMapper.selectByPrimaryKey(id);

	}

	@Override
	public List<SysPosition> selectAll() {

		return sysPositionMapper.selectAll();
	}

	@Override
	public void add(SysPosition sysPosition) {

		sysPositionMapper.insert(sysPosition);

	}

	@Override
	public void deleteById(int id) {
		sysPositionMapper.deleteByPrimaryKey(id);

	}

	@Override
	public List<SysPosition> selectChildren(int id) {

		return sysPositionMapper.selectChildren(id);

	}

	@Override
	public void update(SysPosition sysPosition) {

		sysPositionMapper.updateByPrimaryKey(sysPosition);

	}

}
