import { Injectable } from '@angular/core';
import { BankAccount } from './fund-transfer/BankAccount';

@Injectable({
  providedIn: 'root'
})
export class FundTransferService {

  constructor() { }

  transferFunds(sourceAccount:BankAccount,targetAccount:BankAccount,amount:number){
    if(amount<=0){
      alert("Amount should be more than 0");
    }
    else if(sourceAccount.accBal <= amount){
      alert("Insufficient amount");
    }
    else{
      sourceAccount.accBal -= amount;
      targetAccount.accBal += amount;
      alert(amount+" Rs transfer from Account number : "+sourceAccount.accNo+" to Account number : "+targetAccount.accNo);
    }
  }
}
