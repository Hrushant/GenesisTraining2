import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'compoundInterest'
})
export class CompoundInterestPipe implements PipeTransform {
//  formula -> ci = p * ( 1 + r/n )**nt
  transform(p: number, r: number, n:number, t:number): number {
    let ci = p * (Math.pow((1+r/n), n*t));
    return ci;
  }

  
}
