package tasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlDatabaseExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "toor";

        String dbName = "TESTDBsa";
        String tableName = "testtable";

        Connection connection = null;
        Statement statement = null;

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            connection = DriverManager.getConnection(url, user, password);

            // Create statement object
            statement = connection.createStatement();

            // Create database if it doesn't exist
            String createDatabaseSQL = "CREATE DATABASE IF NOT EXISTS " + dbName;
            statement.executeUpdate(createDatabaseSQL);
            System.out.println("Database created successfully or already exists.");

            // Connect to the new database
            connection.setCatalog(dbName);
            statement.close();
            connection.close();
            connection = DriverManager.getConnection(url+dbName,user,password);
            statement = connection.createStatement();
            
            // Create table if it doesn't exist
            String createTableSQL = "CREATE TABLE IF NOT EXISTS Human (" +
                    "id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, " +
                    "first_name VARCHAR(50), " +
                    "last_name VARCHAR(50), " +
                    "age INT, " +
                    "gender VARCHAR(20)"+
                    ")";
            statement.executeUpdate(createTableSQL);
            System.out.println("Table created successfully or already exists.");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
