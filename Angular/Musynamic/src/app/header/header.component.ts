import { Component, OnInit, Input } from '@angular/core';
import { Header } from '../header';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

@Input() header : Header
 
constructor() { 

  connexion : "Connexion";
  inscription : "inscription";
  }

  ngOnInit() {
  }

}
