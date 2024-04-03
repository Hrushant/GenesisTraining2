import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TigerComponent } from './tiger/tiger.component';
import { LionComponent } from './lion/lion.component';



@NgModule({
  declarations: [
    TigerComponent,
    LionComponent
  ],
  exports:[
    LionComponent,
    TigerComponent
  ],
  imports: [
    CommonModule
  ]
})
export class CaveModule { }
