package com.example.LearningSpringJpa01.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.LearningSpringJpa01.models.Course;

@Repository
public class CourseRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;

//	private static String insert_query = 
//			"""
//			insert into course (id, name, author) values (1, 'Learn Spring', 'Joy Saha');
//			insert into course (id, name, author) values (2, 'C++', 'The Sonett');
//			insert into course (id, name, author) values (3, 'Python', 'Navin Reddy');
//			""";
//	
//	private static String delete_query = 
//			"""
//			delete from course where id=?; 
//			
//			""";
//	private static String select_query = 
//			"""  
//			select * from course where id=?;
//			""";
	
	@Autowired
	private CourseJpaRepo courseJpaRepo;
	
	public void insert() {
		//jdbcTemplate.update(insert_query);
		courseJpaRepo.insert(new Course(1, "Learn Reactjs", "Navin Reddy"));
		courseJpaRepo.insert(new Course(2, "Learn Spring Framework", "in28Mins"));
		courseJpaRepo.insert(new Course(3, "Learn Core Java", "CodeWithHarry"));
	}
	
	public void delete(int id) {
		//jdbcTemplate.update(delete_query, id);
		courseJpaRepo.deleteById(id);
	}
	
	public Course getCourseById(int id) {
		//return jdbcTemplate.queryForObject(select_query, 
				//new BeanPropertyRowMapper<>(Course.class), id);
		return courseJpaRepo.findById(id);
	}
	
	public List<Course> showTable() {
		return jdbcTemplate.query("select * from course", 
				new BeanPropertyRowMapper<>(Course.class));
	}
}
