package com.company;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLDatabaseConnection {
    // Connect to your database.
    // Replace server name, username, and password with your credentials
    public static void test() {
        String connectionUrl =
                "jdbc:mysql://mysql.agh.edu.pl:3306/maciejch:3306;"
                        + "database=maciejch;"
                        + "maciejch;"
                        + "password=osB50UQCh9NxBwEo;"
                        + "encrypt=true;"
                        + "trustServerCertificate=false;"
                        + "loginTimeout=30;";

        ResultSet resultSet;

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://mysql.agh.edu.pl:3306/maciejch", "maciejch", "osB50UQCh9NxBwEo");
             Statement statement = connection.createStatement()) {
            String selectSql = "SELECT word FROM words WHERE id = 482";
            resultSet = statement.executeQuery(selectSql);

            System.out.println(resultSet.getString(2));
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
