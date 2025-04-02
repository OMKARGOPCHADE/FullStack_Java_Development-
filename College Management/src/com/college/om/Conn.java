package com.college.om;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conn {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    Conn()
    {
        try {
            String username = "root";
            String url = "jdbc:mysql://localhost:3306/collegeapp";
            String password = "sharvi@123";
            connection = DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        new Conn();
    }
}
