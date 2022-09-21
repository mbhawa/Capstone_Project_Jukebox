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
    //create a method to connect the database
    public void connect(){
        Connection connection=null;
        try{
            String url="jdbc:mysql://localhost:3306/jukebox";
            String username="root";
            String password="rootpassword";
            connection= DriverManager.getConnection(url,username,password);
        } catch (SQLException exception) {
            exception.getMessage();
            exception.printStackTrace();
        }
    }
}
