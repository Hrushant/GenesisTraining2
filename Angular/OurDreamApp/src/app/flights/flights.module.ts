import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddFlightComponent } from './add-flight/add-flight.component';
import { ViewFlightComponent } from './view-flight/view-flight.component';
import { ViewAllFlightsComponent } from './view-all-flights/view-all-flights.component';
import { ModifyFlightComponent } from './modify-flight/modify-flight.component';
import { DeleteFlightComponent } from './delete-flight/delete-flight.component';



@NgModule({
  declarations: [
    AddFlightComponent,
    ViewFlightComponent,
    ViewAllFlightsComponent,
    ModifyFlightComponent,
    DeleteFlightComponent
  ],
  exports:[
    AddFlightComponent,
    ViewFlightComponent,
    ViewAllFlightsComponent
  ],
  imports: [
    CommonModule
  ]
})
export class FlightsModule { }
