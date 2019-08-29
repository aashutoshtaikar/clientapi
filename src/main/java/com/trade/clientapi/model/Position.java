package com.trade.clientapi.model;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "asset_id", "symbol", "exchange", "asset_class", "avg_entry_price", "qty", "side", "market_value",
		"cost_basis", "unrealized_pl", "unrealized_plpc", "unrealized_intraday_pl", "unrealized_intraday_plpc",
		"current_price", "lastday_price", "change_today" })
public class Position {

	@JsonProperty("asset_id")
	private String assetId;
	@JsonProperty("symbol")
	private String symbol;
	@JsonProperty("exchange")
	private String exchange;
	@JsonProperty("asset_class")
	private String assetClass;
	@JsonProperty("avg_entry_price")
	private String avgEntryPrice;
	@JsonProperty("qty")
	private String qty;
	@JsonProperty("side")
	private String side;
	@JsonProperty("market_value")
	private String marketValue;
	@JsonProperty("cost_basis")
	private String costBasis;
	@JsonProperty("unrealized_pl")
	private String unrealizedPl;
	@JsonProperty("unrealized_plpc")
	private String unrealizedPlpc;
	@JsonProperty("unrealized_intraday_pl")
	private String unrealizedIntradayPl;
	@JsonProperty("unrealized_intraday_plpc")
	private String unrealizedIntradayPlpc;
	@JsonProperty("current_price")
	private String currentPrice;
	@JsonProperty("lastday_price")
	private String lastdayPrice;
	@JsonProperty("change_today")
	private String changeToday;

	@JsonProperty("asset_id")
	public String getAssetId() {
		return assetId;
	}

	@JsonProperty("asset_id")
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	@JsonProperty("symbol")
	public String getSymbol() {
		return symbol;
	}

	@JsonProperty("symbol")
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	@JsonProperty("exchange")
	public String getExchange() {
		return exchange;
	}

	@JsonProperty("exchange")
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	@JsonProperty("asset_class")
	public String getAssetClass() {
		return assetClass;
	}

	@JsonProperty("asset_class")
	public void setAssetClass(String assetClass) {
		this.assetClass = assetClass;
	}

	@JsonProperty("avg_entry_price")
	public String getAvgEntryPrice() {
		return avgEntryPrice;
	}

	@JsonProperty("avg_entry_price")
	public void setAvgEntryPrice(String avgEntryPrice) {
		this.avgEntryPrice = avgEntryPrice;
	}

	@JsonProperty("qty")
	public String getQty() {
		return qty;
	}

	@JsonProperty("qty")
	public void setQty(String qty) {
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

	@JsonProperty("market_value")
	public String getMarketValue() {
		return marketValue;
	}

	@JsonProperty("market_value")
	public void setMarketValue(String marketValue) {
		this.marketValue = marketValue;
	}

	@JsonProperty("cost_basis")
	public String getCostBasis() {
		return costBasis;
	}

	@JsonProperty("cost_basis")
	public void setCostBasis(String costBasis) {
		this.costBasis = costBasis;
	}

	@JsonProperty("unrealized_pl")
	public String getUnrealizedPl() {
		return unrealizedPl;
	}

	@JsonProperty("unrealized_pl")
	public void setUnrealizedPl(String unrealizedPl) {
		this.unrealizedPl = unrealizedPl;
	}

	@JsonProperty("unrealized_plpc")
	public String getUnrealizedPlpc() {
		return unrealizedPlpc;
	}

	@JsonProperty("unrealized_plpc")
	public void setUnrealizedPlpc(String unrealizedPlpc) {
		this.unrealizedPlpc = unrealizedPlpc;
	}

	@JsonProperty("unrealized_intraday_pl")
	public String getUnrealizedIntradayPl() {
		return unrealizedIntradayPl;
	}

	@JsonProperty("unrealized_intraday_pl")
	public void setUnrealizedIntradayPl(String unrealizedIntradayPl) {
		this.unrealizedIntradayPl = unrealizedIntradayPl;
	}

	@JsonProperty("unrealized_intraday_plpc")
	public String getUnrealizedIntradayPlpc() {
		return unrealizedIntradayPlpc;
	}

	@JsonProperty("unrealized_intraday_plpc")
	public void setUnrealizedIntradayPlpc(String unrealizedIntradayPlpc) {
		this.unrealizedIntradayPlpc = unrealizedIntradayPlpc;
	}

	@JsonProperty("current_price")
	public String getCurrentPrice() {
		return currentPrice;
	}

	@JsonProperty("current_price")
	public void setCurrentPrice(String currentPrice) {
		this.currentPrice = currentPrice;
	}

	@JsonProperty("lastday_price")
	public String getLastdayPrice() {
		return lastdayPrice;
	}

	@JsonProperty("lastday_price")
	public void setLastdayPrice(String lastdayPrice) {
		this.lastdayPrice = lastdayPrice;
	}

	@JsonProperty("change_today")
	public String getChangeToday() {
		return changeToday;
	}

	@JsonProperty("change_today")
	public void setChangeToday(String changeToday) {
		this.changeToday = changeToday;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("assetId", assetId).append("symbol", symbol)
				.append("exchange", exchange).append("assetClass", assetClass).append("avgEntryPrice", avgEntryPrice)
				.append("qty", qty).append("side", side).append("marketValue", marketValue)
				.append("costBasis", costBasis).append("unrealizedPl", unrealizedPl)
				.append("unrealizedPlpc", unrealizedPlpc).append("unrealizedIntradayPl", unrealizedIntradayPl)
				.append("unrealizedIntradayPlpc", unrealizedIntradayPlpc).append("currentPrice", currentPrice)
				.append("lastdayPrice", lastdayPrice).append("changeToday", changeToday).toString();
	}

}
