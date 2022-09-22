/*
 * Author Name: Mridul
 * Date: 20-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package repository;

import model.Song;
import service.DatabaseService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SongRepository implements Repository<Song> {
    DatabaseService databaseService;

    //create a method to display all the songs
    @Override
    public List<Song> displayAllSongs() throws SQLException, NullPointerException {
        //create object of generic list
        List<Song> songList = new ArrayList<>();
        Connection connection;
        connection = DatabaseService.getConnection();

        String query = "Select * from `jukebox`.`song_details`;";
        try {
            //prepared statement interface
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("SONG_ID---SONG_NAME-------------------------------ARTIST_NAME---------GENRE---------------DURATION------------PATH_LOCATION-----------------------------------");
                System.out.println("==============================================================================================================================================================");
                while (resultSet.next()) {
                    System.out.format("%-10d%-40s%-20s%-20s%-20s%-20s", resultSet.getInt(1), resultSet.getString("SONG_NAME"),
                            resultSet.getString("ARTIST_NAME"),
                            resultSet.getString("GENRE"),
                            resultSet.getString("DURATION"),
                            resultSet.getString("PATH_LOCATION"));
                    System.out.println();
                }
            }
        } catch (SQLException e) {
            e.getMessage();
            e.printStackTrace();
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }
        return songList;
    }

    @Override
    public List<Song> searchByAlbumName( String albumName) throws SQLException {
        List<Song> songLists = new ArrayList<>();
        Connection connection = databaseService.getConnection();
        Statement statement = connection.createStatement();
        String sql = "SELECT * FROM SONG_LIST where ALBUM_NAME=? ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, albumName);
        ResultSet resultSet = preparedStatement.executeQuery();
        System.out.println("SONG_ID---SONG_NAME-------------------------------ARTIST_NAME---------GENRE---------------DURATION------------PATH_LOCATION-----------------------------------");
        System.out.println("==============================================================================================================================================================");
        while (resultSet.next()) {
            System.out.format("%-10d%-40s%-20s%-20s%-20s%-20s", resultSet.getInt(1), resultSet.getString("SONG_NAME"),
                    resultSet.getString("ARTIST_NAME"),
                    resultSet.getString("GENRE"),
                    resultSet.getString("DURATION"),
                    resultSet.getString("PATH_LOCATION"));
            System.out.println();
        }
        return songLists;
    }

    @Override
    public List<Song> searchBySongName(String songName) throws SQLException {
        List<Song> songLists = new ArrayList<>();
        Connection connection = databaseService.getConnection();
        Statement statement = connection.createStatement();
        String sql = "SELECT * FROM SONG_LIST where SONG_NAME=? ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, songName);
        ResultSet resultSet = preparedStatement.executeQuery();
        System.out.println("SONG_ID---SONG_NAME-------------------------------ARTIST_NAME---------GENRE---------------DURATION------------PATH_LOCATION-----------------------------------");
        System.out.println("==============================================================================================================================================================");
        while (resultSet.next()) {
            System.out.format("%-10d%-40s%-20s%-20s%-20s%-20s", resultSet.getInt(1), resultSet.getString("SONG_NAME"),
                    resultSet.getString("ARTIST_NAME"),
                    resultSet.getString("GENRE"),
                    resultSet.getString("DURATION"),
                    resultSet.getString("PATH_LOCATION"));
            System.out.println();
        }
        return songLists;
    }

    @Override
    public List<Song> searchByArtistName(String artistName) {
        List<Song> songLists = new ArrayList<>();
        try {
            Connection connection = databaseService.getConnection();
            String sql = "SELECT * FROM SONG_LIST WHERE ARTIST_NAME LIKE '%" + artistName + "%'";
            Statement statement =connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            System.out.println("SONG_ID---SONG_NAME-------------------------------ARTIST_NAME---------GENRE---------------DURATION------------PATH_LOCATION-----------------------------------");
            System.out.println("==============================================================================================================================================================");
            while (resultSet.next()) {
                System.out.format("%-10d%-40s%-20s%-20s%-20s%-20s", resultSet.getInt(1), resultSet.getString("SONG_NAME"),
                        resultSet.getString("ARTIST_NAME"),
                        resultSet.getString("GENRE"),
                        resultSet.getString("DURATION"),
                        resultSet.getString("PATH_LOCATION"));
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return songLists;

    }

    @Override
    public List<Song> searchByGenre( String genre) {
        List<Song> songLists = new ArrayList<>();
        try {
            Connection connection = databaseService.getConnection();
            //Statement statement = connection.createStatement();
            String sql ="SELECT * FROM SONG_LIST WHERE GENRE=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,genre);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("SONG_ID---SONG_NAME-------------------------------ARTIST_NAME---------GENRE---------------DURATION------------PATH_LOCATION-----------------------------------");
            System.out.println("==============================================================================================================================================================");
            while (resultSet.next()){
                System.out.format("%-10d%-40s%-20s%-20s%-20s%-20s",resultSet.getInt(1),resultSet.getString("SONG_NAME"),
                        resultSet.getString("ARTIST_NAME"),
                        resultSet.getString("GENRE"),
                        resultSet.getString("DURATION"),
                        resultSet.getString("PATH_LOCATION"));
                System.out.println();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return songLists;
    }


}
