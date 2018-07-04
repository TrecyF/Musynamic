package app.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

import app.dao.UserDao;
import app.model.Utilisateur;

@Component
public class AuthenticationService implements UserDetailsService {

	@Autowired
	private UserDao userDao;

	@Override
	public UserDetails loadUserByUsername(final String username) {
			List<GrantedAuthority> rules = new ArrayList();
			rules.add(new SimpleGrantedAuthority("READ"));

			if (username.equals("admin")) {
				rules.add(new SimpleGrantedAuthority("WRITE"));
			}
			
			Utilisateur myUser = userDao.findOneByLogin(username);
			UserDetails myUserDetails = new org.springframework.security.core.userdetails.User(username, myUser.getMot_de_passe(), rules);
			return myUserDetails;

	}
}