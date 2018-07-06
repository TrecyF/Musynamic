 package app.musynamic.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.musynamic.dao.ProduitRepository;
import app.musynamic.model.Produit;
import app.musynamic.model.Type;

@Service
public class ProduitServiceImpl implements ProduitService {
	

    @Autowired
    private ProduitRepository produitRepository;

	public List<String> getAllProductsByName(String nom) {
		
        List<String> result = new ArrayList<String>();
        List<Produit> products = produitRepository.findByNom(nom);
        for (Produit product : products) {
            result.add(product.getNom());
        }
        return result;
	}


	@Override
	public void addProduit(String nom, Type type, String description,
			LocalDate date_de_parution, String interprete, int stock, int prix, String photo) {

        Produit newProduct = new Produit();
        
        newProduct.setNom(nom);
        newProduct.setType(type);
        newProduct.setDescription(description);
        newProduct.setDate_de_parution(date_de_parution);
        newProduct.setInterprete(interprete);
        newProduct.setStock(stock);
        newProduct.setPrix(prix);
        newProduct.setPhoto(photo);
        produitRepository.save(newProduct);
		
	}
	
}
