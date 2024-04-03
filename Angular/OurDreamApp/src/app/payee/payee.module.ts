import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddPayeeComponent } from './add-payee/add-payee.component';
import { ViewPayeeComponent } from './view-payee/view-payee.component';
import { ViewAllPayeesComponent } from './view-all-payees/view-all-payees.component';
import { DeletePayeeComponent } from './delete-payee/delete-payee.component';



@NgModule({
  declarations: [   //below components are belong to payeeModule
    AddPayeeComponent,
    ViewPayeeComponent,
    ViewAllPayeesComponent,
    DeletePayeeComponent
  ],
  exports:[   //this components are used for another module...
    AddPayeeComponent,
    
  ],
  imports: [
    CommonModule
  ]
})
export class PayeeModule {

}
