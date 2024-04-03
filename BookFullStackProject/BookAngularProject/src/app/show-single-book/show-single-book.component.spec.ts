import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowSingleBookComponent } from './show-single-book.component';

describe('ShowSingleBookComponent', () => {
  let component: ShowSingleBookComponent;
  let fixture: ComponentFixture<ShowSingleBookComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ShowSingleBookComponent]
    });
    fixture = TestBed.createComponent(ShowSingleBookComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
