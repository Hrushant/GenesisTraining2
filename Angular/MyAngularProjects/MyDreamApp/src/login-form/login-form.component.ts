import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent {
  @Input("username")
  userName: string = '';
  @Input("password")
  password : string = '';
}
