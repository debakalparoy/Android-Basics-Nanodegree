package com.example.melody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tracks = findViewById(R.id.tracks);
        tracks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(getApplicationContext(), TracksActivity.class);
                startActivity(i1);
                Toast.makeText(v.getContext(), "Showing All Tracks", Toast.LENGTH_SHORT).show();
            }
        });

        TextView artists = findViewById(R.id.artists);
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(getApplicationContext(), ArtistsActivity.class);
                startActivity(i2);
                Toast.makeText(v.getContext(), "Showing All Artists", Toast.LENGTH_SHORT).show();
            }
        });

        TextView albums = findViewById(R.id.albums);
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(getApplicationContext(), AlbumsActivity.class);
                startActivity(i3);
                Toast.makeText(v.getContext(), "Showing All Albums", Toast.LENGTH_SHORT).show();
            }
        });

        TextView genres = findViewById(R.id.genres);
        genres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(getApplicationContext(), GenresActivity.class);
                startActivity(i4);
                Toast.makeText(v.getContext(), "Showing All Genres", Toast.LENGTH_SHORT).show();
            }
        });
    }
}