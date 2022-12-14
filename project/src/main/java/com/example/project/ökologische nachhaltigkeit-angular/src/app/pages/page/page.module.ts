import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core'
import { RouterModule } from '@angular/router'
import { CommonModule } from '@angular/common'

import { ComponentsModule } from '../../components/components.module'
import { Page } from './page.component'

const routes = [
  {
    path: '',
    component: Page,
  },
]

@NgModule({
  declarations: [Page],
  imports: [CommonModule, ComponentsModule, RouterModule.forChild(routes)],
  exports: [Page],
  schemas: [CUSTOM_ELEMENTS_SCHEMA],
})
export class PageModule {}
