package com.spicy.chicken.wings;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import com.spicy.chiken.wings.Restaurant;
import com.spicy.chiken.wings.Restaurants;
import com.spicy.chiken.wings.SpicyChickenWings;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

public class RestaurantsTest
{
    @Test
    void findAllRestaurantsWithLocationAndRadius(){
        Restaurants restaurants = mock(Restaurants.class);
        SpicyChickenWings spicyChickenWings = new SpicyChickenWings();
        when(restaurants.getTopRestaurants("ABC",5,10)).thenReturn(Collections.singletonList(new Restaurant("best chicken in town")));
        List<Restaurant> restaurantList = spicyChickenWings.findAllRestaurantWithCriteria(restaurants, "ABC", 5, 10);
        verify(restaurants).getTopRestaurants("ABC",5,10);
        assertEquals(1, restaurantList.size());
    }
}
