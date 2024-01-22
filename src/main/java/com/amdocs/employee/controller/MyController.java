package com.amdocs.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.amdocs.employee.entity.employee;
import com.amdocs.employee.service.empServiceImpl;
//import com.example.employee.demoEmployee.entity.EmployeeDetails;

@RestController
public class MyController {
	
	@Autowired
	private empServiceImpl empService;
	
	@PostMapping("/add")
	public String add(@RequestBody employee emp) {
		empService.saveEmployee(emp);
		return "Employee Added Successfully";
	}
	
	@GetMapping("/getAll")
	public List<employee> getAll(){
		return empService.getAllemployee();
	}
	
	@GetMapping("/get/{id}")
	public employee  getById (@PathVariable("id") int id){
		return empService.getByEmployeeId(id);

	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id) {
		empService.deleteEmployee(id);
		return "Employee Details Deleted Successfully";
	}
	@PutMapping("/put/{id}")
	 public String updateEmployee(@PathVariable("id") int id, @RequestBody employee emp)
	 {
		emp.setEmpId(id);
		
		empService.updateEmployee(emp,id);
		return "Updated Succesfully";
	}
}
