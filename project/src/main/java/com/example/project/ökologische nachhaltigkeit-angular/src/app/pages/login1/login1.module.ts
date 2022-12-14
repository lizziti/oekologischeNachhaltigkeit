import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core'
import { RouterModule } from '@angular/router'
import { CommonModule } from '@angular/common'

import { ComponentsModule } from '../../components/components.module'
import { Login1 } from './login1.component'

const routes = [
  {
    path: '',
    component: Login1,
  },
]

@NgModule({
  declarations: [Login1],
  imports: [CommonModule, ComponentsModule, RouterModule.forChild(routes)],
  exports: [Login1],
  schemas: [CUSTOM_ELEMENTS_SCHEMA],
})
export class Login1Module {}
