package com.mindtree.orderservice.dto;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author Joby Wilson Mathews
 *
 */
@JsonInclude(Include.NON_NULL)
public class OrderDTO {
	
	@NotNull
	private String customerName;
	
	@NotNull
	private String orderDate;

	@NotNull
	private String shippingAddress;
	
	@NotNull
	@Size(min=1)
	@Valid
	private List<OrderItemDTO> orderItemDTO;
	
	@NotNull
	private Double total;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public List<OrderItemDTO> getOrderItemDTO() {
		return orderItemDTO;
	}

	public void setOrderItemDTO(List<OrderItemDTO> orderItemDTO) {
		this.orderItemDTO = orderItemDTO;
	}
	
	
	

}
