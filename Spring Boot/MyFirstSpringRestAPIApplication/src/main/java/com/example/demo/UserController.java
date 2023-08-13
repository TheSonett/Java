package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	@Lazy
	private UserService userService;

	
	@GetMapping("/users")
	public User getUser(@RequestParam Integer id) {
		return userService.getUser(id);
	}
	
	@GetMapping("/usersList")
	public List<User> getUser() {
		return userService.getUserList();
	}
}
