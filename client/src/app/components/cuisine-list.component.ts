import { Component, OnInit } from '@angular/core';
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
  cuisines: Cuisines[] = []

  constructor(private restaurantSvc: RestaurantService) { }
  
  ngOnInit(): void {
    this.restaurantSvc.getCuisineList()
      .then(cuisines => {
        this.cuisines = cuisines
      })
      .catch(error => {
        console.error('error', error)
      })
      
  }

}