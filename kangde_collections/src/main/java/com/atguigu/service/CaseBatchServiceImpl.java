package com.atguigu.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.bean.CaseBatch;
import com.atguigu.bean.CaseBatchWithBLOBs;
import com.atguigu.mapper.CaseBatchMapper;

@Service
public class CaseBatchServiceImpl implements CaseBatchService {

	@Autowired
	CaseBatchMapper caseBatchMapper;

	@Override
	public CaseBatch getCaseBatchById(int id) {

		return caseBatchMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<CaseBatchWithBLOBs> selectAll() {

		return caseBatchMapper.selectAll();
	}

	@Override
	public List<CaseBatchWithBLOBs> selectSerchcaseBatch(Map<Object, Object> map) {

		return caseBatchMapper.selectSerchcaseBatch(map);
	}

	@Override
	public void add(CaseBatchWithBLOBs caseBatch) {

		caseBatchMapper.insert(caseBatch);
	}

	@Override
	public void deleteById(int id) {

		caseBatchMapper.deleteByPrimaryKey(id);

	}

	@Override
	public void update(CaseBatchWithBLOBs caseBatch) {

		caseBatchMapper.updateByPrimaryKey(caseBatch);

	}

}
