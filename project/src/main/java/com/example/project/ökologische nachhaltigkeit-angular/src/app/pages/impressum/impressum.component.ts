import { Component } from '@angular/core'
import { Title, Meta } from '@angular/platform-browser'

@Component({
  selector: 'app-impressum',
  templateUrl: 'impressum.component.html',
  styleUrls: ['impressum.component.css'],
})
export class Impressum {
  constructor(private title: Title, private meta: Meta) {
    this.title.setTitle('Impressum - ökologische Nachhaltigkeit')
    this.meta.addTags([
      {
        property: 'og:title',
        content: 'Impressum - ökologische Nachhaltigkeit',
      },
    ])
  }
}
