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
    public static final String URL="jdbc:mysql://localhost:3306/jukebox";
    public static final String USERNAME="root";
    public static final String PASSWORD="rootpassword";
    private Connection connection;

    public DatabaseService(Connection connection) {
        this.connection = connection;
    }
    public void connect(Connection connection) throws SQLException {
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
