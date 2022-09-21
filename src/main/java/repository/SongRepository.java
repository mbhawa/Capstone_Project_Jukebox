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
    public List<Song> displayAllSongs(List<Song> songList, String name) throws SQLException {
        Connection connection=databaseService.getConnection();
        List<Song> songList1= new ArrayList<Song>();
        for(Song song : songList) {
            System.out.println(song.getSongName());
            if(song.getSongName().equalsIgnoreCase(name)){
                songList1.add(song);
            }
        }
        return songList1;
    }

    @Override
    public List<Song> searchBySongName(String songName) throws SQLException {
        return null;
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
