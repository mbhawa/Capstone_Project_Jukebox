/*
 * Author Name: Mridul
 * Date: 20-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package model;

public class PlaylistModel {
    private int playlistId;
    private String playlistName;

    public PlaylistModel() {
    }

    public PlaylistModel(int playlistId, String playlistName) {
        this.playlistId = playlistId;
        this.playlistName = playlistName;
    }

    public int getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(int playlistId) {
        this.playlistId = playlistId;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }
}
