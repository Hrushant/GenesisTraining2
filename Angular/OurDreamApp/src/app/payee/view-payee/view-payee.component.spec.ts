import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewPayeeComponent } from './view-payee.component';

describe('ViewPayeeComponent', () => {
  let component: ViewPayeeComponent;
  let fixture: ComponentFixture<ViewPayeeComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ViewPayeeComponent]
    });
    fixture = TestBed.createComponent(ViewPayeeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
