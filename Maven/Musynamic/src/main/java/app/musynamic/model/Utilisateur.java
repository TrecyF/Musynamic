package app.musynamic.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Utilisateur {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idNumClient;

	@Column
	private String nom;
	
	@Column
	private String prenom;
	@Column
	private String adresse;
	
	@Column
	private String telephone;
	
	@Column
	private String email;
	
	@Column
	private LocalDate date_de_naissance;
	
	@Column
	private String mot_de_passe;
	
	@Column
	private String droit;
	
	@OneToMany(mappedBy = "utilCommande")
	private List<Commande> commandes = new ArrayList<>();

	public Utilisateur() {
		
	}
	
	public Utilisateur(String nom, String prenom, String adresse, String telephone, String email,
			LocalDate date_de_naissance, String mot_de_passe, String droit) {
		super();
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

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDate_de_naissance() {
		return date_de_naissance;
	}

	public void setDate_de_naissance(LocalDate date_de_naissance) {
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
