import { TestBed } from '@angular/core/testing';

import { SpringBookService } from './spring-book.service';

describe('SpringBookService', () => {
  let service: SpringBookService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SpringBookService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
