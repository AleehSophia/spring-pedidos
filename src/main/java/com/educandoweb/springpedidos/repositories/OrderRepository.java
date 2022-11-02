package com.educandoweb.springpedidos.repositories;

import com.educandoweb.springpedidos.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}