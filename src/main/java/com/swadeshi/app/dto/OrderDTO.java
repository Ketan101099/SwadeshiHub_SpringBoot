package com.swadeshi.app.dto;

import java.util.Date;

public class OrderDTO {

    private Long userId;
    private String orderStatus;
    private Date orderDate;
    private String size;
    private String color;
    private int quantity;
    private String address;
    
    
	public OrderDTO() {
		
	}
	public OrderDTO(Long userId, String orderStatus, Date orderDate, String size, String color, int quantity,
			String address) {
		super();
		this.userId = userId;
		this.orderStatus = orderStatus;
		this.orderDate = orderDate;
		this.size = size;
		this.color = color;
		this.quantity = quantity;
		this.address = address;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

  
}
