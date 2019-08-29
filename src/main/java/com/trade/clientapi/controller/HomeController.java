package com.trade.clientapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.trade.clientapi.service.UserService;

@Controller
@RequestMapping("/home")
public class HomeController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/dashboard")
	public String dashboard(@ModelAttribute("username") String username, Model model) {
		
		//Earnings chart from service into model month(X-axis) vs earnings(Y-axis)
		
		
		//get watchlist from service into model  
		
		
		//get news from service to model
		
		
		return "home";
	}
	
	@GetMapping("/showSettings")
	public String showDetails(Model model) {
		//add details form in model
		model.addAttribute("");
		return "home";
	}
	
	@GetMapping("/saveOrUpdateSettings")
	public String saveOrUpdateDetails(Model model) {
		//update user details using service into dao 
		return "home";
	}
	
}
