import { Component, Input } from '@angular/core'

@Component({
  selector: 'app-footer',
  templateUrl: 'footer.component.html',
  styleUrls: ['footer.component.css'],
})
export class Footer {
  @Input()
  image_alt: string = 'image'
  @Input()
  image_src: string = '/playground_assets/logo-200h.jpg'
  @Input()
  rootClassName: string = ''
  @Input()
  text: string =
    '© 2022 Frankfurt University of Applied Sciences , All Rights Reserved.'

  constructor() {}
}
