package com.aithinkers.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aithinkers.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Employee> findAll() {

		// Create a query
		TypedQuery<Employee> theQuery = entityManager.createQuery("FROM Employee", Employee.class);

		// Execute the query and get result list
		List<Employee> resultList = theQuery.getResultList();

		// return the result
		return resultList;
	}

	@Override
	public Employee findEmployeeByID(Integer id) {
		// Create a query
		//TypedQuery<Employee> theQuery = entityManager.createQuery("FROM Employee where id=${id}", Employee.class);

		// Execute the query and get result list
		//Employee result = theQuery.executeUpdate();
		
		// return the result
		//Get Employee
		Employee employee = entityManager.find(Employee.class, id);
		//Return Result
		return employee;
	}

	@Override
	public Employee saveEmployeeDetails(Employee employee) {
		//Save the Employee
		Employee merge = entityManager.merge(employee);
		
		//Return the DBEmployee
		return merge;
	}

	@Override
	public void deleteByid(Integer id) {
		//Find the employee by ID
		Employee employee = entityManager.find(Employee.class,id);
		
		//Remove the employee
		entityManager.remove(employee);
		

	}

}
