package com.spicy.chicken.wings;

import com.spicy.chiken.wings.Restaurant;
import com.spicy.chiken.wings.Restaurants;

import java.util.List;

public class SpicyChickenWings
{

    public List<Restaurant> findAllRestaurantWithCriteria(Restaurants restaurants, String location, double radius, int count)
    {
        return restaurants.getTopRestaurants(location, radius, count);
    }
}
