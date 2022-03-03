package com.ojas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.entity.Employee;
import com.ojas.service.EmployeeServices;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private EmployeeServices service;
	
	@PostMapping("/new")
	public Employee create(@RequestBody Employee emp) {
		return service.createEmp(emp);
	}
	
	@GetMapping("/info")
	public Iterable<Employee> getinfo(){
		return service.empinfo();
	}
}
