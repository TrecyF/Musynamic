package app.musynamic.service;

import java.time.LocalDate;
import java.util.List;

import app.musynamic.model.Utilisateur;

public interface UtilisateurService {
	
	public List<String> getAllUsersByName(String nom);
	
	public Utilisateur utilisateurFindByEmail(String email);
	
	public void addUtilisateur(
	String nom,
	String prenom,
	String adresse,
	String telephone,
	String email,
	LocalDate date_de_naissance,
	String mot_de_passe,
	String droit);
	
}
