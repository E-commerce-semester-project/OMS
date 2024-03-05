package net.oms;

import net.oms.database.DatabaseConfig;

public class Main {
    public static DatabaseConfig db = new DatabaseConfig();

    public static void main(String[] args) {
        db.connect();
    }
}