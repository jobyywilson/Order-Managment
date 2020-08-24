package com.mindtree.orderservice.config;

import java.util.Date;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.TransactionSystemException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class OrderItemGlobalHandler {

//	@ExceptionHandler({ Exception.class })
//	public ResponseEntity<ResponseObject> handleException(Exception ex, WebRequest request) {
//		System.out.println(ex);
//		return null;
//
//	}
	@ExceptionHandler({ OrderNotFoundException.class })
	public ResponseEntity<ResponseObject> handleConstraintViolation(OrderNotFoundException ex, WebRequest request) {
		ResponseObject obj = new  ResponseObject(new Date(), "Invalid Request", ex.getMessage(), HttpStatus.BAD_REQUEST.toString());
		ResponseEntity<ResponseObject> rspEntity= new ResponseEntity<ResponseObject>(obj,HttpStatus.BAD_REQUEST);
		return  rspEntity;
		
	}
	@ExceptionHandler({ TransactionSystemException.class })
	public ResponseEntity<ResponseObject> handleConstraintViolation(TransactionSystemException ex, WebRequest request) {
		if (ex.getRootCause() instanceof ConstraintViolationException) {
	        ConstraintViolationException constraintViolationException = (ConstraintViolationException) ex.getRootCause();
	        Set<ConstraintViolation<?>> constraintViolations = constraintViolationException.getConstraintViolations();
			String response = constraintViolations.stream().map(constraint -> constraint.getPropertyPath()+"-"+constraint.getMessage()).collect(Collectors.joining(","));
			ResponseObject obj = new  ResponseObject(new Date(), "Invalid Request", response, HttpStatus.BAD_REQUEST.toString());
			ResponseEntity<ResponseObject> rspEntity= new ResponseEntity<ResponseObject>(obj,HttpStatus.BAD_REQUEST);
			return  rspEntity;

	    }
		return null;
		
	}

}
