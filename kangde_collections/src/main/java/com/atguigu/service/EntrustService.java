package com.atguigu.service;

import java.util.List;
import java.util.Map;

import com.atguigu.bean.Entrust;
import com.atguigu.bean.EntrustWithBLOBs;
import com.atguigu.bean.EntrustWithCustomerStatus;

public interface EntrustService {

	Entrust getEntrustById(int id);

	List<Entrust> selectAll();

	void add(EntrustWithBLOBs entrust);

	void deleteById(int id);

	void update(Entrust entrust);

	List<EntrustWithCustomerStatus> selectAllWithCustomerStatus();

	List<EntrustWithCustomerStatus> selectSerchEntrust(Map<Object, Object> map);

	void endEntrustCustomerStatusById(Integer id);

	void startEntrustCustomerStatusById(Integer id);

}
