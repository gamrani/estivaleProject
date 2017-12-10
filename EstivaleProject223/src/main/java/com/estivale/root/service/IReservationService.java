package com.estivale.root.service;

public interface IReservationService {

	public boolean reserver(int int_sejour, int montant, int id_user);

	public boolean annuler(int int_sejour, int id_user);

	public boolean modifier(int int_sejour, int id_user);

}
