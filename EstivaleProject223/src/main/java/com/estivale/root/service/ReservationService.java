package com.estivale.root.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.estivale.root.entities.Reservation;
import com.estivale.root.entities.Sejour;
import com.estivale.root.entities.User;
import com.estivale.root.repository.ReservationRepository;
import com.estivale.root.repository.SejourRepository;
import com.estivale.root.repository.UserRepository;

@Service
public class ReservationService implements IReservationService {

	@Autowired
	private ReservationRepository reservationRepository;
	@Autowired
	private SejourRepository sejourRepository;
	@Autowired
	private UserRepository userRepository;

	@Override
	@Transactional
	public boolean reserver(int id_sejour, int montant, int id_user) {
		Sejour sejour = sejourRepository.getOne(id_sejour);
		User user = userRepository.getOne(id_user);
		Reservation reservation = new Reservation();

		reservation.setDescription("CREATION");
		reservation.setSejour(sejour);
		reservation.setMontant(montant);
		reservation.setDateReservation(new Date());
		reservationRepository.save(reservation);
		return true;
	}

	@Override
	public boolean annuler(int int_sejour, int id_user) {

		return false;
	}

	@Override
	public boolean modifier(int int_sejour, int id_user) {
		// TODO Auto-generated method stub
		return false;
	}

}
