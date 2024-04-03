import { Component } from '@angular/core';
import { LoginComponent } from '../login/login.component';

@Component({
  selector: 'app-login-registration',
  templateUrl: './login-registration.component.html',
  styleUrls: ['./login-registration.component.css']
})
export class LoginRegistrationComponent {
  container = "container";
  loginLabel = "Login";
  registrationLabel = "Registration";
  isUserLoggedIn: boolean = false;

  userName: string = "";
  loginPage() {
    if (this.isUserLoggedIn == false) {
      this.isUserLoggedIn = true;
    }
    console.log("User Name : " + this.userName);
  }
  registrationPage() {
    if (this.isUserLoggedIn = true) {
      this.isUserLoggedIn = false;
    }
  }
}
