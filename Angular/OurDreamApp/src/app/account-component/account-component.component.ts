import { Component } from '@angular/core';
import { AccountServiceService } from '../account-service.service';

@Component({
  selector: 'app-account-component',
  templateUrl: './account-component.component.html',
  styleUrls: ['./account-component.component.css']
})
export class AccountComponentComponent {
  constructor(private accs: AccountServiceService) {
    console.log('Appcomponent created...');
  }

  accOpen() {
    console.log('opens the account...');
    this.accs.openAccount(101);
  }
  accFetch() {
    console.log('fetch the account...');
    this.accs.fetchAccount(101);
  }
  allAccFetch() {
    console.log('fetch all the accounts...');
    this.accs.fetchAllAccount();
  }
  accModify() {
    console.log('modify the account...');
    this.accs.modifyAccount(101);
  }
  accDelete() {
    console.log('delete the account...');
    this.accs.deleteAccount(101);
  }

}
