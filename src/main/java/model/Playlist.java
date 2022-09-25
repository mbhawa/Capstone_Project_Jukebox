/*
 * Author Name: Mridul
 * Date: 20-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package model;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Playlist {
    //create the fields for the PlaylistModel class
    private int playlistId;
    private String playlistName;

    private Set<Song> song;

    //create a no args and a parameterised constructor
    public Playlist(int playlistId, String playlistName, List<Song> songs) {
        song = new TreeSet<>();
    }

    public Playlist(String playlistName, Set<Song> song) {
        this.playlistName = playlistName;
        this.song = song;
    }

    public Playlist(String playList, int count) {
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

    public Set<Song> getSong() {
        return song;
    }

    public void setSong(Set<Song> song) {
        this.song = song;
    }

    //override the equals and hashcode methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Playlist that = (Playlist) o;
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
