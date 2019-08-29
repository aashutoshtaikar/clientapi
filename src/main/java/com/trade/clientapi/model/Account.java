package com.trade.clientapi.model;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "status",
    "currency",
    "buying_power",
    "regt_buying_power",
    "daytrading_buying_power",
    "cash",
    "portfolio_value",
    "pattern_day_trader",
    "trading_blocked",
    "transfers_blocked",
    "account_blocked",
    "created_at",
    "trade_suspended_by_user",
    "multiplier",
    "shorting_enabled",
    "equity",
    "last_equity",
    "long_market_value",
    "short_market_value",
    "initial_margin",
    "maintenance_margin",
    "last_maintenance_margin",
    "sma",
    "daytrade_count"
})
public class Account {

    @JsonProperty("id")
    private String id;
    @JsonProperty("status")
    private String status;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("buying_power")
    private String buyingPower;
    @JsonProperty("regt_buying_power")
    private String regtBuyingPower;
    @JsonProperty("daytrading_buying_power")
    private String daytradingBuyingPower;
    @JsonProperty("cash")
    private String cash;
    @JsonProperty("portfolio_value")
    private String portfolioValue;
    @JsonProperty("pattern_day_trader")
    private Boolean patternDayTrader;
    @JsonProperty("trading_blocked")
    private Boolean tradingBlocked;
    @JsonProperty("transfers_blocked")
    private Boolean transfersBlocked;
    @JsonProperty("account_blocked")
    private Boolean accountBlocked;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("trade_suspended_by_user")
    private Boolean tradeSuspendedByUser;
    @JsonProperty("multiplier")
    private String multiplier;
    @JsonProperty("shorting_enabled")
    private Boolean shortingEnabled;
    @JsonProperty("equity")
    private String equity;
    @JsonProperty("last_equity")
    private String lastEquity;
    @JsonProperty("long_market_value")
    private String longMarketValue;
    @JsonProperty("short_market_value")
    private String shortMarketValue;
    @JsonProperty("initial_margin")
    private String initialMargin;
    @JsonProperty("maintenance_margin")
    private String maintenanceMargin;
    @JsonProperty("last_maintenance_margin")
    private String lastMaintenanceMargin;
    @JsonProperty("sma")
    private String sma;
    @JsonProperty("daytrade_count")
    private Integer daytradeCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Account withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public Account withStatus(String status) {
        this.status = status;
        return this;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Account withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    @JsonProperty("buying_power")
    public String getBuyingPower() {
        return buyingPower;
    }

    @JsonProperty("buying_power")
    public void setBuyingPower(String buyingPower) {
        this.buyingPower = buyingPower;
    }

    public Account withBuyingPower(String buyingPower) {
        this.buyingPower = buyingPower;
        return this;
    }

    @JsonProperty("regt_buying_power")
    public String getRegtBuyingPower() {
        return regtBuyingPower;
    }

    @JsonProperty("regt_buying_power")
    public void setRegtBuyingPower(String regtBuyingPower) {
        this.regtBuyingPower = regtBuyingPower;
    }

    public Account withRegtBuyingPower(String regtBuyingPower) {
        this.regtBuyingPower = regtBuyingPower;
        return this;
    }

    @JsonProperty("daytrading_buying_power")
    public String getDaytradingBuyingPower() {
        return daytradingBuyingPower;
    }

    @JsonProperty("daytrading_buying_power")
    public void setDaytradingBuyingPower(String daytradingBuyingPower) {
        this.daytradingBuyingPower = daytradingBuyingPower;
    }

    public Account withDaytradingBuyingPower(String daytradingBuyingPower) {
        this.daytradingBuyingPower = daytradingBuyingPower;
        return this;
    }

    @JsonProperty("cash")
    public String getCash() {
        return cash;
    }

    @JsonProperty("cash")
    public void setCash(String cash) {
        this.cash = cash;
    }

    public Account withCash(String cash) {
        this.cash = cash;
        return this;
    }

    @JsonProperty("portfolio_value")
    public String getPortfolioValue() {
        return portfolioValue;
    }

    @JsonProperty("portfolio_value")
    public void setPortfolioValue(String portfolioValue) {
        this.portfolioValue = portfolioValue;
    }

    public Account withPortfolioValue(String portfolioValue) {
        this.portfolioValue = portfolioValue;
        return this;
    }

    @JsonProperty("pattern_day_trader")
    public Boolean getPatternDayTrader() {
        return patternDayTrader;
    }

    @JsonProperty("pattern_day_trader")
    public void setPatternDayTrader(Boolean patternDayTrader) {
        this.patternDayTrader = patternDayTrader;
    }

    public Account withPatternDayTrader(Boolean patternDayTrader) {
        this.patternDayTrader = patternDayTrader;
        return this;
    }

    @JsonProperty("trading_blocked")
    public Boolean getTradingBlocked() {
        return tradingBlocked;
    }

    @JsonProperty("trading_blocked")
    public void setTradingBlocked(Boolean tradingBlocked) {
        this.tradingBlocked = tradingBlocked;
    }

    public Account withTradingBlocked(Boolean tradingBlocked) {
        this.tradingBlocked = tradingBlocked;
        return this;
    }

    @JsonProperty("transfers_blocked")
    public Boolean getTransfersBlocked() {
        return transfersBlocked;
    }

    @JsonProperty("transfers_blocked")
    public void setTransfersBlocked(Boolean transfersBlocked) {
        this.transfersBlocked = transfersBlocked;
    }

    public Account withTransfersBlocked(Boolean transfersBlocked) {
        this.transfersBlocked = transfersBlocked;
        return this;
    }

    @JsonProperty("account_blocked")
    public Boolean getAccountBlocked() {
        return accountBlocked;
    }

    @JsonProperty("account_blocked")
    public void setAccountBlocked(Boolean accountBlocked) {
        this.accountBlocked = accountBlocked;
    }

    public Account withAccountBlocked(Boolean accountBlocked) {
        this.accountBlocked = accountBlocked;
        return this;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Account withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("trade_suspended_by_user")
    public Boolean getTradeSuspendedByUser() {
        return tradeSuspendedByUser;
    }

    @JsonProperty("trade_suspended_by_user")
    public void setTradeSuspendedByUser(Boolean tradeSuspendedByUser) {
        this.tradeSuspendedByUser = tradeSuspendedByUser;
    }

    public Account withTradeSuspendedByUser(Boolean tradeSuspendedByUser) {
        this.tradeSuspendedByUser = tradeSuspendedByUser;
        return this;
    }

    @JsonProperty("multiplier")
    public String getMultiplier() {
        return multiplier;
    }

    @JsonProperty("multiplier")
    public void setMultiplier(String multiplier) {
        this.multiplier = multiplier;
    }

    public Account withMultiplier(String multiplier) {
        this.multiplier = multiplier;
        return this;
    }

    @JsonProperty("shorting_enabled")
    public Boolean getShortingEnabled() {
        return shortingEnabled;
    }

    @JsonProperty("shorting_enabled")
    public void setShortingEnabled(Boolean shortingEnabled) {
        this.shortingEnabled = shortingEnabled;
    }

    public Account withShortingEnabled(Boolean shortingEnabled) {
        this.shortingEnabled = shortingEnabled;
        return this;
    }

    @JsonProperty("equity")
    public String getEquity() {
        return equity;
    }

    @JsonProperty("equity")
    public void setEquity(String equity) {
        this.equity = equity;
    }

    public Account withEquity(String equity) {
        this.equity = equity;
        return this;
    }

    @JsonProperty("last_equity")
    public String getLastEquity() {
        return lastEquity;
    }

    @JsonProperty("last_equity")
    public void setLastEquity(String lastEquity) {
        this.lastEquity = lastEquity;
    }

    public Account withLastEquity(String lastEquity) {
        this.lastEquity = lastEquity;
        return this;
    }

    @JsonProperty("long_market_value")
    public String getLongMarketValue() {
        return longMarketValue;
    }

    @JsonProperty("long_market_value")
    public void setLongMarketValue(String longMarketValue) {
        this.longMarketValue = longMarketValue;
    }

    public Account withLongMarketValue(String longMarketValue) {
        this.longMarketValue = longMarketValue;
        return this;
    }

    @JsonProperty("short_market_value")
    public String getShortMarketValue() {
        return shortMarketValue;
    }

    @JsonProperty("short_market_value")
    public void setShortMarketValue(String shortMarketValue) {
        this.shortMarketValue = shortMarketValue;
    }

    public Account withShortMarketValue(String shortMarketValue) {
        this.shortMarketValue = shortMarketValue;
        return this;
    }

    @JsonProperty("initial_margin")
    public String getInitialMargin() {
        return initialMargin;
    }

    @JsonProperty("initial_margin")
    public void setInitialMargin(String initialMargin) {
        this.initialMargin = initialMargin;
    }

    public Account withInitialMargin(String initialMargin) {
        this.initialMargin = initialMargin;
        return this;
    }

    @JsonProperty("maintenance_margin")
    public String getMaintenanceMargin() {
        return maintenanceMargin;
    }

    @JsonProperty("maintenance_margin")
    public void setMaintenanceMargin(String maintenanceMargin) {
        this.maintenanceMargin = maintenanceMargin;
    }

    public Account withMaintenanceMargin(String maintenanceMargin) {
        this.maintenanceMargin = maintenanceMargin;
        return this;
    }

    @JsonProperty("last_maintenance_margin")
    public String getLastMaintenanceMargin() {
        return lastMaintenanceMargin;
    }

    @JsonProperty("last_maintenance_margin")
    public void setLastMaintenanceMargin(String lastMaintenanceMargin) {
        this.lastMaintenanceMargin = lastMaintenanceMargin;
    }

    public Account withLastMaintenanceMargin(String lastMaintenanceMargin) {
        this.lastMaintenanceMargin = lastMaintenanceMargin;
        return this;
    }

    @JsonProperty("sma")
    public String getSma() {
        return sma;
    }

    @JsonProperty("sma")
    public void setSma(String sma) {
        this.sma = sma;
    }

    public Account withSma(String sma) {
        this.sma = sma;
        return this;
    }

    @JsonProperty("daytrade_count")
    public Integer getDaytradeCount() {
        return daytradeCount;
    }

    @JsonProperty("daytrade_count")
    public void setDaytradeCount(Integer daytradeCount) {
        this.daytradeCount = daytradeCount;
    }

    public Account withDaytradeCount(Integer daytradeCount) {
        this.daytradeCount = daytradeCount;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Account withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(status).append(currency).append(buyingPower).append(regtBuyingPower).append(daytradingBuyingPower).append(cash).append(portfolioValue).append(patternDayTrader).append(tradingBlocked).append(transfersBlocked).append(accountBlocked).append(createdAt).append(tradeSuspendedByUser).append(multiplier).append(shortingEnabled).append(equity).append(lastEquity).append(longMarketValue).append(shortMarketValue).append(initialMargin).append(maintenanceMargin).append(lastMaintenanceMargin).append(sma).append(daytradeCount).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Account) == false) {
            return false;
        }
        Account rhs = ((Account) other);
        return new EqualsBuilder().append(id, rhs.id).append(status, rhs.status).append(currency, rhs.currency).append(buyingPower, rhs.buyingPower).append(regtBuyingPower, rhs.regtBuyingPower).append(daytradingBuyingPower, rhs.daytradingBuyingPower).append(cash, rhs.cash).append(portfolioValue, rhs.portfolioValue).append(patternDayTrader, rhs.patternDayTrader).append(tradingBlocked, rhs.tradingBlocked).append(transfersBlocked, rhs.transfersBlocked).append(accountBlocked, rhs.accountBlocked).append(createdAt, rhs.createdAt).append(tradeSuspendedByUser, rhs.tradeSuspendedByUser).append(multiplier, rhs.multiplier).append(shortingEnabled, rhs.shortingEnabled).append(equity, rhs.equity).append(lastEquity, rhs.lastEquity).append(longMarketValue, rhs.longMarketValue).append(shortMarketValue, rhs.shortMarketValue).append(initialMargin, rhs.initialMargin).append(maintenanceMargin, rhs.maintenanceMargin).append(lastMaintenanceMargin, rhs.lastMaintenanceMargin).append(sma, rhs.sma).append(daytradeCount, rhs.daytradeCount).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
