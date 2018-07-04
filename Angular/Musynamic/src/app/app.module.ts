import { BrowserModule } from '@angular/platform-browser';
import { NgModule,NO_ERRORS_SCHEMA } from '@angular/core';
import 'materialize-css';
import { MaterializeModule } from 'angular2-materialize';
import { MDBBootstrapModule } from 'angular-bootstrap-md';
import { NavbarModule, WavesModule } from 'angular-bootstrap-md';
import { HttpClientModule } from '@angular/common/http'; 
import { InputsModule } from 'angular-bootstrap-md'


import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FormsModule } from '@angular/forms';

import { LoginService } from './login-service.service';
import { FooterComponent } from './footer/footer.component';
import { PresentationProduitComponent } from './presentation-produit/presentation-produit.component';
import { CarouselImg } from './carousel/carousel-img';
import { AdministrateurComponent } from './administrateur/administrateur.component';
import { AppRoutingModule } from './app-routing.module';

import { LoginComponent } from './login/login.component';
import { InscriptionComponent } from './inscription/inscription.component';
import { IndexComponent } from './index/index.component';
import { FilterPipe } from './filter.pipe';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LoginComponent,
    FooterComponent,
    PresentationProduitComponent,
    CarouselImg,
    AdministrateurComponent,
    InscriptionComponent,
    IndexComponent,
    FilterPipe,
  ],
  imports: [
    BrowserModule,
    MaterializeModule,
    FormsModule,
    HttpClientModule,
    MDBBootstrapModule.forRoot(),
    NavbarModule,
    WavesModule,
    AppRoutingModule,
    InputsModule
  ],
  schemas: [ NO_ERRORS_SCHEMA ],
  providers: [LoginService],
  bootstrap: [AppComponent]
})
export class AppModule { }
