/*
 * Author Name: Mridul
 * Date: 24-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package repository;

import model.Playlist;
import model.Song;
import service.DatabaseService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlaylistRepository {

    DatabaseService databaseService = new DatabaseService();


    // for adding PlayList into dataBase
    public void createNewPlaylist(String playlistName) {
        Connection connection = databaseService.connect();
        String query = "Insert into playlist(playlist_name) values(?);";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, playlistName);
            int row = preparedStatement.executeUpdate();
            if (row == 1) {
                System.out.println("Playlist created Successfully");
            } else {
                System.out.println("Playlist not created");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Show play list
    public List<Playlist> showPlaylists() {
        String playlist = null;
        int count = 0;
        List<Playlist> playlistsList = new ArrayList<>();
        Connection getConnection = databaseService.connect();
        String query = "Select `playlist_id`,`playlist_name`,`song_id` from `jukebox`.`playlist`;";
        try {
            Statement statement = getConnection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                System.out.println(resultSet);;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return playlistsList;
    }

    //get song from playList
    public List<Song> getSongFromList(int playlistId, List<Song> songList) {
        List<Song> getSong = new ArrayList<>();
        Connection connection = databaseService.connect();
        String query = "Select * from playlist where playlist_id = " + playlistId;

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int playlistIdFromTable = resultSet.getInt(1);
                int songId = resultSet.getInt(2);
                for (Song song : songList) {
                    if (songId == song.getSongId()) {
                        getSong.add(song);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return getSong;
    }

    // inserting song into play list
    public void insertSongIntoPlayList(int playlistId, int songId) {
        Connection connection = databaseService.connect();
        String query = "Insert into playlist(playlist_id, song-id) values(?,?);";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, playlistId);
            preparedStatement.setInt(2, songId);
            int row = preparedStatement.executeUpdate();
            if (row == 1) {
                System.out.println("Song successful added into list");
            } else {
                System.out.println("Song not added please try again!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}