package com.example.ResturentModel.repository;

import com.example.ResturentModel.model.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RestaurantRepo {

    List<Restaurant> restaurantsList = new ArrayList<>();
    public String save(Restaurant restaurant){
        restaurantsList.add(restaurant);
        return "Added Successfully";
    }

    public List<Restaurant> getRestaurants(){
        return restaurantsList;
    }

    public Boolean removeRestaurantById(Restaurant restaurant){
        restaurantsList.remove(restaurant);
        return true;
    }

    public Boolean updateRestaurantById(Integer restaurantId,Restaurant restaurant){
        for (Restaurant restaurantObj : restaurantsList){
            if (restaurantObj.getRestaurantId().equals(restaurantId)){
                restaurantObj.setRestaurantName(restaurant.getRestaurantName());
                restaurantObj.setAddress(restaurant.getAddress());
                restaurantObj.setNumber(restaurant.getNumber());
                restaurantObj.setSpecialty(restaurant.getSpecialty());
                restaurantObj.setTotal_staff(restaurant.getTotal_staff());
                return true;
            }
        }
        return false;
    }

}
