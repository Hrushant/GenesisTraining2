import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CompoundInterestPipe } from './compound-interest.pipe';
import { CompoundInterestPageComponent } from './compound-interest-page/compound-interest-page.component';
import {FormsModule} from '@angular/forms';


@NgModule({
  declarations: [
    CompoundInterestPipe,
    CompoundInterestPageComponent
  ],
  imports: [
    CommonModule,
     FormsModule
  ],
  exports: [
    CompoundInterestPageComponent,
    CompoundInterestPipe
  ]
})
export class PipesModule { }
