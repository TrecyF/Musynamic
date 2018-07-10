import { Component, OnInit } from '@angular/core';
import { Footer } from '../footer';
import { Router } from '../../../node_modules/@angular/router';

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.css']
})
export class FooterComponent implements OnInit {
foot : Footer = new Footer ();
  constructor(private router : Router) { }

  ngOnInit() {
    this.foot
  }

}
