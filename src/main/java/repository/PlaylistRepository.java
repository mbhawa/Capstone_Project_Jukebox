/*
 * Author Name: Mridul
 * Date: 20-09-2022
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
    /*
     * given play list add into database
     * add song into playlist table

     * show all playList from dataBase
     * get all song from play List
     */
    DatabaseService databaseService = new DatabaseService();

    // for adding PlayList into dataBase
    public void addIntoDatabase(String playListName) {
        Connection getConnection = DatabaseService.getConnection();
        String query = "Insert into playList values(?);";
        try {
            PreparedStatement ps = getConnection.prepareStatement(query);
            ps.setString(1, playListName);
            int row = ps.executeUpdate();
            if (row == 1) {
                System.out.println("Play List successful created");
            } else {
                System.out.println("Play List not created");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // show play list
    public List<Playlist> showPlayList() {
        String playList = null;
        int count = 0;
        List<Playlist> playlistName = new ArrayList<>();
        Connection getConnection = DatabaseService.getConnection();
        String query = "Select * from `jukebox`.`playList`;";
        try {
            Statement statement = getConnection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                playList = resultSet.getString(1);
                count++;
                playlistName.add(new Playlist(playList, count));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return playlistName;
    }

    //get song from playList
    public List<Song> getSongFromList(int playListId, List<Song> songList) {
        List<Song> getSong = new ArrayList<>();
        DatabaseService connection = new DatabaseService();
        Connection getConnection = DatabaseService.getConnection();
        String query = "Select * from playList1 where playListId = " + playListId;

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
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return getSong;
    }

    // inserting song into play list
    public void insertSongIntoPlayList(int playListId, int songId) {
        DatabaseService connection = new DatabaseService();
        Connection getConnection = DatabaseService.getConnection();
        String query = "Insert into playList1 values(?,?);";
        try {
            PreparedStatement preparedStatement = getConnection.prepareStatement(query);
            preparedStatement.setInt(1, playListId);
            preparedStatement.setInt(2, songId);
            int row = preparedStatement.executeUpdate();
            if (row > 0) {
                System.out.println("Song successful added into list");
            } else {
                System.out.println("Song not added please try again!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}