import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Inscription } from '../inscription';
import { InscriptionServiceService } from '../inscription-service.service';

@Component({
  selector: 'app-inscription',
  templateUrl: './inscription.component.html',
  styleUrls: ['./inscription.component.scss']
})
export class InscriptionComponent implements OnInit {

  model: Inscription;
  models: Inscription[];
  date: Date;

  constructor(private inscriptionServiceService: InscriptionServiceService, private router: Router, private route: ActivatedRoute) {
    this.model = new Inscription('', '', '', '', this.date, '', '', 'READ');
    this.route.params.subscribe(params => this.model.userEmail = params['email']);
  }

  ngOnInit() {
    console.log(this.model.userEmail);
  }

<<<<<<< HEAD
  onSubmit() {
    this.inscriptionServiceService.toRegisterUser(this.model)
    .subscribe(model => this.models.push(model));
  }
=======

>>>>>>> 241959af90552a16ffd5400694429668bbd33aa8
}
