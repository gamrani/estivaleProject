package com.estivale.root.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estivale.root.entities.User;
import com.estivale.root.repository.UserRepository;

@Service
public class UserService implements IUserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User u) {
		// TODO Auto-generated method stub
		return userRepository.save(u);
	}

	@Override
	public List<User> listClient() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}
