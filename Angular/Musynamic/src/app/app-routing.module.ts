import { NgModule }             from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { LoginComponent } from './login/login.component';
import { IndexComponent } from './index/index.component';
import { PresentationProduitComponent } from './presentation-produit/presentation-produit.component';

const routes: Routes = [
  { path: '', redirectTo: '/accueil', pathMatch: 'full' },
  { path: 'accueil', component: IndexComponent },
  { path: 'connexion', component: LoginComponent },
  { path: 'inscription', component: LoginComponent },
  { path: 'boutique', component: PresentationProduitComponent }
];

@NgModule({
  exports: [ RouterModule ],
  imports: [RouterModule.forRoot(routes)]
})
export class AppRoutingModule {
}