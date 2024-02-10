package com.swadeshi.app.dto;

import java.time.LocalDateTime;

public class CartDTO {

    private Long cartId;
    private Long userId;
    private Long productId;
    private String size;
    private String color;
    private int quantity;
    private LocalDateTime addDate;
    private LocalDateTime updDate;
    private String message;
    
	public CartDTO() {
		
	}

	public CartDTO(Long cartId, Long userId, Long productId, String size, String color, int quantity,
			LocalDateTime addDate, LocalDateTime updDate, String message) {
		super();
		this.cartId = cartId;
		this.userId = userId;
		this.productId = productId;
		this.size = size;
		this.color = color;
		this.quantity = quantity;
		this.addDate = addDate;
		this.updDate = updDate;
		this.message = message;
	}

	public Long getCartId() {
		return cartId;
	}

	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
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

	public LocalDateTime getAddDate() {
		return addDate;
	}

	public void setAddDate(LocalDateTime addDate) {
		this.addDate = addDate;
	}

	public LocalDateTime getUpdDate() {
		return updDate;
	}

	public void setUpdDate(LocalDateTime updDate) {
		this.updDate = updDate;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

    
}