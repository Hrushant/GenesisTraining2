import { Component } from '@angular/core';

@Component({
  selector: 'app-array',
  templateUrl: './array.component.html',
  styleUrls: ['./array.component.css']
})
export class ArrayComponent {

  newPrime: number=0;
  primeFound: boolean=false;

  addNewPrime() {
    console.log('Adding new prime in the array...'+this.newPrime);

    let prime=0;
    for (let i= 2; i < this.newPrime/2 ; i++) {
      if(this.newPrime%i==0)
        prime=1;
    }
    if(prime==0) { //to verify if it is a prime
//      this.primes = this.primes.filter(  i => i==this.newPrime );
      // for (let index = 0; index < this.primes.length; index++) {
      //   const element = this.primes[index];
      //   if(element == this.newPrime) {
      //     alert('Prime alreay exists');
      //     this.primeFound=true;
      //     break;
      //   }
      // }
      if(this.primes.findIndex(  (i) => i==this.newPrime ) != -1 ) {
        alert('already exists');
      }
      else {
        this.primes.push(this.newPrime); //to add it  
        alert('prime added...');
      }
    }
    else {
      alert('not a prime');
    }
  }

  deleteExistingPrime(x:number) {
    console.log('Deleting existing prime from the array...'+x);
    this.primes = this.primes.filter(  i => i!=x );
  }

  primes : number[] = [
    2,3,5,7,11
  ];


  editExistingPrime(x: number) {

  }

}
