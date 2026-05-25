package Spotify_songs_library;

import java.util.ArrayList;
import java.util.List;

public class MusicLibrary {
    private List<Song> song = new ArrayList<>();

    public void addsong(Song s){
        song.add(s);
    }

    public List<Song> getSong() {
        return song;
    }
}
