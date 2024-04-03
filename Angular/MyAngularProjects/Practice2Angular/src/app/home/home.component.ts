import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  pageStyle="pageStyle";
  loginLabel = "Login";
  registerLabel = "Register";
  submitLabel = "Submit";
  isUserLoggedIn : boolean = false;
  loginPage(){
    if(this.isUserLoggedIn == false){
      this.isUserLoggedIn=true;
    }
  }
  registerPage(){
    if(this.isUserLoggedIn == true)
    {
      this.isUserLoggedIn=false;
    }
  }
}
