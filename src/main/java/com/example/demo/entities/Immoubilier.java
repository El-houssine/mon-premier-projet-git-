package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Immoubilier implements Serializable  {

	@Id @GeneratedValue
	private int id;
	private String categorie;
	
	public Immoubilier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Immoubilier(String categorie) {
		super();
		this.categorie = categorie;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
	
	
}
