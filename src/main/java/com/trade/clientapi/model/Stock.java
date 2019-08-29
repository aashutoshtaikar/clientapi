package com.trade.clientapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/*{
    "id": "b0b6dd9d-8b9b-48a9-ba46-b9d54906e415",
    "class": "us_equity",
    "exchange": "NASDAQ",
    "symbol": "AAPL",
    "status": "active",
    "tradable": true,
    "marginable": true,
    "shortable": true,
    "easy_to_borrow": true
}*/
public class Stock {
	private String id;
	
	@JsonProperty("class")
	private String clas;
	
	private String exchange;
	private String symbol;
	private String status;
	private boolean tradable;
	private boolean marginable;
	private boolean shortable;
	private boolean easyToBorrow;
	
	public Stock() {
	}
	
	public Stock(String id, String clas, String exchange, String symbol, String status, boolean tradable,
			boolean marginable, boolean shortable, boolean easyToBorrow) {
		this.id = id;
		this.clas = clas;
		this.exchange = exchange;
		this.symbol = symbol;
		this.status = status;
		this.tradable = tradable;
		this.marginable = marginable;
		this.shortable = shortable;
		this.easyToBorrow = easyToBorrow;
	}
	//getters and setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getClas() {
		return clas;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}
	public String getExchange() {
		return exchange;
	}
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public boolean isTradable() {
		return tradable;
	}
	public void setTradable(boolean tradable) {
		this.tradable = tradable;
	}
	public boolean isMarginable() {
		return marginable;
	}
	public void setMarginable(boolean marginable) {
		this.marginable = marginable;
	}
	public boolean isShortable() {
		return shortable;
	}
	public void setShortable(boolean shortable) {
		this.shortable = shortable;
	}
	public boolean isEasyToBorrow() {
		return easyToBorrow;
	}
	public void setEasyToBorrow(boolean easyToBorrow) {
		this.easyToBorrow = easyToBorrow;
	}
	@Override
	public String toString() {
		return "Stock [id=" + id + ", clas=" + clas + ", exchange=" + exchange + ", symbol=" + symbol + ", status="
				+ status + ", tradable=" + tradable + ", marginable=" + marginable + ", shortable=" + shortable
				+ ", easyToBorrow=" + easyToBorrow + "]";
	}
	
	
}
