package app.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;



@Entity
public class Produit {
	
	private Set<ProduitCommande> produitCommande = new HashSet<ProduitCommande>();

	@Id
	@GeneratedValue
	private int idProduit;

	@Column
	private String nom;
	
	@Enumerated(EnumType.STRING)
	@Column
	private Type type;
	
	@Column
	private String description;
	
	@Column
	private Date date_de_parution;
	
	@Column
	private String interprete;
	
	@Column
	private int stock;
	
	@Column
	private int prix;
	
	@Column
	private String photo;
	
	@ManyToMany
	private List<Commande> commandes = new ArrayList<>();
	
    @OneToMany(mappedBy = "primaryKey.user")
    public Set<ProduitCommande> getprodComm() {
        return produitCommande;
    }
	 
	
	public Set<ProduitCommande> getProduitCommande() {
		return produitCommande;
	}


	public void setProduitCommande(Set<ProduitCommande> produitCommande) {
		this.produitCommande = produitCommande;
	}


	public List<Commande> getCommandes() {
		return commandes;
	}


	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}


	public Produit() {
		
	}


	public Produit(Set<ProduitCommande> produitCommande, int idProduit, String nom, Type type, String description,
			Date date_de_parution, String interprete, int stock, int prix, String photo, List<Commande> commandes) {
		super();
		this.produitCommande = produitCommande;
		this.idProduit = idProduit;
		this.nom = nom;
		this.type = type;
		this.description = description;
		this.date_de_parution = date_de_parution;
		this.interprete = interprete;
		this.stock = stock;
		this.prix = prix;
		this.photo = photo;
		this.commandes = commandes;
	}


	public int getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate_de_parution() {
		return date_de_parution;
	}

	public void setDate_de_parution(Date date_de_parution) {
		this.date_de_parution = date_de_parution;
	}

	public String getInterprete() {
		return interprete;
	}

	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
	
	
}
