package com.javaprojects.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaprojects.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
