package com.lazy.LazyInitialization;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class A 
{
	
}

@Component
@Lazy
class B
{
	private A classA = null;
	public B(A classA) {
		System.out.println("Class B constructor called!");
		System.out.println(classA);
		
		this.classA = classA;
	}
}


@SpringBootApplication
@Configuration
@ComponentScan
public class LazyInitializationApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LazyInitializationApplication.class);
		//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		context.getBean(B.class);
	}

}
