package com.restaurant.app;

import com.restaurant.app.repository.AdminRestaurantFoodItemRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;

@SpringBootApplication(scanBasePackages = "com.restaurant.app.*")
@EnableMongoRepositories
public class RestaurantManagementAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestaurantManagementAppApplication.class, args);
        }

}
