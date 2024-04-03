import { Injectable } from '@angular/core';
import { SavingsAccount } from './fund-transfer/SavingsAccount';

@Injectable({
  providedIn: 'root'
})
export class FundTransferService {

  constructor() { }

  transferFund(sourceAccount: SavingsAccount, targetAccount: SavingsAccount, amount: number) {
    if (amount <= 0) {
      alert("Amount must be greater than 0");
    }
    else if (sourceAccount.acBalance < amount) {
      alert("Insufficient Fund");
    }
    else {
      sourceAccount.acBalance -= amount;
      targetAccount.acBalance += amount;
      alert(amount + " Rs transfered from Account Number : " + sourceAccount.acno + " to Account Number : " + targetAccount.acno);
    }
  }
}
