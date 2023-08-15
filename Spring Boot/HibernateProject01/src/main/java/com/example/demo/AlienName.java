package com.example.demo;

import jakarta.persistence.Embeddable;

@Embeddable
public class AlienName {
	private String fname;
	private String lname;
	
	public AlienName() {}
	
	public AlienName(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}
	
	public String getFname() { return fname; }
	public void setFname(String fname) { this.fname = fname; }
	public String getLname() { return lname; }
	public void setLname(String lname) { this.lname = lname; }

	@Override
	public String toString() {
		return "AlienName [fname=" + fname + ", lname=" + lname + "]";
	}
}
