package com.example.growth_prediction.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtil {
    public static Connection getConnection() {
        try {
            String dbURL = "jdbc:mysql://localhost:3306/growth_prediction"; // localhost:3306 200.200.6.3
            String dbID = "root"; // root growthprediction
            String dbPW = "choibecode21!"; // choibecode21! 04tjdwkdxhd04
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(dbURL, dbID, dbPW);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
