package com.swadeshi.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.swadeshi.app.model.Order;


@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    // Additional query methods if needed
	
	

	
	List<Order> findBySellerIdAndOrderStatus(Long sellerId, String orderStatus);
   
	List<Order> findByUserIdAndOrderStatus(Long userId, String orderStatus);
	
	List<Order> findBySellerId(Long sellerId);
	
	List<Order> findByUserId(Long userId);
	
}