package Spotify_songs_library;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello playlist!");

        MusicLibrary musicLibrary = new MusicLibrary();
        User user = new User("u1","Praneet");

        Song s1 = new Song("1", "Believer", "Imagine Dragons", "Evolve", "Rock");
        Song s2 = new Song("2", "Shape of You", "Ed Sheeran", "Divide", "Pop");
        Song s3 = new Song("3", "Thunder", "Imagine Dragons", "Evolve", "Rock");

        musicLibrary.addsong(s1);
        musicLibrary.addsong(s2);
        musicLibrary.addsong(s3);

        PlayList playlist = new PlayList("Favourite");
        playlist.addsong(s1);
        playlist.addsong(s2);


        System.out.println(playlist.getSongs());

        //Search

        SearchEngine searchEngine = new SearchEngine(new SearchByArtist());
        List<Song> results = searchEngine.search(musicLibrary.getSong(),"Thunder");

        System.out.println(results);
    }
}