package repository;

import model.Song;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class SongRepositoryTest {
    SongRepository songRepository;
    List<Song> songList;

    @BeforeEach
    void setUp() {
        songRepository = new SongRepository();
        songList = songRepository.displayAllSong();
    }

    @AfterEach
    void tearDown() {
        songRepository = null;
    }

    @Test
    void displayAllNames() {
        List<Song> songList = songRepository.displayAllSong();
        Assertions.assertEquals(6, songList.size());
    }

    @Test
    void displayAllNamesFailure() {
        List<Song> songList = songRepository.displayAllSong();
        Assertions.assertNotEquals(4, songList.size());
    }
}