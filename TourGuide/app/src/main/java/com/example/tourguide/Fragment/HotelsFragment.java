package com.example.tourguide.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.tourguide.Adapter.LocationAdapter;
import com.example.tourguide.Hotels;
import com.example.tourguide.Location;
import com.example.tourguide.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HotelsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        List<Location> list = new ArrayList<>();
        Hotels.initShopsList(list, Objects.requireNonNull(getContext()));

        LocationAdapter adapter = new LocationAdapter(getActivity(), -1, list);
        View view = inflater.inflate(R.layout.locations_list, container, false);
        ListView listView = view.findViewById(R.id.listView);

        listView.setAdapter(adapter);

        return view;
    }
}
