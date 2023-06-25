package com.javaprojects.flightreservation.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaprojects.flightreservation.entities.User;
import com.javaprojects.flightreservation.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/register")
	public void register(@RequestBody User user) {
		service.registerUser(user);
	}

	// Reference -
	// https://stackoverflow.com/questions/12893566/passing-multiple-variables-in-requestbody-to-a-spring-mvc-controller-using-ajax
	@PostMapping("/login")
	public User login(@RequestBody Map<String, String> json) {
		String email = json.get("email");
		String password = json.get("password");
		User user = service.loginUser(email, password);
		return user;
	}

	@GetMapping
	public List<User> getAllUsers() {
		return service.getAllUsers();
	}

	@GetMapping("/{id}")
	public User getUserById(@PathVariable("id") Long id) {
		return service.findById(id);
	}

	@DeleteMapping("/{id}")
	private void deleteUser(@PathVariable("id") Long id) {
		service.delete(id);
	}

}
