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
    //create fields for the class DatabaseService
    public static final String URL="jdbc:mysql://localhost:3306/jukebox";
    public static final String USERNAME="root";
    public static final String PASSWORD="rootpassword";
    private Connection connection;

    //create a constructor and initialise the connection as  null
    public DatabaseService(Connection connection) {
        this.connection = null;
    }

    //create a method to connect the database
    public void connect(Connection connection) throws SQLException {
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
