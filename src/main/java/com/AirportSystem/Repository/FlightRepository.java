package com.AirportSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AirportSystem.Entity.Flight;
@Repository
public interface FlightRepository extends JpaRepository<Flight, Long>{

}
