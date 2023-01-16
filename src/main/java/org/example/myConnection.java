package org.example;

import java.sql.DriverManager;
import java.sql.SQLException;

public class myConnection {
    String jdbcURL = "jdbc:postgresql://localhost:5432/Try";
    String userName = "postgres";
    String password = "tarop1324";
    public void getConnection() {
        try {
            java.sql.Connection connection = DriverManager.getConnection(jdbcURL, userName, password);
            System.out.println("There is connection");
            connection.close();

        } catch (
                SQLException e) {
            System.out.println("Error!!");
            throw new RuntimeException(e);
        }
    }
}

