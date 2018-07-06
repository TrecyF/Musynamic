import { Component, OnDestroy, OnInit } from '@angular/core';
import { Subscription } from 'rxjs/Subscription';
import { Router, ActivatedRoute } from '@angular/router';
import { ProduitService } from '../produit.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-car-edit',
  templateUrl: './edit-produit.component.html',
  styleUrls: []
})
export class EditProduitComponent implements OnInit, OnDestroy {
  produit: any = {};

  sub: Subscription;

  constructor(private router: Router,
              private route: ActivatedRoute,
              private produitService: ProduitService){
  }

  ngOnInit() {
    this.sub = this.route.params.subscribe(params => {
      const idProduit = params['idProduit'];
      if (idProduit) {
        this.produitService.get(idProduit).subscribe((produit: any) => {
          if (produit) {
            this.produit = produit;
            this.produit.href = produit._links.self.href;
          } else {
            console.log(`produit with id '${idProduit}' not found, returning to list`);
            this.gotoList();
          }
        });
      }
    });
  }

  ngOnDestroy() {
    this.sub.unsubscribe();
  }

  gotoList() {
    this.router.navigate(['/listeprod']);
  }

  save(form: NgForm) {
    this.produitService.save(form).subscribe(data => {
      this.gotoList();
    }, error => console.error(error));
  }
}