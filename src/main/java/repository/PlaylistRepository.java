/*
 * Author Name: Mridul
 * Date: 24-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package repository;

import exceptions.EmptyPlaylistException;
import model.Playlist;
import model.Song;
import service.DatabaseService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlaylistRepository {

    DatabaseService databaseService = new DatabaseService();


    // for adding PlayList into dataBase
    public void addIntoDatabase(String playListName) {
        Connection getConnection = databaseService.connect();
        String query = "Insert into playList values(?);";
        try {
            PreparedStatement preparedStatement = getConnection.prepareStatement(query);
            preparedStatement.setString(1, playListName);
            int row = preparedStatement.executeUpdate();
            if (row == 1) {
                System.out.println("Play List successful created");
            } else {
                System.out.println("Play List not created");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Show play list
    public List<Playlist> ShowPlayList() throws SQLException {
        String playList = null;
        int count = 0;
        List<Playlist> playListsName = new ArrayList<>();
        Connection getConnection = databaseService.connect();
        String query = "Select * from playlist;";
        Statement statement = getConnection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            playList = resultSet.getString(1);
            count++;
            playListsName.add(new Playlist(playList, count));
        }
        return playListsName;
    }

    //get song from playList
    public List<Song> getSongFromList(int playListId, List<Song> songList) {
        List<Song> getSong = new ArrayList<>();
        Connection getConnection = databaseService.connect();
        String query = "Select * from playlist1 where playListId = " + playListId;

        try {
            PreparedStatement preparedStatement = getConnection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int playListIdFromTable = resultSet.getInt(1);
                int songId = resultSet.getInt(2);
                for (Song song : songList) {
                    if (songId == song.getSongId()) {
                        getSong.add(song);
                    }
                }
            }
            if (getSong == null) {
                throw new EmptyPlaylistException("The following playlist is empty");
            }
        } catch (SQLException | EmptyPlaylistException e) {
            e.printStackTrace();
        }
        return getSong;
    }

    // inserting song into play list
    public void insertSongIntoPlayList(int playListId, int songId) {
        Connection getConnection = databaseService.connect();
        String query = "Insert into playList1 values(?,?);";
        try {
            PreparedStatement preparedStatement = getConnection.prepareStatement(query);
            preparedStatement.setInt(1, playListId);
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