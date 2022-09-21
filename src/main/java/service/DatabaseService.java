/*
 * Author Name: Mridul
 * Date: 20-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseService {
    //create fields for URL, USERNAME and PASSWORD
    private static final String URL="jdbc:mysql://localhost:3306/jukebox";
    private static final String USERNAME="root";
    private static final String PASSWORD="rootpassword";
    private static Connection connection;

    //create constructor for the connection
    public DatabaseService() {
        this.connection = null;
    }
    //create getter method for the field
    public static Connection getConnection() {
        return connection;
    }

    //create a method for connecting the database
    public boolean connect() {
        try {
            this.connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            printConnectionStatus();
            return true;
        } catch (SQLException exception) {
            System.err.println("Could not connect to the database!!");
            exception.printStackTrace();
            printConnectionStatus();
            return false;
        }
    }

    // create a method for printing the connection method
    public void printConnectionStatus() {
        if (connection != null) {
            System.out.println(" \u001B[32m CONNECTION : ACTIVE \u001B[32m");
        } else {
            System.err.println("CONNECTION : INACTIVE");
        }
    }
}