import { Injectable } from '@angular/core';
import { Inscription } from './inscription';
import { Observable, of, throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { Login } from './login';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
const httpOptions = {
    headers: new HttpHeaders({
        'Content-Type': 'application/json'
    }),
    //params: new HttpParams().set('ID', 'blablabla') URL /api/login?ID=blablabla
};

@Injectable({
    providedIn: 'root'
})
export class InscriptionServiceService {
    

    date: Date;
    inscription = new Inscription('', '', '', '', this.date, '', '', '');
    urlService: string;

    constructor(private http: HttpClient) {
        this.urlService = 'http://localhost:8086/musynamic/register';
    }

    getLogin(): Observable<Inscription> {
        return this.http.get<Inscription>(this.urlService + '/logins'); // A MODIFIER
    }

    toRegisterUser(user: Inscription): Observable<Inscription> {
        return this.http.post<Inscription>(this.urlService, user, httpOptions)
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
  toLoginUser(formLogin: Login) {
      console.log("Email : " + formLogin.email + ", Password : " + formLogin.password);
      this.http.post<Login>(this.urlService, formLogin).subscribe();
  }
  
}
