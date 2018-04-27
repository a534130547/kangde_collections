package com.atguigu.bean;

public class SearchEmployee {

	private Integer employeeStatusId;
	
	private Integer orgSearchId;
	
	private String account;
	private String 	userName;
	public SearchEmployee() {
		super();
	}
	public SearchEmployee(Integer employeeStatusId, Integer orgSearchId, String account, String userName) {
		super();
		this.employeeStatusId = employeeStatusId;
		this.orgSearchId = orgSearchId;
		this.account = account;
		this.userName = userName;
	}
	public Integer getEmployeeStatusId() {
		return employeeStatusId;
	}
	public void setEmployeeStatusId(Integer employeeStatusId) {
		this.employeeStatusId = employeeStatusId;
	}
	public Integer getOrgSearchId() {
		return orgSearchId;
	}
	public void setOrgSearchId(Integer orgSearchId) {
		this.orgSearchId = orgSearchId;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
