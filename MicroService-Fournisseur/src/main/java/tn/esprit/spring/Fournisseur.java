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

public class Fournisseur implements Serializable {
	public Fournisseur() {
		super();
	}
	public Fournisseur(long id, String nom, String type, String telephone, float chiffreAffaire, Date dateDebutContrat,
			Date dateFinContrat) {
		super();
		this.id = id;
		this.nom = nom;
		this.type = type;
		this.telephone = telephone;
		this.chiffreAffaire = chiffreAffaire;
		this.dateDebutContrat = dateDebutContrat;
		this.dateFinContrat = dateFinContrat;
	}
	@Id
	@GeneratedValue
	private long id;
	private String nom;
	private String type;
	private String telephone;
	private float chiffreAffaire;
	@DateTimeFormat(pattern = "yyyy-MM-dd") 
	private Date dateDebutContrat;
	@DateTimeFormat(pattern = "yyyy-MM-dd") 
	private Date dateFinContrat;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public float getChiffreAffaire() {
		return chiffreAffaire;
	}
	public void setChiffreAffaire(float chiffreAffaire) {
		this.chiffreAffaire = chiffreAffaire;
	}
	public Date getDateDebutContrat() {
		return dateDebutContrat;
	}
	public void setDateDebutContrat(Date dateDebutContrat) {
		this.dateDebutContrat = dateDebutContrat;
	}
	public Date getDateFinContrat() {
		return dateFinContrat;
	}
	public void setDateFinContrat(Date dateFinContrat) {
		this.dateFinContrat = dateFinContrat;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
}
