package com.sms.action;

import com.opensymphony.xwork2.Action;
import com.sms.other.ComputeSalarySingleton;

public class InitSalaryCompute {
	private Integer areaDifference;//地区差
	private Integer positionAllowance;//岗位津贴
	private Integer educationAllowance;///教护补贴
	private Double specialPositionParas,specialLevelParas;//特殊津贴加权
	private Integer onlyChildAllowance;//独生子女
	private Double otherPositionParas,otherLevelParas;//其它补贴加权
	private Double phonePositionParam,phoneLevelParam;//电话补贴加权
	 
	public String initSalaryCompute(){
		 ComputeSalarySingleton computeSalarySingleton=ComputeSalarySingleton.getInstance();
		 
		 System.out.println(areaDifference);
		 computeSalarySingleton.setAreaDifference(areaDifference);
		 System.out.println(specialPositionParas);
		 System.out.println(specialLevelParas);
		 computeSalarySingleton.setPhoneLevelParam(phoneLevelParam);
		 computeSalarySingleton.setPhonePositionParam(phonePositionParam);
		 computeSalarySingleton.setPositionAllowance(positionAllowance);
		 computeSalarySingleton.setEducationAllowance(educationAllowance);
		 computeSalarySingleton.setSpecialLevelParas(specialLevelParas);
		 computeSalarySingleton.setSpecialPositionParas(specialPositionParas);
		 computeSalarySingleton.setOnlyChildAllowance(onlyChildAllowance);
		 computeSalarySingleton.setOtherLevelParas(otherLevelParas);
		 computeSalarySingleton.setOtherPositionParas(otherPositionParas);
		 
		 return Action.SUCCESS;
	 }

	public Integer getAreaDifference() {
		return areaDifference;
	}

	public void setAreaDifference(Integer areaDifference) {
		this.areaDifference = areaDifference;
	}

	public Integer getPositionAllowance() {
		return positionAllowance;
	}

	public void setPositionAllowance(Integer positionAllowance) {
		this.positionAllowance = positionAllowance;
	}

	public Integer getEducationAllowance() {
		return educationAllowance;
	}

	public void setEducationAllowance(Integer educationAllowance) {
		this.educationAllowance = educationAllowance;
	}

	public Double getSpecialPositionParas() {
		return specialPositionParas;
	}

	public void setSpecialPositionParas(Double specialPositionParas) {
		this.specialPositionParas = specialPositionParas;
	}

	public Double getSpecialLevelParas() {
		return specialLevelParas;
	}

	public void setSpecialLevelParas(Double specialLevelParas) {
		this.specialLevelParas = specialLevelParas;
	}

	public Integer getOnlyChildAllowance() {
		return onlyChildAllowance;
	}

	public void setOnlyChildAllowance(Integer onlyChildAllowance) {
		this.onlyChildAllowance = onlyChildAllowance;
	}

	public Double getOtherPositionParas() {
		return otherPositionParas;
	}

	public void setOtherPositionParas(Double otherPositionParas) {
		this.otherPositionParas = otherPositionParas;
	}

	public Double getOtherLevelParas() {
		return otherLevelParas;
	}

	public void setOtherLevelParas(Double otherLevelParas) {
		this.otherLevelParas = otherLevelParas;
	}

	public Double getPhonePositionParam() {
		return phonePositionParam;
	}

	public void setPhonePositionParam(Double phonePositionParam) {
		this.phonePositionParam = phonePositionParam;
	}

	public Double getPhoneLevelParam() {
		return phoneLevelParam;
	}

	public void setPhoneLevelParam(Double phoneLevelParam) {
		this.phoneLevelParam = phoneLevelParam;
	}
}
