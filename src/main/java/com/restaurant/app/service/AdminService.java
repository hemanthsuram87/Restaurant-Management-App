package com.restaurant.app.service;

import com.restaurant.app.retaurant.FoodItem;
import org.springframework.stereotype.Service;


public interface AdminService {

    String addNewItemService(FoodItem item);

    public String removeFoodItem(String itemId);
}
