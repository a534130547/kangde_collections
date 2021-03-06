package com.atguigu.mapper;

import java.util.List;
import java.util.Map;

import com.atguigu.bean.Entrust;
import com.atguigu.bean.EntrustWithBLOBs;
import com.atguigu.bean.EntrustWithCustomerStatus;

public interface EntrustMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table entrust
	 *
	 * @mbggenerated Sat Apr 21 11:25:08 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table entrust
	 *
	 * @mbggenerated Sat Apr 21 11:25:08 CST 2018
	 */
	int insert(EntrustWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table entrust
	 *
	 * @mbggenerated Sat Apr 21 11:25:08 CST 2018
	 */
	int insertSelective(EntrustWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table entrust
	 *
	 * @mbggenerated Sat Apr 21 11:25:08 CST 2018
	 */
	EntrustWithBLOBs selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table entrust
	 *
	 * @mbggenerated Sat Apr 21 11:25:08 CST 2018
	 */
	int updateByPrimaryKeySelective(EntrustWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table entrust
	 *
	 * @mbggenerated Sat Apr 21 11:25:08 CST 2018
	 */
	int updateByPrimaryKeyWithBLOBs(EntrustWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table entrust
	 *
	 * @mbggenerated Sat Apr 21 11:25:08 CST 2018
	 */
	int updateByPrimaryKey(Entrust record);

	List<Entrust> selectAll();

	List<EntrustWithCustomerStatus> selectAllWithCustomerStatus();

	List<EntrustWithCustomerStatus> selectSerchEntrust(Map<Object, Object> map);

	void endEntrustCustomerStatusById(Map<Object, Object> map);

	void startEntrustCustomerStatusById(Map<Object, Object> map);

}