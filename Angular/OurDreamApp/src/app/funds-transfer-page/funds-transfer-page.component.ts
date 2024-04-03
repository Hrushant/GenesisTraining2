import { Component } from '@angular/core';
import { FundTransferService } from '../fund-transfer.service';
import { BankAccount } from './BankAccounts';

@Component({
  selector: 'app-funds-transfer-page',
  templateUrl: './funds-transfer-page.component.html',
  styleUrls: ['./funds-transfer-page.component.css']
})
export class FundsTransferPageComponent {   //3
  sourceAccountNumber : number=0;
  targetAmountNumber : number=0;
  amountToTransfer: number=0;

  // Arrays -->
  sourceAccounts : number[] = [
    101,102,103,104,105
  ];

  targetAccounts:number[] = [
    501,502,503,504,505
  ];

  constructor(private fts:FundTransferService){
    this.bankAccountObj.accountNumber=101;
    this.bankAccountObj.accountHolder='Smith';
    this.bankAccountObj.accountBalance=5000;
  }
  bankAccountObj : BankAccount = new BankAccount();

  bankAccountSourceArray: BankAccount[]=[
    {accountNumber:101,accountHolder:'Jack',accountBalance:5000},
    {accountNumber:102,accountHolder:'Jane',accountBalance:6000},
    {accountNumber:103,accountHolder:'Jill',accountBalance:7000},
    {accountNumber:104,accountHolder:'Julie',accountBalance:8000},
    {accountNumber:105,accountHolder:'Janet',accountBalance:9000}
  ];

  bankAccountTargetArray: BankAccount[]=[
    {accountNumber:501,accountHolder:'Suresh',accountBalance:5000},
    {accountNumber:502,accountHolder:'Jayesh',accountBalance:6000},
    {accountNumber:503,accountHolder:'Ramesh',accountBalance:7000},
    {accountNumber:504,accountHolder:'Umesh',accountBalance:8000},
    {accountNumber:505,accountHolder:'Gitesh',accountBalance:9000}
  ];

  localTransferViaService(){
    console.log("localTransferViaService() is invoking the service...");
    this.fts.transferFundsFromArray(this.bankAccountSourceArray,this.bankAccountTargetArray,this.sourceAccountNumber,this.targetAmountNumber,this.amountToTransfer);
  }

  localTransferFunction(){
    console.log("localTransferFunction() is invoking the function...");
    // this.fts.transferFunds(this.sourceAccountNumber,this.targetAmountNumber,this.amountToTransfer);
    for(let i=0;i<this.bankAccountSourceArray.length;i++){
      if(this.bankAccountSourceArray[i].accountNumber==this.sourceAccountNumber){
        console.log('Source account found with balance : '+this.bankAccountSourceArray[i].accountBalance);
        this.bankAccountSourceArray[i].accountBalance -= this.amountToTransfer;
        break;
      }
    }

    for(let i=0;i<this.bankAccountTargetArray.length;i++){
      if(this.bankAccountTargetArray[i].accountNumber==this.targetAmountNumber){
        console.log('target account found with balance : '+this.bankAccountTargetArray[i].accountBalance);
        this.bankAccountTargetArray[i].accountBalance += this.amountToTransfer;
        break;
      }
    }
  }

  localDepositFunction(){
    console.log("localDepositFunction() is invoking the function...");
    this.fts.deposit(this.sourceAccountNumber,this.amountToTransfer);
  }

  

}
