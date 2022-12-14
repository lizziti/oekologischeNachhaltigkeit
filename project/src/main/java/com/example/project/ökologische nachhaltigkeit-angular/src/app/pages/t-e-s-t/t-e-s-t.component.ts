import { Component } from '@angular/core'
import { Title, Meta } from '@angular/platform-browser'

@Component({
  selector: 't-e-s-t',
  templateUrl: 't-e-s-t.component.html',
  styleUrls: ['t-e-s-t.component.css'],
})
export class TEST {
  constructor(private title: Title, private meta: Meta) {
    this.title.setTitle('TEST - ökologische Nachhaltigkeit')
    this.meta.addTags([
      {
        property: 'og:title',
        content: 'TEST - ökologische Nachhaltigkeit',
      },
    ])
  }
}
