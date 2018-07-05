package app.musynamic.controller;

import java.security.Principal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/musynamic/")
public class UtilisateurController {
	
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource ds) {
		this.jdbcTemplate = new JdbcTemplate(ds);

	}


	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<String> foo2() {
		return new ResponseEntity<String>("Ferme la", HttpStatus.OK);
	}

	@RequestMapping(value = "hello", method = RequestMethod.GET)
	public ResponseEntity<String> foo() {
		return new ResponseEntity<String>("Appli de mes couilles", HttpStatus.OK);
	}
	
	@GetMapping("tp/images/search/{annee}/{mois}/{jours}")
	public String findOwner(@PathVariable("annee") String theAnnee,
			@PathVariable("mois") String theMois,
			@PathVariable("jours") String theJours,
			@RequestParam("sort") String sort) throws ParseException {
		
		SimpleDateFormat  aFormater = new SimpleDateFormat("yyyyMMdd");
		Date date = aFormater.parse(theAnnee + theMois + theJours);
		
		SimpleDateFormat formater = new SimpleDateFormat("dd MMMM yyyy");
		String date2 = formater.format(date);
		
		
		return "Liste des images du " + date2 + " triée par " +  sort;
		
	}
	

//	@RequestMapping(value = "login", consumes = "application/json")	
//	public void form(@RequestBody Utilisateur utilisateur) {
//		
//		System.out.println(utilisateur.getEmail());
//	}

	@RequestMapping("cool")
	public Principal helloworld(HttpServletRequest request, HttpServletResponse response) {
	    Principal userPrincipal = request.getUserPrincipal();
	    
	    return userPrincipal;
	}
	
	@RequestMapping("lolilol")
	public String lala1(HttpServletRequest request, HttpServletResponse response) {

	    
	    return "lalalal";
	}
	
    @RequestMapping(value = "login", produces = "application/json")
    public Principal util(Principal user) {
       System.out.println(user.getName());
    	return user;
    }
	    
	
//	@GetMapping("utilisateur/{id}")
//	public User findOwner(@PathVariable("id") int theId) throws ParseException {
//		
//		User rowCount = this.jdbcTemplate.queryForObject("select * from utilisateur where id = ?", new Object[] { theId }, new UserMapper());
//		
//		return rowCount;		
//		
//	}
//	
//	@GetMapping("utilisateur/{lastName}")
//	public User findOwnerByLogin(@PathVariable("lastName") String username) throws ParseException {
//		
//		User rowCount = this.jdbcTemplate.queryForObject("select * from utilisateur where LastName = ?", new Object[] { username }, new UserMapper());
//		
//		return rowCount;			
//	}
	
	
//	@RequestMapping(value = "users", method = RequestMethod.PUT,  produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<String> foo1() {
//		return new ResponseEntity<String>("Ferme la", HttpStatus.OK);
//	}
	
//	@PreAuthorize("hasAuthority('READ')")
//	@RequestMapping(value = "users", method = RequestMethod.GET)
//	public User display() {
//		return new User();
//	}

//	@GetMapping("/tp/images/search/annee/{mois}")
//	public String findOwner1(@PathVariable String mois) {
//		return mois;
//		
//	}

}
