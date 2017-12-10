package com.estivale.root.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.estivale.root.entities.Sejour;
import com.estivale.root.service.ISejourService;

@RestController
public class SejourRestService {
	@Autowired
	private ISejourService iSejourService;

	@RequestMapping(value = "/sejour", method = RequestMethod.POST)
	public Sejour saveSejour(@RequestBody Sejour s) {
		s.setDateDebut(new Date());
		s.setDateFin(new Date());
		return iSejourService.saveSejour(s);
	}

	@RequestMapping(value = "/sejour/{id}", method = RequestMethod.DELETE)
	public void deleteSejour(@PathVariable int id) {

		iSejourService.removeSejour(id);
	}

	@RequestMapping(value = "/sejour/{id}", method = RequestMethod.GET)
	public Optional<Sejour> getSejour(@PathVariable int id) {
		return iSejourService.getSejour(id);
	}

	@RequestMapping(value = "/sejour", method = RequestMethod.GET)

	public List<Sejour> getSejours() {
		return iSejourService.getSejours();
	}

}
