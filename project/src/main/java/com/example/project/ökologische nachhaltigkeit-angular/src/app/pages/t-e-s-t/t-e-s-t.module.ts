import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core'
import { RouterModule } from '@angular/router'
import { CommonModule } from '@angular/common'

import { ComponentsModule } from '../../components/components.module'
import { TEST } from './t-e-s-t.component'

const routes = [
  {
    path: '',
    component: TEST,
  },
]

@NgModule({
  declarations: [TEST],
  imports: [CommonModule, ComponentsModule, RouterModule.forChild(routes)],
  exports: [TEST],
  schemas: [CUSTOM_ELEMENTS_SCHEMA],
})
export class TESTModule {}
