package com.AirportSystem.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode
@Table(name = "airports")
public class Airport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long airportID;
	
	@Column(name = "airportCode")
	public String airportCode;
	
	@Column(name = "airportName")
	public String airportName;
	
	@Column(name = "airportCity")
	public String airportCity;
	
	@Column(name = "airportCountry")
	public String airportCountry;

}
