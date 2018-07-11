import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { ProduitService } from '../produit.service';
import { NgForm } from '@angular/forms';
import { Produit } from '../produit';

@Component({
  templateUrl: './add-produit.component.html'
})
export class AddProduitComponent {

  //produit: Produit = new Produit();
  produit: any = {};
  produits: any[];

  constructor(private router: Router, private produitService: ProduitService) {}

  gotoList() {
    this.router.navigate(['/listeprod']);
  }

  // createProduct(): void {
  //   this.produitService.createProduit(this.produit)
  //       .subscribe(produit => this.produits.push(produit));
  // }
  
  save(form: NgForm) {
    this.produitService.save(form)
    .subscribe(data => {
      this.gotoList();
    }, error => console.error(error));
  }
  

  /*ngOnInit() {
    this.sub = this.route.params.subscribe(params => {
      const id = params['id'];
      if (id) {
        this.produitService.get(id).subscribe((produit: any) => {
          if (produit) {
            this.produit = produit;
            this.produit.href = produit._links.self.href;
          } else {
            console.log(`produit with id '${id}' not found, returning to list`);
            this.gotoList();
          }
        });
      }
    });
  }*/

}