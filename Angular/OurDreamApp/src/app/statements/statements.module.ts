import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddStatementComponent } from './add-statement/add-statement.component';
import { ModifyStatementComponent } from './modify-statement/modify-statement.component';
import { DeleteStatementComponent } from './delete-statement/delete-statement.component';



@NgModule({
  declarations: [
    AddStatementComponent,
    ModifyStatementComponent,
    DeleteStatementComponent
  ],
  exports:[
    AddStatementComponent,
    ModifyStatementComponent,
    DeleteStatementComponent
  ],
  imports: [
    CommonModule
  ]
})
export class StatementsModule { }
