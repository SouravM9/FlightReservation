package com.javaprojects.flightreservation.services;

import com.javaprojects.flightreservation.entities.User;

public interface UserService {

	public void registerUser(User user);

	public User loginUser(String email, String password);

}
