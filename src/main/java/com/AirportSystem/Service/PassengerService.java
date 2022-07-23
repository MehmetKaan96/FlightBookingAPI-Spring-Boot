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
	public String AddPassenger(Passenger passenger) {
		try {
			if(repo.PassengerControl(passenger.email, passenger.phone) == null){
				 repo.save(passenger);
				 return "Yolcu Eklendi!";
			}else{
				return "Girilen email veya telefon numarası zaten kayıtlı.";
			}
		} catch (Exception e) {
			return e.getMessage();
		}
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

	@Override
	public Passenger Login(String Email, String Password) {
		return repo.Login(Email, Password);
	}


}
