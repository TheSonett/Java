package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private int rollno;
	private int marks;
	
//	@OneToOne
//	private Laptop laptop;
	
	@OneToMany(mappedBy = "student")
	private List<Laptop> laptops = new ArrayList<>();
	
	public Student() {}
	
	public Student(int id, String name, int rollno, int marks) 
	{
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}
	
//	public Laptop getLaptop() { return laptop; }
//	public void setLaptop(Laptop laptop) { this.laptop = laptop; }
	
	public List<Laptop> getLaptops() { return laptops; }
	public void setLaptops(List<Laptop> laptops) { this.laptops = laptops; }

	public int getId() { return id; }
	public void setId(int id) { this.id = id; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getRollno() { return rollno; }
	public void setRollno(int rollno) { this.rollno = rollno; }
	public int getMarks() { return marks; }
	public void setMarks(int marks) { this.marks = marks; }

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollno=" + rollno + ", marks=" + marks + "]";
	}
}
