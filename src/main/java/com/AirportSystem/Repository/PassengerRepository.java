package com.AirportSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AirportSystem.Entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long>{

}
