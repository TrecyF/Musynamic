package app.musynamic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import app.musynamic.model.Produit;
import app.musynamic.model.Type;
import app.musynamic.service.ProduitService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")//, maxAge = 3600)
@RestController
@RequestMapping("/musynamic/")
public class ProduitController {

    @Autowired
    private ProduitService produitService;

    /*@PostMapping
    public Produit create(@RequestBody Produit produit){
        return produitService.create(produit);
    }*/
    
    
    @RequestMapping(value = "createproduct", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    @ResponseBody
    public ResponseEntity<List<Produit>> create(
            @RequestBody Map<String,String> json) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-d");
        List<Produit> list = new ArrayList<>();
        if(json.get("nom") != null) {
        list.add(new Produit(
                                json.get("nom"),
                                Type.valueOf(json.get("type")),
                                json.get("description"),
                                LocalDate.parse(json.get("date_de_parution"), formatter),
                                json.get("interprete"),
                                Integer.parseInt(json.get("stock")),
                                Integer.parseInt(json.get("prix")),
                                json.get("photo")));
        produitService.create(new Produit(
				                json.get("nom"),
				                Type.valueOf(json.get("type")),
				                json.get("description"),
				                LocalDate.parse(json.get("date_de_parution"), formatter),
				                json.get("interprete"),
				                Integer.parseInt(json.get("stock")),
				                Integer.parseInt(json.get("prix")),
				                json.get("photo")));
        return new ResponseEntity<>(list, HttpStatus.OK);
        }
        else return null;
    }
    
    @GetMapping(path = {"/{id}"})
    public Produit findOne(@PathVariable("id") int idProduit){
        return produitService.findById(idProduit);
    }

    @PutMapping
    public Produit update(@RequestBody Produit produit){
        return produitService.update(produit);
    }

    @DeleteMapping(path ={"/{id}"})
    public Produit delete(@PathVariable("id") int idProduit) {
        return produitService.delete(idProduit);
    }

    @GetMapping
    public List findAll(){
        return produitService.findAll();
    }
}