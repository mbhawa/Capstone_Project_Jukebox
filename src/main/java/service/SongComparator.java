/*
 * Author Name: Mridul
 * Date: 25-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package service;

import model.Song;

import java.util.Comparator;

public class SongComparator implements Comparator<Song> {

    @Override
    public int compare(Song o1, Song o2) {
        return o1.getGenre().compareTo(o2.getGenre());
    }
}
