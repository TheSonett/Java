package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import jakarta.persistence.TypedQuery;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class HibernateCaching01Application {

	public static void main(String[] args) {
		SpringApplication.run(HibernateCaching01Application.class, args);
		
		Alien alien = null;
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
		SessionFactory sf = con.buildSessionFactory();
		
		System.out.println(org.hibernate.Version.getVersionString());
		
		// session 1
		Session s1 = sf.openSession();
		Transaction t1 = s1.beginTransaction();
		
		Query<Alien> q1 = s1.createQuery("from Alien where id=101", Alien.class);  
		q1.setCacheable(true);
		
		// first level caching by default
//		alien = (Alien) s1.get(Alien.class, 101);
//		System.out.println(alien);
		
		alien = (Alien) q1.uniqueResult();
		System.out.println(alien);
		
		t1.commit();
		s1.close();
		
		
		// session 2
		Session s2 = sf.openSession();
		Transaction t2 = s2.beginTransaction();
		
		Query<Alien> q2 = s2.createQuery("from Alien where id=101", Alien.class);  
		q2.setCacheable(true);
		
//		alien = (Alien) s2.get(Alien.class, 101);
//		System.out.println(alien);
//		
		alien = (Alien) q2.uniqueResult();
		System.out.println(alien);
		
		t2.commit();
		s2.close();
		
	}

}
