package com.AirportSystem.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode
@Table(name = "routes")
public class Route {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long routeID;
	
	@ManyToOne
	public Airport departureAirport;
	
	@ManyToOne
	public Airport destinationAirport;
	
	/*@OneToMany(mappedBy = "route")
	public List<Flight> flights;*/
	
	@OneToOne
	@JoinColumn(name = "company_id")
	public AirlineCompany company;
	

}
