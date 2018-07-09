package app.musynamic.service;

import java.time.LocalDate;
import java.util.List;

import app.musynamic.model.Produit;
import app.musynamic.model.Type;

public interface ProduitService {

//	Produit create(Produit produit);

	Produit delete(int idProduit);

	    List<Produit> findAll();

	    Produit findById(int idProduit);

	    Produit update(Produit produit);

		void create(String nom, Type type, String description, LocalDate date_de_parution, String interprete, int stock,
				int prix, String photo);
	
	
}
