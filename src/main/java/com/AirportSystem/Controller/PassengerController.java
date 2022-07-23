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

import com.AirportSystem.Entity.Passenger;
import com.AirportSystem.Service.PassengerService;

@RestController
@RequestMapping("api")
public class PassengerController {

	@Autowired
	PassengerService service;
	
	@GetMapping("/passengers")
	public List<Passenger> getPassengers()
	{
		return service.getAllPassengers();
	}
	
	@GetMapping("/passengers/{id}")
	public Passenger getPassengerById(@PathVariable("id") Long Id)
	{
		return service.getPassengerById(Id);
	}
	
	@PostMapping("/passengers")
	public String AddPassenger(@RequestBody Passenger passenger)
	{
		return service.AddPassenger(passenger);
	}
	
	@PutMapping("/passengers")
	public String UpdatePassenger(@RequestBody Passenger passenger)
	{
		return service.UpdatePassenger(passenger);
	}
	
	@DeleteMapping("/passengers/{id}")
	public String DeletePassenger(@PathVariable("id") Long Id)
	{
		return service.DeletePassengerById(Id);
	}

	@PostMapping("/passengers/login")
	public Passenger login(String Email, String Password)
	{
		System.out.println(Email + " " + Password);
		return service.Login(Email, Password);
	}
	
}
