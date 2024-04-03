import { Component } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  userName!: string;
  userEmail!: string;
  buttonStyle="buttonStyle";

  loginPage() {
    console.log("UserName : " + this.userName);
    console.log("UserEmail : " + this.userEmail);
  }
}
