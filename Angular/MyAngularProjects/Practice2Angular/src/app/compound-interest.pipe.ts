import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'compoundInterest'
})
export class CompoundInterestPipe implements PipeTransform {

  transform(principal: number, rateOfInterest: number, time: number, compoundInterest: number): number {
    let A = principal * Math.pow((1 + rateOfInterest / compoundInterest), time * compoundInterest);
    let CI=A-principal;
    return CI;
  }

}
