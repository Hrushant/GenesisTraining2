import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewAllPayeesComponent } from './view-all-payees.component';

describe('ViewAllPayeesComponent', () => {
  let component: ViewAllPayeesComponent;
  let fixture: ComponentFixture<ViewAllPayeesComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ViewAllPayeesComponent]
    });
    fixture = TestBed.createComponent(ViewAllPayeesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
