/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.database.dao;

import com.mycompany.mavenproject1.database.ConnectionManager;
import com.mycompany.mavenproject1.model.Accounttype;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author robertrook
 */
public class AccounttypeDAO {
    
    
    private PreparedStatement preparedStatement;
    private Connection connection;
    
    public void create(Accounttype accounttype) throws SQLException  {
        
        
        connection = ConnectionManager.getConnection();
        // String query = "INSERT INTO Artikel (idArtikel, Naam, Prijs, Voorraad) VALUES(?, ?, ?, ?)";
        //String query = "INSERT INTO Artikel  VALUES (?, ?, ?, ?)";
        
        String query = "INSERT INTO ACCOUNTYPE"
		+ "(ID, TYPE) VALUES"
		+ "(?,?)";
        
        
        
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, accounttype.getId());
        preparedStatement.setString(2, accounttype.getType());
 
        preparedStatement.executeUpdate();
        
        connection.close();
       
         
    }
    
}
