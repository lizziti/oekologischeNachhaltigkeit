import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core'
import { RouterModule } from '@angular/router'
import { CommonModule } from '@angular/common'

import { ComponentsModule } from '../../components/components.module'
import { Impressum } from './impressum.component'

const routes = [
  {
    path: '',
    component: Impressum,
  },
]

@NgModule({
  declarations: [Impressum],
  imports: [CommonModule, ComponentsModule, RouterModule.forChild(routes)],
  exports: [Impressum],
  schemas: [CUSTOM_ELEMENTS_SCHEMA],
})
export class ImpressumModule {}
