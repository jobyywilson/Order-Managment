package com.mindtree.orderservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.orderservice.client.OrderItemClient;
import com.mindtree.orderservice.config.OrderNotFoundException;
import com.mindtree.orderservice.dto.OrderDTO;
import com.mindtree.orderservice.dto.OrderItemDTO;
import com.mindtree.orderservice.model.Order;
import com.mindtree.orderservice.repository.OrderRepository;

/**
 * @author Joby Wilson Mathews
 *
 */
@Service
public class OrderService {
	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	OrderItemClient orderItemClient;
	
	public Long createOrder(OrderDTO orderDTO ) {
		
		Order order = new Order();
		order.setCustomerName(orderDTO.getCustomerName());
		order.setShippingAddress(orderDTO.getShippingAddress());
		order.setCustomerName(orderDTO.getCustomerName());
		order.setTotal(orderDTO.getTotal());
		Order orderSaved = orderRepository.save(order);
		ArrayList<OrderItemDTO> orderItemList = new ArrayList<>();		
		orderDTO.getOrderItemDTO().forEach(orderItem->{
			orderItem.setOrderId(orderSaved.getOrderId());
			orderItemList.add(orderItem);
		});
		orderItemClient.saveOrderItemList(orderItemList);
		return orderSaved.getOrderId();
	}
	
	public OrderDTO getOrderById(Long id) throws OrderNotFoundException {
		Optional<Order> orderOptional = orderRepository.findById(id);
		if(orderOptional.isPresent()) {
			return mapModelToDTO(orderOptional.get());
		}else {
			throw new OrderNotFoundException("Order:"+id +" not found");
		}
		
	}
	
	public List<OrderDTO> getAllOrders() {
		List<Order> orderList = orderRepository.findAll();
		List<OrderDTO> orderDTOList = new ArrayList<>();
		for(Order order : orderList) {
			orderDTOList.add(mapModelToDTO(order));
		}
		return orderDTOList;
	}
	private OrderDTO mapModelToDTO(Order order) {
		OrderDTO orderDTO = new OrderDTO();
		orderDTO.setCustomerName(order.getCustomerName());
		orderDTO.setOrderDate(order.getOrderDate());
		orderDTO.setShippingAddress(order.getShippingAddress());
		orderDTO.setOrderItemDTO(orderItemClient.getOrderItemsByid(String.valueOf(order.getOrderId())));
		return orderDTO;
	}

}
