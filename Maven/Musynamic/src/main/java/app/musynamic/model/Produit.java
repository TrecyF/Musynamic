package app.musynamic.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Produit {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idProduit;

	@Column
	private String nom;
	
	@Enumerated(EnumType.STRING)
	@Column
	private Type type;
	
	@Column
	private String description;
	
	@Column
	private LocalDate date_de_parution;
	
	@Column
	private String interprete;
	
	@Column
	private int stock;
	
	@Column
	private int prix;
	
	@Column
	private String photo;

    @OneToMany(mappedBy = "primaryKey.produit", cascade = CascadeType.ALL, targetEntity = ProduitCommande.class)
	private Set<ProduitCommande> produitCommandes = new HashSet<ProduitCommande>();
	
    public Set<ProduitCommande> getProduitCommandes() {
        return produitCommandes;
    }
	
	public void setProduitCommandes(Set<ProduitCommande> produitCommandes) {
		this.produitCommandes = produitCommandes;
	}
	
    public void addGroup(ProduitCommande prod) {
        this.produitCommandes.add(prod);
    }
    
    public void addUserGroup(ProduitCommande prodcomm) {
        this.produitCommandes.add(prodcomm);
    }  
	
	public Produit() {
	}

	public Produit(String nom, Type type, String description,
			LocalDate date_de_parution, String interprete, int stock, int prix, String photo) {
		super();
		this.nom = nom;
		this.type = type;
		this.description = description;
		this.date_de_parution = date_de_parution;
		this.interprete = interprete;
		this.stock = stock;
		this.prix = prix;
		this.photo = photo;
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

	public LocalDate getDate_de_parution() {
		return date_de_parution;
	}

	public void setDate_de_parution(LocalDate date_de_parution) {
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
