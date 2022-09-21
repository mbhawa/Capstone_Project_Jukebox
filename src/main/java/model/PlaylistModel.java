/*
 * Author Name: Mridul
 * Date: 20-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package model;

import java.util.Objects;

public class PlaylistModel {
    //create the fields for the PlaylistModel class
    private int playlistId;
    private String playlistName;

    //create a no args and a parameterised constructor
    public PlaylistModel() {
    }

    public PlaylistModel(int playlistId, String playlistName) {
        this.playlistId = playlistId;
        this.playlistName = playlistName;
    }

    //create getter and setter methods for the fields
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

    //override the equals and hashcode methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlaylistModel that = (PlaylistModel) o;
        return playlistId == that.playlistId && Objects.equals(playlistName, that.playlistName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playlistId, playlistName);
    }

    //override the toString method
    @Override
    public String toString() {
        return "PlaylistModel{" + "playlistId=" + playlistId + ", playlistName='" + playlistName + '\'' + '}';
    }
}
