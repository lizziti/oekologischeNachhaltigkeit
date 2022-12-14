import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core'
import { RouterModule } from '@angular/router'
import { CommonModule } from '@angular/common'

import { ComponentsModule } from '../../components/components.module'
import { DatenschutzRechte } from './datenschutz-rechte.component'

const routes = [
  {
    path: '',
    component: DatenschutzRechte,
  },
]

@NgModule({
  declarations: [DatenschutzRechte],
  imports: [CommonModule, ComponentsModule, RouterModule.forChild(routes)],
  exports: [DatenschutzRechte],
  schemas: [CUSTOM_ELEMENTS_SCHEMA],
})
export class DatenschutzRechteModule {}
