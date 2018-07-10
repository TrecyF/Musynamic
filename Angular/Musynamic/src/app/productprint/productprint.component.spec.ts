import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductprintComponent } from './productprint.component';

describe('ProductprintComponent', () => {
  let component: ProductprintComponent;
  let fixture: ComponentFixture<ProductprintComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProductprintComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ProductprintComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
