package com.spicy.chiken.wings;

import java.util.List;

public class SpicyChickenWings
{

    public List<Restaurant> findAllRestaurantWithCriteria(Restaurants restaurants, String location, double radius, int count)
    {
        return restaurants.getTopRestaurants(location, radius, count);
    }
}
