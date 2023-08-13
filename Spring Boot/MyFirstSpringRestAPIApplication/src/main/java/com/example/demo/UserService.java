package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	private List<User> userList;
	
	public UserService() {
		userList = new ArrayList<User>();
		
		User user1 = new User(1, "Joy Saha", 23, "joy@gmail.com");
		User user2 = new User(2, "Anika Dutta", 20, "anika@gmail.com");
		User user3 = new User(3, "Rahul Dey", 23, "rahul@gmail.com");
		User user4 = new User(4, "Pratik Majumdar", 23, "pratik@gmail.com");
		User user5 = new User(5, "Priya Sen", 23, "priya@gmail.com");
	
		userList.addAll(Arrays.asList(user1, user2, user3, user4, user5));
		System.out.println(userList);
	}
	
	public User getUser(Integer id) {
		for(User user : userList) {
			if(id == user.getId()) {
				return user;
			}
		}
		
		return new User(0, null, 0, null);
	}
	
	public List<User> getUserList() {
		return userList;
	}
}
