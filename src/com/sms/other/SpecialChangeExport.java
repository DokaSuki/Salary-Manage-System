package com.sms.other;

import java.util.Date;


public class SpecialChangeExport {
	Integer eid;
	String name;
	String department;
	Integer amount;
	String reason;
	Date date;
	
	public SpecialChangeExport(Integer eid,String name,String department,Integer amount,String reason,Date date){
		this.eid=eid;
		this.name=name;
		this.department=department;
		this.amount=amount;
		this.reason=reason;
		this.date=date;
	}
	
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
