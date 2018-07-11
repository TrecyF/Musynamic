package app.musynamic.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import app.musynamic.model.Produit;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface ProduitRepository extends CrudRepository<Produit, String> {

	void delete(Produit produit);

	List<Produit> findAll();

	//Produit findOne(int idProduit);

	Produit save(Produit produit);
	
	List<Produit> findByNom(String nom);
}
	