import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { PresentationProduitService } from '../presentation-produit.service';



@Component({
  selector: 'app-presentation-produit',
  templateUrl: './presentation-produit.component.html',
  styleUrls: ['./presentation-produit.component.css']
})
export class PresentationProduitComponent implements OnInit {

  constructor(private service: PresentationProduitService) { }

  ngOnInit() {
    this.service.lolilol();
    
  }

}
