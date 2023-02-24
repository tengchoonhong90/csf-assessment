import { Component, OnInit } from '@angular/core';
import { FormArray } from '@angular/forms';
import { Restaurant } from '../models';
import { RestaurantService } from '../restaurant-service';

@Component({
  selector: 'app-restaurant-cuisine',
  templateUrl: './restaurant-cuisine.component.html',
  styleUrls: ['./restaurant-cuisine.component.css']
})
export class RestaurantCuisineComponent implements OnInit{
	
	// TODO Task 3
	// For View 2
  lineItems!: FormArray
  restaurants: Restaurant[] = []

  constructor(private restaurantSvc: RestaurantService){ };

  ngOnInit(): void {
      
  }
  
}
