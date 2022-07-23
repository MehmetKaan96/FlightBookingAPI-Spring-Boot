package com.AirportSystem.IService;

import java.util.List;

import com.AirportSystem.Entity.AirlineCompany;

public interface IAirlineCompanyService {
	
	public List<AirlineCompany> getAll();
	
	public AirlineCompany getCompanyByID(int Id);
	
	public String DeleteCompanyByID(int Id);
	
	public AirlineCompany AddCompany(AirlineCompany company);

}
