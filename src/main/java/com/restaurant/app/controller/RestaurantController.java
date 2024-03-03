package com.restaurant.app.controller;

import com.restaurant.app.retaurant.FoodItem;
import com.restaurant.app.service.RestaurantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    @Autowired
    RestaurantServiceImpl restaurantService;

    /**
     * This method retrieves all the food items for the landing page
     * @return FoodItems
     */
    @GetMapping("/retrieve/AllItems")
    public @ResponseBody List<FoodItem> getAllFoodItems() {
        return restaurantService.retrieveAllItems();
    }



}
