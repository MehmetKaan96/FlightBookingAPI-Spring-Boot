package com.AirportSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AirportSystem.Entity.AirlineCompany;
import com.AirportSystem.IService.IAirlineCompanyService;
import com.AirportSystem.Repository.AirlineCompanyRepository;

@Service
public class AirlineCompanyService implements IAirlineCompanyService{
	
	@Autowired
	AirlineCompanyRepository repo;
	@Override
	public List<AirlineCompany> getAll() {
		return repo.findAll();
	}

	@Override
	public AirlineCompany getCompanyByID(int Id) {
		return repo.findById(Id).orElse(null);
	}

	@Override
	public String DeleteCompanyByID(int Id) {
		try {
			repo.deleteById(Id);
			return "Sirket Silindi!";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@Override
	public AirlineCompany AddCompany(AirlineCompany company) {
		return repo.save(company);
	}

}
