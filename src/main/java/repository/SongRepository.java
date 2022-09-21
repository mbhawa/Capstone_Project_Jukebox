/*
 * Author Name: Mridul
 * Date: 20-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package repository;

import com.mysql.cj.jdbc.JdbcConnection;
import model.Song;
import service.DatabaseService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
public class SongRepository implements Repository<Song> {
    DatabaseService databaseService;
    //create a method to display all the songs
    @Override
    public List<Song> displayAllSongs() throws SQLException {
        //create object of generic list
        List<Song> songList = new ArrayList<>();
        Connection connection = databaseService.getConnection();

        String query = "Select * from `jukebox`.`song_details`;";
        try {
            //prepared statement interface
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int songId = resultSet.getInt(1);
                String songName = resultSet.getString(2);
                String artistName = resultSet.getString(3);
                String albumName = resultSet.getString(4);
                Time duration = resultSet.getTime(5);
                String genre = resultSet.getString(6);
                String songPath = resultSet.getString(7);
                songList.add(new Song(songId, songName, artistName, albumName, duration, genre, songPath));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return songList;
    }

    @Override
    public List<Song> searchByAlbumName(List<Song> songList, String albumName) throws SQLException {
      Connection connection = databaseService.getConnection();
      List<Song> songList1=new ArrayList<Song>();
      for (Song song : songList) {
          if (song.getAlbumName().equalsIgnoreCase(albumName)){
              songList1.add(song);
          }
      }
      return songList1;
    }

    @Override
    public List<Song> searchBySongName(List<Song> songList, String songName) throws SQLException {
        Connection connection=databaseService.getConnection();
        List<Song> songList1= new ArrayList<Song>();
        for(Song song : songList) {
            System.out.println(song.getSongName());
            if(song.getSongName().equalsIgnoreCase(songName)){
                songList1.add(song);
            }
        }
        return songList1;
    }

    @Override
    public List<Song> searchByArtistName(String artistName) {
        return null;
    }

    @Override
    public List<Song> searchByGenre(String genre) {
        return null;
    }


}
