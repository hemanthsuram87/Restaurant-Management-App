package com.restaurant.app.retaurant;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FoodItem {

    @Id
    private String itemCode;
    private String itemName;
    private double itemPrice;
    private String description;
    private boolean isVeg;
    private String foodType;

}
