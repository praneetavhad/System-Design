package Spotify_songs_library;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userid;
    private String username;
    private List<PlayList> list = new ArrayList<>();

    public User(String userid, String username){
        this.userid = userid;
        this.username = username;
    }

    public void createPlaylist(String playlistname){
        list.add(new PlayList(playlistname));
    }

    public String getUsername() {
        return username;
    }

    public List<PlayList> getList() {
        return list;
    }
}
