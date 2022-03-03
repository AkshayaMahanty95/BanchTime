package com.ojas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ojas.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
