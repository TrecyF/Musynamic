import { Component, OnInit } from '@angular/core';
import { Login } from '../login';
import { LoginService } from '../login-service.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  model: Login;
  constructor(private loginService: LoginService) {
      this.loginService == loginService;
      this.model = new Login('', ''); // insert params for constructor
  }

  ngOnInit() {
    this.getConnexion();
  }

  getConnexion()  {
    this.loginService.getLogin()
    .subscribe(connexion => this.model = connexion);
  }
  onSubmit() {
      this.loginService.toLoginUser(this.model);
      this.model = new Login('', ''); // insert params for constructor
  }
}
