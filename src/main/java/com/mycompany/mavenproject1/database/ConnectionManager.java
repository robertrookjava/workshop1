/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.database;

import java.sql.*;

/**
 *
 * @author robertrook
 */
public class ConnectionManager {
    private static String url = "jdbc:mysql://localhost:3306/Workshop1";    
    private static String driverName = "com.mysql.jdbc.Driver";   
    private static String username = "root";   
    private static String password = "ultimatejazz";
    private static Connection connection;
  

    public static Connection getConnection() {
        try {
            Class.forName(driverName);
            try {
                connection = DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                // log an exception..
                // System.out.println("Failed to create the database connection.");
		System.out.println("Exception thrown  :" + ex); 
            }
        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            // System.out.println("Driver not found.");
	    System.out.println("Exception thrown  :" + ex); 
        }
        return connection;
    }
    
    
    
}
