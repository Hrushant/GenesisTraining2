import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AccountServiceService {

  constructor() {
    console.log('AccountService constructed...');
   }

   openAccount(accno : number){
    console.log('Account is open... ');
   }

   fetchAccount(accno : number){
    console.log('Account is fetching...');
   }

   fetchAllAccount(){
    console.log('Fetching all accounts');
   }

   modifyAccount(accno : number){
    console.log('Account is modified...');
   }

   deleteAccount(accno : number){
    console.log('Account is deleted...');
   }
}
