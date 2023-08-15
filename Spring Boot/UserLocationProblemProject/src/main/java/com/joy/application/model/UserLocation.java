package com.joy.application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserLocation 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private double latitude;
	private double longitude;
	private boolean excluded;
	
	public UserLocation() { }
	 
	public UserLocation(String name, double latitude, double longitude, 
			boolean excluded) 
	{
		super();
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
		this.excluded = excluded;
	}
	
	// getters
	public Long getId() { return id; }
	public String getName() { return name; }
	public double getLatitude() { return latitude; }
	public double getLongitude() { return longitude; }
	public boolean isExcluded() { return excluded;}
	
	// setters
	public void setName(String name) { this.name = name; }
	public void setLatitude(double latitude) { this.latitude = latitude; }
	public void setLongitude(double longitude) { this.longitude = longitude; }
	public void setExcluded(boolean excluded) { this.excluded = excluded; }

	@Override
	public String toString() {
		return "UserLocation [id=" + id + ", name=" + name + ", latitude=" + latitude + ", longitude=" + longitude
				+ ", excluded=" + excluded + "]";
	}
}
