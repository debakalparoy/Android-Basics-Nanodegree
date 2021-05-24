package com.example.tourguide;

import android.content.Context;

import java.util.List;

public class Info {

    public static void initInfoList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.info_city_name),
                context.getString(R.string.info_city_description),
                null,
                null,
                null,
                null,
                R.drawable.city_of_joy
        ));

        list.add(new Location(
                context.getString(R.string.info_helpful_tips),
                context.getString(R.string.info_helpful_tips_description),
                null,
                null,
                null,
                null,
                -1
        ));


    }
}
