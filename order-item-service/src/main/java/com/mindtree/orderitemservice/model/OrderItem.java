package com.mindtree.orderitemservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "ORDER_ITEM")
public class OrderItem {
	
	@Id @GeneratedValue
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "PRODUCT_CODE")
	@NotNull
	private String productCode;
	
	@Column(name = "PRODUCT_NAME")
	@NotNull
	private String productName;
	
	@Column(name = "QUANTITY")
	@NotNull
	private Integer quantity;
	
	@Column(name = "ORDER_ID")
	@NotNull
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	

	
}
