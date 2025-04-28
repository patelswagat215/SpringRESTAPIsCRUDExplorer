package com.aithinkers.pojo;

import lombok.Data;
@Data
public class Student {
	
	public Student(String str1, String str2) {
		this.firstName=str1;
		this.lastName=str2;
	}
	private String firstName;
	private String lastName;
	

}
