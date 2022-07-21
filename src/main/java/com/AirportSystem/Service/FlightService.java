package com.AirportSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AirportSystem.Entity.Flight;
import com.AirportSystem.IService.IFlightService;
import com.AirportSystem.Repository.FlightRepository;

@Service
public class FlightService implements IFlightService{
	
	@Autowired
	FlightRepository repo;

	@Override
	public List<Flight> getAllFlights() {
		return repo.findAll();
	}

	@Override
	public Flight getFlightById(Long Id) {
		return repo.findById(Id).orElse(null);
	}

	@Override
	public Flight AddFlight(Flight flight) {
		return repo.save(flight);
	}

	@Override
	public String UpdateFlight(Flight flight) {
		try {
			repo.save(flight);
			return "Ucus Guncellendi!";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@Override
	public String DeleteFlightById(Long Id) {
		try {
			repo.deleteById(Id);
			return "Ucus Silindi!";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

}
