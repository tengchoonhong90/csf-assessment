import { Component, OnInit } from '@angular/core';
import { FormArray, FormBuilder, FormGroup } from '@angular/forms';
import { Cuisines } from '../models';
import { RestaurantService } from '../restaurant-service';

@Component({
  selector: 'app-cuisine-list',
  templateUrl: './cuisine-list.component.html',
  styleUrls: ['./cuisine-list.component.css']
})
export class CuisineListComponent implements OnInit {

	// TODO Task 2
	// For View 1
  lineItems!: FormArray
  cuisines: Cuisines[] = []

  constructor(private restaurantSvc: RestaurantService) { }
  
  ngOnInit(): void {
      
  }

}