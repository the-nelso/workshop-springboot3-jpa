package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entitys.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
