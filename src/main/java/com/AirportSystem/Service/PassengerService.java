package com.AirportSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AirportSystem.Entity.Passenger;
import com.AirportSystem.IService.IPassengerService;
import com.AirportSystem.Repository.PassengerRepository;

@Service
public class PassengerService implements IPassengerService{
	
	@Autowired
	PassengerRepository repo;

	@Override
	public List<Passenger> getAllPassengers() {
		return repo.findAll();
	}

	@Override
	public Passenger getPassengerById(Long Id) {
		return repo.findById(Id).orElse(null);
	}

	@Override
	public Passenger AddPassenger(Passenger passenger) {
		return repo.save(passenger);
	}

	@Override
	public String UpdatePassenger(Passenger passenger) {
		try {
			repo.save(passenger);
			return "Yolcu Guncellendi!";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@Override
	public String DeletePassengerById(Long Id) {
		try {
			repo.deleteById(Id);
			return "Yolcu Silindi!";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

}
