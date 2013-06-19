package com.iut.julien;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Geek {

	@Id
	private long id;
	private String nom;
	private String prenom;
	private boolean sexe;
	private String mail;
	private String interet;
	
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
	public boolean isSexe() {
		return sexe;
	}
	public void setSexe(boolean sexe) {
		this.sexe = sexe;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getInteret() {
		return interet;
	}
	public void setInteret(String interet) {
		this.interet = interet;
	}

	
}
