package com.springcloud.orderservice.dto;

public class OrderDTO {
	
	private String orderId;
	private String orderDesc;
	private double orderTotal;
	private double orderDate;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderDesc() {
		return orderDesc;
	}
	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}
	public double getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}
	public double getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(double orderDate) {
		this.orderDate = orderDate;
	}
	
	@Override
	public String toString() {
		return "OrderDTO [orderId=" + orderId + ", orderDesc=" + orderDesc + ", orderTotal=" + orderTotal
				+ ", orderDate=" + orderDate + "]";
	}
	
	

}
