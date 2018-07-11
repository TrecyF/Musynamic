import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '../../node_modules/@angular/common/http';
import { Observable } from '../../node_modules/rxjs';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class HeaderService {

	public produitUrl = '//localhost:8086';
  public PRODUIT_API = this.produitUrl + '/musynamic/createproduct';

  constructor(private http : HttpClient) { }


public searchlol(nomProduit: string): Observable<any> {
  return this.http.get(this.produitUrl + '/musynamic/products/search?nom=' + nomProduit);
}



}
