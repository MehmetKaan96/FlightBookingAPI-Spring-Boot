package com.AirportSystem.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
	
	@ManyToOne
	@JoinColumn(name = "route_id")
	public Route route;
	
	@Temporal(TemporalType.DATE)
	public Date date;
	
	
	
}
