import { Component } from '@angular/core';
import { SavingsAccount } from './SavingsAccount';
import { FundTransferService } from '../fund-transfer.service';

@Component({
  selector: 'app-fund-transfer',
  templateUrl: './fund-transfer.component.html',
  styleUrls: ['./fund-transfer.component.css']
})
export class FundTransferComponent {
  sourceAccount: SavingsAccount = new SavingsAccount;
  targetAccount: SavingsAccount = new SavingsAccount;
  amount: number = 0;
  container = "container";

  constructor(private fts: FundTransferService) {
    console.log("FundTransferService() is created...");
    this.sourceAccount.acno = 101;
    this.sourceAccount.acHolderName = "James Clear";
    this.sourceAccount.acBalance = 10000;

    this.targetAccount.acno = 102;
    this.targetAccount.acHolderName = "Thomas Henry";
    this.targetAccount.acBalance = 1000;
  }

  loaclTransferFund() {
    this.fts.transferFund(this.sourceAccount, this.targetAccount, this.amount);
  }
}
