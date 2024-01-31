package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entitys.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
