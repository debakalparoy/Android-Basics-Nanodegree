package com.example.tourguide;

import android.content.Context;

import java.util.List;

public class Hotels {

    public static void initShopsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.hotel_hyatt_name),
                context.getString(R.string.hotel_hyatt_description),
                context.getString(R.string.hotel_hyatt_address),
                context.getString(R.string.hotel_hyatt_phone),
                null,
                context.getString(R.string.price_luxury),
                R.drawable.hyatt_regency_kolkata
        ));

        list.add(new Location(
                context.getString(R.string.hotel_westin_name),
                context.getString(R.string.hotel_westin_description),
                context.getString(R.string.hotel_westin_address),
                context.getString(R.string.hotel_westin_phone),
                null,
                context.getString(R.string.price_fine),
                R.drawable.the_westin
        ));

        list.add(new Location(
                context.getString(R.string.hotel_jw_marriott_name),
                context.getString(R.string.hotel_jw_marriott_description),
                context.getString(R.string.hotel_jw_marriott_address),
                context.getString(R.string.hotel_jw_marriott_phone),
                null,
                context.getString(R.string.price_luxury),
                R.drawable.jw_mariott
        ));

        list.add(new Location(
                context.getString(R.string.hotel_montel_name),
                context.getString(R.string.hotel_montel_description),
                context.getString(R.string.hotel_montel_address),
                context.getString(R.string.hotel_montel_phone),
                null,
                context.getString(R.string.price_fine),
                R.drawable.monotel
        ));

        list.add(new Location(
                context.getString(R.string.hotel_pride_name),
                context.getString(R.string.hotel_pride_description),
                context.getString(R.string.hotel_pride_address),
                context.getString(R.string.hotel_pride_phone),
                null,
                context.getString(R.string.price_fine),
                R.drawable.pride_hotel
        ));

        list.add(new Location(
                context.getString(R.string.hotel_oberoi_grand_name),
                context.getString(R.string.hotel_oberoi_grand_description),
                context.getString(R.string.hotel_oberoi_grand_address),
                context.getString(R.string.hotel_oberoi_grand_phone),
                null,
                context.getString(R.string.price_luxury),
                R.drawable.oberoi_grand
        ));

        list.add(new Location(
                context.getString(R.string.hotel_itc_royal_name),
                context.getString(R.string.hotel_itc_royal_description),
                context.getString(R.string.hotel_itc_royal_address),
                context.getString(R.string.hotel_itc_royal_phone),
                null,
                context.getString(R.string.price_luxury),
                R.drawable.itc_royal_bengal
        ));

        list.add(new Location(
                context.getString(R.string.hotel_taj_name),
                context.getString(R.string.hotel_taj_description),
                context.getString(R.string.hotel_taj_address),
                context.getString(R.string.hotel_taj_phone),
                null,
                context.getString(R.string.price_luxury),
                R.drawable.taj_bengal
        ));
    }
}
