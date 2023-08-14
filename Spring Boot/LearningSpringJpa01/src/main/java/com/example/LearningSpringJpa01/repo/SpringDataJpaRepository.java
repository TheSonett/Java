package com.example.LearningSpringJpa01.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LearningSpringJpa01.models.Course;

public interface SpringDataJpaRepository extends JpaRepository<Course, Integer>{
	List<Course> findByAuthor(String author);
}
