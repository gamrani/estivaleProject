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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "sejour")
public class Sejour implements Serializable {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "type_hebergement")
	private String typeHebergement;
	@Column(name = "nombre_personne")
	private int nombrePersonne;
	@Column(name = "numero_hebergement")
	private int numeroHebergement;
	@Column(name = "localisation_hebergement")
	private String localisation_hebergement;
	@Column(name = "restauration")
	private String restauration;
	@Column(name = "date_debut")
	private Date dateDebut;
	@Column(name = "date_fin")
	private Date dateFin;
	@Column(name = "prix")
	private int prix;
	@ManyToOne
	@JoinColumn(name = "id_user")
	@JsonIgnoreProperties("sejours")
	private User user;

	public Sejour(String typeHebergement, int nombrePersonne, int numeroHebergement, String localisation_hebergement,
			String restauration, Date dateDebut, Date dateFin, int prix, User user) {
		super();
		this.typeHebergement = typeHebergement;
		this.nombrePersonne = nombrePersonne;
		this.numeroHebergement = numeroHebergement;
		this.localisation_hebergement = localisation_hebergement;
		this.restauration = restauration;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.prix = prix;
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + ": " + this.typeHebergement + ": " + this.nombrePersonne + ": " + this.numeroHebergement + ": "
				+ this.localisation_hebergement + ": " + this.restauration + ": " + this.dateDebut + ": " + this.dateFin
				+ ": " + this.prix;
	}

	public Sejour() {
		super();
		System.out.println("here sejour");
	}

	public Sejour(String typeHebergement, int nombrePersonne, int numeroHebergement, String localisation_hebergement,
			String restauration, Date dateDebut, Date dateFin, int prix) {
		super();
		this.typeHebergement = typeHebergement;
		this.nombrePersonne = nombrePersonne;
		this.numeroHebergement = numeroHebergement;
		this.localisation_hebergement = localisation_hebergement;
		this.restauration = restauration;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.prix = prix;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTypeHebergement() {
		return typeHebergement;
	}

	public void setTypeHebergement(String typeHebergement) {
		this.typeHebergement = typeHebergement;
	}

	public int getNombrePersonne() {
		return nombrePersonne;
	}

	public void setNombrePersonne(int nombrePersonne) {
		this.nombrePersonne = nombrePersonne;
	}

	public int getNumeroHebergement() {
		return numeroHebergement;
	}

	public void setNumeroHebergement(int numeroHebergement) {
		this.numeroHebergement = numeroHebergement;
	}

	public String getLocalisation_hebergement() {
		return localisation_hebergement;
	}

	public void setLocalisation_hebergement(String localisation_hebergement) {
		this.localisation_hebergement = localisation_hebergement;
	}

	public String getRestauration() {
		return restauration;
	}

	public void setRestauration(String restauration) {
		this.restauration = restauration;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

}
