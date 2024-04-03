import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeletePayeeComponent } from './delete-payee.component';

describe('DeletePayeeComponent', () => {
  let component: DeletePayeeComponent;
  let fixture: ComponentFixture<DeletePayeeComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DeletePayeeComponent]
    });
    fixture = TestBed.createComponent(DeletePayeeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
