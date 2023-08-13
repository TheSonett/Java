package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;

@Controller
public class HomeController 
{
	@Autowired
	UserRepo userRepo;
	
	@GetMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@GetMapping("/addUser")
	public String addUser(User user) {
		userRepo.save(user);
		return "home.jsp";
	}
	
	@GetMapping("/getUser")
	public ModelAndView getUser(@RequestParam int id) {
		ModelAndView mv = new ModelAndView();
		User user = userRepo.findById(id).orElse(new User());
		mv.setViewName("showUser.jsp");
		mv.addObject(user);
		return mv;
	}
	
	@GetMapping(path="/getUsers", produces="application/xml")
	@ResponseBody
	public List<User> getUsers() {
		return userRepo.findAll();
	}
	
	@GetMapping("/user/{id}")
	@ResponseBody
	public Optional<User> user(@PathVariable("id") int id) {
		// return userRepo.findById(id).toString(); // not in JSON format
		return userRepo.findById(id); // in JSON format
	}
}
