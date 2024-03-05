package net.oms.database;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseConfigTest {

    @Test
    void isConnected() {
        DatabaseConfig dbConfig = new DatabaseConfig();
        assertFalse(dbConfig.isConnected(), "Database should not be connected initially");

        dbConfig.connect();
        assertTrue(dbConfig.isConnected(), "Database should be connected after calling connect");

        dbConfig.disconnect();
        assertFalse(dbConfig.isConnected(), "Database should not be connected after calling disconnect");
    }

    @Test
    void connect() {
        DatabaseConfig dbConfig = new DatabaseConfig();
        dbConfig.connect();
        assertTrue(dbConfig.isConnected(), "Database should be connected after calling connect");
    }

    @Test
    void getConnection() {
        DatabaseConfig dbConfig = new DatabaseConfig();
        dbConfig.connect();
        assertNotNull(dbConfig.getConnection(), "Connection should not be null after calling connect");
    }

    @Test
    void disconnect() {
        DatabaseConfig dbConfig = new DatabaseConfig();
        dbConfig.connect();
        dbConfig.disconnect();
        assertFalse(dbConfig.isConnected(), "Database should not be connected after calling disconnect");
    }
}