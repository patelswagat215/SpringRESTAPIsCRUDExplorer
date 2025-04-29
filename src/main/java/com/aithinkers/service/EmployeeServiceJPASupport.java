package com.aithinkers.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.aithinkers.dao.EmployeeRepositoryJPASupport;
import com.aithinkers.entity.Employee;
@Service
@Primary
public class EmployeeServiceJPASupport implements EmployeeService {

	@Autowired
	private EmployeeRepositoryJPASupport employeeRepository;

	@Override
	public List<Employee> findAllEmployees() {

		return employeeRepository.findAll();
	}

	@Override
	public Employee findEmployeeByID(Integer id) {
		Optional<Employee> employee = employeeRepository.findById(id);

		Employee emp = null;

		if (employee.isPresent()) {
			emp = employee.get();
		}
		return emp;

	}

	@Override
	public Employee saveEmployeeDetails(Employee employee) {

		return employeeRepository.save(employee);
	}

	@Override
	public void deleteByid(Integer id) {
		employeeRepository.deleteById(id);
	}

}
