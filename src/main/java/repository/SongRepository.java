/*
 * Author Name: Mridul
 * Date: 20-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package repository;

import model.Song;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SongRepository implements Repository {
    public List<Song> getAll(Connection connection) throws SQLException {

        String readQuery = "SELECT * FROM `jukebox`.`song_details`;";

        List<Song> songList = new ArrayList<>();

        try (Statement statement = connection.createStatement()) {

            ResultSet songResultSet = statement.executeQuery(readQuery);

            while (songResultSet.next()) {
                int songId = songResultSet.getInt("id");
                String songName = songResultSet.getString("name");
                String artistName = songResultSet.getString("artistName");
                String albumName = songResultSet.getString("albumName");
                Time duration = songResultSet.getTime("duration");
                String genre = songResultSet.getString("genre");
                String url = songResultSet.getString("url");

                Song song = new Song(songId, songName, artistName, albumName, duration, genre, url);

                songList.add(song);
            }
        }
        return songList;
    }

    public Song searchByName(Connection connection, String name) throws SQLException {

        String searchQueryByName = "SELECT * FROM `jukebox`.`song_details` WHERE(`song_name` = ?);";

        Song song = null;
        try (PreparedStatement preparedStatement = connection.prepareStatement(searchQueryByName)) {

            preparedStatement.setString(1, name);
            ResultSet songResultSet = preparedStatement.executeQuery();

            while (songResultSet.next()) {

                int songId = songResultSet.getInt("id");
                String songName = songResultSet.getString("name");
                String artistName = songResultSet.getString("artistName");
                String albumName = songResultSet.getString("albumName");
                Time duration = songResultSet.getTime("duration");
                String genre = songResultSet.getString("genre");
                String url = songResultSet.getString("url");

                song = new Song(songId, songName, artistName, albumName, duration, genre, url);
            }
        }
        return song;
    }

    public Song searchByArtist(Connection connection, String artistName) throws SQLException {

        String searchQueryByName = "SELECT * FROM `jukebox`.`song_details` WHERE(`artist_name` = ?);";

        Song song = null;

        try (PreparedStatement preparedStatement = connection.prepareStatement(searchQueryByName)) {

            preparedStatement.setString(1, artistName);
            ResultSet songResultSet = preparedStatement.executeQuery();

            while (songResultSet.next()) {

                int songId = songResultSet.getInt("id");
                String songName = songResultSet.getString("name");
                artistName = songResultSet.getString("artistName");
                String albumName = songResultSet.getString("albumName");
                Time duration = songResultSet.getTime("duration");
                String genre = songResultSet.getString("genre");
                String url = songResultSet.getString("url");

                song = new Song(songId, songName, artistName, albumName, duration, genre, url);

            }
        }

        return song;
    }

    public Song searchByGenre(Connection connection, String genre) throws SQLException {

        String searchQueryByName = "SELECT * FROM `jukebox`.`song` WHERE(`artist_name` = ?);";

        Song song = null;

        try (PreparedStatement preparedStatement = connection.prepareStatement(searchQueryByName)) {

            preparedStatement.setString(1, genre);
            ResultSet songResultSet = preparedStatement.executeQuery();

            while (songResultSet.next()) {

                int songId = songResultSet.getInt("id");
                String songName = songResultSet.getString("name");
                String artistName = songResultSet.getString("artistName");
                String albumName = songResultSet.getString("albumName");
                genre = songResultSet.getString("genre");
                Time duration = songResultSet.getTime("duration");
                String url = songResultSet.getString("url");

                song = new Song(songId, songName, artistName, albumName, duration, genre, url);

            }
        }

        return song;
    }

    @Override
    public Song searchByAlbumName(Connection connection, String albumName) throws SQLException {

        String searchQueryByName = "SELECT * FROM `jukebox`.`song` WHERE(`album_name` = ?);";

        Song song = null;

        try (PreparedStatement preparedStatement = connection.prepareStatement(searchQueryByName)) {

            preparedStatement.setString(1, albumName);
            ResultSet songResultSet = preparedStatement.executeQuery();

            while (songResultSet.next()) {

                int songId = songResultSet.getInt("id");
                String songName = songResultSet.getString("name");
                String artistName = songResultSet.getString("artistName");
                albumName = songResultSet.getString("albumName");
                String genre = songResultSet.getString("genre");
                Time duration = songResultSet.getTime("duration");
                String url = songResultSet.getString("url");

                song = new Song(songId, songName, artistName, albumName, duration, genre, url);

            }
        }

        return song;
    }
}


