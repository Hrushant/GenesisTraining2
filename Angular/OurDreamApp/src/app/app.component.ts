import { Component } from '@angular/core';
import { Person } from './Person'; ///<-- this is a ts filename
import { FundTransferService } from './fund-transfer.service';
import { CurrencyPipe } from '@angular/common';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  // Person thePersonObj = new Person(); -- java style
  // thePersonObj: Person = new Person();
  // thePersonObj2: Person = new Person();

  // constructor() { // Constructor of AppComponent class

  //   console.log('AppComponent constructor called...');

  //   this.thePersonObj.firstName = 'Hrushant';
  //   this.thePersonObj.lastName = 'Raghwarte';
  //   this.thePersonObj.age = 22;
  //   this.thePersonObj.favouriteFood = 'Gulaab Jamun';
  //   this.thePersonObj.city = 'Amravati';

  //   this.thePersonObj2.firstName = 'Abhijeet';
  //   this.thePersonObj2.lastName = 'Rathor';
  //   this.thePersonObj2.age = 22;
  //   this.thePersonObj2.favouriteFood = 'Kachori';
  //   this.thePersonObj2.city = 'Ahmednagar';
  // }
  // ------------------------------------------------------------------------------------------------
  // Service oriented architecture-->
  constructor(private fts: FundTransferService) {
    console.log("Appcomponent created...");
  }

  banking() {
    console.log('transferFunds() invoked...');
    var value1 = this.fts.getBalance(1000);
    console.log('value1 is : ' + value1);

    var value2 = this.fts.getBalance(1000);
    console.log('value2 is : ' + value2);

    this.fts.withdraw(108, 4000);
    this.fts.transferFunds(110, 113, 5000);
    this.fts.deposit(105, 7985);
  }

  accDetails() {
    console.log('printing is called...');
    this.fts.hrushAccountDetails();
  }

  // ----------------------------------------------------------------------
// PIPES -->
  todaysDate: Date = new Date;
  mySalary : number = 25000;

}