package com.example.digitalelection;

import java.sql.*;

public class DataBaseConnection {
    private static final String url = "jdbc:mysql://localhost:3306/digitalelection";
    private static final String user = "root";
    private static final String password = "@Dharsh2806";

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(url,user,password);
    }

}

