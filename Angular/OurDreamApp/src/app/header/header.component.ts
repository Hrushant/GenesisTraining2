import { Component } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {
  title = 'Welcome to My Airlines World';   //Data-->Model
  constructor(){

  }
  changeHeading(){
    console.log('heading is clicked...');
    if(this.title=='Welcome to Our Airlines World'){
      this.title=('Welcome to My Airlines World');
    }
    else{
      this.title=('Welcome to Our Airlines World');
    }
  }
}

