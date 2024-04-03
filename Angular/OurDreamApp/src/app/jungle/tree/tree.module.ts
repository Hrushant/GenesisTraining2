import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MonkeyComponent } from './monkey/monkey.component';



@NgModule({
  declarations: [
    MonkeyComponent
  ],
  exports:[
    MonkeyComponent
  ],
  imports: [
    CommonModule
  ]
})
export class TreeModule { }
