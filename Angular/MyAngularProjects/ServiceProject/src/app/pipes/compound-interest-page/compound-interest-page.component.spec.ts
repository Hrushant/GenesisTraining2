import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CompoundInterestPageComponent } from './compound-interest-page.component';

describe('CompoundInterestPageComponent', () => {
  let component: CompoundInterestPageComponent;
  let fixture: ComponentFixture<CompoundInterestPageComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CompoundInterestPageComponent]
    });
    fixture = TestBed.createComponent(CompoundInterestPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
