package com.educandoweb.springpedidos.repositories;

import com.educandoweb.springpedidos.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}