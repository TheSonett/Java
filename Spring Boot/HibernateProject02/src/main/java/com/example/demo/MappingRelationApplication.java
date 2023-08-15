package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MappingRelationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MappingRelationApplication.class, args);
		
		Laptop laptop = new Laptop(101, "HP Intel CORE i3");
		Student student = new Student(1, "Joy", 5, 80);
		
		//student.setLaptop(laptop);
		student.getLaptops().add(laptop);
		laptop.setStudent(student);
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction t = session.beginTransaction();
		
		session.persist(laptop);
		session.persist(student);
		
		// adding another Laptop
		laptop = new Laptop(102, "DELL Intel CORE i7");
		student.getLaptops().add(laptop);
		laptop.setStudent(student);
		
		session.persist(laptop);
		session.persist(student);
		
		t.commit();
	}
}
