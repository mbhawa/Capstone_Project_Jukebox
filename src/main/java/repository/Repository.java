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

public interface Repository {
    List<Song> getAll(Connection connection) throws SQLException;

    Song searchByName(Connection connection, String name) throws SQLException;

    Song searchByArtist(Connection connection, String artistName) throws SQLException;

    Song searchByGenre(Connection connection, String genre) throws SQLException;

    Song searchByAlbumName(Connection connection, String albumName) throws SQLException;
}

