import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { Produit } from "./produit";


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class ProduitService {

	public produitUrl = '//localhost:8086';
  public PRODUIT_API = this.produitUrl + '/musynamic/createproduct';

  constructor(private http : HttpClient) {}


  public getProduits(): Observable<any> {
    return this.http.get('//localhost:8086/musynamic/createproduct/listeprod');
  }

  get(idProduit: string) {
    return this.http.get(this.PRODUIT_API + '/' + idProduit);
  }
  
  getNom(nomProduit: string): Observable<any> {
    return this.http.get(this.produitUrl + '/musynamic/products/search/' + nomProduit);
  }

  /*public deleteProduit(produit) {
    return this.http.delete(this.produitUrl + "/"+ produit.id);
  }*/

  /*public createProduit(produit) {
    return this.http.post(this.produitUrl, produit);
  }*/

  // ajouterPanier(produit: any){
  //   let res: Observable<Object>;
  //   console.log('1');
  //   if (produit['href']) {
      
  //     sessionStorage.setItem('panier',produit);
  //     console.log('ajouter dans le panier');
  //   }
  //   return res;
  // }

  deleteProduit(produit: any) {
    //return this.http.delete(href);
    let res: Observable<Object>;
    if (produit['href']) {
      res = this.http.delete(produit.href, produit);
    } 
    return res;
  }

  save(produit: any): Observable<any> {
    let result: Observable<Object>;
    if (produit['href']) {
      result = this.http.put(produit.href, produit);
    } else {
      result = this.http.post(this.PRODUIT_API, produit);
    }
    return result;
  }


  createProduit(produit: Produit): Observable<Produit> {
    return this.http.post<Produit>(this.PRODUIT_API, produit, httpOptions)
        .pipe(
            catchError(this.handleError)
        );
  }

  private handleError(error: HttpErrorResponse) {
      if (error.error instanceof ErrorEvent) {
          // A client-side or network error occurred. Handle it accordingly.
          console.error('An error occurred:', error.error.message);
      } else {
          // The backend returned an unsuccessful response code.
          // The response body may contain clues as to what went wrong,
          console.error(
              `Backend returned code ${error.status}, ` +
              `body was: ${error.error}`);
      }
      // return an observable with a user-facing error message
      return throwError(
          'Something bad happened; please try again later.');
  }
}