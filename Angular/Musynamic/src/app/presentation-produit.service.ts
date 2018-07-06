import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class PresentationProduitService {

  configUrl = 'assets/config.json';
  urlService: string;

  constructor(private http: HttpClient) {
    this.urlService = 'http://localhost:8086/musynamic/lolilol';
   }

   lolilol() {
    console.log("0");
    this.http.get(this.urlService ).subscribe(response => {
      console.log("3"+ response);

  });
    console.log("1 ");
  }
}