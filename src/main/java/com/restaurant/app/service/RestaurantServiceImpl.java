package com.restaurant.app.service;

import com.restaurant.app.repository.RestaurantFoodItemRepository;
import com.restaurant.app.retaurant.FoodItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService{

    @Autowired
    RestaurantFoodItemRepository restaurantFoodItemRepository;
    public List<FoodItem> retrieveAllItems(){

        return restaurantFoodItemRepository.findAll();
    }
}
