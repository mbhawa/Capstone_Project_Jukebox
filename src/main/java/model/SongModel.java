/*
 * Author Name: Mridul
 * Date: 20-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package model;

import java.sql.Time;
import java.util.Date;
import java.util.Objects;

public class SongModel {
    private int songId;
    private String songName;
    private String albumName;
    private Time duration;
    private String genre;
    private String songPath;

    public SongModel() {
    }

    public SongModel(int songId,
                     String songName,
                     String albumName,
                     Time duration,
                     String genre,
                     String songPath) {
        this.songId = songId;
        this.songName = songName;
        this.albumName = albumName;
        this.duration=duration;
        this.genre = genre;
        this.songPath = songPath;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SongModel songModel = (SongModel) o;
        return songId == songModel.songId && Objects.equals(songName, songModel.songName) && Objects.equals(albumName, songModel.albumName)&& Objects.equals(duration, songModel.duration) && Objects.equals(genre, songModel.genre) && Objects.equals(songPath, songModel.songPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(songId, songName, albumName,duration, genre, songPath);
    }

    @Override
    public String toString() {
        return "SongModel{" +
                "songId=" + songId +
                ", songName='" + songName + '\'' +
                ", albumName='" + albumName + '\'' +
                ", duration='" + duration + '\'' +
                ", genre='" + genre + '\'' +
                ", songPath='" + songPath + '\'' +
                '}';
    }
}
