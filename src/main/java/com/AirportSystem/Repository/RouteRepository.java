package com.AirportSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AirportSystem.Entity.Route;
@Repository
public interface RouteRepository extends JpaRepository<Route, Long>{

}
