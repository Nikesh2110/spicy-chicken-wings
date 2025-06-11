package com.spicy.chiken.wings;

import java.util.List;

public interface Restaurants
{
    List<Restaurant> getTopRestaurants(String location, double radius, int count);
}
