package com.trade.clientapi.service.restclient;

import java.util.Arrays;
import java.util.logging.Logger;

import org.apache.http.HttpStatus;
import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.trade.clientapi.model.Account;
import com.trade.clientapi.model.BuyingRequest;
import com.trade.clientapi.model.Order;
import com.trade.clientapi.model.Stock;

@Service
public class StocksServiceImpl implements StocksService {

	private RestTemplate restTemplate;
	private String restUrl;
	private Logger logger = Logger.getLogger(getClass().getName());
	static private HttpHeaders headers = new HttpHeaders();
	
	@Autowired
	public StocksServiceImpl(@Value("${alpaca.root.rest.url}") String theUrl, RestTemplate rt) {
		this.restTemplate = rt;
		this.restUrl = theUrl;
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("APCA-API-KEY-ID", "PKGNTKCDPQF9EA48PDJM");
		headers.set("APCA-API-SECRET-KEY", "AaYy9W65FOydvHXByr8Qypxmil2Ohs5WYybjrUAw");
	}
	
	@Override
	public Stock getStockInfo(String stockSymbol) {	
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		ResponseEntity<Stock> respEntity = restTemplate.exchange(restUrl + "/assets/" + stockSymbol, HttpMethod.GET, entity, Stock.class);
		return respEntity.getBody();
	}

	@Override
	public Account getAccountInfo() {
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		ResponseEntity<Account> respEntity = restTemplate.exchange(restUrl + "/account", HttpMethod.GET, entity, Account.class);
		return respEntity.getBody();	
	}

	@Override
	public Order buy(BuyingRequest buyingRequest) {
		HttpEntity<BuyingRequest> entity = new HttpEntity<BuyingRequest>(buyingRequest, headers);
		logger.info(restUrl + "/orders");
		logger.info(buyingRequest.toString());
		ResponseEntity<Order> respEntity = restTemplate.postForEntity(restUrl + "/orders", entity, Order.class);
		
		if (respEntity.getStatusCodeValue() == HttpStatus.SC_FORBIDDEN || respEntity.getStatusCodeValue() == HttpStatus.SC_UNPROCESSABLE_ENTITY) {
			return null;
		}
		return respEntity.getBody();
	}

//	@Override
//	public JSONObject sell(String jsonString) {
//		return j2JPostRestCall("/orders", jsonString);
//	}
//
//	@Override
//	public void position() {
//		// TODO Auto-generated method stub
//		
//	}
	
	
	//using raw string -- experimental
	private JSONObject string2JsonPostRestCall(String endpoint, String jsonString){
		HttpEntity<String> entity = new HttpEntity<String>(jsonString, headers);
		logger.info(restUrl + endpoint);
		ResponseEntity<String> respEntity = restTemplate.postForEntity(restUrl + endpoint, entity, String.class);
		if (respEntity.getStatusCodeValue() == HttpStatus.SC_FORBIDDEN || respEntity.getStatusCodeValue() == HttpStatus.SC_UNPROCESSABLE_ENTITY) {
			return null;
		}
		
		Object jsonParser = new JSONParser(respEntity.getBody());
		return (JSONObject)jsonParser;
	}
	
}




// Getting JSON using API key and secret key in header
// ResponseEntity<JSONObject> respEntity = restTemplate.exchange(restUrl + "/assets/AAPL", HttpMethod.GET, entity, JSONObject.class);
// JSONObject body = respEntity.getBody();
//
//Stock stock = new Stock();
//stock.setId(body.getString("id"));
//stock.setClas(body.getString("class"));
//stock.setExchange(body.getString("exchange"));
//stock.setSymbol(body.getString("symbol"));
//stock.setStatus(body.getString("status"));
//stock.setTradable(body.getBoolean("tradable"));
//stock.setMarginable(body.getBoolean("marginable"));
//stock.setShortable(body.getBoolean("shortable"));
//stock.setEasyToBorrow(body.getBoolean("easy_to_borrow"));
//Stock resp = respEntity.getBody();
