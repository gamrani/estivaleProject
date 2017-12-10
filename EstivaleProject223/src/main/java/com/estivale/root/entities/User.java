package com.estivale.root.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
@Table(name = "user")
public class User implements Serializable {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "nom")
	private String nom;

	@Column(name = "prenom")
	private String prenom;

	@Column(name = "cin")
	private String cin;

	@Column(name = "date_inscription")
	private Date dateInscription;

	@Column(name = "statut")
	private String statut;

	@Column(name = "telephone")
	private int telephone;

	@Column(name = "email")
	private String email;
	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Sejour> sejours;

	public User() {
		super();
		System.out.println("here");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + ": " + this.nom + ": " + this.prenom + ": " + this.cin + ": " + this.dateInscription + ": "
				+ this.statut + ": " + this.telephone + ": " + this.email;
	}

	public User(String nom, String prenom, String cin, String statut, int telephone, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;

		this.statut = statut;
		this.telephone = telephone;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public Date getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@JsonIgnore
	public List<Sejour> getSejours() {
		return sejours;
	}

	@JsonSetter
	public void setSejours(List<Sejour> sejours) {
		this.sejours = sejours;
	}

}
