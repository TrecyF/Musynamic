import { Component, OnInit } from '@angular/core';
import { Produit } from '../produit';

@Component({
  selector: 'app-productprint',
  templateUrl: './productprint.component.html',
  styleUrls: ['./productprint.component.scss']
})
export class ProductprintComponent implements OnInit {

  product = new Produit( 1, 
                    new Date(2007,6,17),
                    "cijcij",
                    "Jean Luc",
                    "Le port d'amsterdam Vol. 2",
                    "photo1.jpg",
                    "13.99$",
                    5,
                    "Cd");



  constructor() { }

  ngOnInit() {
  }

}
