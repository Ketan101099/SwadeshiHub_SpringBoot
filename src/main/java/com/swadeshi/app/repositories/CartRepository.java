package com.swadeshi.app.repositories;

import com.swadeshi.app.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
   
}