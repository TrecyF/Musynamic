import { Component, OnDestroy, OnInit } from '@angular/core';
import { ProduitService } from '../produit.service';
import { Router } from '@angular/router';


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

  remove(href) {
    this.produitService.deleteProduit(href)
    .subscribe(data => {
      this.gotoList();
    }, error => console.error(error));
  }

}