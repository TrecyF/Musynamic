package app.musynamic;


import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import app.musynamic.model.Produit;
import app.musynamic.model.Type;
import app.musynamic.service.ProduitService;
import app.musynamic.service.UtilisateurService;

@SpringBootApplication
@EnableAutoConfiguration
public class MusynamicApplication implements CommandLineRunner {
	
	@Autowired
    UtilisateurService utilisateurService;
	
	@Autowired
    ProduitService produitService;
	
	public static void main(String[] args) {
		SpringApplication.run(MusynamicApplication.class, args);
	}

	@Override
    public void run(String... arg0) throws Exception {
		System.out.println("-*------------------------******-------------- **---- **- --- -- jhghkgcjhcjhcjhgchj");
    	utilisateurService.addUtilisateur(
    			"Astier", 
    			"Florent", 
    			"605 Saint Laurent des arbres", 
    			"0631731014", 
    			"astierflorent@gmail.com", 
    			LocalDate.of(2016, 06, 26), 
    			"jaimeLaFondue123", 
    			"");
    
    	System.out.println("-*------------------------******-------------- **---- **- --- -- jhghkgcjhcjhcjhgchj");
    	produitService.create(
			"Album Carlos", 
			Type.Cd, 
			"album de Carlos tout nu est tout bronzé",
			LocalDate.of(1995, 06, 26), 
			"Carlos", 
			4000, 
			10, 
			"url_photo");
    	
    	produitService.create(
    			"Album lala", 
    			Type.Cd, 
    			"album de Carlos tout nu est tout bronzé",
    			LocalDate.of(1995, 06, 26), 
    			"Carlos", 
    			4000, 
    			10, 
    			"url_photo");


	}
}

