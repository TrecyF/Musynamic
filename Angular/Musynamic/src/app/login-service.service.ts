import { Injectable } from '@angular/core';
import { Login } from './login';
import { Observable, of } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
const httpOptions = {
    headers: new HttpHeaders({
        'Content-Type': 'application/json'
    })
};

@Injectable()
export class LoginService {
    
    login = new Login('', '');
    urlService: string;
    authenticated = false;

    constructor(private http: HttpClient) {
        this.urlService = 'http://localhost:8086/musynamic/login';
    }

    getLogin() : Observable<Login> {
        return this.http.get<Login>(this.urlService);
    }

    authenticate(credentials: Login, callback) {
        const headers = new HttpHeaders(credentials ? {
            authorization : 'Basic ' + btoa(credentials.email + ':' + credentials.password)
        } : {});

        this.http.get(this.urlService, {headers: headers}).subscribe(response => {
            if (response['name']) {
                this.authenticated = true;
            } else {
                this.authenticated = false;
            }
            return callback && callback();
        });
    }

}