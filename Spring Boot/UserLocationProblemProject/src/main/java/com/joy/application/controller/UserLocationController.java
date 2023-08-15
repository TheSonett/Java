package com.joy.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joy.application.model.UserLocation;
import com.joy.application.services.UserLocationService;

@RestController
public class UserLocationController {
	@Autowired
	private UserLocationService userLocationService;

	@PostMapping("/create_data")
	public ResponseEntity<UserLocation> createUserLocation(@RequestBody UserLocation userLocation) 
	{
		UserLocation createdLocation = userLocationService.createUserLocation(userLocation);
	    return new ResponseEntity<>(createdLocation, HttpStatus.CREATED);
	}
	
	@GetMapping("/get_users/{n}")
	public ResponseEntity<List<UserLocation>> getNearestUsers(@PathVariable int n) {
		List<UserLocation> nearestUsers = userLocationService.getNearestUsers(n);
		return new ResponseEntity<>(nearestUsers, HttpStatus.OK);
	}
	
	@PatchMapping("/update_data/{id}")
	public ResponseEntity<UserLocation> updateUserLocation(@PathVariable Long id, @RequestBody UserLocation updatedUserLocation) 
	{
		UserLocation updatedLocation = userLocationService.updateUserLocation(id, updatedUserLocation);
	    return new ResponseEntity<>(updatedLocation, HttpStatus.OK);
	}
}
