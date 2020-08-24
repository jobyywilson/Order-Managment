package com.mindtree.orderservice.dto;

import javax.validation.constraints.NotNull;

public class OrderItemDTO {
	
	@NotNull
	private String productCode;
	
	@NotNull
	private String productName;

	@NotNull
	private Integer quantity;
	
	private Long orderId;

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}



	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}



	
}
