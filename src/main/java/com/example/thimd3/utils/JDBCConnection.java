package com.example.thimd3.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    private static final String jdbcURL="jdbc:mysql://localhost:3306/thimd3";
    private static final String jdbcUser = "root";
    private static final String jdbcPass = "123456@Abc";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPass);
            System.out.println("Database connected successfully");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Database connection failed: " + e.getMessage());
        }
        return connection;
    }
}
