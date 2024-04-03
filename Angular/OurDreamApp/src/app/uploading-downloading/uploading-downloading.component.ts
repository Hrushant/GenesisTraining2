import { Component } from '@angular/core';

@Component({
  selector: 'app-uploading-downloading',
  templateUrl: './uploading-downloading.component.html',
  styleUrls: ['./uploading-downloading.component.css']
})
export class UploadingDownloadingComponent {
  uploadLabel='Upload';uploadCount=0;
  uploadButton='uploadButtonStyle';
  downloadLabel='Download';downloadCount=0;
  downloadButton='downloadButtonStyle';
  increaseUploads() { this.uploadCount++;}
  decreaseUploads() { this.downloadCount++;}
}
