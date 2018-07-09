package app.musynamic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import app.musynamic.model.Produit;
import app.musynamic.model.Type;
import app.musynamic.service.ProduitService;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/musynamic/")
public class ProduitController {

    @Autowired
    private ProduitService produitService;
    
    
    @RequestMapping(value = "createproduct", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    @ResponseBody
    public ResponseEntity<List<Produit>> create(
            @RequestBody Map<String,String> json) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-d");
        List<Produit> list = new ArrayList<>();
        if(json.get("nom") != null) {
        produitService.create(
				                json.get("nom"),
				                Type.valueOf(json.get("type")),
				                json.get("description"),
				                LocalDate.parse(json.get("date_de_parution"), formatter),
				                json.get("interprete"),
				                Integer.parseInt(json.get("stock")),
				                Integer.parseInt(json.get("prix")),
				                json.get("photo"));
        return new ResponseEntity<>(list, HttpStatus.OK);
        }
        else return null;
    }
    
    @RequestMapping(value = "createproduct/listeprod", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Produit> findAll() throws IOException{
        return produitService.findAll();
    }
    
    @RequestMapping(value = "createproduct/listeprod", method = RequestMethod.DELETE)
    public @ResponseBody String delete(@PathVariable("id") int id) {
        try {
            // DELETE processing
             produitService.delete(id);
        } catch (Exception e) {
            return "Error";
        }
        System.out.println("le produit a été supprimé");
		return "Done";

    }
    //lalal

    @GetMapping(path = {"/{id}"})
    public Produit findOne(@PathVariable("id") int idProduit){
        return produitService.findById(idProduit);
    }

    @PutMapping
    public Produit update(@RequestBody Produit produit){
        return produitService.update(produit);
    }
    
}