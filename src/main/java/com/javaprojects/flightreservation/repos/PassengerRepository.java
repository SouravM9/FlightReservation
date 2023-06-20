package com.javaprojects.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaprojects.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
