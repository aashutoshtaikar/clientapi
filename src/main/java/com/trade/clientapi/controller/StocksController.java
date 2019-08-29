package com.trade.clientapi.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trade.clientapi.model.BuyingRequest;
import com.trade.clientapi.service.restclient.StocksService;

@Controller
@RequestMapping("/stocks")
public class StocksController {
	
	@Autowired
	private StocksService stocksService;
	private Logger logger = Logger.getLogger(getClass().getName());
	
	//for displaying the user stocks
	@GetMapping("/myStocks")
	public String myStocks(Model model) {
//		model.addAttribute("positions", positionService);
		return "home";
	}
	
	@GetMapping("/getStockInfo")
	public String getInfo(@RequestParam("stockSymbol") String stockSymbol, Model model) {	
		model.addAttribute("stockSymbol", stockSymbol);
		model.addAttribute("searchedStockDetails", stocksService.getStockInfo(stockSymbol));
		return "home";
	}
	
	//buying page as per the stock
	@GetMapping("/showBuyingForm")
	public String showBuyingForm(Model model) {
		//add model for buying form
		model.addAttribute("buyingRequest",new BuyingRequest());
//		model.addAttribute("showBuyingForm", true);
		return "home";
	}
	
	@PostMapping("/buy")
	public String buy(@ModelAttribute("buyingRequest") BuyingRequest buyingRequest, Model model) {
		//add model for buying success/ failure
		model.addAttribute("orderResponse", stocksService.buy(buyingRequest)); //null check on thymeleaf template
		logger.info("\n" + buyingRequest + "\n");
		return "home";
	}
	
	//selling page as per the stock
	@GetMapping("/showSellingForm")
	public String showSellingForm(Model model) {
		//add model for selling form
		return "home";
	}
	
	@PostMapping("/sell")
	public String sell(Model model) {
		//add model for selling success/ failure
		
		return "home";
	}
	

}
