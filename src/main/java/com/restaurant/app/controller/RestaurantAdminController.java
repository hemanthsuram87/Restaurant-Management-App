package com.restaurant.app.controller;

import com.restaurant.app.retaurant.FoodItem;
import com.restaurant.app.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class RestaurantAdminController {

    @Autowired
    AdminService adminService;

    @PostMapping("/addNewItem")
    public @ResponseBody String addNewItem(@RequestBody FoodItem item) {
       return adminService.addNewItemService(item);
    }
    @GetMapping("/removeFoodItem/{id}")
    public @ResponseBody String removeFoodItem(@PathVariable String id) {
        return adminService.removeFoodItem(id);
    }
}
