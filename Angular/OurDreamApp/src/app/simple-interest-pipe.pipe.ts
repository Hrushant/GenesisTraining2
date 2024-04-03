import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'simpleInterestPipe'
})
export class SimpleInterestPipePipe implements PipeTransform {

  transform(principal: number, ...args: number[]): number {
    let simpleInterest = principal;
    for (let i = 0; i < args.length; i++) {
      simpleInterest = principal * args[i];
    }
    return (simpleInterest / 100);
  }
}
