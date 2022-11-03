package com.educandoweb.springpedidos.repositories;

import com.educandoweb.springpedidos.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}