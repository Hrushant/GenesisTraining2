import { Injectable } from '@angular/core';
import { Bank } from './fund-transfer/Bank';

@Injectable({
  providedIn: 'root'
})
export class FundTransferService {

  constructor() { }

  transferFunds(sourceAccount:Bank,targetAccount:Bank,amount:number){
    if(amount <= 0){
      alert("Amount must be greater than 0");
    }
    else if(sourceAccount.accBal < amount){
      alert("Insufficient fund");
    }
    else{
      sourceAccount.accBal -= amount;
      targetAccount.accBal += amount;
      alert("Amount is transfered...");
    }
  }
}
