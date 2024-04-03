import { Component } from '@angular/core';
import { __values } from 'tslib';

@Component({
  selector: 'app-simple-interest',
  templateUrl: './simple-interest.component.html',
  styleUrls: ['./simple-interest.component.css']
})
export class SimpleInterestComponent {
  principal : number=5000;
  numberOfYears : number=5;
  rateOfInterest : number=3.5;
  simpleInterest : number=0;

  constructor(){
    console.log('SimpleInterestComponent : constructor()');
    this.calculateSimpleInterest();
  }

  calculateSimpleInterest(){
    console.log('SimpleInterestComponent : calculateSimpleInterest()');
    this.simpleInterest = (this.principal*this.numberOfYears*this.rateOfInterest)/100;
  }
  
}
