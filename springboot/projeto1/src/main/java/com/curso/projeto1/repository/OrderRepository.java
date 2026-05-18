package com.curso.projeto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.projeto1.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}