import { Component, ViewChild } from '@angular/core';
import { LoginFormComponent } from '../login-form/login-form.component';
import { RegistrationFormComponent } from '../registration-form/registration-form.component';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {

  // accessing login form details using @ViewChild
  @ViewChild(LoginFormComponent)
  loginForm! : LoginFormComponent;

  isUserLoggedIn : boolean = false;
  login(){
    if(this.isUserLoggedIn==false){
      this.isUserLoggedIn=true;
    }
  }
  register(){
    if(this.isUserLoggedIn==true){
      this.isUserLoggedIn=false;
    }
  }
}
