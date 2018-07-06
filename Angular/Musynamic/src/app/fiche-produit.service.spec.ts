import { TestBed, inject } from '@angular/core/testing';

import { FicheProduitService } from './fiche-produit.service';

describe('FicheProduitService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [FicheProduitService]
    });
  });

  it('should be created', inject([FicheProduitService], (service: FicheProduitService) => {
    expect(service).toBeTruthy();
  }));
});
