package com.AirportSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.AirportSystem.Entity.Airport;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Long>{

	@Query(value = "SELECT * FROM airports WHERE airport_code = :code",nativeQuery = true)
	public Airport getAirportByCode(@Param("code") String code);
}
