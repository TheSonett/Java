package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {	
	@GetMapping("/home")
	public ModelAndView home(@RequestParam("myName") String name) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("myName", name);
		mv.setViewName("home");
		return mv;
	}
}
