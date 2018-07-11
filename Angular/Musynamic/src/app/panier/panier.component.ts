import { Component, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { Router } from '@angular/router';
import { ProduitService } from '../produit.service';
import { Produit } from '../produit';

@Component({
  selector: 'app-panier',
  templateUrl: './panier.component.html',
  styleUrls: ['./panier.component.scss']
})
export class PanierComponent implements OnInit {
  
  produits: Array<any>;
  sub: Subscription;

  constructor(private router: Router, private produitService: ProduitService) { }

  ngOnInit() {
    var a = sessionStorage.getItem('panier')
    this.produitService.getNom(a)
    .subscribe( data => {
      this.produits = data;
    });
  }

}
