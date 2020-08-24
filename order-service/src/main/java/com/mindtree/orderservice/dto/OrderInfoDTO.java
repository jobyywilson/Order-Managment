package com.mindtree.orderservice.dto;

/**
 * @author Joby Wilson Mathews
 *
 */
public class OrderInfoDTO {
	
	private Long orderId;
	
	public OrderInfoDTO(Long orderId) {
		this.orderId=orderId;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

}
