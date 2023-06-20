package com.javaprojects.flightreservation.services.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaprojects.flightreservation.entities.Flight;
import com.javaprojects.flightreservation.repos.FlightRepository;
import com.javaprojects.flightreservation.services.FlightService;

@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	private FlightRepository repository;

	@Override
	public List<Flight> findFlights(String from, String to, Date departureDate) {
		return repository.findFlights(from, to, departureDate);
	}

	@Override
	public Flight findOne(Long flightId) {
		Optional<Flight> flight = repository.findById(flightId);
		return flight.get();
	}

}
