package com.example.tourguide;

import android.content.Context;

import java.util.List;

public class Places {

    public static void initSightsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.places_victoria_name),
                context.getString(R.string.places_victoria_description),
                context.getString(R.string.places_victoria_address),
                null,
                context.getString(R.string.places_victoria_schedule),
                context.getString(R.string.places_victoria_price),
                R.drawable.victoria_memorial
        ));

        list.add(new Location(
                context.getString(R.string.places_fort_name),
                context.getString(R.string.places_fort_description),
                context.getString(R.string.places_fort_address),
                null,
                context.getString(R.string.places_fort_schedule),
                context.getString(R.string.sight_price_free),
                R.drawable.fort_williams
        ));

        list.add(new Location(
                context.getString(R.string.places_bridge_name),
                context.getString(R.string.places_bridge_description),
                context.getString(R.string.places_bridge_address),
                null,
                context.getString(R.string.places_bridge_schedule),
                context.getString(R.string.sight_price_free),
                R.drawable.howrah_bridge
        ));

        list.add(new Location(
                context.getString(R.string.places_science_city_name),
                context.getString(R.string.places_science_city_description),
                context.getString(R.string.places_science_city_address),
                context.getString(R.string.places_science_city_phone),
                context.getString(R.string.places_science_city_schedule),
                context.getString(R.string.places_science_city_price),
                R.drawable.science_city
        ));

        list.add(new Location(
                context.getString(R.string.places_belur_name),
                context.getString(R.string.places_belur_description),
                context.getString(R.string.places_belur_address),
                context.getString(R.string.places_belur_phone),
                context.getString(R.string.places_belur_schedule),
                context.getString(R.string.sight_price_free),
                R.drawable.belur_math
        ));

        list.add(new Location(
                context.getString(R.string.places_museum_name),
                context.getString(R.string.places_museum_description),
                context.getString(R.string.places_museum_address),
                context.getString(R.string.places_museum_phone),
                context.getString(R.string.places_museum_schedule),
                context.getString(R.string.places_museum_price),
                R.drawable.indian_museum
        ));

        list.add(new Location(
                context.getString(R.string.places_coffee_house_name),
                context.getString(R.string.places_coffee_house_description),
                context.getString(R.string.places_coffee_house_address),
                context.getString(R.string.places_coffee_house_phone),
                context.getString(R.string.places_coffee_house_schedule),
                context.getString(R.string.places_coffee_house_price),
                R.drawable.coffee_house
        ));

        list.add(new Location(
                context.getString(R.string.places_botanical_gardens_name),
                context.getString(R.string.places_botanical_gardens_description),
                context.getString(R.string.places_botanical_gardens_address),
                context.getString(R.string.places_botanical_gardens_phone),
                context.getString(R.string.places_botanical_gardens_schedule),
                context.getString(R.string.places_botanical_gardens_price),
                R.drawable.botanical_garden
        ));
    }
}
