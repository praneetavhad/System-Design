package Spotify_songs_library;

import java.util.List;

public interface SearchStartergy {
    List<Song> search(List<Song> songs, String query);
}
