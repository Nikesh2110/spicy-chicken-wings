package com.spicy.chicken.wings;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import com.spicy.chiken.wings.Restaurant;
import com.spicy.chiken.wings.Restaurants;
import com.spicy.chiken.wings.SpicyChickenWings;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RestaurantsTest
{
    @Test
    void findAllRestaurantsWithLocationAndRadius(){
        Restaurants restaurants = mock(Restaurants.class);
        SpicyChickenWings spicyChickenWings = new SpicyChickenWings();
        List<Restaurant> restaurantList = spicyChickenWings.findAllRestaurantWithCriteria(restaurants, "ABC", 5, 10);
        verify(restaurants).getTopRestaurants("ABC",5,10);
    }


}
