package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Connection connection = null;
        String url = "jdbc:postgresql://localhost/test?user=postgres&password=12345";
        try {
            connection = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());

        }
    }
}
