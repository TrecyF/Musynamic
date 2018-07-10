declare var require: any;

export class Header {
    logo : string;
    connexion : string;
    inscription : string;
    boutique : string;

    constructor(connexion : string, inscription : string, boutique : string){
        this.boutique = boutique;
        this.connexion = connexion;
        this.inscription = inscription;
        this.logo = require('../img/logo-petit.png');
    }

}
