package com.amdocs.employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class employee {
	@Id
	private int empId;
	private String empName;
	private String empAddress;
	private String empRole;
	private String empContact;
	
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public employee(int empId, String empName, String empAddress, String empRole, String empContact) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empRole = empRole;
		this.empContact = empContact;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	public String getEmpContact() {
		return empContact;
	}
	public void setEmpContact(String empContact) {
		this.empContact = empContact;
	}
	@Override
	public String toString() {
		return "employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + ", empRole="
				+ empRole + ", empContact=" + empContact + "]";
	}
	
	
	
}
