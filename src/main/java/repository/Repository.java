/*
 * Author Name: Mridul
 * Date: 21-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package repository;

import model.Song;

import java.sql.SQLException;
import java.util.List;

public interface Repository<T>{
    List<Song> displayAllSongs() throws SQLException;
    List<Song> searchByAlbumName(List<Song> songList, String albumName) throws SQLException;
    List<Song> searchByArtistName(String artistName);
    List<Song> searchBySongName(List<Song> songList, String songName) throws SQLException

    List<Song> searchByGenre (String genre);
}
