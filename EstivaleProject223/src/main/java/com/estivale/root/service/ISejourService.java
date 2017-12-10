package com.estivale.root.service;

import java.util.List;
import java.util.Optional;

import com.estivale.root.entities.Sejour;

public interface ISejourService {

	public Sejour saveSejour(Sejour s);

	public Optional<Sejour> getSejour(int id);

	public List<Sejour> getSejours();

	public void removeSejour(int id);
}
