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

}
