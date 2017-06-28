package com.durga.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.durga.user.model.User;

@RestController
@RequestMapping("api/users")
public class UserController {
	
	@GetMapping("/{id}")
	public User getUser(@PathVariable("id") String id) {
		return new User(id, "Durga");
	}

}
