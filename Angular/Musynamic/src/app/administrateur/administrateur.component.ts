import { Component, OnInit } from '@angular/core';
import { Header } from '../header';

@Component({
  selector: 'app-administrateur',
  templateUrl: './administrateur.component.html',
  styleUrls: ['./administrateur.component.scss']
})
export class AdministrateurComponent implements OnInit {

  admin : Header = new Header("administrateur","administrateur");

  constructor() { }

  ngOnInit() {
  }

}
