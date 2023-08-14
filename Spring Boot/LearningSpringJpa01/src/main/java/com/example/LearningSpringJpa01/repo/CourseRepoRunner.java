package com.example.LearningSpringJpa01.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.LearningSpringJpa01.models.Course;

@Component
public class CourseRepoRunner implements CommandLineRunner {
//	@Autowired
//	private CourseRepository repository;
	
	@Autowired
	private SpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		//repository.insert();
		//repository.delete(2);
		
		//System.out.println(repository.getCourseById(1));
		//System.out.println(repository.getCourseById(3));
		//System.out.println(repository.showTable());
		
		repository.save(new Course(1, "Learn Java", "Navin Reddy"));
		repository.save(new Course(2, "Learn Spring Boot", "Navin Reddy"));
		repository.save(new Course(3, "Learn C++", "The Cherno"));
		
		System.out.println(repository.findAll());
		
		repository.deleteById(3);
		
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(3));
		System.out.println(repository.findByAuthor("Navin Reddy"));
	}

}
