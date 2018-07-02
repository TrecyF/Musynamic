import { Component, OnInit, Input } from '@angular/core';
import { Header } from '../header';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  head : Header = new Header("Connexion","Inscription");

 
constructor() { 
   
  
  
  }

  ngOnInit() {
  }

}
