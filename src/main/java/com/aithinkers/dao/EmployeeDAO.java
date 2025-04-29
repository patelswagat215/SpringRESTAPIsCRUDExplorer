package com.aithinkers.dao;

import java.util.List;

import com.aithinkers.entity.Employee;

public interface EmployeeDAO {
	List<Employee> findAll();

	Employee findEmployeeByID(Integer id);

	Employee saveEmployeeDetails(Employee employee);

	void deleteByid(Integer id);

}
