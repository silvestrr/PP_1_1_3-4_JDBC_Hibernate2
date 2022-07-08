package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        String URL = "jdbc:mysql://localhost:3306/user";
        String LOGIN = "root";
        String PASSWORD = "root";
        return getConnection(URL,LOGIN,PASSWORD);
    }


    public static Connection getConnection(String URL, String LOGIN, String PASSWORD)  {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            System.out.println("Connection to Store DB succesfull!");

        } catch (SQLException e) {
            System.out.println("Connection failed...");
            e.printStackTrace();
        }
        return connection;
    }


}

