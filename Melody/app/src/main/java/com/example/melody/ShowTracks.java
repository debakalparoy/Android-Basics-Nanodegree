package com.example.melody;

public class ShowTracks {

    private String songName = NO_SONG_SELECTED;
    private String artistName;
    private int audioResourceID, albumArtId = NO_IMAGE_SELECTED;
    private String genres;
    private static final String NO_SONG_SELECTED = null;
    private static final int NO_IMAGE_SELECTED = -1;

    // Constructor for Genres.
    public ShowTracks(String genres) {
        this.artistName = genres;
    }

    // Constructor for All Track Screen & Albums Screen.
    public ShowTracks(String songName, String artistName, int albumArtId) {
        this.songName = songName;
        this.artistName = artistName;
        this.albumArtId = albumArtId;
    }

    // Constructor for All Track Screen & Albums Screen.
    public ShowTracks(String songName, String artistName, int albumArtId, int audioResourceID) {
        this.songName = songName;
        this.artistName = artistName;
        this.albumArtId = albumArtId;
        this.audioResourceID = audioResourceID;
    }

    // Gets the song name.
    public String getSongName() {
        return songName;
    }

    // Gets the artists name.
    public String getArtistName() {
        return artistName;
    }

    // Gets the album art id.
    public int getalbumArtId() {
        return albumArtId;
    }

    //Checks whether it has image & song or not, for Genre category only.
    public boolean hasIMAGEandSong() {
        boolean hasIMAGEandSong = songName != null && albumArtId != NO_IMAGE_SELECTED;
        return hasIMAGEandSong;
    }

    //Returns the song_id that will be played.
    public int getAudioResourceId() {
        return audioResourceID;
    }
}
