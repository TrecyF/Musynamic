import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '../../node_modules/@angular/common/http';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class HeaderService {

	public produitUrl = '//localhost:8086';
  public PRODUIT_API = this.produitUrl + '/musynamic/createproduct';

  constructor(private http : HttpClient) { }


public searchlol(){
  
}



}
