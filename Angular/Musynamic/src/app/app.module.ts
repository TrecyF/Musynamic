import { BrowserModule } from '@angular/platform-browser';
import { NgModule,NO_ERRORS_SCHEMA } from '@angular/core';
import 'materialize-css';
import { MaterializeModule } from 'angular2-materialize';
import { MDBBootstrapModule } from 'angular-bootstrap-md';
import { NavbarModule, WavesModule } from 'angular-bootstrap-md';
import { HttpClientModule } from '@angular/common/http'; 
import { Ng2SmartTableModule } from 'ng2-smart-table';
import { Ng2CompleterModule } from "ng2-completer";
import { AppRoutingModule } from './app-routing.module'; 
import { FormsModule } from '@angular/forms';
import { MatButtonModule, MatCardModule, MatInputModule, MatListModule, MatToolbarModule } from '@angular/material';



import { CarouselImg } from './carousel/carousel-img';
import { LoginService } from './login-service.service';
import { ProduitService } from './produit.service';

import { HeaderComponent } from './header/header.component';
import { AppComponent } from './app.component';
import { PresentationProduitComponent } from './presentation-produit/presentation-produit.component';
import { FooterComponent } from './footer/footer.component';
import { AdministrateurComponent } from './administrateur/administrateur.component';
import { LoginComponent } from './login/login.component';
import { ListeCommandeComponent } from './liste-commande/liste-commande.component';
import { ProduitComponent } from './liste-produit/liste-produit.component';
import { AddProduitComponent } from './add-produit/add-produit.component';
import { EditProduitComponent } from './edit-produit/edit-produit.component';



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LoginComponent,
    FooterComponent,
    PresentationProduitComponent,
    CarouselImg,
    AdministrateurComponent,
    ListeCommandeComponent,
    ProduitComponent,
    AddProduitComponent,
    EditProduitComponent,
    
    
  
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
    Ng2SmartTableModule,
    Ng2CompleterModule,
    MatButtonModule,
    MatCardModule,
    MatInputModule,
    MatListModule,
    MatToolbarModule,
    
    
  ],

  schemas: [ NO_ERRORS_SCHEMA ],
  providers: [
    LoginService,
    ProduitService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }

