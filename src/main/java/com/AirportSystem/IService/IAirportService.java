package com.AirportSystem.IService;

import java.util.List;

import com.AirportSystem.Entity.Airport;

public interface IAirportService {
	
	public List<Airport> getAllAirports();
	
	public Airport getAirportById(Long Id);
	
	public Airport getAirportByCode(String code);
	
	public Airport AddAirport(Airport airport);
	
	public String UpdateAirport(Airport airport);
	
	public String DeleteAirportById(Long Id);

}
