package com.javaprojects.flightreservation.services;

import java.util.List;

import com.javaprojects.flightreservation.entities.User;

public interface UserService {

	public void registerUser(User user);

	public User loginUser(String email, String password);

	public List<User> getAllUsers();

	public User findById(Long id);

	public void delete(Long id);

}
