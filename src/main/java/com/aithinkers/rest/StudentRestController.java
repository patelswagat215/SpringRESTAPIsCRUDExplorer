package com.aithinkers.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aithinkers.exception.StudentErrorResponse;
import com.aithinkers.exception.StudentNotFoundException;
import com.aithinkers.pojo.Student;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/student-api")
public class StudentRestController {

	private List<Student> students;

	@PostConstruct
	private void loadData() {
		students = Arrays.asList(new Student("Swagat", "Patel"), new Student("Pooja", "Patel"),
				new Student("John", "Smith"));

	}

	@GetMapping("/studs")
	public List<Student> getStudentDetails() {

		return students;

	}

	@GetMapping("/studs/{studentId}")
	public Student getStudent(@PathVariable int studentId) {

		if (studentId >= students.size() || studentId < 0) {
			throw new StudentNotFoundException("Student ID does not found :-" + studentId);
		}

		return students.get(studentId);
	}

	
}
