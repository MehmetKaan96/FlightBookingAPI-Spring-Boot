package com.AirportSystem.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "passengers")
public class Passenger {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long passengerID;
	
	@Column(name = "fullname")
	public String fullname;
	
	@Column(name = "age")
	public byte age;
	
	@Column(name = "passportID")
	public String passportID;
	
	@Column(name = "email")
	public String email;
	
	@Column(name = "phone",length = 13)
	public String phone;
	
	/*@ManyToOne
	@JoinColumn(name = "route_id")
	public Route route;*/
	
	@ManyToOne
	@JoinColumn(name = "flight_id",nullable = true)
	public Flight flight;
}
