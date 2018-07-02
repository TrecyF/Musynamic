package app.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Utilisateur {
	
	@Id
	@GeneratedValue
	private int idNumClient;

	@Column
	private String nom;
	
	@Column
	private String prenom;
	@Column
	private String adresse;
	
	@Column
	private int telephone;
	
	@Column
	private String email;
	
	@Column
	private Date date_de_naissance;
	
	@Column
	private String mot_de_passe;
	
	@Column
	private String droit;
	
	@ManyToMany
	private List<Commande> commandes = new ArrayList<>();

	public Utilisateur() {
		
	}
	
	public Utilisateur(int idNumClient, String nom, String prenom, String adresse, int telephone, String email,
			Date date_de_naissance, String mot_de_passe, String droit) {
		super();
		this.idNumClient = idNumClient;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.email = email;
		this.date_de_naissance = date_de_naissance;
		this.mot_de_passe = mot_de_passe;
		this.droit = droit;
	}

	public int getIdNumClient() {
		return idNumClient;
	}

	public void setIdNumClient(int idNumClient) {
		this.idNumClient = idNumClient;
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
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

	public Date getDate_de_naissance() {
		return date_de_naissance;
	}

	public void setDate_de_naissance(Date date_de_naissance) {
		this.date_de_naissance = date_de_naissance;
	}

	public String getMot_de_passe() {
		return mot_de_passe;
	}

	public void setMot_de_passe(String mot_de_passe) {
		this.mot_de_passe = mot_de_passe;
	}

	public String getDroit() {
		return droit;
	}

	public void setDroit(String droit) {
		this.droit = droit;
	}
	

}
