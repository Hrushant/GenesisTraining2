import { Component } from '@angular/core';

@Component({
  selector: 'app-condition',
  templateUrl: './condition.component.html',
  styleUrls: ['./condition.component.css']
})
export class ConditionComponent {
  myAge: number = 25;
  isUserLogIn: boolean = false;
  bottonLable = 'Login';
  logInMe() {
    this.bottonLable = (this.isUserLogIn == false) ? 'LogOut' : 'Login';
    this.isUserLogIn = (this.isUserLogIn == false) ? true : false;
  }
}
