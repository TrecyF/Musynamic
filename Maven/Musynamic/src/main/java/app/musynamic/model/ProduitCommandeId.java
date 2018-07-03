package app.musynamic.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class ProduitCommandeId implements Serializable {

	private Produit produit;

    private Commande commande;

    @ManyToOne(cascade = CascadeType.ALL)
	public Produit getProduit() {
		return produit;
	}

  
	public void setProduit(Produit produit) {
		this.produit = produit;
	}

    @ManyToOne(cascade = CascadeType.ALL)
	public Commande getCommande() {
		return commande;
	}

    
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
}
