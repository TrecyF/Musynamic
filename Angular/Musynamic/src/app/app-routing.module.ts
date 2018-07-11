import { NgModule }             from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { LoginComponent } from './login/login.component';
import { InscriptionComponent } from './inscription/inscription.component';
import { IndexComponent } from './index/index.component';
import { ProductprintComponent } from './productprint/productprint.component';
import { PresentationProduitComponent } from './presentation-produit/presentation-produit.component';
import { FicheProduitComponent } from './fiche-produit/fiche-produit.component';
import { AdministrateurComponent } from './administrateur/administrateur.component';
import { ListeCommandeComponent } from './liste-commande/liste-commande.component';
import { ProduitComponent } from './liste-produit/liste-produit.component';
import { AddProduitComponent } from './add-produit/add-produit.component';
import { PanierComponent } from './panier/panier.component';

const routes: Routes = [
  { path: '', redirectTo: '/accueil', pathMatch: 'full' },
  { path: 'accueil', component: IndexComponent },
  { path: 'connexion', component: LoginComponent },
  { path: 'inscription', component: InscriptionComponent },
  { path: 'productprint', component: ProductprintComponent },
  { path: 'boutique', component: PresentationProduitComponent },
  { path: 'ficheProduit', component: FicheProduitComponent },
  { path: 'admin', component: AdministrateurComponent },
  { path: 'listecmd', component: ListeCommandeComponent },
  { path: 'listeprod', component: ProduitComponent },
  { path: 'addprod', component: AddProduitComponent },
  { path: 'panier', component: PanierComponent},
];

@NgModule({
  exports: [ RouterModule ],
  imports: [
    RouterModule.forRoot(routes)
  ]
})
export class AppRoutingModule {
}
