package com.trade.clientapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.trade.clientapi.service.restclient.AccountService;

@Controller
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@GetMapping("/getInfo")
	public String getInfo(Model model) {
		model.addAttribute("accountInfo", accountService.getInfo());
		return "home";
	}
	
}
