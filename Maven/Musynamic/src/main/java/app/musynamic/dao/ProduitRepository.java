package app.musynamic.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import app.musynamic.model.Produit;

@Repository
public interface ProduitRepository extends CrudRepository<Produit, String> {
	public List<Produit> findByNom(String nom); 

}
