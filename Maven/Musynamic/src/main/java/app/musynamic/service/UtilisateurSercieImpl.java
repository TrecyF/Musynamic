package app.musynamic.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.musynamic.dao.UtilisateurRepository;
import app.musynamic.model.Utilisateur;

@Service
public class UtilisateurSercieImpl implements  UtilisateurService {
	

    @Autowired
    private UtilisateurRepository utilisateurRepository;


	public List<String> getAllUsersByName(String nom) {
		
        List<String> result = new ArrayList<String>();
        List<Utilisateur> users = utilisateurRepository.findByNom(nom);
        for (Utilisateur user : users) {
            result.add(user.getNom());
        }
        return result;
	}


	@Override
	public void addUtilisateur(String nom, String prenom, String adresse, int telephone, String email,
			LocalDate date_de_naissance, String mot_de_passe, String droit) {

        Utilisateur newUser = new Utilisateur();
        
        newUser.setNom(nom);
        newUser.setPrenom(prenom);
        newUser.setAdresse(adresse);
        newUser.setTelephone(telephone);
        newUser.setEmail(email);
        newUser.setDate_de_naissance(date_de_naissance);
        newUser.setMot_de_passe(mot_de_passe);
        newUser.setDroit(droit);
        utilisateurRepository.save(newUser);
		
	}
	


}
