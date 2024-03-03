package com.restaurant.app.service;

import com.restaurant.app.repository.AdminRestaurantFoodItemRepo;
import com.restaurant.app.retaurant.FoodItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    AdminRestaurantFoodItemRepo adminRestaurantFoodItemRepo;


    public String addNewItemService(FoodItem item){
        adminRestaurantFoodItemRepo.insert(item);
        return "Item is Added Successfully";
    }

    public String removeFoodItem(String itemId) {
        adminRestaurantFoodItemRepo.deleteById(itemId);
        return "Item deleted Successfully";
    }
}
