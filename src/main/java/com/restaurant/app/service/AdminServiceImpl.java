package com.restaurant.app.service;

import com.restaurant.app.repository.AdminRestaurantFoodItemRepo;
import com.restaurant.app.retaurant.FoodItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    AdminRestaurantFoodItemRepo adminRestaurantFoodItemRepo;


    public Mono<Object> addNewItemService(FoodItem item){
       return Mono.fromSupplier(() ->adminRestaurantFoodItemRepo.insert(item));
    }

    public Mono<String> removeFoodItem(String itemId) {
        adminRestaurantFoodItemRepo.deleteById(itemId);
        return Mono.fromSupplier(() -> "Item deleted Successfully");
    }
}
