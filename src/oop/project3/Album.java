package oop.project3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Album {
    public final String name;
    public final int year;
    public final Artist artist;

    private final ArrayList<Song> track = new ArrayList<>();

    public Album(String name, int year, Artist artist) {
        this.name = name;
        this.year = year;
        this.artist = artist;
    }

    public void addTrack(Song song) {
        track.add(song);

//        // ArrayList 정렬
//        Collections.sort(track, new Comparator<Song>() {
//            @Override
//            public int compare(Song o1, Song o2) {
//                return o2.name.compareTo(o1.name);
//            }
//        });
    }

    public Song getTrack(int trackNum) {
        if (trackNum < 0 || trackNum > track.size())
            return null;
        return track.get(trackNum - 1);
    }
}
