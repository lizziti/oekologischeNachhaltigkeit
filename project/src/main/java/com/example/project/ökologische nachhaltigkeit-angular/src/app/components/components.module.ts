import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core'
import { RouterModule } from '@angular/router'
import { CommonModule } from '@angular/common'

import { Footer } from './footer/footer.component'
import { Header2 } from './header2/header2.component'
import { HeaderFinal } from './header-final/header-final.component'
import { Register } from './register/register.component'
import { NavigationLinks } from './navigation-links/navigation-links.component'
import { DropdownMenu1 } from './dropdown-menu1/dropdown-menu1.component'
import { DropdownMenu } from './dropdown-menu/dropdown-menu.component'
import { LOGIN } from './l-o-g-i-n/l-o-g-i-n.component'
import { NavigationLinks2 } from './navigation-links2/navigation-links2.component'

@NgModule({
  declarations: [
    Footer,
    Header2,
    HeaderFinal,
    Register,
    NavigationLinks,
    DropdownMenu1,
    DropdownMenu,
    LOGIN,
    NavigationLinks2,
  ],
  imports: [CommonModule, RouterModule],
  exports: [
    Footer,
    Header2,
    HeaderFinal,
    Register,
    NavigationLinks,
    DropdownMenu1,
    DropdownMenu,
    LOGIN,
    NavigationLinks2,
  ],
  schemas: [CUSTOM_ELEMENTS_SCHEMA],
})
export class ComponentsModule {}
