package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entitys.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
