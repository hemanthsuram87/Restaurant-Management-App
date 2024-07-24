package com.restaurant.app.service;

import com.restaurant.app.retaurant.FoodItem;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;


public interface AdminService {

    Mono<Object> addNewItemService(FoodItem item);

    public Mono<String> removeFoodItem(String itemId);
}
