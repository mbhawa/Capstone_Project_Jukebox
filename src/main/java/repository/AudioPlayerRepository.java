/*
 * Author Name: Mridul
 * Date: 20-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package repository;

import model.PlaylistModel;

import java.util.List;

public class AudioPlayerRepository implements AudioPlayerRepositoryInterface{
    @Override
    public List<PlaylistModel> searchPlaylistByName(String playlistName) {
        return null;
    }

    @Override
    public List<PlaylistModel> searchPlaylistById(String playlistId) {
        return null;
    }

    @Override
    public List<PlaylistModel> insertIntoThePlaylist(String playlistName, int songId) {
        return null;
    }

    @Override
    public List<PlaylistModel> showAllPlaylist() {
        return null;
    }
}
