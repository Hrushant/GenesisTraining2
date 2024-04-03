import { Component } from '@angular/core';

@Component({
  selector: 'app-like-dislike',
  templateUrl: './like-dislike.component.html',
  styleUrls: ['./like-dislike.component.css']
})
export class LikeDislikeComponent {
  likeCount : number = 0;
  dislikeCount : number = 0;

  like(){
    if(this.likeCount>20){
      this.likeCount=0;
    }
    else {
      this.likeCount++;
    }
  }

  dislike(){
    if(this.dislikeCount>20){
      this.dislikeCount=0;
    }
    else {
      this.dislikeCount++;
    }
  }

  // likeLabel = '👍';
  // likeCount = 10;
  // likeButton = 'likeButtonStyle';
 
  // disLikeLabel = '👎';
  // disLikeCount = -20;
  // disLikeButton = 'disLikeButtonStyle';
 
  // increaseLikes() {
  //   if(this.likeCount == 200){
  //     this.likeCount=10;
  //   }else
  //     this.likeCount++;
  // }
 
  // decreseLikes() {
  //   if(this.disLikeCount == -50){
  //     this.disLikeCount = -20;
  //   }else
  //     this.disLikeCount--;
  // }
}
