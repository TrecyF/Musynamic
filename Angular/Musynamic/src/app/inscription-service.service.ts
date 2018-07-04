import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class InscriptionServiceService {

  login = new Login('', '');
  urlService: string;

  constructor(private http: HttpClient) {
      this.urlService = 'http://localhost:4200/musynamic/login/';
  }

  getLogin() : Observable<Login> {
      return this.http.get<Login>(this.urlService + '/logins');
  }

  toLoginUser(formLogin: Login) {
      console.log("Email : " + formLogin.email + ", Password : " + formLogin.password);
      this.http.post<Login>(this.urlService, formLogin, httpOptions).subscribe();
  }
  
}
