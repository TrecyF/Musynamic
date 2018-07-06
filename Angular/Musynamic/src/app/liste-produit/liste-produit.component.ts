import { Component, OnDestroy, OnInit } from '@angular/core';
import { ProduitService } from '../produit.service';
import { Subscription } from 'rxjs/Subscription';

@Component({
  selector: 'app-liste-produit',
  templateUrl: './liste-produit.component.html',
  styles: []
})
export class ProduitComponent implements OnInit, OnDestroy {

  produits: Array<any>;
  sub: Subscription;

  constructor(private produitService: ProduitService) {
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

  remove(href) {
    this.produitService.deleteProduit(href)
    .subscribe(data => {
//      this.gotoList();
    }, error => console.error(error));
  }

}