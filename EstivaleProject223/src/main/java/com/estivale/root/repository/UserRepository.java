package com.estivale.root.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estivale.root.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
