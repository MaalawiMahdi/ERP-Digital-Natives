package tn.esprit.spring;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Produit implements Serializable{
	public Produit() {
		super();
	}
	
	@Id
	@GeneratedValue
	private long id;
	private String libelle;
	private String type;
	private int quantite;
	private float TVA;
	private float prixUnitaire;
	
	public Produit(long id, String libelle, String type, int quantite, float tVA, float prixUnitaire) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.type = type;
		this.quantite = quantite;
		TVA = tVA;
		this.prixUnitaire = prixUnitaire;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public float getTVA() {
		return TVA;
	}

	public void setTVA(float tVA) {
		TVA = tVA;
	}

	public float getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
}
