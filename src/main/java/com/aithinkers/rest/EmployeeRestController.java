package com.aithinkers.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aithinkers.dao.EmployeeDAO;
import com.aithinkers.dao.EmployeeDAOImpl;
import com.aithinkers.entity.Employee;

@RestController
@RequestMapping("/employee-api")
public class EmployeeRestController {
	
	@Autowired
	private EmployeeDAOImpl emp;
	
	@GetMapping("/getAllEmpDtls")
	public List<Employee> getEmployeesDetails() {
	    List<Employee> all = emp.findAll();
	    return all;
	}
	

}
