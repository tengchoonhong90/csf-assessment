package vttp2022.csf.assessment.server.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.json.Json;
import jakarta.json.JsonArrayBuilder;
import vttp2022.csf.assessment.server.models.Restaurant;
import vttp2022.csf.assessment.server.repositories.RestaurantRepository;

@Controller
public class CuisineListController {
    
    @Autowired
    private RestaurantRepository restaurantRepo;

    @GetMapping(path="/api/cuisines", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<String> getCuisines() {

        List<String> cuisines = restaurantRepo.getCuisines();

        JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
        for (String c: cuisines)
            arrayBuilder.add(c);

        return ResponseEntity.ok(arrayBuilder.build().toString());
    }

    @GetMapping(path="/api/{cuisine}/restaurants", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Restaurant> getRestaurantsByCuisine(@RequestParam String cuisine) {

        List<Restaurant> restaurants = restaurantRepo.getRestaurantsByCuisine(cuisine);

        return restaurants;
    }

}
