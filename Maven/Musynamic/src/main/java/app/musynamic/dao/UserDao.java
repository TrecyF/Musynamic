package app.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import app.model.Utilisateur;

@Repository
public class UserDao {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource ds) {
		this.jdbcTemplate = new JdbcTemplate(ds);
	}

	@Transactional
	public void ligneInsert(Utilisateur Utilisateur) {
	this.jdbcTemplate.update("insert into usertable (iduser, firstName, lastName, email, password) values (?, ?, ?, ?, ?)", Utilisateur.getId(), Utilisateur.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword());
	}
	
	@Transactional
	public List<Utilisateur> getListUtilisateur() {
		List<Utilisateur> utilisateur = this.jdbcTemplate.query("select * from usertable", new UserMapper());
		return utilisateur;
	}
	
	@Transactional
	public Utilisateur getUserById(int id) {
		return this.jdbcTemplate.queryForObject("select * from usertable where iduser = ?", new Object[]{ id }, new UserMapper());
	}

	public Utilisateur findOneByLogin(String username) {
		return this.jdbcTemplate.queryForObject("select * from usertable where login = ?", new Object[]{ username }, new UserMapper());
	}
	

}
