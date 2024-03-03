package com.restaurant.app.repository;

import com.restaurant.app.retaurant.FoodItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface AdminRestaurantFoodItemRepo extends MongoRepository<FoodItem,String> {

    @Query("{itemName:'?0'}")
    FoodItem findItemByName(String itemName);

    @Query("{itemCode:'?0'}")
    List<FoodItem> findAll(String itemCode);

    public long count();

}
