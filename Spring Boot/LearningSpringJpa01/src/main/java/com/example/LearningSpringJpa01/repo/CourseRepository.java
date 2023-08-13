package com.example.LearningSpringJpa01.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static String query = 
			"""
			insert into course (id, name, author) values (1, 'Learn Spring', 'Joy Saha');
			insert into course (id, name, author) values (2, 'C++', 'The Sonett');
			insert into course (id, name, author) values (3, 'Python', 'Navin Reddy');
			""";
	
	public void insert() {
		jdbcTemplate.update(query);
	}
}
