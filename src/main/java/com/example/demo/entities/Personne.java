package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Personne implements Serializable {
	@Id @GeneratedValue
	private long id;
	private String nom;
	private String prenom;
	private String num;
	
	
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Personne(String nom, String prenom, String num) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.num = num;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
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


	public String getNum() {
		return num;
	}


	public void setNum(String num) {
		this.num = num;
	}
	
	
	

}
