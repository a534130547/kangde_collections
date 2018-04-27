package com.atguigu.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.bean.Entrust;
import com.atguigu.bean.EntrustWithBLOBs;
import com.atguigu.bean.EntrustWithCustomerStatus;
import com.atguigu.mapper.EntrustMapper;

@Service
public class EntrustServiceImpl implements EntrustService {
	@Autowired
	EntrustMapper entrustMapper;

	@Override
	public Entrust getEntrustById(int id) {

		return entrustMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Entrust> selectAll() {

		return entrustMapper.selectAll();
	}

	@Override
	public void add(EntrustWithBLOBs entrust) {
		entrustMapper.insert(entrust);

	}

	@Override
	public void deleteById(int id) {

		entrustMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(Entrust entrust) {
		entrustMapper.updateByPrimaryKey(entrust);
	}

	@Override
	public List<EntrustWithCustomerStatus> selectAllWithCustomerStatus() {
		return entrustMapper.selectAllWithCustomerStatus();

	}

	@Override
	public List<EntrustWithCustomerStatus> selectSerchEntrust(Map<Object, Object> map) {

		return entrustMapper.selectSerchEntrust(map);
	}

	@Override
	public void endEntrustCustomerStatusById(Integer id) {

		Map<Object, Object> map = new HashMap<Object, Object>();

		map.put("id", id);
		map.put("end", 0);

		entrustMapper.endEntrustCustomerStatusById(map);
	}

	@Override
	public void startEntrustCustomerStatusById(Integer id) {
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("id", id);
		map.put("start", 1);
		entrustMapper.startEntrustCustomerStatusById(map);

	}

}
