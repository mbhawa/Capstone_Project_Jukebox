/*
 * Author Name: Mridul
 * Date: 20-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */

import model.Song;
import repository.SongRepository;
import service.DatabaseService;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("-----------------------------All Songs-------------------------------");
        System.out.println();
        //display all the songs
        SongRepository songRepository = null;
        List<Song> displayAllSongs = songRepository.displayAllSongs();
        int choice;
        do {
            System.out.println("\u001B[32m\u001B[1m WELCOME \u001B[32m\u001B[1m ");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("1. Display All songs");
            System.out.println("2. Search songs by name");
            System.out.println("3. Search songs by genre");
            System.out.println("4. Search songs by  artist name");
            System.out.println("5. Search songs by  album name");
            System.out.println("6. Exit");
            System.out.println("======================================================================");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your choice :- ");
            choice = scanner.nextInt();
            DatabaseService databaseService = new DatabaseService();
            databaseService.connect();
            databaseService.printConnectionStatus();
            songRepository = new SongRepository();
            Connection connection = DatabaseService.getConnection();
            switch (choice) {
                case 1:
                    System.out.println("View all songs");
                    songRepository.displayAllSongs().forEach(System.out::println);
                    break;
                case 2:
                    System.out.println("Search songs by name");
                    System.out.println("Enter the name of the song to search");
                    String song=scanner.next();
                    songRepository.searchBySongName(displayAllSongs,song).forEach(System.out::println);
                    break;
            }
        } while (choice != 6);
    }
}


