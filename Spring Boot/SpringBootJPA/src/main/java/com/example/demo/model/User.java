package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String username;
	private String tech;
	
	public int getId() { return id; }
	public void setId(int id) { this.id = id; }
	public String getUsername() { return username; }
	public void setUsername(String username) { this.username = username; }
	public String getTech() { return tech; }
	public void setTech(String tech) { this.tech = tech; }
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", tech=" + tech + "]";
	}
}
