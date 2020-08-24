package com.mindtree.orderitemservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.orderitemservice.model.OrderItem;
import com.mindtree.orderitemservice.repository.OrderItemRepository;

@Service
public class OrderItemService {
	
	@Autowired
	OrderItemRepository orderItemRepository;
	
	public List<OrderItem> getOrderItemsbyId(Long id) {
		return orderItemRepository.findByOrderId(id);
	}
	
	public void saveOrderItemList(List<OrderItem> orderItemList) {
		 orderItemRepository.saveAll(orderItemList);
	}

}
