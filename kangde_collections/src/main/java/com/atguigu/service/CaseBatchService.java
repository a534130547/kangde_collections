package com.atguigu.service;

import java.util.List;
import java.util.Map;

import com.atguigu.bean.CaseBatch;
import com.atguigu.bean.CaseBatchWithBLOBs;

public interface CaseBatchService {

	CaseBatch getCaseBatchById(int id);

	List<CaseBatchWithBLOBs> selectAll();

	List<CaseBatchWithBLOBs> selectSerchcaseBatch(Map<Object, Object> map);

	void add(CaseBatchWithBLOBs caseBatch);

	void deleteById(int id);

	void update(CaseBatchWithBLOBs caseBatch);

}
