package com.mindtree.orderservice.controller;

import java.util.List;

import javax.validation.Valid;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.orderservice.config.OrderNotFoundException;
import com.mindtree.orderservice.dto.OrderDTO;
import com.mindtree.orderservice.service.OrderService;

/**
 * @author Joby Wilson Mathews
 *
 */
@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping
	public void createOrder(@Valid @RequestBody OrderDTO orderDTO ) {
		
		orderService.createOrder(orderDTO);
		
	}
	
	@GetMapping
	public List<OrderDTO> getAllOrders() {
			return orderService.getAllOrders();
		
	}
	@GetMapping("/{orderId}")
	public OrderDTO getOrderById(@PathVariable Long orderId) throws OrderNotFoundException {
			return orderService.getOrderById(orderId);
		
		
	}

}
