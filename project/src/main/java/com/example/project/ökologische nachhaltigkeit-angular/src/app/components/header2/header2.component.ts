import { Component, Input } from '@angular/core'

@Component({
  selector: 'app-header2',
  templateUrl: 'header2.component.html',
  styleUrls: ['header2.component.css'],
})
export class Header2 {
  @Input()
  image_alt: string = 'image'
  @Input()
  image_src: string =
    'https://presentation-website-assets.teleporthq.io/logos/logo.png'
  @Input()
  rootClassName: string = ''
  @Input()
  Register: string = 'Register'
  @Input()
  image_alt1: string = 'image'
  @Input()
  image_src1: string =
    '/playground_assets/signal-2022-11-24-092844-removebg-preview-300h.png'
  @Input()
  Login1: string = 'Login'

  constructor() {}
}
