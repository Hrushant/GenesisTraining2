import { Component } from '@angular/core';

@Component({
  selector: 'app-like-dislike',
  templateUrl: './like-dislike.component.html',
  styleUrls: ['./like-dislike.component.css']
})
export class LikeDislikeComponent {
  likeCount = 0;
  likeLabel="Like";
  likeButton = "likeButtonStyle";
  disLikeCount = 0;
  disLikeLabel = "DisLike";
  disLikeButton="disLikeButtonStyle";

  buttonStyle="buttonStyle";
  increaseLikeCount(){
    this.likeCount++;
    if(this.likeCount > 10){
      this.likeCount=0;
      alert("Reached to limit");
    }
  }
  increaseDisLikeCount(){
    this.disLikeCount++;
    if(this.disLikeCount>10){
      this.disLikeCount=0;
      alert("Reached to limit");
    }
  }
}
