package com.example.melody;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.melody.Adapter.ArtistsAdapter;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detais_lists);

        ArrayList<ShowTracks> tracks = new ArrayList<>();

        tracks.add(new ShowTracks("Believer", "Imagine Dragons", R.drawable.believer));
        tracks.add(new ShowTracks("Bhohemian Rhapsody", "Queen", R.drawable.bohemmian_rhapsody));
        tracks.add(new ShowTracks("Circles", "Post Malone", R.drawable.circles));
        tracks.add(new ShowTracks("For Elise", "Saint Motel", R.drawable.for_elise));
        tracks.add(new ShowTracks("Hurricanes & Butterflies", "Muse", R.drawable.hurricanes_and_butterflies));
        tracks.add(new ShowTracks("Moon River", "Audrey Hepburn", R.drawable.moon_river));
        tracks.add(new ShowTracks("Old Soul", "Saint Motel", R.drawable.old_soul));
        tracks.add(new ShowTracks("Running by a Dream", "Tom Petty", R.drawable.running_by_a_dream));
        tracks.add(new ShowTracks("Should I Stay or Should I Go", "The Clash", R.drawable.should_i_stay_or_should_i_go));
        tracks.add(new ShowTracks("Somebody I used to Know", "Gotye", R.drawable.somebody_i_used_to_know));

        ArtistsAdapter artistsListAdapter = new ArtistsAdapter(this, tracks);
        ListView listView = findViewById(R.id.itemsList);
        listView.setAdapter(artistsListAdapter);

    }
}
