package com.javaprojects.flightreservation.services;

import java.util.Date;
import java.util.List;

import com.javaprojects.flightreservation.entities.Flight;

public interface FlightService {

	public List<Flight> findFlights(String from, String to, Date departureDate);
	
	Flight findOne(Long flightId);

	public List<Flight> getAllFlights();

	public void delete(Long id);

	public void saveOrUpdate(Flight flight);
}
