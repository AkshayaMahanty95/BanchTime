package com.ojas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.dao.EmployeeDao;
import com.ojas.entity.Employee;

@Service
public class EmployeeServices {

	@Autowired
	private EmployeeDao dao;
	
	public Employee createEmp(Employee emp) {
	
		return dao.save(emp);
	}
	
	public Iterable<Employee> empinfo() {
		return dao.findAll();
	}
}
