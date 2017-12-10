package com.estivale.root.service;

import java.util.List;

import com.estivale.root.entities.User;

public interface IUserService {

	public User saveUser(User u);

	public List<User> listClient();
}
