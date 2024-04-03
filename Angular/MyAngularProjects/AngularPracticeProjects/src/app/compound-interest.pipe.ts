import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'compoundInterest'
})
export class CompoundInterestPipe implements PipeTransform {

  transform(principal: number,rateOfInterest: number,time:number,frequencyCompound:number): number {
    let CI = principal * Math.pow((1+rateOfInterest/frequencyCompound),frequencyCompound*time);
    return CI;
  }

}
