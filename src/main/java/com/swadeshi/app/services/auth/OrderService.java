package com.swadeshi.app.services.auth;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swadeshi.app.model.Order;
import com.swadeshi.app.repositories.OrderRepository;

import java.util.Date;
import java.util.List;

@Service
public class OrderService {

	private final OrderRepository orderRepository;

	@Autowired
	public OrderService(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	public List<Order> getAllOrders() {
		return orderRepository.findAll();
	}

	public Order getOrderById(Long id) {
		return orderRepository.findById(id).orElse(null);
	}

	public Order createOrder(Order order) {
		order.setOrderDate(new Date());
		return orderRepository.save(order);
	}

	public Order updateOrder(Long id, Order updatedOrder) {
		Order existingOrder = orderRepository.findById(id).orElse(null);

		if (existingOrder != null) {
			BeanUtils.copyProperties(updatedOrder, existingOrder, "ordId", "orderDate");
			return orderRepository.save(existingOrder);
		}

		return null; // Handle non-existing order
	}

	public void deleteOrder(Long id) {
		orderRepository.deleteById(id);
	}

	public List<Order> getAllOrdersBySellerId(Long sellerId) {

		return orderRepository.findBySellerId(sellerId);
	}

	public List<Order> getAllOrdersByUserId(Long userId) {

		return orderRepository.findByUserId(userId);
	}
	
	public List<Order> getAllOrdersByUserIdAndOrderStatus(Long userId, String orderStatus) {

		return orderRepository.findByUserIdAndOrderStatus(userId,orderStatus);
	}
	
	public List<Order> getAllOrdersBySellerIdAndOrderStatus(Long sellerId, String orderStatus) {

		return orderRepository.findBySellerIdAndOrderStatus(sellerId,orderStatus);
	}
}
