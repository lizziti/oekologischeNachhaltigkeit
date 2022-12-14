import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core'
import { RouterModule } from '@angular/router'
import { BrowserModule } from '@angular/platform-browser'
import { HttpClientModule } from 'angular/common/http'

import { ComponentsModule } from './components/components.module'
import { AppComponent } from './app.component'

const routes = [
  {
    path: 'login1',
    loadChildren: () =>
      import('./pages/login1/login1.module').then((m) => m.Login1Module),
  },
  {
    path: 'page',
    loadChildren: () =>
      import('./pages/page/page.module').then((m) => m.PageModule),
  },
  {
    path: '',
    loadChildren: () =>
      import('./pages/home/home.module').then((m) => m.HomeModule),
  },
  {
    path: 'datenschutz-rechte',
    loadChildren: () =>
      import('./pages/datenschutz-rechte/datenschutz-rechte.module').then(
        (m) => m.DatenschutzRechteModule
      ),
  },
  {
    path: 'impressum',
    loadChildren: () =>
      import('./pages/impressum/impressum.module').then(
        (m) => m.ImpressumModule
      ),
  },
  {
    path: 't-e-s-t',
    loadChildren: () =>
      import('./pages/t-e-s-t/t-e-s-t.module').then((m) => m.TESTModule),
  },
  {
    path: 'login',
    loadChildren: () =>
      import('./pages/login/login.module').then((m) => m.LoginModule),
  },
  {
    path: 'register1',
    loadChildren: () =>
      import('./pages/register1/register1.module').then(
        (m) => m.Register1Module
      ),
  },
]

@NgModule({
  declarations: [AppComponent],
  imports: [BrowserModule, RouterModule.forRoot(routes), ComponentsModule, HttpClientModule],
  providers: [],
  bootstrap: [AppComponent],
  schemas: [CUSTOM_ELEMENTS_SCHEMA],
})
export class AppModule {}
