import { Component } from '@angular/core'
import { Title, Meta } from '@angular/platform-browser'

@Component({
  selector: 'app-login1',
  templateUrl: 'login1.component.html',
  styleUrls: ['login1.component.css'],
})
export class Login1 {
  constructor(private title: Title, private meta: Meta) {
    this.title.setTitle('Login1 - ökologische Nachhaltigkeit')
    this.meta.addTags([
      {
        property: 'og:title',
        content: 'Login1 - ökologische Nachhaltigkeit',
      },
    ])
  }
}
