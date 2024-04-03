import { Component } from '@angular/core';
import { Bank } from './Bank';
import { FundTransferService } from '../fund-transfer.service';

@Component({
  selector: 'app-fund-transfer',
  templateUrl: './fund-transfer.component.html',
  styleUrls: ['./fund-transfer.component.css']
})
export class FundTransferComponent {

  sourceAccount : Bank = new Bank;
  targetAccount : Bank = new Bank;
  amount : number = 0;
  constructor(private fts:FundTransferService){
    console.log("constructor constructed...");
    this.sourceAccount.accNo=101;
    this.sourceAccount.accHolderName='Hrush';
    this.sourceAccount.accBal=10000;

    this.targetAccount.accNo=102;
    this.targetAccount.accHolderName='sohan';
    this.targetAccount.accBal=1000;
  }

  localTransfer(){
    this.fts.transferFunds(this.sourceAccount,this.targetAccount,this.amount);
  }
}
