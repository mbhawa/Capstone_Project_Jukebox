package repository;

import model.SongModel;

import java.util.List;

public interface SongRepositoryInterface {
    List<SongModel> displayAllSongs();
    List<SongModel> searchBySongName(String songName);
    List<SongModel> searchByArtistName(String artistName);
    List<SongModel> searchByGenre(String genre);
    }
