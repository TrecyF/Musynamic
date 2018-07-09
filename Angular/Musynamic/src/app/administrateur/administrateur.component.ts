import { Component, OnInit } from '@angular/core';
import { Administrateur } from '../administrateur';

@Component({
  selector: 'app-administrateur',
  templateUrl: './administrateur.component.html',
  styleUrls: ['./administrateur.component.scss']
})
export class AdministrateurComponent implements OnInit {

<<<<<<< HEAD
  //admin : Header = new Header("administrateur","administrateur");
=======
  admin : Administrateur = new Administrateur("administrateur");
>>>>>>> 241959af90552a16ffd5400694429668bbd33aa8

  constructor() { }

  ngOnInit() {
  }

}
