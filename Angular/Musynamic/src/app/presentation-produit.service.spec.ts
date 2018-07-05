import { TestBed, inject } from '@angular/core/testing';

import { PresentationProduitService } from './presentation-produit.service';

describe('PresentationProduitService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [PresentationProduitService]
    });
  });

  it('should be created', inject([PresentationProduitService], (service: PresentationProduitService) => {
    expect(service).toBeTruthy();
  }));
});
