package com.swadeshi.app.model;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ordId;

    @Column(name = "user_id")
    private Long userId;
    
    @Column(name = "seller_id")
    private Long sellerId;

    @Column(name = "order_status")
    private String orderStatus;

    @Column(name = "order_date")
    private Date orderDate;

    private String size;

    private String color;

    private int quantity;

    private String address;
    

	public Order() {
		
	}

	

	public Order(Long ordId, Long userId, Long sellerId, String orderStatus, Date orderDate, String size, String color,
			int quantity, String address) {
		super();
		this.ordId = ordId;
		this.userId = userId;
		this.sellerId = sellerId;
		this.orderStatus = orderStatus;
		this.orderDate = orderDate;
		this.size = size;
		this.color = color;
		this.quantity = quantity;
		this.address = address;
	}



	public Long getSellerId() {
		return sellerId;
	}



	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}



	public Long getOrdId() {
		return ordId;
	}

	public void setOrdId(Long ordId) {
		this.ordId = ordId;
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

    // Constructors, getters, and setters
}
