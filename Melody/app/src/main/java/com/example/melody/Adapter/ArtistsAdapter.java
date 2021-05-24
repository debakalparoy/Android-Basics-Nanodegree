package com.example.melody.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.melody.R;
import com.example.melody.ShowTracks;

import java.util.ArrayList;

public class ArtistsAdapter extends ArrayAdapter<ShowTracks> {

    public ArtistsAdapter(@NonNull Context context, ArrayList<ShowTracks> tracks) {
        super(context, 0, tracks);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_artists, parent, false);
        }

        ShowTracks currentTrack = getItem(position);

        TextView artistTextView = listItemView.findViewById(R.id.artistslistArtistName);
        assert currentTrack != null;
        artistTextView.setText(currentTrack.getArtistName());

        ImageView iconView = listItemView.findViewById(R.id.aristslistAlbumArt);
        iconView.setImageResource(currentTrack.getalbumArtId());

        // Return the whole list item layout (containing 1 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
