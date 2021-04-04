package com.junit.practice.collection;

public class EmployeEntity {

	private String empName;
	
	private int empNum;
	
	private int empSal;
	
	

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
		
	}
	

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	public int getEmpNum() {
		return empNum;
	}

	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}

	@Override
	public String toString() {
		return "EmployeEntity [empName=" + empName + ", empNum=" + empNum + ",empSal="+empSal+"]";
	}

	public EmployeEntity(String empName, int empNum) {
		super();
		this.empName = empName;
		this.empNum = empNum;
	}

	public EmployeEntity(String empName, int empNum, int empSal) {
		super();
		this.empName = empName;
		this.empNum = empNum;
		this.empSal = empSal;
	}
	
	
	
}
