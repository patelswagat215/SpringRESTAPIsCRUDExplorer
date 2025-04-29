package com.aithinkers.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aithinkers.entity.Employee;

@Repository
public interface EmployeeRepositoryJPASupport extends JpaRepository<Employee,Integer>{

}
