package com.example.tourguide.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tourguide.Location;
import com.example.tourguide.R;

import java.util.List;

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Context context, int resources, List<Location> locationsList) {
        super(context, 0, locationsList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Location currentLocation = getItem(position);
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        TextView nameLocationTextView = listItemView.findViewById(R.id.nameTextView);
        assert currentLocation != null;
        nameLocationTextView.setText(currentLocation.getName());

        TextView descriptionLocationTextView = listItemView.findViewById(R.id.descriptionTextView);
        descriptionLocationTextView.setText(currentLocation.getDescription());

        TextView addressLocationTextView = listItemView.findViewById(R.id.addressTextView);
        addressLocationTextView.setText(currentLocation.getAddress());

        TextView scheduleLocationTextView = listItemView.findViewById(R.id.scheduleTextView);
        scheduleLocationTextView.setText(currentLocation.getSchedule());

        TextView priceLocationTextView = listItemView.findViewById(R.id.priceTextView);
        priceLocationTextView.setText(currentLocation.getPrice());

        TextView phoneLocationTextView = listItemView.findViewById(R.id.phoneTextView);
        phoneLocationTextView.setText(currentLocation.getPhone());

        ImageView photoLocationImageView = listItemView.findViewById(R.id.photoImageView);

        if (currentLocation.hasImage()) {
            photoLocationImageView.setImageResource(currentLocation.getImageResourceId());
            photoLocationImageView.setVisibility(View.VISIBLE);
        } else {
            photoLocationImageView.setVisibility(View.GONE);
        }

        if (currentLocation.hasPrice()) {
            priceLocationTextView.setVisibility(View.VISIBLE);
        } else {
            priceLocationTextView.setVisibility(View.GONE);
        }

        if (currentLocation.hasSchedule()) {
            scheduleLocationTextView.setVisibility(View.VISIBLE);
        } else {
            scheduleLocationTextView.setVisibility(View.GONE);
        }

        if (currentLocation.hasAddress()) {
            addressLocationTextView.setVisibility(View.VISIBLE);
        } else {
            addressLocationTextView.setVisibility(View.GONE);
        }

        if (currentLocation.hasPhone()) {
            phoneLocationTextView.setVisibility(View.VISIBLE);
        } else {
            phoneLocationTextView.setVisibility(View.GONE);
        }

        return listItemView;
    }


}
