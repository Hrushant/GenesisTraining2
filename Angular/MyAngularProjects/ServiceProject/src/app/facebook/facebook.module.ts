import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LikeDislikeComponent } from './like-dislike/like-dislike.component';



@NgModule({
  declarations: [
    LikeDislikeComponent
  ],
  imports: [
    CommonModule,
    
  ],
  exports: [
    LikeDislikeComponent
  ]
})
export class FacebookModule { }
