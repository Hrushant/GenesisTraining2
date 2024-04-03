import { Component } from '@angular/core';

@Component({
  selector: 'app-compound-interest',
  templateUrl: './compound-interest.component.html',
  styleUrls: ['./compound-interest.component.css']
})
export class CompoundInterestComponent {
  principal : number =0;
  rateOfInterest : number=0;
  time : number=0;
  frequencyCompound : number=0;
}
