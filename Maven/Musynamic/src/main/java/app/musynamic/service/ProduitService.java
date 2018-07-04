package app.musynamic.service;

import java.time.LocalDate;
import java.util.List;

import app.musynamic.model.Type;

public interface ProduitService {

	public List<String> getAllProductsByName(String nom);
	public void addProduit(
			String nom,
			Type type,
			String description,
			LocalDate date_de_parution,
			String interprete,
			int stock,
			int prix,
			String photo);

}
