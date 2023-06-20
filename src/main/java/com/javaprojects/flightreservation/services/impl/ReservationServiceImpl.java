package com.javaprojects.flightreservation.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaprojects.flightreservation.dto.ReservationRequest;
import com.javaprojects.flightreservation.entities.Flight;
import com.javaprojects.flightreservation.entities.Passenger;
import com.javaprojects.flightreservation.entities.Reservation;
import com.javaprojects.flightreservation.repos.ReservationRepository;
import com.javaprojects.flightreservation.services.FlightService;
import com.javaprojects.flightreservation.services.PassengerService;
import com.javaprojects.flightreservation.services.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private FlightService flightService;

	@Autowired
	private PassengerService passengerService;

	@Autowired
	private ReservationRepository reservationRepository;

	@Override
	public Reservation bookFlight(ReservationRequest request) {

		// makePayment();

		Long flightId = request.getFlightId();
		Flight flight = flightService.findOne(flightId);

		Passenger passenger = new Passenger();
		passenger.setFirstName(request.getPassengerFirstName());
		passenger.setLastName(request.getPassengerLastName());
		passenger.setPhone(request.getPassengerPhone());
		passenger.setEmail(request.getPassengerEmail());
		Passenger savedPassenger = passengerService.savePassenger(passenger);

		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(savedPassenger);
		reservation.setCheckedIn(false);
		reservation.setNumberOfBags(0);

		Reservation savedReservation = reservationRepository.save(reservation);
		return savedReservation;
	}

	@Override
	public Reservation findOne(Long id) {
		return reservationRepository.findById(id).get();
	}

	@Override
	public Reservation updateReservation(Reservation reservation) {
		return reservationRepository.save(reservation);
	}

}
