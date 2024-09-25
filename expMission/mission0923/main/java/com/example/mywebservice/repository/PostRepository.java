package com.spring.exp.mission0923.main.java.com.example.mywebservice.repository;

import com.example.mywebservice.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
