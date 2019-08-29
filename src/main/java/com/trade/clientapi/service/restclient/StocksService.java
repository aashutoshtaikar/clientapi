package com.trade.clientapi.service.restclient;

import com.trade.clientapi.model.Account;
import com.trade.clientapi.model.BuyingRequest;
import com.trade.clientapi.model.Order;
import com.trade.clientapi.model.Stock;

/* StocksService: Describes the rules for consuming the REST API
 * 					Implementation class must have a restTemplate and return objects 
 * */
public interface StocksService {
	public Stock getStockInfo(String stockSymbol);
	public Account getAccountInfo();
	public Order buy(BuyingRequest buyingRequest);
//	public JSONObject sell(JSONObject jsonObject);
}
