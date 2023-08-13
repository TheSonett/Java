package com.sonett.DependencySpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class Dependencies {
	@Autowired
	Dependency1 obj1;
	Dependency2 obj2;
	
	//@Autowired by default 
	public Dependencies(Dependency1 obj1, Dependency2 obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	public String toString() {
		return obj1 + "===" + obj2;
	}
}

@Component
class Dependency1 {}
@Component
class Dependency2 {}


@SpringBootApplication
@Configuration
@ComponentScan
public class DependencySpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencySpringApplication.class, args);
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DependencySpringApplication.class);
		System.out.println(context.getBean(Dependencies.class));
	}

}
