package com.example.LearningSpringJpa01.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.LearningSpringJpa01.models.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepo 
{
	@PersistenceContext // similar to @Autowired but more specific
	private EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
	}
	
	public Course findById(int id) {
		return entityManager.find(Course.class, id);
	}
	
	public void deleteById(int id) {
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);
	}
}
