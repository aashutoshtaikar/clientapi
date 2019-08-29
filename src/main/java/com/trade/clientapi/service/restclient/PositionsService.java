package com.trade.clientapi.service.restclient;

import java.util.List;

import com.trade.clientapi.model.Position;

public interface PositionsService {
	public List<Position> getPositions();
	public Position getPosition();
}
