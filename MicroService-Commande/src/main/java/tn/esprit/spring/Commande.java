package tn.esprit.spring;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
public class Commande implements Serializable{
	
	@Id
	@GeneratedValue
	private long id;
	private String adresse;
	private String telephone;
	private String quantite;
	private float prixUnitaire;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getQuantite() {
		return quantite;
	}
	public void setQuantite(String quantite) {
		this.quantite = quantite;
	}
	public float getPrixUnitaire() {
		return prixUnitaire;
	}
	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	public Commande(long id, String adresse, String telephone, String quantite, float prixUnitaire) {
		super();
		this.id = id;
		this.adresse = adresse;
		this.telephone = telephone;
		this.quantite = quantite;
		this.prixUnitaire = prixUnitaire;
	}
	public Commande() {
		super();
	}
	


}
