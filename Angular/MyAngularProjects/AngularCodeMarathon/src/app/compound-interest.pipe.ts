import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'compoundInterest'
})
export class CompoundInterestPipe implements PipeTransform {

  transform(principal: number, rateOfInterest: number, noOfTimesInterestIsCompounded: number, timeInYears: number): number {
    let CI = principal * Math.pow((1 + rateOfInterest / noOfTimesInterestIsCompounded), noOfTimesInterestIsCompounded * timeInYears);
    return CI;
  }
}
