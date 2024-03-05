package net.oms.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {
    private Connection connection;
    private String host = "localhost";
    private String port = "5432";
    private String database = "oms";
    private String username = "postgres";
    private String password = "Azizaetl8.";


    public boolean isConnected() {
        return connection != null;
    }

    public void connect() {
        if(!isConnected()) {
            try {
                DriverManager.getConnection("jdbc:postgresql://" + host + ":" + port + "/" + database, username, password);
                System.out.println("Connected to postgres database");
            } catch (SQLException e) {
                System.out.println("Failed to connected to postgres database + " + e.getCause() + e.getMessage());
            }
        }
    }

    public Connection getConnection() {
        return this.connection;
    }

    public void disconnect() {
        if(isConnected()) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Failed to disconnect from postgres database + " + e.getCause() + e.getMessage());
            }
        }
    }
}
