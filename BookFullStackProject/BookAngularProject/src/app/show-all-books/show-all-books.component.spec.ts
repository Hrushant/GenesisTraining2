import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowAllBooksComponent } from './show-all-books.component';

describe('ShowAllBooksComponent', () => {
  let component: ShowAllBooksComponent;
  let fixture: ComponentFixture<ShowAllBooksComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ShowAllBooksComponent]
    });
    fixture = TestBed.createComponent(ShowAllBooksComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
