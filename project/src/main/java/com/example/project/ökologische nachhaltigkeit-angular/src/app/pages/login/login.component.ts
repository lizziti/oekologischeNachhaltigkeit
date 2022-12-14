import { Component } from '@angular/core'
import { Title, Meta } from '@angular/platform-browser'

@Component({
  selector: 'app-login',
  templateUrl: 'login.component.html',
  styleUrls: ['login.component.css'],
})
export class Login {
  constructor(private title: Title, private meta: Meta) {
    this.title.setTitle('Login - ökologische Nachhaltigkeit')
    this.meta.addTags([
      {
        property: 'og:title',
        content: 'Login - ökologische Nachhaltigkeit',
      },
    ])
  }
}
