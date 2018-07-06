import { NgModule }             from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { LoginComponent } from './login/login.component';
import { AdministrateurComponent } from './administrateur/administrateur.component';
import { ListeCommandeComponent } from './liste-commande/liste-commande.component';
import { ProduitComponent } from './liste-produit/liste-produit.component';
import { AddProduitComponent } from './add-produit/add-produit.component';


const routes: Routes = [
  { path: '', redirectTo: '/index', pathMatch: 'full' },
  { path: 'connexion', component: LoginComponent },
  { path: 'inscription', component: LoginComponent },
  { path: 'admin', component: AdministrateurComponent },
  { path: 'listecmd', component: ListeCommandeComponent },
  { path: 'listeprod', component: ProduitComponent },
  { path: 'addprod', component: AddProduitComponent }
];

@NgModule({
  exports: [ RouterModule ],
  imports: [
    RouterModule.forRoot(routes)
  ]
})
export class AppRoutingModule {
}