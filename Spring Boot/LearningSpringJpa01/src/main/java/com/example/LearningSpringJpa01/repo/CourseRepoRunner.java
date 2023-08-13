package com.example.LearningSpringJpa01.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseRepoRunner implements CommandLineRunner {
	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public void run(String... args) throws Exception {
		courseRepository.insert();
	}

}
