/*
 * Author Name: Mridul
 * Date: 20-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package repository;

import model.SongModel;

import java.util.List;

public class SongRepository implements SongRepositoryInterface{
    @Override
    public List<SongModel> displayAllSongs() {
        return null;
    }

    @Override
    public List<SongModel> searchBySongName(String songName) {
        return null;
    }

    @Override
    public List<SongModel> searchByArtistName(String artist) {
        return null;
    }

    @Override
    public List<SongModel> searchByGenre(String genre) {
        return null;
    }
}
