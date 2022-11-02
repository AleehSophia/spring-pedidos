package com.educandoweb.springpedidos.repositories;

import com.educandoweb.springpedidos.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}