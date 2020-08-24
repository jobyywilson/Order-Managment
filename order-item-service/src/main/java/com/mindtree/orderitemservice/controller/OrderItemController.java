package com.mindtree.orderitemservice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.orderitemservice.model.OrderItem;
import com.mindtree.orderitemservice.service.OrderItemService;

/**
 * @author Joby Wilson Mathews
 *
 */
@RestController
@RequestMapping("/orderItem")
public class OrderItemController {
	
	@Autowired
	OrderItemService orderItemService;
	
	@GetMapping
	public List<OrderItem> getOrderItemsByid(@RequestParam("id") String id){
		
		return orderItemService.getOrderItemsbyId(Long.parseLong(id));
	}
	
	@PostMapping
	public void saveOrderItemList(@Valid @RequestBody List<OrderItem> orderItemList){
		
		 orderItemService.saveOrderItemList(orderItemList);
	}

}
