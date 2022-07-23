package com.AirportSystem.IService;

import java.util.List;

import com.AirportSystem.Entity.Passenger;

public interface IPassengerService {
	
	public List<Passenger> getAllPassengers();
	
	public Passenger getPassengerById(Long Id);
	
	public String AddPassenger(Passenger passenger);
	
	public String UpdatePassenger(Passenger passenger);
	
	public String DeletePassengerById(Long Id);

	public Passenger Login(String Email, String Password);
	

}
