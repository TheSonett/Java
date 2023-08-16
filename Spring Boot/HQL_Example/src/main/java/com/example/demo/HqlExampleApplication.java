package com.example.demo;

import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class HqlExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(HqlExampleApplication.class, args);
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf = con.buildSessionFactory();
		
		Session session = sf.openSession();
		session.beginTransaction();
		
//		Random random = new Random();
//		
//		for(int i = 1; i <= 50; i++) 
//		{
//			Student student = new Student();
//			student.setRollno(i);
//			student.setName("Name: " + i);
//			student.setMarks(random.nextInt(100));
//			
//			session.persist(student);
//		}
		
		// example 1
		Query<Student> query = session.createQuery("from Student", Student.class);
		query.setCacheable(true);
		
		List<Student> students = query.list();
		for(var s : students) {
			System.out.println(s);
		}
		
		System.out.println();
		
		// example 2
		int b = 50;
		query = session.createQuery("from Student where marks= :b", Student.class);
		query.setParameter("b", b);
		Student student = query.uniqueResult();
		System.out.println(student);
		
		System.out.println();
		
		// example 3
		Query<Object[]> query2 = session.createQuery("select rollno,name,marks from Student s where s.rollno = 7", Object[].class);
		Object[] studs = query2.uniqueResult();
		System.out.println(studs[0] + " : " + studs[1] + " : " + studs[2]);
		
		System.out.println("\nExample 4 :::::: ");
		
		// example 4
		Query<Object[]> query3 = session.createQuery("select rollno,name,marks from Student s where s.marks > 60", Object[].class);
		List<Object[]> studs2 = query3.list();
		
		for(Object[] s : studs2) {
			System.out.println(s[0] + " : " + s[1] + " : " + s[2]);			
		}
		
		session.getTransaction().commit();
	}

}
