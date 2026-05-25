package Spotify_songs_library;

import java.util.List;

public class SearchEngine {
    public SearchStartergy startergy;

    public SearchEngine(SearchStartergy startergy) {
        this.startergy = startergy;
    }

    public List<Song> search(List<Song> songs, String query){
        return startergy.search(songs,query);
    }
}
