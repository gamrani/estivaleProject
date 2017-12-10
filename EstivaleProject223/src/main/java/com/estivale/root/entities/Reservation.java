package com.estivale.root.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reservation")
public class Reservation implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "date")
	private Date dateReservation;
	@Column(name = "description")
	private String description;
	@Column(name = "montant")
	private int montant;
	@ManyToOne
	@JoinColumn(name = "id_sejour")
	private Sejour sejour;
	@ManyToOne
	@JoinColumn(name = "id_user")
	private User user;

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

	public Date getDateReservation() {
		return dateReservation;
	}

	public void setDateReservation(Date dateOperation) {
		this.dateReservation = dateOperation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Sejour getSejour() {
		return sejour;
	}

	public void setSejour(Sejour sejour) {
		this.sejour = sejour;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Reservation(String description, int montant, Sejour sejour, User user) {
		super();
		this.description = description;
		this.sejour = sejour;
		this.user = user;
		this.montant = montant;
	}

	public Reservation() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
