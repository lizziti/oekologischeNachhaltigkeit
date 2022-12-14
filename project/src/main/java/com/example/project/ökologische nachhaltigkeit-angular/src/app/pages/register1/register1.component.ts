import { Component } from '@angular/core'
import { Title, Meta } from '@angular/platform-browser'

@Component({
  selector: 'app-register1',
  templateUrl: 'register1.component.html',
  styleUrls: ['register1.component.css'],
})
export class Register1 {
  constructor(private title: Title, private meta: Meta) {
    this.title.setTitle('Register1 - ökologische Nachhaltigkeit')
    this.meta.addTags([
      {
        property: 'og:title',
        content: 'Register1 - ökologische Nachhaltigkeit',
      },
    ])
  }
}
