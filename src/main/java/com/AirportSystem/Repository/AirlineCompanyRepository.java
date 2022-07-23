package com.AirportSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AirportSystem.Entity.AirlineCompany;

public interface AirlineCompanyRepository  extends JpaRepository<AirlineCompany, Integer>{

}
