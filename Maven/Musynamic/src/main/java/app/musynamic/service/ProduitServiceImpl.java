 package app.musynamic.service;

import java.time.LocalDate;
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

    
//    @Override
//    public Produit create(Produit produit) {
//        return produitRepository.save(produit);
//    }
    
    
	@Override
	public void create(String nom, Type type, String description, LocalDate date_de_parution, String interprete, int stock, int prix, String photo) {

		Produit newProd = new Produit();

		newProd.setNom(nom);
		newProd.setType(type);
		newProd.setDescription(description);
		newProd.setDate_de_parution(date_de_parution);
		newProd.setInterprete(interprete);
		newProd.setStock(stock);
		newProd.setPrix(prix);
		newProd.setPhoto(photo);
		produitRepository.save(newProd);

	}
	

    @Override
    public Produit delete(int idProduit) {
    	Produit produit = findById(idProduit);
        if(produit != null){
        	produitRepository.delete(produit);
        }
        return produit;
    }

    @Override
    public List<Produit> findAll() {
        return produitRepository.findAll();
    }

    @Override
    public Produit findById(int idProduit) {
        //return produitRepository.findOne(idProduit);
    	return new Produit();
    }

    @Override
    public Produit update(Produit produit) {
        return null;
    }
	

   

   
	
}
