import model.Playlist;
import model.Song;
import repository.PlaylistRepository;
import repository.SongRepository;
import service.MusicPlayerService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //creating scanner object for take input from user
        Scanner scanner = new Scanner(System.in);
        // creating object of song repository class for call method
        SongRepository songRepository = new SongRepository();
        // creating object of playlist repository class for call method
        PlaylistRepository playlistRepository = new PlaylistRepository();
        //creating object os song service class for call method
        MusicPlayerService musicPlayerService = new MusicPlayerService();
        //  System.out.println("-----------------All song------------------");
        // System.out.println();
        //display method return value store this object
        List<Song> displayAllSongs = songRepository.displayAllSong();
        displayFormat(displayAllSongs);
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();
        int task = 0;
        do {
            System.out.println("Press 1 to search in list");
            System.out.println("Press 2 to Play a Song");
            System.out.println("Press 3 to create play list");
            System.out.println("Press 4 to insert song into play List");
            System.out.println("Press 5 to view play lists");
            System.out.println("Press 6 to Exit");
            task = scanner.nextInt();
            System.out.println();
            System.out.println("--------------------------------------------------------------------------");
            System.out.println();
            switch (task) {
                case 1:
                    System.out.println("Press 1 to Search song details-by Genre");
                    System.out.println("Press 2 to Search song detail-by Album");
                    System.out.println("Press 3 to Search song detail by-Artist Name");
                    System.out.println("Press 4 to Search song detail by-Song Name");
                    int choice = scanner.nextInt();
                    System.out.println("------------------------------------------------------------------------");
                    if (choice == 1) {
                        System.out.println("Enter Genre name ::");
                        String genre = scanner.next();
                        List<Song> getGenre = null;
                        try {
                            getGenre = songRepository.songSearchByGenre(displayAllSongs, genre);
                            displayFormat(getGenre);
                            System.out.println("If you want to play song then press (Y/N)");
                            String option = scanner.next();
                            if (option.equals("Y")) {
                                System.out.println("please enter the song id which you want play");
                                int id = scanner.nextInt();
                                musicPlayerService.playParticular(id);
                                System.out.println();
                            } else {
                                break;
                            }
                        }/*catch (GenreNotFoundException e) {
                            e.printStackTrace();
                        }*/ catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else if (choice == 2) {
                        System.out.println("Enter Album name ::");
                        String album = scanner.next();
                        List<Song> getAlbum = null;
                        try {
                            getAlbum = songRepository.songSearchByAlbumName(displayAllSongs, album);
                            displayFormat(getAlbum);
                            System.out.println("If you want to play song then press (Y/N)");
                            String option = scanner.next();
                            if (option.equals("Y")) {
                                System.out.println("please enter the song id which you want play");
                                int id = scanner.nextInt();
                                musicPlayerService.playParticular(id);
                                System.out.println();
                            } else {
                                break;
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else if (choice == 3) {
                        System.out.println("Enter Artist Name ::");
                        scanner.nextLine();
                        String artistName = scanner.next();
                        List<Song> getArtist = null;
                        try {
                            getArtist = songRepository.songSearchByArtistName(displayAllSongs, artistName);
                            displayFormat(getArtist);
                            System.out.println("If you want to play song then press (Y/N)");
                            String option = scanner.next();
                            if (option.equals("Y")) {
                                System.out.println("please enter the song id which you want play");
                                int id = scanner.nextInt();
                                musicPlayerService.playParticular(id);
                                System.out.println();
                            } else {
                                break;
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else if (choice == 4) {
                        System.out.println("Enter Song Name ::");
                        scanner.nextLine();
                        String songName = scanner.nextLine();
                        List<Song> getSong = null;
                        try {
                            getSong = songRepository.songSearchBySongName(displayAllSongs, songName);
                            displayFormat(getSong);
                            System.out.println("If you want to play song then press (Y/N)");
                            String option = scanner.next();
                            if (option.equals("Y")) {
                                System.out.println("please enter the song id which you want play");
                                int id = scanner.nextInt();
                                musicPlayerService.playParticular(id);
                                System.out.println();
                            } else {
                                break;
                            }
                        } /*catch (SongNotFoundException e) {
                            e.printStackTrace();
                        }*/ catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                case 2:
                    displayFormat(displayAllSongs);
                    System.out.println("Please enter song id which you want to play");
                    int choice2 = scanner.nextInt();
                    System.out.println("---------------------------------------------------------------------");
                    musicPlayerService.playParticular(choice2);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("-----------------Press 3 to create play list----------------------------");
                    System.out.println("Enter play list name::");
                    String playListName = scanner.next();
                    //scanner.nextLine();
                    playlistRepository.createNewPlaylist(playListName);
                    System.out.println();
                    System.out.println("Enter play list name::");
                    break;
                case 4:
                    System.out.println("------------------insert song into play List------------------------------");
                    List<Playlist> getPlayListName1 = playlistRepository.showPlaylists();
                    for (Playlist playList : getPlayListName1) {
                        System.out.println(playList.getPlaylistId() + " " + playList.getPlaylistName());
                    }
                    System.out.println("Enter Play list number for choose playList which you want add song::");
                    int playListId = scanner.nextInt();
                    displayFormat(displayAllSongs);
                    System.out.println("Enter Song id which song you want to add into play list::");
                    int songId = scanner.nextInt();
                    playlistRepository.insertSongIntoPlayList(playListId, songId);
                    break;
                case 5:
                    System.out.println("-------------------view to play list--------------------------------------");
                    List<Playlist> getPlayListName = playlistRepository.showPlaylists();
                    for (Playlist playList : getPlayListName) {
                        System.out.println(playList.getPlaylistId() + " " + playList.getPlaylistName());
                    }
                    System.out.println("Press 1 for view song from the play list");
                    System.out.println("Press 2 for Exit");

                    int choice3 = scanner.nextInt();
                    if (choice3 == 1) {
                        System.out.println("Please enter the play list id which you view the song");
                        int playListIds = scanner.nextInt();
                        List<Song> getSongFromList = playlistRepository.getSongFromList(playListIds, displayAllSongs);
                        displayFormat(getSongFromList);
                    }
                    System.out.println("If you want to play song then press (Y/N)");
                    String option = scanner.next();
                    if (option.equals("Y")) {
                        System.out.println("please enter the song id which you want play");
                        int songIds = scanner.nextInt();
                        musicPlayerService.playParticular(songIds);
                    } else {
                        break;
                    }
                case 6:
                    System.out.println("Successful Exit");
                    System.out.println("--------------------------------------------------------------------------");
                default:
                    System.out.println("Enter a valid option");
            }
        } while (task < 6);
    }

    private static void displayFormat(List<Song> songList) {
        System.out.format("%-10s %-30s %-20s %-30s %-20s %-30s\n", "Id", "Name", "Duration", "AlbumName", "ArtistName", "Genre");
        for (Song song : songList) {
            System.out.format("%-10d %-30s %-20s %-30s %-20s %-30s\n", song.getSongId(), song.getSongName(), song.getDuration(), song.getAlbumName(), song.getArtistName(), song.getGenre());
        }
    }
}