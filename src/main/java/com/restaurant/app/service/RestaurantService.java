package com.restaurant.app.service;

import com.restaurant.app.retaurant.FoodItem;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RestaurantService {
    public List<FoodItem> retrieveAllItems();
}
