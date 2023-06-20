package com.javaprojects.flightreservation.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaprojects.flightreservation.entities.Passenger;
import com.javaprojects.flightreservation.repos.PassengerRepository;
import com.javaprojects.flightreservation.services.PassengerService;

@Service
public class PassengerServiceImpl implements PassengerService {

	@Autowired
	private PassengerRepository repository;

	@Override
	public Passenger savePassenger(Passenger passenger) {
		return repository.save(passenger);
	}

}
