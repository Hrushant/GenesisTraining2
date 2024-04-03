import { Component, OnInit } from '@angular/core';
import { FundTransferService } from '../fund-transfer.service';
import { BankAccount } from './BankAccount';

@Component({
  selector: 'app-fund-transfer',
  templateUrl: './fund-transfer.component.html',
  styleUrls: ['./fund-transfer.component.css']
})
export class FundTransferComponent implements OnInit {

  srcAccount: BankAccount = new BankAccount;
  tgtAccount: BankAccount = new BankAccount;
  amnt: number = 0;
  headerStyling = "headerStyle";
  constructor(private fts: FundTransferService) {

    console.log("Constructed")
  }

  ngOnInit(): void {
    this.srcAccount.accBalance = 100000;
    this.srcAccount.accHolderName = "Jack";
    this.srcAccount.accNo = 100;

    this.tgtAccount.accHolderName = "Jason";
    this.tgtAccount.accNo = 200;
    this.tgtAccount.accBalance = 10000000;
  }


  localTransferFunds() {
    this.fts.transferFunds(this.srcAccount, this.tgtAccount, this.amnt);
    console.log("Fund transferred successfully!");
  }
}
