import { Component, OnDestroy, OnInit } from '@angular/core';
import { ProduitService } from '../produit.service';
import { Router } from '@angular/router';
import { Subscription } from 'rxjs';
import { Produit } from '../produit';


@Component({
  selector: 'app-liste-produit',
  templateUrl: './liste-produit.component.html',
  styles: []
})
export class ProduitComponent implements OnInit, OnDestroy {

  produits: Array<any>;
  sub: Subscription;

  constructor(private router: Router, private produitService: ProduitService) {
  }

  ngOnInit() {
    this.produitService.getProduits()
      .subscribe( data => {
        this.produits = data;
      });
  };

  ngOnDestroy() {
    this.sub.unsubscribe();
  }

  gotoList() {
    this.router.navigate(['createproduct/listeprod']);
  }

  ajouter(produit: Produit){

    sessionStorage.setItem('panier',produit.nom);
      console.log('ajouter dans le panier');
      console.log(sessionStorage.getItem('panier'));
  }




  remove(href) {
    this.produitService.deleteProduit(href)
    .subscribe(data => {
      this.gotoList();
    }, error => console.error(error));
  }

}