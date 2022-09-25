/*
 * Author Name: Mridul
 * Date: 21-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package repository;

import model.Song;

import java.util.List;

public interface Repository {
    List<Song> displayAllSong();

    List<Song> songSearchBySongName(List<Song> songList, String name);

    List<Song> songSearchByAlbumName(List<Song> songList, String albumName);

    List<Song> songSearchByArtistName(List<Song> songList, String artistName);

    List<Song> songSearchByGenre(List<Song> songList, String genre);
}

