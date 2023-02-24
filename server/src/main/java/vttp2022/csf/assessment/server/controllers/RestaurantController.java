package vttp2022.csf.assessment.server.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import vttp2022.csf.assessment.server.models.Restaurant;
import vttp2022.csf.assessment.server.repositories.RestaurantRepository;

@Controller
public class RestaurantController {

    @Autowired
    private RestaurantRepository restaurantRepo;

    @GetMapping(path = "/api/restaurant/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Optional<Restaurant> getRestaurant(@RequestParam String name) {

        Optional<Restaurant> restaurant = restaurantRepo.getRestaurant(name);

        return restaurant;
    }
}
