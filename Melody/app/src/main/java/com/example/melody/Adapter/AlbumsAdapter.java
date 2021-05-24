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

public class AlbumsAdapter extends ArrayAdapter<ShowTracks> {

    public AlbumsAdapter(@NonNull Context context, ArrayList<ShowTracks> tracks) {
        super(context, 0, tracks);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View gridItemView = convertView;
        if (gridItemView == null) {
            gridItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.grid_albums, parent, false);
        }

        ShowTracks currentTrack = getItem(position);

        TextView songNameTextView = gridItemView.findViewById(R.id.gridSongName);
        assert currentTrack != null;
        songNameTextView.setText(currentTrack.getSongName());

        TextView artistTextView = gridItemView.findViewById(R.id.gridArtistName);
        artistTextView.setText(currentTrack.getArtistName());

        ImageView iconView = gridItemView.findViewById(R.id.gridAlbumArt);
        iconView.setImageResource(currentTrack.getalbumArtId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the gridView.
        return gridItemView;
    }

}