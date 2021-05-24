package com.example.melody;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.melody.Adapter.TracksAdapter;

import java.util.ArrayList;

public class GenresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_grid);

        ArrayList<ShowTracks> tracks = new ArrayList<>();

        tracks.add(new ShowTracks("A capella"));
        tracks.add(new ShowTracks("Alternative"));
        tracks.add(new ShowTracks("Blues"));
        tracks.add(new ShowTracks("Classical"));
        tracks.add(new ShowTracks("Classic Rock"));
        tracks.add(new ShowTracks("Folk"));
        tracks.add(new ShowTracks("Indie Rock"));
        tracks.add(new ShowTracks("Pop"));
        tracks.add(new ShowTracks("Rock"));
        tracks.add(new ShowTracks("Jazz"));
        tracks.add(new ShowTracks("Rap/Hip-Hop"));
        tracks.add(new ShowTracks("Soundtrack"));

        TracksAdapter tracksListAdapter = new TracksAdapter(this, tracks);
        GridView gridView = findViewById(R.id.itemsGrid);
        gridView.setAdapter(tracksListAdapter);
    }
}
