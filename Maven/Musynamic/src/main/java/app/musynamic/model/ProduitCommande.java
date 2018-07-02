package app.musynamic.model;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Transient;



@Entity
@AssociationOverrides({
    @AssociationOverride(name = "primaryKey.produit",
        joinColumns = @JoinColumn(name = "idProduit")),
    @AssociationOverride(name = "primaryKey.commande",
        joinColumns = @JoinColumn(name = "idCommande")) })
public class ProduitCommande {
	
    // composite-id key
    private ProduitCommandeId primaryKey = new ProduitCommandeId();
     
    // additional fields
    private int quantite;

    @EmbeddedId
    public ProduitCommandeId getPrimaryKey() {
        return primaryKey;
    }
    
    @Transient
    public Produit getProduit() {
        return getPrimaryKey().getProduit();
    }
 
    public void setProduit(Produit produit) {
        getPrimaryKey().setProduit(produit);
    }
 
    @Transient
    public Commande getCommande() {
        return getPrimaryKey().getCommande();
    }
 
    public void setCommande(Commande commande) {
        getPrimaryKey().setCommande(commande);
    }
 
 
    public void setPrimaryKey(ProduitCommandeId primaryKey) {
        this.primaryKey = primaryKey;
    }

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
    
}
