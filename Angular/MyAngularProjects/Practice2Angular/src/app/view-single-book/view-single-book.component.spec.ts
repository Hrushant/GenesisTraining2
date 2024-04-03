import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewSingleBookComponent } from './view-single-book.component';

describe('ViewSingleBookComponent', () => {
  let component: ViewSingleBookComponent;
  let fixture: ComponentFixture<ViewSingleBookComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ViewSingleBookComponent]
    });
    fixture = TestBed.createComponent(ViewSingleBookComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
