import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core'
import { RouterModule } from '@angular/router'
import { CommonModule } from '@angular/common'

import { ComponentsModule } from '../../components/components.module'
import { Register1 } from './register1.component'

const routes = [
  {
    path: '',
    component: Register1,
  },
]

@NgModule({
  declarations: [Register1],
  imports: [CommonModule, ComponentsModule, RouterModule.forChild(routes)],
  exports: [Register1],
  schemas: [CUSTOM_ELEMENTS_SCHEMA],
})
export class Register1Module {}
