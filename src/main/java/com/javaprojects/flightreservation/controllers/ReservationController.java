package com.javaprojects.flightreservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaprojects.flightreservation.dto.ReservationRequest;
import com.javaprojects.flightreservation.dto.ReservationUpdateRequest;
import com.javaprojects.flightreservation.entities.Reservation;
import com.javaprojects.flightreservation.services.ReservationService;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

	@Autowired
	private ReservationService service;

//	@RequestMapping("/showCompleteReservation")
//	public String showCompleteReservation(Long flightId)
//	{
//		
//	}

	@PostMapping("/completeReservation")
	public Reservation completeReservation(@RequestBody ReservationRequest request) {
		Reservation reservation = service.bookFlight(request);
		return reservation;
	}
	
	@GetMapping("/{id}")
	public Reservation findReservation(@PathVariable("id") Long id)
	{
		return service.findOne(id);
	}
	
	@PostMapping("/updateReservation")
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request)
	{
		Reservation reservation = service.findOne(request.getId());
		reservation.setNumberOfBags(request.getNumberOfBags());
		reservation.setCheckedIn(request.getCheckedIn());
		return service.updateReservation(reservation);
	}
}
