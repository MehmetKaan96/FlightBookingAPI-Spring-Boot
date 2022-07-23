package com.AirportSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AirportSystem.Entity.AirlineCompany;
import com.AirportSystem.Service.AirlineCompanyService;

@RestController
@RequestMapping("api")
public class AirlineCompanyController {
	
	@Autowired
	AirlineCompanyService service;
	
	@GetMapping("/companies")
	public List<AirlineCompany> getAllCompanies(){
		return service.getAll();
	}
	
	@GetMapping("/companies/{id}")
	public AirlineCompany getCompanyById(@PathVariable("id") int Id)
	{
		return service.getCompanyByID(Id);
	}
	
	@PostMapping("/companies")
	public AirlineCompany addCompany(@RequestBody AirlineCompany company)
	{
		return service.AddCompany(company);
	}
	
	@DeleteMapping("/companies/{id}")
	public String deleteCompany(@PathVariable("id") int Id)
	{
		return service.DeleteCompanyByID(Id);
	}
}
