import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Inscription } from '../inscription';
import { InscriptionServiceService } from '../inscription-service.service';

@Component({
  selector: 'app-inscription',
  templateUrl: './inscription.component.html',
  styleUrls: ['./inscription.component.scss']
})
export class InscriptionComponent implements OnInit {

  model: Inscription;
  date: Date;

  constructor(private inscriptionServiceService: InscriptionServiceService, private route: ActivatedRoute) {
    this.model = new Inscription('', '', '', '', this.date, '', '');
    this.route.params.subscribe(params => this.model.userEmail = params['email']);
  }

  ngOnInit() {
    console.log(this.model.userEmail);
  }


}
