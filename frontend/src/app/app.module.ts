import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ReactiveFormsModule} from "@angular/forms";
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { MarkdownModule } from 'ngx-markdown';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { FooterComponent } from './footer/footer.component';
import { DatenschutzComponent } from './datenschutz/datenschutz.component';
import { HomeComponent } from './home/home.component';
import { ContentComponent } from './content/content.component';
import { PostComponent } from './content/post/post.component';
import { AllgDefComponent } from './content/allg-def/allg-def.component';
import { TemplateComponent } from './content/template/template.component';
import { PlastikComponent } from './content/plastik/plastik.component';
import { FrauasNachhaltigkeitComponent } from './content/frauas-nachhaltigkeit/frauas-nachhaltigkeit.component';
import { TippsComponent } from './content/tipps/tipps.component';
import { FleischalternativenComponent } from './content/fleischalternativen/fleischalternativen.component';
import { LebensmittelComponent } from './content/lebensmittel/lebensmittel.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LoginComponent,
    RegisterComponent,
    FooterComponent,
    DatenschutzComponent,
    HomeComponent,
    ContentComponent,
    PostComponent,
    AllgDefComponent,
    TemplateComponent,
    PlastikComponent,
    FrauasNachhaltigkeitComponent,
    TippsComponent,
    FleischalternativenComponent,
    LebensmittelComponent
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    AppRoutingModule,
    HttpClientModule,
    MarkdownModule.forRoot({loader: HttpClient})
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
