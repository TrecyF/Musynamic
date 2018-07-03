package app.musynamic.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import app.musynamic.dao.UtilisateurRepository;
import app.musynamic.model.Utilisateur;
import app.musynamic.service.UtilisateurService;

@Component
public class AuthenticationService implements UserDetailsService {

//	@Autowired
//	private bdd myController;
	@Autowired
	private UtilisateurRepository utilisateurRepository;

//	@Override
//	public UserDetails loadUserByUsername(final String username) {
//		User option;
//		try {
//			option = .findOwnerByLogin(username);
//			if (option != null) {
//				List<GrantedAuthority> rules = new ArrayList<>();
//				rules.add(new SimpleGrantedAuthority("READ"));
//
//				return new org.springframework.security.core.userdetails.User(option.getLasteName(),
//						option.getLasteName(), rules);
//			}
//
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		throw new UsernameNotFoundException("username.not.found");
//	}
	
		@Override
	    public UserDetails loadUserByUsername(String email)  throws UsernameNotFoundException {
	        Utilisateur user = (Utilisateur) utilisateurRepository.findByEmail(email);
	        System.out.println("User : " + user);
	        if(user==null){
	        	System.out.println("User not found");
	            throw new UsernameNotFoundException("Username not found");
	        }
	            return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getMot_de_passe(), 
	                 true, true, true, true, getGrantedAuthorities(user));
	    }
		
	 
	     
	    private List<GrantedAuthority> getGrantedAuthorities(Utilisateur user){
	        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
	         

	            System.out.println("UserProfile : " + user);
	            authorities.add(new SimpleGrantedAuthority("ROLE_"+ user.getDroit()));
	        
	        System.out.println("authorities : " + user.getDroit());
	        
	        return authorities;
	    }
}
