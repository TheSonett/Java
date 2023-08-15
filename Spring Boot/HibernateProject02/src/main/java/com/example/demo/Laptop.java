package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Laptop {
	@Id
	private int id;
	private String model;
	
	@ManyToOne
	private Student student;
	
	public Laptop() {}
	
	public Laptop(int id, String model) 
	{
		super();
		this.id = id;
		this.model = model;
	}
	
	public Student getStudent() { return student; }
	public void setStudent(Student student) { this.student = student; }

	public int getId() { return id; }
	public void setId(int id) { this.id = id; }
	public String getModel() { return model; }
	public void setModel(String model) { this.model = model; }
	
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", model=" + model + "]";
	}	
}
