package app.musynamic.service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface UtilisateurService {
	
	public List<String> getAllUsersByName(String nom);
	public void addUtilisateur(
	String nom,
	String prenom,
	String adresse,
	int telephone,
	String email,
	LocalDate date_de_naissance,
	String mot_de_passe,
	String droit);
	
}
