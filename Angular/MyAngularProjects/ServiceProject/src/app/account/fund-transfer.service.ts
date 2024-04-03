import { Injectable } from '@angular/core';
import { BankAccount } from './fund-transfer/BankAccount';

@Injectable({
  providedIn: 'root'
})
export class FundTransferService {

  constructor() { }

  transferFunds(srcAcc: BankAccount, tgtAcc: BankAccount, amnt : number){
    if(amnt <= 0){
      alert("Amount to transfer must be greater than 0");
      return;
    } 
    if(srcAcc.accBalance<amnt){
      alert("Insufficient balance");
    } 
    else {
      srcAcc.accBalance -= amnt;
      tgtAcc.accBalance += amnt;
      alert("Rs. "+amnt+" successfully transfered from "+srcAcc.accNo+" to "+tgtAcc.accNo+"...");
    }
  }
}
