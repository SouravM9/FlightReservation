package com.javaprojects.flightreservation.services;

import com.javaprojects.flightreservation.dto.ReservationRequest;
import com.javaprojects.flightreservation.entities.Reservation;

public interface ReservationService {

	Reservation bookFlight(ReservationRequest request);

	Reservation findOne(Long id);

	Reservation updateReservation(Reservation reservation);

}
