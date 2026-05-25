package Spotify_songs_library;

import java.util.ArrayList;
import java.util.List;

public class SearchByArtist implements SearchStartergy {
    @Override
    public List<Song> search(List<Song> songs, String query) {
        List<Song> result = new ArrayList<>();

        for(Song s: songs){
            if(s.getArtist().equalsIgnoreCase(query)){
                result.add(s);
            }
        }
        return result;
    }
}
