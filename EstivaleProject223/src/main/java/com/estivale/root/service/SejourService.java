package com.estivale.root.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estivale.root.entities.Sejour;
import com.estivale.root.repository.SejourRepository;

@Service
public class SejourService implements ISejourService {

	@Autowired
	private SejourRepository sejourRepository;

	@Override
	public Sejour saveSejour(Sejour s) {
		// TODO Auto-generated method stub
		return sejourRepository.save(s);
	}

	@Override
	public Optional<Sejour> getSejour(int id) {
		return sejourRepository.findById(id);
	}

	@Override
	public List<Sejour> getSejours() {
		// TODO Auto-generated method stub
		return sejourRepository.findAll();
	}

	@Override
	public void removeSejour(int id) {
		// TODO Auto-generated method stub
		Sejour sejour = sejourRepository.getOne(id);
		sejourRepository.delete(sejour);

	}

}
