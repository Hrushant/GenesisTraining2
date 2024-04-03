import { Injectable } from '@angular/core';
import { BankAccount } from './funds-transfer-page/BankAccounts';

@Injectable({
  providedIn: 'root'
})
export class FundTransferService {

  constructor() {
    console.log('FundTransferService created...');
  }

  transferFunds(source: number, target: number, amountToTransfer: number) {
    console.log('Transfering ' + amountToTransfer + ' funds from ' + source + ' to ' + target);
  }


  transferFundsFromArray(bankAccountSourceArray: BankAccount[], bankAccountTargetArray: BankAccount[], sourceAccountNumber: number, targetAmountNumber: number, amountToTransfer: number) {
    console.log("transferFundsFromArray() invoked with 5 arguments...");
    for (let i = 0; i < bankAccountSourceArray.length; i++) {
      if (bankAccountSourceArray[i].accountNumber == sourceAccountNumber) {
        console.log('Source account found with balance : ' + bankAccountSourceArray[i].accountBalance);
        bankAccountSourceArray[i].accountBalance -= amountToTransfer;
        break;
      }
    }

    for (let i = 0; i < bankAccountTargetArray.length; i++) {
      if (bankAccountTargetArray[i].accountNumber == targetAmountNumber) {
        console.log('target account found with balance : ' + bankAccountTargetArray[i].accountBalance);
        bankAccountTargetArray[i].accountBalance += amountToTransfer;
        break;
      }
    }
  }

  getBalance(accNumber: number): number {
    console.log('Finding the balance of account no : ' + accNumber);
    return 100000;
  }

  withdraw(accNo: number, amountToWithdraw: number) {
    console.log('withdrawing amount ' + amountToWithdraw + 'from acc no ' + accNo);
    return 100000;
  }

  deposit(accNo: number, amountToDeposit: number) {
    console.log('depositing amount ' + amountToDeposit + ' in acc no ' + accNo);
    return 100000;
  }

  hrushAccountDetails() {
    console.log('Account balance of hrush...');
  }

}
