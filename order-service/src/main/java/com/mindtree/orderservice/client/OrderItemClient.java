package com.mindtree.orderservice.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.orderservice.dto.OrderItemDTO;



@FeignClient(url="http://localhost:8081/orderItem/", name="ORDER-ITEM")
public interface OrderItemClient {
	
	@GetMapping
	public List<OrderItemDTO> getOrderItemsByid(@RequestParam("id") String id);
	
	@PostMapping
	public void saveOrderItemList(List<OrderItemDTO> orderItemList);

}
