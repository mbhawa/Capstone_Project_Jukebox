/*
 * Author Name: Mridul
 * Date: 20-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package repository;

import com.mysql.cj.jdbc.JdbcConnection;
import model.Song;
import service.DatabaseService;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class SongRepository {
    public List<Song> displayAllSongs() {
        List<Song> songsList= new ArrayList<>();

        try {
            DatabaseService dbService= new DatabaseService();
            Connection connection=dbService.getConnection();
            String query= "Select * from `jukebox`.`song_details`;";
            Statement statement=connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public List<Song> searchBySongName(String songName) {
        return null;
    }
    public List<Song> searchByArtistName(String artistName) {
        return null;
    }
    public List<Song> searchByGenre(String genre) {
        return null;
    }
}
