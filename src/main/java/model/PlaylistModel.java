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
}
