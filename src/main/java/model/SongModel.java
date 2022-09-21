/*
 * Author Name: Mridul
 * Date: 20-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package model;

import java.sql.Time;
import java.util.Objects;

public class SongModel {
    //create the fields for the SongModel class
    private int songId;
    private String songName;
    private String artistName;
    private String albumName;
    private Time duration;
    private String genre;
    private String songPath;

    //create a no args and a parameterised constructor
    public SongModel() {
    }

    public SongModel(int songId, String songName, String artistName, String albumName, Time duration, String genre, String songPath) {
        this.songId = songId;
        this.songName = songName;
        this.artistName = artistName;
        this.albumName=albumName;
        this.duration = duration;
        this.genre = genre;
        this.songPath = songPath;
    }

    //create getter and setter methods for the fields
    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public Time getDuration() {
        return duration;
    }

    public void setDuration(Time duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSongPath() {
        return songPath;
    }

    public void setSongPath(String songPath) {
        this.songPath = songPath;
    }

    //override the equals and hashcode methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SongModel songModel = (SongModel) o;
        return songId == songModel.songId && Objects.equals(songName, songModel.songName) && Objects.equals(artistName, songModel.artistName) && Objects.equals(albumName, songModel.albumName) && Objects.equals(duration, songModel.duration) && Objects.equals(genre, songModel.genre) && Objects.equals(songPath, songModel.songPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(songId, songName, artistName, albumName, duration, genre, songPath);
    }

    //override the toString method
    @Override
    public String toString() {
        return "SongModel{" + "songId=" + songId + ", songName='" + songName + '\'' + "artistName='" + artistName+ '\''+ ", albumName='" + albumName + '\'' + ", duration='" + duration + '\'' + ", genre='" + genre + '\'' + ", songPath='" + songPath + '\'' + '}';
    }
}
