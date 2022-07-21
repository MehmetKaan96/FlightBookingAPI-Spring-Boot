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

import com.AirportSystem.Entity.Flight;
import com.AirportSystem.Service.FlightService;

@RestController
@RequestMapping("api")
public class FlightController {
	@Autowired
	FlightService service;
	
	@GetMapping("/flights")
	public List<Flight> getAllFlights(){
		return service.getAllFlights();
	}
	
	@GetMapping("/flights/{id}")
	public Flight getFlightById(@PathVariable("id") Long Id)
	{
		return service.getFlightById(Id);
	}
	
	@PostMapping("/flights")
	public Flight AddFlight(@RequestBody Flight flight)
	{
		return service.AddFlight(flight);
	}
	
	@PutMapping("/flights")
	public String UpdateFlight(@RequestBody Flight flight)
	{
		return service.UpdateFlight(flight);
	}
	
	@DeleteMapping("/flights/{id}")
	public String DeleteFlight(@PathVariable("id") Long Id)
	{
		return service.DeleteFlightById(Id);
	}
}
