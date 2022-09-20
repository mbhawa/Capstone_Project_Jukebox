/*
 * Author Name: Mridul
 * Date: 20-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package model;

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
}
