package com.AirportSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AirportSystem.Entity.Route;
import com.AirportSystem.IService.IRouteService;
import com.AirportSystem.Repository.RouteRepository;

@Service
public class RouteService implements IRouteService{

	@Autowired
	RouteRepository repo;
	
	@Override
	public List<Route> getAllRoutes() {
		return repo.findAll();
	}

	@Override
	public Route getRouteById(Long Id) {
		return repo.findById(Id).orElse(null);
	}

	@Override
	public Route AddRoute(Route route) {
		return repo.save(route);
	}

	@Override
	public String UpdateRoute(Route route) {
		try {
			repo.save(route);
			return "Route Guncellendi!";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@Override
	public String DeleteRouteById(Long Id) {
		try {
			repo.deleteById(Id);
			return "Route Silindi!";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

}
