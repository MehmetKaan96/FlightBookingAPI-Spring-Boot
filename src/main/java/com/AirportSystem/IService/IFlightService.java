package com.AirportSystem.IService;

import java.util.List;

import com.AirportSystem.Entity.Flight;

public interface IFlightService {
	
	public List<Flight> getAllFlights();
	
	public Flight getFlightById(Long Id);
	
	public Flight AddFlight(Flight flight);
	
	public String UpdateFlight(Flight flight);
	
	public String DeleteFlightById(Long Id);

}
