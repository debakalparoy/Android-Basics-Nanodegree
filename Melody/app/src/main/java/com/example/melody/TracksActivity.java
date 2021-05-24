package com.example.melody;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.melody.Adapter.TracksAdapter;

import java.util.ArrayList;

public class TracksActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    /**
     * This listener gets triggered when the {@link MediaPlayer} has completed
     * playing the audio file.
     */
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            // Now that the sound file has finished playing, release the media player resources.
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detais_lists);

        final ArrayList<ShowTracks> tracks = new ArrayList<>();

        tracks.add(new ShowTracks("Believer", "Imagine Dragons", R.drawable.believer, R.raw.believer));
        tracks.add(new ShowTracks("Bhohemian Rhapsody", "Queen", R.drawable.bohemmian_rhapsody, R.raw.bohemian_rhapsody));
        tracks.add(new ShowTracks("Circles", "Post Malone", R.drawable.circles, R.raw.circles));
        tracks.add(new ShowTracks("For Elise", "Saint Motel", R.drawable.for_elise, R.raw.for_elsie));
        tracks.add(new ShowTracks("Butterflies & Hurricanes", "Muse", R.drawable.hurricanes_and_butterflies, R.raw.butterflies_and_hurricanes));
        tracks.add(new ShowTracks("Moon River", "Audrey Hepburn", R.drawable.moon_river, R.raw.moon_river));
        tracks.add(new ShowTracks("Old Soul", "Saint Motel", R.drawable.old_soul, R.raw.old_soul));
        tracks.add(new ShowTracks("Running down a Dream", "Tom Petty", R.drawable.running_by_a_dream, R.raw.runnin_down_a_dream));
        tracks.add(new ShowTracks("Should I Stay or Should I Go", "The Clash", R.drawable.should_i_stay_or_should_i_go, R.raw.should_i_stay_or_should_i_go));
        tracks.add(new ShowTracks("Somebody I used to Know", "Gotye", R.drawable.somebody_i_used_to_know, R.raw.somebody_i_used_to_know));

        TracksAdapter tracksListAdapter = new TracksAdapter(this, tracks);
        ListView listView = findViewById(R.id.itemsList);
        listView.setAdapter(tracksListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                ShowTracks tracksPosition = tracks.get(position);

                // Release the media player if it currently exists because we are about to
                // play a different sound file.
                releaseMediaPlayer();

                //Creates the mediaPlayer.
                mediaPlayer = MediaPlayer.create(TracksActivity.this, tracksPosition.getAudioResourceId());
                mediaPlayer.start();

                // Setup a listener on the media player, so that we can stop and release the
                // media player once the sound has finished playing.
                mediaPlayer.setOnCompletionListener(mCompletionListener);
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        // When the activity is stopped, release the media player resources because we won't
        // be playing any more sounds.
        releaseMediaPlayer();
    }

    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mediaPlayer = null;
        }
    }
}
