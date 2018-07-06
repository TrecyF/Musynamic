 package app.musynamic.service;

//import java.time.LocalDate;
//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.musynamic.dao.ProduitRepository;
import app.musynamic.model.Produit;

@Service
public class ProduitServiceImpl implements ProduitService {
	

    @Autowired
    private ProduitRepository produitRepository;

    
    @Override
    public Produit create(Produit produit) {
        return produitRepository.save(produit);
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
    public List findAll() {
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
