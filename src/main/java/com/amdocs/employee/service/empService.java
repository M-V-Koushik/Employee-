package com.amdocs.employee.service;

import java.util.List;

import com.amdocs.employee.entity.employee;
//import com.example.employee.demoEmployee.entity.EmployeeDetails;

public interface empService {
	public employee saveEmployee(employee emp);
	public List<employee> getAllemployee();
	public employee updateEmployee(employee emp,int id);
    public employee getByEmployeeId(int id);
	public void  deleteEmployee(int id);
}
