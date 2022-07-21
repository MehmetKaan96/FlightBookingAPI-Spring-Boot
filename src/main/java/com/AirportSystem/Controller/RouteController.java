package com.AirportSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AirportSystem.Entity.Route;
import com.AirportSystem.Service.RouteService;

@RestController
@RequestMapping("api")
public class RouteController {

	@Autowired
	RouteService service;
	
	@GetMapping("/routes")
	public List<Route> getAllFlights(){
		return service.getAllRoutes();
	}
	
	@GetMapping("/routes/{id}")
	public Route getFlightById(@PathVariable("id") Long Id)
	{
		return service.getRouteById(Id);
	}
	
	@PostMapping("/routes")
	public Route AddFlight(@RequestBody Route route)
	{
		return service.AddRoute(route);
	}
	
	@PutMapping("/routes")
	public String UpdateFlight(@RequestBody Route route)
	{
		return service.UpdateRoute(route);
	}
	
	@DeleteMapping("/routes/{id}")
	public String DeleteFlight(@PathVariable("id") Long Id)
	{
		return service.DeleteRouteById(Id);
	}
}
