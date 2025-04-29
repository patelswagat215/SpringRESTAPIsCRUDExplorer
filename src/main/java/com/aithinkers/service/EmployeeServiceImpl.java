package com.aithinkers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aithinkers.dao.EmployeeDAO;
import com.aithinkers.entity.Employee;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDao;

	@Override
	public List<Employee> findAllEmployees() {

		return employeeDao.findAll();
	}

	@Override
	public Employee findEmployeeByID(Integer id) {

		return employeeDao.findEmployeeByID(id);
	}

	@Transactional
	@Override
	public Employee saveEmployeeDetails(Employee employee) {

		return employeeDao.saveEmployeeDetails(employee);
	}

	@Transactional
	@Override
	public void deleteByid(Integer id) {

		employeeDao.deleteByid(id);
	}

}
