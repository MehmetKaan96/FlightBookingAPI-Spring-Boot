package com.AirportSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AirportSystem.Entity.Airport;
import com.AirportSystem.IService.IAirportService;
import com.AirportSystem.Repository.AirportRepository;

@Service
public class AirportService implements IAirportService{
	
	@Autowired
	AirportRepository repo;

	@Override
	public List<Airport> getAllAirports() {
		return repo.findAll();
	}

	@Override
	public Airport getAirportById(Long Id) {
		return repo.findById(Id).orElse(null);
	}

	@Override
	public Airport getAirportByCode(String code) {
		return repo.getAirportByCode(code);
	}

	@Override
	public Airport AddAirport(Airport airport) {
		return repo.save(airport);
	}

	@Override
	public String UpdateAirport(Airport airport) {
		try {
			repo.save(airport);
			return "Guncelleme Basarili!";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@Override
	public String DeleteAirportById(Long Id) {
		try {
			repo.deleteById(Id);
			return "Havayolu Silindi!";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

}
