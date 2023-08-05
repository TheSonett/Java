package com.joy;

public class Student {
	private String name;
	private int rollno;
	
	public Student(String name, int rollno) {
		 this.name = name;
		 this.rollno = rollno;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getRollNo() {
		return this.rollno;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name + " and Roll No is: " + this.rollno;
	}
	
}
