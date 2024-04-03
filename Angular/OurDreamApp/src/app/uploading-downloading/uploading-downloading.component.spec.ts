import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UploadingDownloadingComponent } from './uploading-downloading.component';

describe('UploadingDownloadingComponent', () => {
  let component: UploadingDownloadingComponent;
  let fixture: ComponentFixture<UploadingDownloadingComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [UploadingDownloadingComponent]
    });
    fixture = TestBed.createComponent(UploadingDownloadingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
