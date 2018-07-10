export class Produit {
    idProduit : number;
    date_de_parution : Date;
    description : string;
    interprete : string;
    nom : string;
    photo : string;
    prix : string;
    stock : number;
    type : string;

    constructor(
        idProduit : number,
        date_de_parution : Date,
        description : string,
        interprete : string,
        nom : string,
        photo : string,
        prix : string,
        stock : number,
        type : string
    ) {
        this.idProduit = idProduit;
        this.date_de_parution = date_de_parution;
        this.description = description;
        this.interprete = interprete;
        this.nom = nom;
        this.photo = photo;
        this.prix = prix;
        this.stock = stock;
        this.type = type;
    }
}
