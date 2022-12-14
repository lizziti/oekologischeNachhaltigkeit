import { Component } from '@angular/core'
import { Title, Meta } from '@angular/platform-browser'

@Component({
  selector: 'datenschutz-rechte',
  templateUrl: 'datenschutz-rechte.component.html',
  styleUrls: ['datenschutz-rechte.component.css'],
})
export class DatenschutzRechte {
  constructor(private title: Title, private meta: Meta) {
    this.title.setTitle('Datenschutz-Rechte - ökologische Nachhaltigkeit')
    this.meta.addTags([
      {
        property: 'og:title',
        content: 'Datenschutz-Rechte - ökologische Nachhaltigkeit',
      },
    ])
  }
}
