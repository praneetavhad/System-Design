package Spotify_songs_library;

import java.util.ArrayList;
import java.util.List;

public class PlayList {

     private String playlistname;
     private List<Song> songs = new ArrayList<>();

    public PlayList(String playlistname) {
        this.playlistname = playlistname;
    }

    public void addsong(Song s){
        songs.add(s);
    }

    public void removesong(Song s){
        songs.remove(s);
    }

    public String getPlaylistname() {
        return playlistname;
    }

    public List<Song> getSongs() {
        return songs;
    }
}
