package repository;

import exceptions.EmptyPlaylistException;
import model.Playlist;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class PlaylistRepositoryTest {
    PlaylistRepository playlistRepository;

    @BeforeEach
    void setUp() {
        playlistRepository = new PlaylistRepository();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void showPlaylist() throws SQLException, EmptyPlaylistException {
        List<Playlist> playlists = playlistRepository.ShowPlayList();
        Assertions.assertEquals(1, playlists.size());
    }

    @Test
    void showPlaylistFailure() throws SQLException, EmptyPlaylistException {
        List<Playlist> playlists = playlistRepository.ShowPlayList();
        assertNotEquals(4, playlists.size());
    }
}