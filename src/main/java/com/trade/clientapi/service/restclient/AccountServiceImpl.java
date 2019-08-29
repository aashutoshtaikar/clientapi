package com.trade.clientapi.service.restclient;

import java.util.Arrays;
import java.util.logging.Logger;

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

@Service
public class AccountServiceImpl implements AccountService {

	private RestTemplate restTemplate;
	private String restUrl;
	private Logger logger = Logger.getLogger(getClass().getName());
	static private HttpHeaders headers = new HttpHeaders();
	
	@Autowired
	public AccountServiceImpl(@Value("${alpaca.root.rest.url}") String theUrl, RestTemplate rt) {
		this.restTemplate = rt;
		this.restUrl = theUrl;
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("APCA-API-KEY-ID", "PKGNTKCDPQF9EA48PDJM");
		headers.set("APCA-API-SECRET-KEY", "AaYy9W65FOydvHXByr8Qypxmil2Ohs5WYybjrUAw");
	}
	
	@Override
	public Account getInfo() {
		HttpEntity<String> reqEntity = new HttpEntity<String>(headers);
		ResponseEntity<Account> respEnity = restTemplate.exchange(restUrl, HttpMethod.GET, reqEntity, Account.class);
		return respEnity.getBody();
	}

}
