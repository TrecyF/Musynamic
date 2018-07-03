import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PresentationProduitComponent } from './presentation-produit.component';

describe('PresentationProduitComponent', () => {
  let component: PresentationProduitComponent;
  let fixture: ComponentFixture<PresentationProduitComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PresentationProduitComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PresentationProduitComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
