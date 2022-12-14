import { Component, Input } from '@angular/core'

@Component({
  selector: 'navigation-links2',
  templateUrl: 'navigation-links2.component.html',
  styleUrls: ['navigation-links2.component.css'],
})
export class NavigationLinks2 {
  @Input()
  text: string = 'About'
  @Input()
  text1: string = 'Features'
  @Input()
  text3: string = 'Team'
  @Input()
  text2: string = 'Pricing'
  @Input()
  rootClassName: string = ''

  constructor() {}
}
