package com.example.tourguide;

import android.content.Context;

import java.util.List;

public class Food {

    public static void initFoodsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.food_oudh),
                context.getString(R.string.food_oudh_description),
                context.getString(R.string.food_oudh_address),
                context.getString(R.string.food_oudh_phone),
                context.getString(R.string.food_oudh_schedule),
                context.getString(R.string.price_fine),
                R.drawable.oudh
        ));

        list.add(new Location(
                context.getString(R.string.food_arsalan_name),
                context.getString(R.string.food_arsalan_description),
                context.getString(R.string.food_arsalan_address),
                context.getString(R.string.food_arsalan_phone),
                context.getString(R.string.food_arsalan_schedule),
                context.getString(R.string.price_casual),
                R.drawable.arsalan
        ));

        list.add(new Location(
                context.getString(R.string.food_flurys_name),
                context.getString(R.string.food_flurys_description),
                context.getString(R.string.food_flurys_address),
                context.getString(R.string.food_flurys_phone),
                context.getString(R.string.food_flurys_schedule),
                context.getString(R.string.price_casual),
                R.drawable.flurys
        ));

        list.add(new Location(
                context.getString(R.string.food_oh_calcutta_name),
                context.getString(R.string.food_oh_calutta_description),
                context.getString(R.string.food_oh_calcutta_address),
                context.getString(R.string.food_oh_calcutta_phone),
                context.getString(R.string.food_oh_calcutta_schedule),
                context.getString(R.string.price_luxury),
                R.drawable.oh_calcutta
        ));

        list.add(new Location(
                context.getString(R.string.food_haldiram_name),
                context.getString(R.string.food_haldiram_description),
                context.getString(R.string.food_haldiram_address),
                context.getString(R.string.food_haldiram_phone),
                context.getString(R.string.food_haldiram_schedule),
                context.getString(R.string.price_lite),
                R.drawable.haldirams
        ));

        list.add(new Location(
                context.getString(R.string.food_mullicks_name),
                context.getString(R.string.food_mullicks_description),
                context.getString(R.string.food_mullicks_address),
                context.getString(R.string.food_mullicks_phone),
                context.getString(R.string.food_mullicks_schedule),
                context.getString(R.string.price_cheap),
                R.drawable.balaram_mullick_and_radharaman_mullick
        ));

        list.add(new Location(
                context.getString(R.string.food_mainland_china_name),
                context.getString(R.string.food_mainland_china_description),
                context.getString(R.string.food_mainland_china_address),
                context.getString(R.string.food_mainland_china_phone),
                context.getString(R.string.food_mainland_china_schedule),
                context.getString(R.string.price_fine),
                R.drawable.mainland_china
        ));
    }
}
