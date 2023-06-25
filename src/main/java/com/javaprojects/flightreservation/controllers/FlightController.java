package com.javaprojects.flightreservation.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaprojects.flightreservation.entities.Flight;
import com.javaprojects.flightreservation.services.FlightService;

@RestController
@RequestMapping("/flight")
public class FlightController {

	@Autowired
	private FlightService service;

	@GetMapping("/findFlights")
	public List<Flight> findFlights(@RequestParam("from") String from, @RequestParam("to") String to,
			@RequestParam("departureDate") @DateTimeFormat(pattern = "dd-MM-yyyy") Date departureDate) {
		return service.findFlights(from, to, departureDate);
	}

	@GetMapping
	public List<Flight> getAllFlights() {
		return service.getAllFlights();
	}

	@GetMapping("/{id}")
	public Flight getFlightById(@PathVariable("id") Long id) {
		return service.findOne(id);
	}

	@DeleteMapping("/{id}")
	private void deleteFlight(@PathVariable("id") Long id) {
		service.delete(id);
	}

	@PostMapping
	private void saveFlight(@RequestBody Flight flight) {
		service.saveOrUpdate(flight);
	}

}
