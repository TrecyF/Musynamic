package app.musynamic.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import app.musynamic.model.Utilisateur;

@Repository
public interface UtilisateurRepository extends CrudRepository<Utilisateur, String> {

	public List<Utilisateur> findByNom(String nom); //https://docs.spring.io/spring-data/jpa/docs/current/reference/html/ 5.3.2. Query Creation

}
