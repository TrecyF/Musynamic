package app.musynamic.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Commande {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCommande;

	@Column
	private Date date_debut;
	
	@Column
	private Date date_fin;
	
	@Column
	private int prix_total;
	
	@Column
	private String adresse_livraison;
	
	@ManyToOne
	private Utilisateur utilCommande;

    @OneToMany(mappedBy = "primaryKey.commande", cascade = CascadeType.ALL, targetEntity = ProduitCommande.class)
	private Set<ProduitCommande> produitCommandes = new HashSet<ProduitCommande>();

	public Set<ProduitCommande> getProduitCommandes() {
		return produitCommandes;
	}

	public void setProduitCommandes(Set<ProduitCommande> produitCommandes) {
		this.produitCommandes = produitCommandes;
	}
	
    public void addUserGroup(ProduitCommande prodcomm) {
        this.produitCommandes.add(prodcomm);
    }  

	public Commande() {
		
	}

	public Commande(Date date_debut, Date date_fin, int prix_total,
			String adresse_livraison, Utilisateur utilCommande) {
		super();
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.prix_total = prix_total;
		this.adresse_livraison = adresse_livraison;
		this.utilCommande = utilCommande;
	}

	public Utilisateur getUtilCommande() {
		return utilCommande;
	}

	public void setUtilCommande(Utilisateur utilCommande) {
		this.utilCommande = utilCommande;
	}

	public int getIdCommande() {
		return idCommande;
	}


	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}


	public Date getDate_debut() {
		return date_debut;
	}


	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}


	public Date getDate_fin() {
		return date_fin;
	}


	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}


	public int getPrix_total() {
		return prix_total;
	}


	public void setPrix_total(int prix_total) {
		this.prix_total = prix_total;
	}


	public String getAdresse_livraison() {
		return adresse_livraison;
	}


	public void setAdresse_livraison(String adresse_livraison) {
		this.adresse_livraison = adresse_livraison;
	}
	
	

}
