import { Component } from '@angular/core';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent {
  userName!: string;
  userEmail!: string;
  userAddress!: string;
  userPhone!: string;

  registrationPage() {
    console.log("UserName : " + this.userName);
    console.log("UserEmail : " + this.userEmail);
    console.log("UserAddress : " + this.userAddress);
    console.log("UserPhone : " + this.userPhone);
  }
}
