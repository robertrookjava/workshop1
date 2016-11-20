/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.mavenproject1.database.dao;


import java.sql.*;
import java.util.*;

import com.mycompany.mavenproject1.model.*;
import com.mycompany.mavenproject1.database.*;

/**
 *
 * @author robertrook
 */
public class ArtikelDAO {

    private PreparedStatement preparedStatement;
    
    private Connection connection;
    
    
    public void create(Artikel artikel) throws SQLException  {
        
        
        connection = ConnectionManager.getConnection();
        // String query = "INSERT INTO Artikel (idArtikel, Naam, Prijs, Voorraad) VALUES(?, ?, ?, ?)";
        //String query = "INSERT INTO Artikel  VALUES (?, ?, ?, ?)";
        
        String query = "INSERT INTO ARTIKEL"
		+ "(IDARTIKEL, NAAM, PRIJS, VOORRAAD) VALUES"
		+ "(?,?,?,?)";
        
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, artikel.getIdArtikel());
        preparedStatement.setString(2, artikel.getNaam());
        preparedStatement.setBigDecimal(3, artikel.getPrijs());
        preparedStatement.setInt(4, artikel.getVoorraad());
        preparedStatement.executeUpdate();
        
        connection.close();
       
         
    }
    
    public void delete(Artikel artikel) throws SQLException  {
        
        // Load the JDBC MySQL Driver
        connection = ConnectionManager.getConnection();
        
      
           
        String query = "DELETE FROM Artikel WHERE idArtikel = ?";
        
       
        preparedStatement = connection.prepareStatement(query);
            
            
        preparedStatement.setInt(1, artikel.getIdArtikel());
        preparedStatement.executeUpdate();
        connection.close();
        
    }
    
    public Artikel readByIdArtikel (Artikel artikel) throws SQLException {
        
        Artikel gevondenArtikel = new Artikel();
        
        connection = ConnectionManager.getConnection();
        
        String query = "SELECT * FROM Artikel WHERE Artikel.idArtikel = ?";
        
        
            
        preparedStatement = connection.prepareStatement(query);
            
        preparedStatement.setInt(1, artikel.getIdArtikel());
            
        ResultSet result = preparedStatement.executeQuery();
            
        if (result.next()){
            gevondenArtikel.setIdArtikel(result.getInt("idArtikel"));
            gevondenArtikel.setNaam(result.getString("naam"));
            gevondenArtikel.setPrijs(result.getBigDecimal("prijs"));
            gevondenArtikel.setVoorraad(result.getInt("voorraad"));
        }
        
        
        connection.close();
        
        return gevondenArtikel;
        
    }
    
    public Set<Artikel> readAll() throws SQLException  {
        
        Set<Artikel> artikelen = new HashSet<>();
        
        connection = ConnectionManager.getConnection();
       
        String query = "SELECT * FROM Artikel";
        
       
        preparedStatement = connection.prepareStatement(query);
        
        ResultSet result = preparedStatement.executeQuery(query);
            
        while(result.next()){
            Artikel artikel = new Artikel();
            artikel.setIdArtikel(result.getInt("idArtikel"));
            artikel.setNaam(result.getString("naam"));
            artikel.setPrijs(result.getBigDecimal("prijs"));
            artikel.setVoorraad(result.getInt("voorraad"));
            artikelen.add(artikel);
            }
       
            connection.close();
  
        return artikelen;
    }
    
     public Set<Artikel> readByNaam(Artikel artikel) throws SQLException {
         
       
        Set<Artikel> artikelen = new HashSet<>();
        ;
        connection = ConnectionManager.getConnection();
        
        String query = "SELECT * FROM Artikel WHERE Artikel.Naam = ?";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, artikel.getNaam());
        ResultSet result = preparedStatement.executeQuery();
        
        while(result.next()){
            Artikel artikelGevonden = new Artikel();
            artikelGevonden.setIdArtikel(result.getInt("idArtikel"));
            artikelGevonden.setNaam(result.getString("naam"));
            artikelGevonden.setPrijs(result.getBigDecimal("prijs"));
            artikelGevonden.setVoorraad(result.getInt("voorraad"));
            artikelen.add(artikelGevonden);
          }
        
            connection.close();
      
        return artikelen;
            
            
        
        
    }
     
     
     public void update(Artikel artikel) throws SQLException  {
        
        connection = ConnectionManager.getConnection();
        

        String query = "UPDATE Artikel SET Artikel.naam = ?, "
                + " Artikel.prijs = ?, Artikel.voorraad = ? "
                + "WHERE Artikel.idArtikel = ?";
                       
       
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, artikel.getNaam());
        preparedStatement.setBigDecimal(2, artikel.getPrijs());
        preparedStatement.setInt(3, artikel.getVoorraad());
        preparedStatement.setInt(4, artikel.getIdArtikel());
        preparedStatement.executeUpdate();

        
        connection.close();
      
    }
    
    
}
