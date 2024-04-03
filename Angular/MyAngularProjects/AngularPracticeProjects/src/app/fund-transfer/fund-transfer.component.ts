import { Component } from '@angular/core';
import { FundTransferService } from '../fund-transfer.service';
import { BankAccount } from './BankAccount';

@Component({
  selector: 'app-fund-transfer',
  templateUrl: './fund-transfer.component.html',
  styleUrls: ['./fund-transfer.component.css']
})
export class FundTransferComponent {
  pageStyle="pageStyle";
  sourceAccount: BankAccount = new BankAccount;
  targetAccount: BankAccount = new BankAccount;
  amount=0;
  constructor(private fts:FundTransferService) {
    this.sourceAccount.accNo = 101;
    this.sourceAccount.accHolderName = "Hrushant";
    this.sourceAccount.accBal = 20000;

    this.targetAccount.accNo = 102;
    this.targetAccount.accHolderName = "Sohan";
    this.targetAccount.accBal = 10000;
  }

  localTransferFunds(){
    this.fts.transferFunds(this.sourceAccount,this.targetAccount,this.amount);
  }
}
