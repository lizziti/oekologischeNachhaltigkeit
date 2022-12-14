import { Component, Input } from '@angular/core'

@Component({
  selector: 'dropdown-menu1',
  templateUrl: 'dropdown-menu1.component.html',
  styleUrls: ['dropdown-menu1.component.css'],
})
export class DropdownMenu1 {
  @Input()
  rootClassName: string = ''

  constructor() {}
}
