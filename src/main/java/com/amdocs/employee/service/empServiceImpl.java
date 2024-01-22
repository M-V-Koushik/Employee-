package com.amdocs.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.employee.entity.employee;
import com.amdocs.employee.repo.empRepo;

@Service
public class empServiceImpl implements empService {
	
	@Autowired
	empRepo emprepo;
	public empServiceImpl(empRepo emp) {
		this.emprepo = emp;
	}
	
	
	@Override
	public employee saveEmployee(employee emp) {
		// TODO Auto-generated method stub
		return emprepo.save(emp);
	}

	@Override
	public List<employee> getAllemployee() {
		// TODO Auto-generated method stub
		return emprepo.findAll();
	}

	@Override
	public employee getByEmployeeId(int id) {
		// TODO Auto-generated method stub
		
		return emprepo.findById(id).orElse(null);
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		emprepo.deleteById(id);
		
	}

	@Override
	public employee updateEmployee (employee emp, int id) {
		employee update = emprepo.findById(emp.getEmpId()).get();
		update.setEmpName(emp.getEmpName());
		update.setEmpAddress(emp.getEmpAddress());
		update.setEmpRole(emp.getEmpRole());
		update.setEmpContact(emp.getEmpContact());
		return emprepo.save(update);
		// TODO Auto-generated method stub
		
	}


	
}
