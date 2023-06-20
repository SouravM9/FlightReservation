package com.javaprojects.flightreservation.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaprojects.flightreservation.entities.User;
import com.javaprojects.flightreservation.repos.UserRepository;
import com.javaprojects.flightreservation.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;

	@Override
	public void registerUser(User user) {
		repository.save(user);
	}

	@Override
	public User loginUser(String email, String password) {

		User user = repository.findByEmail(email);

		if (user.getPassword().equals(password))
			return user;
		return null;
	}

}
