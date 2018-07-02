package app.model;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;

import org.springframework.data.annotation.Transient;

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
        return getPrimaryKey().getProd();
    }
 
    public void setProduit(Produit prod) {
        getPrimaryKey().setProd(prod);
    }
 
    @Transient
    public Commande getComm() {
        return getPrimaryKey().getComm();
    }
 
    public void setComm(Commande comm) {
        getPrimaryKey().setComm(comm);
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
