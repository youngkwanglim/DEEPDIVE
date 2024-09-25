package com.spring.exp.mission0923.main.java.com.example.mywebservice.repository;

import com.example.mywebservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
