import { BrowserModule } from '@angular/platform-browser';
import { NgModule,NO_ERRORS_SCHEMA } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';

import 'materialize-css';
import { MaterializeModule } from 'angular2-materialize';

import {  HTTP_INTERCEPTORS, HttpClientXsrfModule, } from '@angular/common/http'; 
import { MDBBootstrapModule, InputsModule,NavbarModule, WavesModule } from 'angular-bootstrap-md';
import { HttpClientModule } from '@angular/common/http'; 

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { LoginService } from './login-service.service';
import { ProduitService } from './produit.service';
import { FilterPipe } from './filter.pipe';
import { FooterComponent } from './footer/footer.component';
import { LoginComponent } from './login/login.component';
import { IndexComponent } from './index/index.component';
import { PresentationProduitComponent } from './presentation-produit/presentation-produit.component';
import { PresentationProduitService } from './presentation-produit.service';
import { CarouselImg } from './carousel/carousel-img';
import { AdministrateurComponent } from './administrateur/administrateur.component';
import { ListeCommandeComponent } from './liste-commande/liste-commande.component';
import { ProduitComponent } from './liste-produit/liste-produit.component';
import { AddProduitComponent } from './add-produit/add-produit.component';
import { EditProduitComponent } from './edit-produit/edit-produit.component';
import { FicheProduitComponent } from './fiche-produit/fiche-produit.component';
import { AuthInterceptor } from './auth-interceptor';
import { InscriptionComponent } from './inscription/inscription.component';
import { ProductprintComponent } from './productprint/productprint.component';
import { Ng2SmartTableModule } from 'ng2-smart-table';
import { Ng2CompleterModule } from 'ng2-completer';


import { MatCardModule, MatButtonModule, MatInputModule, MatToolbarModule, MatListModule} from '@angular/material';

import { HeaderService } from './header.service';

import { PanierComponent } from './panier/panier.component';


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
    IndexComponent,  
    FicheProduitComponent,
    InscriptionComponent,
    IndexComponent,
    FilterPipe,
    ProductprintComponent,
    PanierComponent, 

  ],
  imports: [
    BrowserModule,
    MaterializeModule,
    FormsModule,
    HttpClientModule,
    MDBBootstrapModule.forRoot(),
    NavbarModule,
    WavesModule,
    InputsModule,
    AppRoutingModule,
    Ng2SmartTableModule,
    Ng2CompleterModule,
    MatButtonModule,
    MatCardModule,
    MatInputModule,
    MatListModule,
    MatToolbarModule,
    HttpClientXsrfModule,
    ReactiveFormsModule
        
  ],
  schemas: [ NO_ERRORS_SCHEMA ],
  providers: [
    LoginService,
    ProduitService,
    PresentationProduitService,
    HeaderService,
  {
      provide: HTTP_INTERCEPTORS,
      useClass: AuthInterceptor,
      multi: true,
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
