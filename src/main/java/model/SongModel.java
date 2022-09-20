/*
 * Author Name: Mridul
 * Date: 20-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package model;

import java.util.Objects;

public class SongModel {
    private int songId;
    private String songName;
    private String albumName;
    private String genre;
    private String songPath;

    public SongModel() {
    }

    public SongModel(int songId,
                     String songName,
                     String albumName,
                     String genre,
                     String songPath) {
        this.songId = songId;
        this.songName = songName;
        this.albumName = albumName;
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
        return songId == songModel.songId && Objects.equals(songName, songModel.songName) && Objects.equals(albumName, songModel.albumName) && Objects.equals(genre, songModel.genre) && Objects.equals(songPath, songModel.songPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(songId, songName, albumName, genre, songPath);
    }

    @Override
    public String toString() {
        return "SongModel{" +
                "songId=" + songId +
                ", songName='" + songName + '\'' +
                ", albumName='" + albumName + '\'' +
                ", genre='" + genre + '\'' +
                ", songPath='" + songPath + '\'' +
                '}';
    }
}
