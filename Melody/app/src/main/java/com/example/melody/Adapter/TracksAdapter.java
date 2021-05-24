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

public class TracksAdapter extends ArrayAdapter<ShowTracks> {

    public TracksAdapter(@NonNull Context context, ArrayList<ShowTracks> tracks) {
        super(context, 0, tracks);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_tracks, parent, false);
        }

        ShowTracks currentTrack = getItem(position);
        TextView artistTextView = listItemView.findViewById(R.id.listArtistName);

        TextView songNameTextView = listItemView.findViewById(R.id.listSongName);

        ImageView albumArtView = listItemView.findViewById(R.id.listAlbumArt);

        ImageView playButton = listItemView.findViewById(R.id.play_button);

        assert currentTrack != null;
        artistTextView.setText(currentTrack.getArtistName());

        //Checks whether the part has image or not. If returned false, it hides the image & song name.
        if (currentTrack.hasIMAGEandSong()) {
            songNameTextView.setText(currentTrack.getSongName());
            albumArtView.setImageResource(currentTrack.getalbumArtId());
        } else {
            songNameTextView.setVisibility(View.INVISIBLE);
            albumArtView.setVisibility(View.INVISIBLE);
            playButton.setVisibility(View.GONE);
        }

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
