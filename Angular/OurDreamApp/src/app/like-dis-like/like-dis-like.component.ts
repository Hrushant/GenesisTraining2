import { Component } from '@angular/core';

@Component({
  selector: 'app-like-dis-like',
  templateUrl: './like-dis-like.component.html',
  styleUrls: ['./like-dis-like.component.css']
})
export class LikeDisLikeComponent {
  likeLabel = 'Like'; likeCount = 0;
  likeButton = 'likeButtonStyle';
  disLikeLabel = 'DisLike'; disLikeCount = 0;
  disLikeButton = 'disLikeButtonStyle';
  increaseLikes() { this.likeCount++; }
  decreaseLikes() { this.disLikeCount++; }
}
