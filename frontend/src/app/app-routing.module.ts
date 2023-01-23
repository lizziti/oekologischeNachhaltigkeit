import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {LoginComponent} from "./login/login.component";
import {RegisterComponent} from "./register/register.component";
import {DatenschutzComponent} from "./datenschutz/datenschutz.component";
import {HomeComponent} from "./home/home.component";
import {ContentComponent} from "./content/content.component";
import {PostComponent} from "./content/post/post.component";
import {AllgDefComponent} from "./content/allg-def/allg-def.component";
import {PlastikComponent} from "./content/plastik/plastik.component";
import {FrauasNachhaltigkeitComponent} from "./content/frauas-nachhaltigkeit/frauas-nachhaltigkeit.component";
import {TippsComponent} from "./content/tipps/tipps.component";
import {FleischalternativenComponent} from "./content/fleischalternativen/fleischalternativen.component";
import {LebensmittelComponent} from "./content/lebensmittel/lebensmittel.component";

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'datenschutz', component: DatenschutzComponent },
  { path: 'content', component: ContentComponent },
  //{ path: 'content/:post', component: PostComponent },
  { path: 'content/allgDef', component: AllgDefComponent },
  { path: 'content/plastik', component: PlastikComponent },
  { path: 'content/frauasNachhaltigkeit', component: FrauasNachhaltigkeitComponent },
  { path: 'content/tipps', component: TippsComponent },
  { path: 'content/fleischalternativen', component: FleischalternativenComponent },
  { path: 'content/lebensmittel', component: LebensmittelComponent },
  // ab hier neue Zeilen einfügen
];

@NgModule({
  declarations: [],
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule
  ]
})
export class AppRoutingModule { }
