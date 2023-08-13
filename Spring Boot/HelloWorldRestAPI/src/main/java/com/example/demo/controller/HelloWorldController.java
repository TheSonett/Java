package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
public class HelloWorldController {
	@GetMapping("/students")
	public List<Student> students() {
		return Arrays.asList(
				new Student(1, "Joy Saha", "CSE"),
				new Student(2, "Rahul Dey", "CIVIL"),
				new Student(3, "Deepi Ranjan", "ECE"),
				new Student(4, "Ankita", "AUTO")
		);
	}
}
