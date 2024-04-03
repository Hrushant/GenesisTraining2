import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  loginLabel = "Login";
  registerLabel = "Register";
  isUserLoggedIn: boolean = false;
  loginPage() {
    if (this.isUserLoggedIn == false) {
      this.isUserLoggedIn = true;
    }
  }
  registerPage() {
    if (this.isUserLoggedIn == true) {
      this.isUserLoggedIn = false;
    }
  }

  //css -->
  buttonStyle = "buttonStyle";
  container = "container";
}
