import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-observer-demo',
  templateUrl: './observer-demo.component.html',
  styleUrls: ['./observer-demo.component.css']
})
export class ObserverDemoComponent implements OnInit{
  constructor(private http: HttpClient) {}

   userArray: User[]=[];
   
    ngOnInit() {

        const http$ = this.http.get<User[]>('https://jsonplaceholder.typicode.com/posts'); 

        http$.subscribe(
            res => {
              console.log('HTTP response', res)
              this.userArray=res;
            },
            err => console.log('HTTP Error', err),
            () => console.log('HTTP request completed.')
        );
    }

}

export class User {
  userId! : number
  id!:number
  title!: string
  body!:string
}

