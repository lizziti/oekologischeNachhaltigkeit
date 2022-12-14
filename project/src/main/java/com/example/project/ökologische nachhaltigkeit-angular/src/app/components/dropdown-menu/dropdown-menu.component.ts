import { Component, Input } from '@angular/core'

@Component({
  selector: 'dropdown-menu',
  templateUrl: 'dropdown-menu.component.html',
  styleUrls: ['dropdown-menu.component.css'],
})
export class DropdownMenu {
  @Input()
  rootClassName: string = ''

  constructor() {}
}
