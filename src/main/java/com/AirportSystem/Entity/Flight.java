package com.AirportSystem.Entity;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@Table(name = "flights")
@EqualsAndHashCode
public class Flight {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long flightId;
	
	@OneToOne
	public Airport departureAirport;
	
	@OneToOne
	public Airport destinationAirport;

	@OneToOne
	@JoinColumn(name = "company_id")
	public AirlineCompany company;
	
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern = "yyyy-MM-dd")
	public Date date;
	
	@Temporal(TemporalType.TIME)
	@JsonFormat(pattern = "HH:mm")
	public Date time;
	
	
}
