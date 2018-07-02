package app.model;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;


@Embeddable
public class ProduitCommandeId {
	
	private Produit prod;
    private Commande comm;
 
    @ManyToOne
    public Produit getProd() {
        return prod;
    }
 
    public void setProd(Produit prod) {
        this.prod = prod;
    }
 
    @ManyToOne
    public Commande getComm() {
        return comm;
    }
 
    public void setComm(Commande comm) {
        this.comm = comm;
    }
}
