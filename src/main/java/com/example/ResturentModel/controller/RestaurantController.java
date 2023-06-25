package com.example.ResturentModel.controller;

import com.example.ResturentModel.model.Restaurant;
import com.example.ResturentModel.services.RestaurantServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {
    @Autowired
    RestaurantServices restaurantServices;

    @PostMapping("addrestaurant")
    public String addRestaurant(@RequestBody Restaurant restaurant){
        return restaurantServices.addNewRestaurant(restaurant);
    }

    @GetMapping("getAllRestaurant")
    public List<Restaurant> getAllRestaurant(){

        return restaurantServices.getAllRestaurants();
    }

    @GetMapping("getrestaurant/{restaurantId}")
    public Restaurant getRestaurant(@PathVariable Integer restaurantId){
        return restaurantServices.getRestaurantById(restaurantId);
    }

    @PutMapping("updateRestaurant/{restaurantId}")
    public  String updateRestaurantInfo(@PathVariable Integer restaurantId,@RequestBody Restaurant restaurant){
        return restaurantServices.updateRestaurant(restaurantId,restaurant);
    }

    @DeleteMapping("deleteRestaurant/{restaurantId}")
    public String deleteRestaurant(@PathVariable Integer restaurantId){
        return restaurantServices.deleteRestaurantById(restaurantId);
    }

}
