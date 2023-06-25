package com.example.ResturentModel.services;

import com.example.ResturentModel.model.Restaurant;
import com.example.ResturentModel.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServices {
    @Autowired
    RestaurantRepo restaurantRepo;

    public String addNewRestaurant(Restaurant restaurant){
        return restaurantRepo.save(restaurant);
    }

    public List<Restaurant> getAllRestaurants(){
        return restaurantRepo.getRestaurants();
    }

    public Restaurant getRestaurantById(Integer restaurantId){
        List<Restaurant> specificUser = getAllRestaurants();
        for (Restaurant restaurant : specificUser){
            if (restaurant.getRestaurantId().equals(restaurantId)){
                return restaurant;
            }
        }
        return null;
    }
    public String deleteRestaurantById(Integer restaurantId){
        List<Restaurant> specificUser = getAllRestaurants();
        Boolean status = false;
        for (Restaurant restaurant : specificUser){
            if(restaurant.getRestaurantId().equals(restaurantId)){
                status = restaurantRepo.removeRestaurantById(restaurant);
                if (status){
                    return "Restaurant Id " + restaurantId + " removed successfully";
                }else {
                    return "Restaurant Id " + restaurantId + " Can't removed";
                }
            }
        }
        return "Restaurant Id " + restaurantId + "Not Found";
    }

    public String updateRestaurant(Integer restaurantId,Restaurant restaurant){
        boolean updateStatus = restaurantRepo.updateRestaurantById(restaurantId,restaurant);
        if (updateStatus){
            return "Restaurant: " + restaurantId + " is update";
        }else {
            return "Restaurant: " + restaurantId + "does not exist";
        }
    }
}
