package com.mindtree.orderservice.config;

/**
 * @author Joby Wilson Mathews
 *
 */
public class OrderNotFoundException extends Exception{
	
	public OrderNotFoundException(String message){
		super(message);
	}

}
