import { Injectable } from '@angular/core';
import { Login } from './login';
import { Observable, of } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {RequestOptions, XHRBackend} from '@angular/http';
const httpOptions = {
    headers: new HttpHeaders({
        'Content-Type': 'application/json'
    })
};

@Injectable()
export class LoginService {
    

    authenticated = false;
    urlService = 'http://localhost:8086/musynamic/login';
    constructor(private http: HttpClient) {

    }

    authenticate(credentials: Login, callback) {
        console.log("1 "+sessionStorage);
        const headers = new HttpHeaders(credentials ? {
            authorization : 'Basic ' + btoa(credentials.email + ':' + credentials.password)
        } : {'Content-Type': 'application/json'});
        console.log("2 "+sessionStorage);
      
        this.http.get(this.urlService, {headers: headers}).subscribe(response => {
            console.log("3"+ response);
            if (response['name']) {
                console.log("4 ");
                sessionStorage.setItem('auth', btoa(credentials.email + ':' + credentials.password));
                this.authenticated = true;
            } else {
                this.authenticated = false;
            }    

            return callback && callback();
        });
    }

//     logout() {
//         sessionStorage.removeItem('auth');
//         this.authenticated = false;       
  	
//   }
  isAuthenticated(): boolean {
    return this.authenticated;
  }

  
  

}