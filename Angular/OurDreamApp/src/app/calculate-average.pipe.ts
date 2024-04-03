import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'calculateAverage'
})
export class CalculateAveragePipe implements PipeTransform {

  transform(firstValue: number, ...otherValues: number[]): number {
    console.log(firstValue+' : CalculateAveragePipe: transform() is invoked...');
    let sum=firstValue;
    for(let i=0;i<otherValues.length;i++){
      sum=sum+otherValues[i];
    }
    return (sum)/(otherValues.length+1);
  }

}
