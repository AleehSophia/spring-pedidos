package com.educandoweb.springpedidos.repositories;

import com.educandoweb.springpedidos.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}