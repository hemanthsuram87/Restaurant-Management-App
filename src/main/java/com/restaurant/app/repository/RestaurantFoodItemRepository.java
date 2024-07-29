package com.restaurant.app.repository;

import com.restaurant.app.retaurant.FoodItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface RestaurantFoodItemRepository extends MongoRepository<FoodItem,String> {
List<FoodItem> findAll();

@Query("{name:?0'")
FoodItem findByFoodItem(String name);


}
