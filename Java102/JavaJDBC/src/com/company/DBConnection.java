package com.company;

import java.sql.*;

public class DBConnection {
    public static final String DB_URL =  "jdbc:postgresql://localhost/test";
    public static final String DB_USER =  "postgres";
    public static final String DB_PASSWORD = "12345";

    //keys : Connection
    //DriverManager  getConnection(url)
    //S
    public static void main(String[] args) {
        Connection connect = null;
        //query
        Statement statement = null;

        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            statement = connect.createStatement();
            ResultSet result = statement.executeQuery("Select * from employee");

            while (result.next()) {
                //result.getDATA_TYPE("TABLE_NAME)
                System.out.println("ID " + result.getInt("id"));
                System.out.println("NAME " + result.getString("name"));
                System.out.println("----------------");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
