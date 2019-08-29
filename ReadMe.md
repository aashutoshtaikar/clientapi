Trading application prototype
=============================

## Alpaca REST End-points
Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.

### Get account information:
GET https://paper-api.alpaca.markets/v2/account  
Header:  
```
key					Value  
APCA-API-KEY-ID		PKGNTKCDPQF9EA48PDJM  
APCA-API-SECRET-KEY	AaYy9W65FOydvHXByr8Qypxmil2Ohs5WYybjrUAw  
```

### Get a stock information from symbol  
GET https://paper-api.alpaca.markets/v2/assets/{symbol}  


### Placing first trade  
POST https://paper-api.alpaca.markets/v2/orders  
RequestBody:  
```json
{
    "symbol": "GOOGL",
    "qty": 1,
    "side": "buy",
    "type": "market",
    "time_in_force": "day"
}
```

###  check my position
GET https://paper-api.alpaca.markets/v2/positions  


