import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'simpleInterest'
})
export class SimpleInterestPipe implements PipeTransform {

  transform(value: unknown, ...args: unknown[]): unknown {
    return null;
  }

}
