import { Component, OnInit } from '@angular/core';
import { Login } from '../login';
import { LoginService } from '../login-service.service';
import { RouterModule, Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  model: Login;

  constructor(private loginService: LoginService, private router: Router) {
      this.model = new Login('', ''); // insert params for constructor
  }

  ngOnInit() {
  }

  onSubmit() {
      this.loginService.authenticate(this.model,  () => {
        this.router.navigateByUrl('/');});
      return false;
  }
  
}
