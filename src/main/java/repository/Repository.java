/*
 * Author Name: Mridul
 * Date: 21-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package repository;

import model.Song;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface Repository<T>{
    List<Song> displayAllSongs() throws SQLException, NullPointerException;
    List<Song> searchByAlbumName(String albumName) throws SQLException;
    List<Song> searchBySongName(String songName) throws SQLException;
    List<Song> searchByArtistName(String artistName);

    List<Song> searchByGenre(String genre);
}
