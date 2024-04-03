import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FundsTransferPageComponent } from './funds-transfer-page.component';

describe('FundsTransferPageComponent', () => {
  let component: FundsTransferPageComponent;
  let fixture: ComponentFixture<FundsTransferPageComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [FundsTransferPageComponent]
    });
    fixture = TestBed.createComponent(FundsTransferPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
