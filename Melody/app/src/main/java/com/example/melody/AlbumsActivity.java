package com.example.melody;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.melody.Adapter.AlbumsAdapter;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_grid);

        ArrayList<ShowTracks> tracks = new ArrayList<>();

        tracks.add(new ShowTracks("Believer", "Imagine Dragons", R.drawable.believer));
        tracks.add(new ShowTracks("A Night At the Opera", "Queen", R.drawable.bohemmian_rhapsody));
        tracks.add(new ShowTracks("Hollywood's Bellding", "Post Malone", R.drawable.circles));
        tracks.add(new ShowTracks("Saintmotelevision", "Saint Motel", R.drawable.for_elise));
        tracks.add(new ShowTracks("Hurricanes & Butterflies", "Muse", R.drawable.hurricanes_and_butterflies));
        tracks.add(new ShowTracks("Breakfast at Tiffany's", "Audrey Hepburn", R.drawable.moon_river));
        tracks.add(new ShowTracks("The Original Motion Picture Soundtrack: Pt. 1", "Saint Motel", R.drawable.old_soul));
        tracks.add(new ShowTracks("Full Moon Fever", "Tom Petty", R.drawable.running_by_a_dream));
        tracks.add(new ShowTracks("Combat Rock", "The Clash", R.drawable.should_i_stay_or_should_i_go));
        tracks.add(new ShowTracks("Somebody I used to Know", "Gotye", R.drawable.somebody_i_used_to_know));

        AlbumsAdapter albumsGridAdapter = new AlbumsAdapter(this, tracks);
        GridView gridView = findViewById(R.id.itemsGrid);
        gridView.setAdapter(albumsGridAdapter);
    }
}
