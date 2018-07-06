import { Component, OnInit } from '@angular/core';
import { Administrateur } from '../administrateur';

@Component({
  selector: 'app-administrateur',
  templateUrl: './administrateur.component.html',
  styleUrls: ['./administrateur.component.scss']
})
export class AdministrateurComponent implements OnInit {

  admin : Administrateur = new Administrateur("administrateur");

  constructor() { }

  ngOnInit() {
  }

}
