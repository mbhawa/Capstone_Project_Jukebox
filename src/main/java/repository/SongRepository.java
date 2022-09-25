/*
 * Author Name: Mridul
 * Date: 20-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package repository;

import model.Song;
import service.DatabaseService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SongRepository implements Repository {
    // Creating Database Service object for calling connect method
    DatabaseService databaseService = new DatabaseService();

    // display all the song from dataBase
    public List<Song> displayAllSong() {

        //creating object of genericList
        List<Song> songList = new ArrayList<>();
        Connection connection = databaseService.connect();
        String sqlQuery = "SELECT * FROM `jukebox`.`song_details`;";
        try {
            //PreparedStatement interface
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            ResultSet resultSet = preparedStatement.executeQuery();
            //using next method for control the loop
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String duration = resultSet.getString(3);
                String albumName = resultSet.getString(4);
                String artistName = resultSet.getString(5);
                String genre = resultSet.getString(6);
                String path = resultSet.getString(7);
                //we are adding the object of the song list
                songList.add(new Song(id, name, duration, albumName, artistName, genre, path));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return songList;
    }

    // search song by name
    public List<Song> songSearchBySongName(List<Song> songList, String name) {
        Connection connection = databaseService.connect();
        List<Song> songList1 = new ArrayList<>();
        for (Song song : songList) {
            if (song.getSongName().equalsIgnoreCase(name)) {
                songList1.add(song);
            }
        }
        return songList1;
    }

    //search song by albumName
    public List<Song> songSearchByAlbumName(List<Song> songList, String albumName) {
        Connection connection = databaseService.connect();
        List<Song> songList1 = new ArrayList<>();
        for (Song song : songList) {
            if (song.getSongName().equalsIgnoreCase(albumName)) {
                songList1.add(song);
            }
        }
        return songList1;
    }

    //search song by artist name
    public List<Song> songSearchByArtistName(List<Song> songList, String artistName) {
        Connection connection = databaseService.connect();
        List<Song> songList1 = new ArrayList<>();
        for (Song song : songList) {
            if (song.getArtistName().equals(artistName)) {
                songList1.add(song);
            }
        }
        return songList1;
    }

    //search song by genre
    public List<Song> songSearchByGenre(List<Song> songList, String genre) {
        Connection connection = databaseService.connect();
        List<Song> songList1 = new ArrayList<>();
        for (Song song : songList) {
            if (song.getGenre().equals(genre)) {
                songList1.add(song);
            }
        }
        return songList1;
    }

    public void displayFormat(List<Song> songList) {
        System.out.format("%-10s %-30s %-20s %-30s %-20s %-30s\n", "Id", "Name", "Duration", "AlbumName", "ArtistName", "Genre");
        for (Song song : songList) {
            System.out.format("%-10d %-30s %-20s %-30s %-20s %-30s\n", song.getSongId(), song.getSongName(), song.getDuration(), song.getAlbumName(), song.getArtistName(), song.getGenre());
        }
    }
}


