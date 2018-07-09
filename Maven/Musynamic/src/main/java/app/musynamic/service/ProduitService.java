package app.musynamic.service;

import java.util.List;

import app.musynamic.model.Produit;

public interface ProduitService {

	Produit create(Produit produit);

	Produit delete(int idProduit);

	    List<Produit> findAll();

	    Produit findById(int idProduit);

	    Produit update(Produit produit);
	
	
}
