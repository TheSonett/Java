package com.alien.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.alien.models.Alien;

public class AlienDao {
	public Alien getAlien(int id) {
		Alien alien = new Alien();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/mydatabase", "root", null);
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery("SELECT * FROM alien WHERE id=" + id);
			
			if(rs.next()) {
				alien.setId(rs.getInt("id"));
				alien.setName(rs.getString("name"));
				alien.setTech(rs.getString("tech"));
			}
		}
		catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
		
		return alien;
	}	
}
