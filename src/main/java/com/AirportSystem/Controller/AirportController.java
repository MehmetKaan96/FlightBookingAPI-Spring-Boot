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

import com.AirportSystem.Entity.Airport;
import com.AirportSystem.Service.AirportService;

@RestController
@RequestMapping("api")
public class AirportController {

	@Autowired
	AirportService service;
	
	
	
	@GetMapping("/airports")
	public List<Airport> getAll(){
		return service.getAllAirports();
	}
	
	@GetMapping("/airports/{id}")
	public Airport getAirportById(@PathVariable("id") Long Id)
	{
		return service.getAirportById(Id);
	}
	
	@PostMapping("/airports/code")
	public Airport getAirportByCode(String code)
	{
		System.out.println(code);
		return service.getAirportByCode(code);
	}
	
	@PostMapping("/airports")
	public Airport AddAirport(@RequestBody Airport airport)
	{
		return service.AddAirport(airport);
	}
	
	@PutMapping("/airports")
	public String UpdateAirport(@RequestBody Airport airport)
	{
		return service.UpdateAirport(airport);
	}
	
	@DeleteMapping("/airports/{id}")
	public String DeleteAirport(@PathVariable("id") Long Id)
	{
		return service.DeleteAirportById(Id);
	}
}
