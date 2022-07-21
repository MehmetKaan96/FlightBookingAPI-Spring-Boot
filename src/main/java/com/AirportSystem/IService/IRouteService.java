package com.AirportSystem.IService;

import java.util.List;

import com.AirportSystem.Entity.Route;

public interface IRouteService {
	
	public List<Route> getAllRoutes();
	
	public Route getRouteById(Long Id);
	
	public Route AddRoute(Route route);
	
	public String UpdateRoute(Route route);
	
	public String DeleteRouteById(Long Id);

}
