import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeleteStatementComponent } from './delete-statement.component';

describe('DeleteStatementComponent', () => {
  let component: DeleteStatementComponent;
  let fixture: ComponentFixture<DeleteStatementComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DeleteStatementComponent]
    });
    fixture = TestBed.createComponent(DeleteStatementComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
