package com.sonett.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sonett.components.Student;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println(context.getBean("name"));
		
		Student s = (Student) context.getBean("student");
		System.out.println(s);
	}

}
