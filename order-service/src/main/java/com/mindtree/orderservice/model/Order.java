package com.mindtree.orderservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Joby Wilson Mathews
 *
 */
@Entity
@Table(name = "ORDER_DETAILS")
public class Order {
	
	@Id @GeneratedValue
	@Column(name = "ID")
	private Long orderId;


	@Column(name = "CUSTOMER_NAME")
	private String customerName;
	
	@Column(name = "ORDER_DATE")
	private String orderDate;
	
	@Column(name = "SHIPPING_ADDRESS")
	private String shippingAddress;
	
	@Column(name = "TOTAL")
	private Double total;

	
	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	
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
	
	
	

}
