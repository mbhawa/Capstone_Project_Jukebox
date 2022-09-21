package repository;

import model.PlaylistModel;

import java.util.List;

public interface AudioPlayerRepositoryInterface {
    List<PlaylistModel> searchPlaylistByName(String playlistName);
    List<PlaylistModel> searchPlaylistById(String playlistId);
    List<PlaylistModel> insertIntoThePlaylist(String playlistName, int songId);
    List<PlaylistModel> showAllPlaylist();
}
