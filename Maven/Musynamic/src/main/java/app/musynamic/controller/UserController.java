//package app.musynamic.controller;
//
//import java.text.ParseException;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import app.musynamic.model.Utilisateur;
//
//@RestController
//@RequestMapping("/accueil")
//public class UserController {//	
//	@Autowired
//	UserDao userDao;
//	
//	@PreAuthorize(value = "hasAuthority('READ')")
//	@RequestMapping(method = RequestMethod.GET)
//	public Utilisateur display() {
//		
//		return new Utilisateur();
//	}
//	
////	@PreAuthorize(value = "hasAuthority('READ')")
////	@GetMapping("/{id}")
////	public @ResponseBody Utilisateur test(
////			@PathVariable("id") @Valid int id) throws ParseException {
////		return userDao.getUserById(id);
////	}
////
////	@PreAuthorize(value = "hasAuthority('READ')")
////	@GetMapping("/del/{id}")
////	public @ResponseBody String del(
////			@PathVariable("id") @Valid int id) throws ParseException {
////		return userDao.deleteUserById(id);
////	}
//	
////
////	@PreAuthorize(value = "hasAuthority('WRITE')")
////	@PostMapping(value ="/", consumes = "application/json")
////	public void insert1(@RequestBody @Valid User user, BindingResult bindingResult)
////			 {
////		if (bindingResult.hasErrors()) {
////		     // g�rer ses erreurs
////		     System.out.println(bindingResult.getAllErrors());
////		  }
////		userDao.ligneInsert(user);
////	}
//
//}
