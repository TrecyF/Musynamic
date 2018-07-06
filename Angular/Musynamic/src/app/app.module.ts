import { BrowserModule } from '@angular/platform-browser';
import { NgModule,NO_ERRORS_SCHEMA } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';

import 'materialize-css';
import { MaterializeModule } from 'angular2-materialize';


import {  HTTP_INTERCEPTORS, HttpClientXsrfModule, } from '@angular/common/http'; 


import { MDBBootstrapModule, InputsModule,NavbarModule, WavesModule } from 'angular-bootstrap-md';
import { HttpClientModule } from '@angular/common/http'; 
import { FormsModule } from '@angular/forms';


import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { LoginComponent } from './login/login.component';
import { IndexComponent } from './index/index.component';
import { AdministrateurComponent } from './administrateur/administrateur.component';
import { PresentationProduitComponent } from './presentation-produit/presentation-produit.component';
import { LoginService } from './login-service.service';
import { CarouselImg } from './carousel/carousel-img';
import { InscriptionComponent } from './inscription/inscription.component';
import { FilterPipe } from './filter.pipe';
import { PresentationProduitService } from './presentation-produit.service';

import { AuthInterceptor } from './auth-interceptor';
import { FicheProduitComponent } from './fiche-produit/fiche-produit.component';



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
    FicheProduitComponent, 

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
    InputsModule,
    HttpClientXsrfModule,
  ],
  schemas: [ NO_ERRORS_SCHEMA ],
  providers: [
    LoginService,
    PresentationProduitService,
  {
      provide: HTTP_INTERCEPTORS,
      useClass: AuthInterceptor,
      multi: true,
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
