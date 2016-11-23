/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.database.dao;

import com.mycompany.mavenproject1.database.ConnectionManager;
import com.mycompany.mavenproject1.model.Bestelling;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

/**
 *
 * @author robertrook
 */
public class BestellingDAO {
    private PreparedStatement preparedStatement;
    
    private Connection connection;
    
    
    public void create(Bestelling bestelling) throws SQLException  {
        
        
        connection = ConnectionManager.getConnection();
        // String query = "INSERT INTO Artikel (idArtikel, Naam, Prijs, Voorraad) VALUES(?, ?, ?, ?)";
        //String query = "INSERT INTO Artikel  VALUES (?, ?, ?, ?)";
        
        String query = "INSERT INTO BESTELLING"
		+ "(IDBESTELLING, IDKLANT, DATUM_BESTELLING, IDACCOUNT) VALUES"
		+ "(?,?,?,?)";
        
        
        
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, bestelling.getIdBestelling());
        preparedStatement.setInt(2, bestelling.getIdKlant());
        java.util.Date date = bestelling.getDatum_Bestelling();   
        preparedStatement.setDate(3, new java.sql.Date(date.getTime()));
        preparedStatement.setInt (4, bestelling.getIdAccount());
        
        preparedStatement.executeUpdate();
        
        connection.close();
       
         
    }
    
    public void delete(Bestelling bestelling) throws SQLException  {
        
        // Load the JDBC MySQL Driver
        connection = ConnectionManager.getConnection();

        String query = "DELETE FROM Bestelling WHERE idBestelling = ?";
        
       
        preparedStatement = connection.prepareStatement(query);
            
            
        preparedStatement.setInt(1, bestelling.getIdBestelling());
        preparedStatement.executeUpdate();
        connection.close();
        
    }
    
    public Bestelling readByIdBestelling (Bestelling bestelling) throws SQLException {
        
        Bestelling gevondenBestelling = new Bestelling();
        
        connection = ConnectionManager.getConnection();
        
        String query = "SELECT * FROM Bestelling WHERE idBestelling = ?";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, bestelling.getIdBestelling());
        ResultSet result = preparedStatement.executeQuery();
            
        if (result.next()){
            gevondenBestelling.setIdBestelling(result.getInt("idBestelling"));
            gevondenBestelling.setIdKlant(result.getInt("idKlant"));
            gevondenBestelling.setDatum_Bestelling(result.getDate("Datum_Bestelling"));
            gevondenBestelling.setIdAccount(result.getInt("idAccount"));
            
        }
     
        connection.close();
        
        return gevondenBestelling;
        
    }
    
    public Set<Bestelling> readAll() throws SQLException  {
        
        Set<Bestelling> bestellingen = new HashSet<>();
      
        
        connection = ConnectionManager.getConnection();
       
        String query = "SELECT * FROM Bestelling";
        preparedStatement = connection.prepareStatement(query);
        ResultSet result = preparedStatement.executeQuery(query);
            
        while(result.next()){
            Bestelling bestelling = new Bestelling();
            bestelling.setIdBestelling(result.getInt("idBestelling"));
            bestelling.setIdKlant(result.getInt("idKlant"));
            bestelling.setDatum_Bestelling(result.getDate("Datum_Bestelling"));
            bestelling.setIdAccount(result.getInt("idAccount"));
            
            bestellingen.add(bestelling);
            }
       
            connection.close();
  
        return bestellingen;
    }
    
     public Set<Bestelling> readByIdKlant(Bestelling bestelling) throws SQLException {
         
       
        Set<Bestelling> bestellingen = new HashSet<>();
       
        
        connection = ConnectionManager.getConnection();
        
        String query = "SELECT * FROM Bestelling WHERE idKlant = ?";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, bestelling.getIdKlant());
        ResultSet result = preparedStatement.executeQuery();
        
        while(result.next()){
            Bestelling bestellingGevonden = new Bestelling();
            bestellingGevonden.setIdBestelling(result.getInt("idBestelling"));
            bestellingGevonden.setIdKlant(result.getInt("idKlant"));
            bestellingGevonden.setDatum_Bestelling(result.getDate("Datum_Bestelling"));
            bestellingGevonden.setIdAccount(result.getInt("idAccount"));
            
            bestellingen.add(bestellingGevonden);
            
           
         }
        
            connection.close();
      
        return bestellingen;
            
            
        
        
    }
     
     
     public void update(Bestelling bestelling) throws SQLException  {
        
        connection = ConnectionManager.getConnection();
        
        
        
        String query = "UPDATE Bestelling SET idKlant = ?, "
                + "Datum_Bestelling = ?, idAccount = ? "
                + "WHERE Bestelling.idBestelling = ?";
                            
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, bestelling.getIdKlant());
        
        java.util.Date date = bestelling.getDatum_Bestelling();   
        preparedStatement.setDate(2, new java.sql.Date(date.getTime()));
        
        preparedStatement.setInt(3, bestelling.getIdAccount());
        preparedStatement.setInt(4, bestelling.getIdBestelling());
        preparedStatement.executeUpdate();
    
        connection.close();
      
    }
}
