package com.estivale.root.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.estivale.root.entities.User;
import com.estivale.root.service.UserService;

@RestController
public class UserRestService {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public User saveUser(@RequestBody User u) {
		u.setStatut("client");
		return userService.saveUser(u);
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public List<User> listClient() {
		return userService.listClient();
	}

}
