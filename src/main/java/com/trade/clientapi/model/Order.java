package com.trade.clientapi.model;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "client_order_id", "created_at", "updated_at", "submitted_at", "filled_at", "expired_at",
		"canceled_at", "failed_at", "asset_id", "symbol", "asset_class", "qty", "filled_qty", "type", "side",
		"time_in_force", "limit_price", "stop_price", "filled_avg_price", "status" })
public class Order {

	@JsonProperty("id")
	private String id;
	@JsonProperty("client_order_id")
	private String clientOrderId;
	@JsonProperty("created_at")
	private String createdAt;
	@JsonProperty("updated_at")
	private String updatedAt;
	@JsonProperty("submitted_at")
	private String submittedAt;
	@JsonProperty("filled_at")
	private String filledAt;
	@JsonProperty("expired_at")
	private String expiredAt;
	@JsonProperty("canceled_at")
	private String canceledAt;
	@JsonProperty("failed_at")
	private String failedAt;
	@JsonProperty("asset_id")
	private String assetId;
	@JsonProperty("symbol")
	private String symbol;
	@JsonProperty("asset_class")
	private String assetClass;
	@JsonProperty("qty")
	private String qty;
	@JsonProperty("filled_qty")
	private String filledQty;
	@JsonProperty("type")
	private String type;
	@JsonProperty("side")
	private String side;
	@JsonProperty("time_in_force")
	private String timeInForce;
	@JsonProperty("limit_price")
	private String limitPrice;
	@JsonProperty("stop_price")
	private String stopPrice;
	@JsonProperty("filled_avg_price")
	private String filledAvgPrice;
	@JsonProperty("status")
	private String status;

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("client_order_id")
	public String getClientOrderId() {
		return clientOrderId;
	}

	@JsonProperty("client_order_id")
	public void setClientOrderId(String clientOrderId) {
		this.clientOrderId = clientOrderId;
	}

	@JsonProperty("created_at")
	public String getCreatedAt() {
		return createdAt;
	}

	@JsonProperty("created_at")
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	@JsonProperty("updated_at")
	public String getUpdatedAt() {
		return updatedAt;
	}

	@JsonProperty("updated_at")
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	@JsonProperty("submitted_at")
	public String getSubmittedAt() {
		return submittedAt;
	}

	@JsonProperty("submitted_at")
	public void setSubmittedAt(String submittedAt) {
		this.submittedAt = submittedAt;
	}

	@JsonProperty("filled_at")
	public String getFilledAt() {
		return filledAt;
	}

	@JsonProperty("filled_at")
	public void setFilledAt(String filledAt) {
		this.filledAt = filledAt;
	}

	@JsonProperty("expired_at")
	public String getExpiredAt() {
		return expiredAt;
	}

	@JsonProperty("expired_at")
	public void setExpiredAt(String expiredAt) {
		this.expiredAt = expiredAt;
	}

	@JsonProperty("canceled_at")
	public String getCanceledAt() {
		return canceledAt;
	}

	@JsonProperty("canceled_at")
	public void setCanceledAt(String canceledAt) {
		this.canceledAt = canceledAt;
	}

	@JsonProperty("failed_at")
	public String getFailedAt() {
		return failedAt;
	}

	@JsonProperty("failed_at")
	public void setFailedAt(String failedAt) {
		this.failedAt = failedAt;
	}

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

	@JsonProperty("asset_class")
	public String getAssetClass() {
		return assetClass;
	}

	@JsonProperty("asset_class")
	public void setAssetClass(String assetClass) {
		this.assetClass = assetClass;
	}

	@JsonProperty("qty")
	public String getQty() {
		return qty;
	}

	@JsonProperty("qty")
	public void setQty(String qty) {
		this.qty = qty;
	}

	@JsonProperty("filled_qty")
	public String getFilledQty() {
		return filledQty;
	}

	@JsonProperty("filled_qty")
	public void setFilledQty(String filledQty) {
		this.filledQty = filledQty;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("side")
	public String getSide() {
		return side;
	}

	@JsonProperty("side")
	public void setSide(String side) {
		this.side = side;
	}

	@JsonProperty("time_in_force")
	public String getTimeInForce() {
		return timeInForce;
	}

	@JsonProperty("time_in_force")
	public void setTimeInForce(String timeInForce) {
		this.timeInForce = timeInForce;
	}

	@JsonProperty("limit_price")
	public String getLimitPrice() {
		return limitPrice;
	}

	@JsonProperty("limit_price")
	public void setLimitPrice(String limitPrice) {
		this.limitPrice = limitPrice;
	}

	@JsonProperty("stop_price")
	public String getStopPrice() {
		return stopPrice;
	}

	@JsonProperty("stop_price")
	public void setStopPrice(String stopPrice) {
		this.stopPrice = stopPrice;
	}

	@JsonProperty("filled_avg_price")
	public String getFilledAvgPrice() {
		return filledAvgPrice;
	}

	@JsonProperty("filled_avg_price")
	public void setFilledAvgPrice(String filledAvgPrice) {
		this.filledAvgPrice = filledAvgPrice;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("clientOrderId", clientOrderId)
				.append("createdAt", createdAt).append("updatedAt", updatedAt).append("submittedAt", submittedAt)
				.append("filledAt", filledAt).append("expiredAt", expiredAt).append("canceledAt", canceledAt)
				.append("failedAt", failedAt).append("assetId", assetId).append("symbol", symbol)
				.append("assetClass", assetClass).append("qty", qty).append("filledQty", filledQty).append("type", type)
				.append("side", side).append("timeInForce", timeInForce).append("limitPrice", limitPrice)
				.append("stopPrice", stopPrice).append("filledAvgPrice", filledAvgPrice).append("status", status)
				.toString();
	}

}
