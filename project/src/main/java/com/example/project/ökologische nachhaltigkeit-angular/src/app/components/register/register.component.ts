import { Component, Input } from '@angular/core'

@Component({
  selector: 'app-register',
  templateUrl: 'register.component.html',
  styleUrls: ['register.component.css'],
})
export class Register {
  @Input()
  text11: string = 'Email'
  @Input()
  button: string = 'Registrieren'
  @Input()
  text1111: string = 'Passwort'
  @Input()
  Rolle: string = 'Rolle'
  @Input()
  text111: string = 'Passwort bestätigen'
  @Input()
  textinput_placeholder2: string = 'Email'
  @Input()
  text121: string = 'Nachname'
  @Input()
  textinput_placeholder3: string = 'Nachname'
  @Input()
  text1: string = 'Fachbereich'
  @Input()
  textinput_placeholder: string = 'Vorname'
  @Input()
  rootClassName: string = ''
  @Input()
  textinput_placeholder11: string = 'Passwort bestätigen'
  @Input()
  textinput_placeholder1: string = 'Passwort'
  @Input()
  text12: string = 'Vorname'
  @Input()
  text1112: string =
    'Ich habe die Datenschutzerklärung zur Kenntnis genommen. Ich stimme zu, dass meine Angaben und Daten zur Bearbeitung meiner Anfrage elektronisch erhoben und gespeichert werden.'

  constructor() {}
}
