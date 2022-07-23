package com.AirportSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.AirportSystem.Entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long>{
	@Query(value = "Select * From passengers where Email = :Email or Phone = :Phone", nativeQuery = true)
    public Passenger PassengerControl(@Param("Email") String Email, @Param("Phone") String Phone);

    @Query(value = "SELECT * FROM passengers WHERE email = :Email and password = :Password ",nativeQuery = true)
    public Passenger Login(@Param("Email") String Email, @Param("Password") String Password);

}
