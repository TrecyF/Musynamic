import { Component, OnInit } from '@angular/core';
import { Login } from '../login';
import { LoginService } from '../login-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  model: Login;
  modelEmailTemp: string;

  constructor(private loginService: LoginService, private router: Router) {
      this.model = new Login('', ''); // insert params for constructor
  }

  ngOnInit() {
    //this.loginService.logout();
  }

<<<<<<< HEAD
  getConnexion()  {
    this.loginService.getLogin()
    .subscribe(connexion => this.model = connexion);
  }

=======
>>>>>>> 241959af90552a16ffd5400694429668bbd33aa8
  onSubmit() {
      this.loginService.authenticate(this.model,  () => {
        this.router.navigateByUrl('/');
      });
      return false;
  }

  onSubmitInsc() {
    this.router.navigate(['/inscription', { email: this.modelEmailTemp }]);
  }
}
