package com.kodilla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public enum DbManager {

    INSTANCE;

    private Connection conn;

    DbManager() {
        Properties connectionProps = new Properties();
        connectionProps.put("user", "root");
        connectionProps.put("password", "01060106");
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/kodilla_project"+
                    "?serverTimezone=Europe/Warsaw"+
                    "&useSSL=False", connectionProps);

        } catch (SQLException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static DbManager getInstance(){
        return INSTANCE;
    }

    public Connection getConnection(){
        return conn;
    }
}
