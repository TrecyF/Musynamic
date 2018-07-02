declare var require: any;

export class Header {
    logo : string;
    connexion : string;
    inscription : string;

    constructor(connexion : string, inscription : string){
        this.connexion = connexion;
        this.inscription = inscription;
        this.logo = require('../img/logo.png');
    }

}
