//package com.aithinkers.exception;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//
//@ControllerAdvice
//public class StudentRestExceptionHandler {
//	@ExceptionHandler
//	public ResponseEntity<StudentErrorResponse> handleExceptions(StudentNotFoundException exc) {
//
//		StudentErrorResponse studErrRes = new StudentErrorResponse();
//
//		studErrRes.setMessage(exc.getMessage());
//		studErrRes.setStatus(HttpStatus.NOT_FOUND.value());
//		studErrRes.setTimeStamp(System.currentTimeMillis());
//
//		return new ResponseEntity<>(studErrRes, HttpStatus.NOT_FOUND);
//
//	}
//
//	@ExceptionHandler
//	public ResponseEntity<StudentErrorResponse> handleException(Exception exc) {
//		
//		StudentErrorResponse error = new StudentErrorResponse();
//		
//		error.setStatus(HttpStatus.BAD_REQUEST.value());
//		error.setMessage(exc.getMessage());
//		error.setTimeStamp(System.currentTimeMillis());
//		
//		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
//	}
//
//
//}
