/*
 * Author Name: Mridul
 * Date: 20-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package repository;

import model.Playlist;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import service.DatabaseService;

public class PlaylistRepository {
    public List<Playlist> searchPlaylistByName(String playlistName) {
        return null;
    }
    public List<Playlist> searchPlaylistById(String playlistId) {
        return null;
    }
    public List<Playlist> insertIntoThePlaylist(String playlistName, int songId) {
        List<Playlist> playlists= new ArrayList<>();
        try{
            Connection connection= DatabaseService.getConnection();
            String query= "insert into `jukebox`.`song_details` values(?,?); ";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, playlistName);
            preparedStatement.setInt(2, songId);
            int counter=preparedStatement.executeUpdate();
            if (counter>0){
                System.out.println("Playlist Inserted Successfully");
            }else {
                System.out.println("Playlist Inserted Failed");
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return playlists;
    }

    public List<Playlist> showAllPlaylist() {
        return null;
    }
}
