import { TestBed, inject } from '@angular/core/testing';

import { InscriptionServiceService } from './inscription-service.service';

describe('InscriptionServiceService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [InscriptionServiceService]
    });
  });

  it('should be created', inject([InscriptionServiceService], (service: InscriptionServiceService) => {
    expect(service).toBeTruthy();
  }));
});
