/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author robertrook
 */
public class ConnectionManagerMySQL implements ConnectionManager {
    
    @Override
    public Connection getConnection() {
        String url = getUrl();
        String drivername = getDrivername();
        String username = getUsername();
        String password = getPassword();
        Connection connection = null;
    
        try {
            Class.forName(drivername);
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
    
    
    
    @Override
    public String getUrl(){
        return "jdbc:mysql://localhost:3306/Workshop1";
    }
    
    @Override
    public String getDrivername(){
        return "com.mysql.jdbc.Driver";
    }
     
    @Override
    public String getUsername(){
        return "root"; 
    }
    
    @Override
    public String getPassword(){
        return "ultimatejazz";
    }
   
 
    
}
