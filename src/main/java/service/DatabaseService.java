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
    // the url of the database
    private static final String URL = "Jdbc:mysql://localhost:3306/jukebox";

    // the credentials of the user trying to log in to the database
    private static final String USERNAME = "root";
    private static final String PASSWORD = "rootpassword";

    // private field to store the reference of the connection object
    private Connection databaseConnection;


    // Create a connection object using the driverManager class

    /**
     * It creates a connection to the database using the URL, username, and password
     *
     * @return A connection to the database.
     */
    public Connection connect() {
        try {
            databaseConnection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return databaseConnection;
    }

    // check connection

    /**
     * If the databaseConnection is equal to the connect() function, then print "Connected to the database", otherwise
     * print "Not connected to the database"
     *
     * @return Boolean
     */
    public Boolean printConnectionStatus() {

        if (databaseConnection == connect()) {
            System.out.println("Connected to the database");
        } else {
            System.err.println(" connected to the database");
        }
        return databaseConnection != null;
    }
}