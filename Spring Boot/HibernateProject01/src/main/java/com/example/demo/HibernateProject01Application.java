package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class HibernateProject01Application {
	
//	+-----+---------+---------------+
//	| id  | name    | tech          |
//	+-----+---------+---------------+
//	| 101 | Joy     | Java          |
//	| 102 | Rahul   | C#            |
//	| 103 | Deepi   | Python        |
//	| 104 | Sonett  | C++           |
//	| 105 | Ram     | C Programming |
//	| 106 | Legends | Rust          |
//	+-----+---------+---------------+

	public static void save(Alien obj, Session session) {
		session.persist(obj);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HibernateProject01Application.class, args);
		
		List<Alien> aliens = Arrays.asList(
				new Alien(101, new AlienName("the", "cherno"), "C++"),
				new Alien(102, new AlienName("navin", "reddy"), "Spring boot & Java")
		);
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		// save() and persist() are similar, but still different. save() immediately persist 
		// the entity and returns the generated ID. persist() just marks the entity 
		// for insertion. The ID, depending on the identifier generator, may be generated 
		// asynchronously, for example when the session is flushed.
		
		for(Alien alien : aliens) {
			save(alien, session);
		}
		
//		session.persist(obj1);
//		session.persist(obj2);
//		session.persist(obj3);
//		session.persist(obj4);
		
		Alien obj = session.get(Alien.class, 101); // fetching data from database
		
		tx.commit();
		
		System.out.println(obj);
	}

}
