import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FundTransferComponent } from './fund-transfer/fund-transfer.component';
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    FundTransferComponent
  ],
  imports: [
    CommonModule,
    FormsModule
  ],
  exports: [
    FundTransferComponent,
  ]
})
export class AccountModule { }
