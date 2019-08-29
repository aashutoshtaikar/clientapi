package com.trade.clientapi.model;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "symbol", "qty", "side", "type", "time_in_force" })
public class BuyingRequest {

	@JsonProperty("symbol")
	private String symbol;
	@JsonProperty("qty")
	private Integer qty;
	@JsonProperty("side")
	private String side;
	@JsonProperty("type")
	private String type;
	@JsonProperty("time_in_force")
	private String timeInForce;

	@JsonProperty("symbol")
	public String getSymbol() {
		return symbol;
	}

	@JsonProperty("symbol")
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	@JsonProperty("qty")
	public Integer getQty() {
		return qty;
	}

	@JsonProperty("qty")
	public void setQty(Integer qty) {
		this.qty = qty;
	}

	@JsonProperty("side")
	public String getSide() {
		return side;
	}

	@JsonProperty("side")
	public void setSide(String side) {
		this.side = side;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("time_in_force")
	public String getTimeInForce() {
		return timeInForce;
	}

	@JsonProperty("time_in_force")
	public void setTimeInForce(String timeInForce) {
		this.timeInForce = timeInForce;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("symbol", symbol).append("qty", qty).append("side", side)
				.append("type", type).append("timeInForce", timeInForce).toString();
	}

}