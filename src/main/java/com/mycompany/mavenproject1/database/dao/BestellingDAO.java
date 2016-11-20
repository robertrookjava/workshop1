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

/**
 *
 * @author robertrook
 */
public class BestellingDAO {
    private PreparedStatement preparedStatement;
    
    private Connection connection;
    
    
    public void create(Klant klant) throws SQLException  {
        
        
        connection = ConnectionManager.getConnection();
        // String query = "INSERT INTO Artikel (idArtikel, Naam, Prijs, Voorraad) VALUES(?, ?, ?, ?)";
        //String query = "INSERT INTO Artikel  VALUES (?, ?, ?, ?)";
        
        String query = "INSERT INTO KLANT"
		+ "(IDKLANT, VOORNAAM, ACHTERNAAM, TUSSENVOEGSEL, TELEFOONNUMMER, EMAILADRES) VALUES"
		+ "(?,?,?,?,?,?)";
        
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, klant.getIdKlant());
        preparedStatement.setString(2, klant.getVoornaam());
        preparedStatement.setString(3, klant.getAchternaam());
        preparedStatement.setString (4, klant.getTussenvoegsel());
        preparedStatement.setString (5, klant.getTelefoonnummer());
        preparedStatement.setString (6, klant.getEmailadres());
        
        preparedStatement.executeUpdate();
        
        connection.close();
       
         
    }
    
    public void delete(Klant klant) throws SQLException  {
        
        // Load the JDBC MySQL Driver
        connection = ConnectionManager.getConnection();

        String query = "DELETE FROM Klant WHERE idKlant = ?";
        
       
        preparedStatement = connection.prepareStatement(query);
            
            
        preparedStatement.setInt(1, klant.getIdKlant());
        preparedStatement.executeUpdate();
        connection.close();
        
    }
    
    public Klant readByIdKLant (Klant klant) throws SQLException {
        
        Klant gevondenKlant = new Klant();
        
        connection = ConnectionManager.getConnection();
        
        String query = "SELECT * FROM Klant WHERE Klant.idKlant = ?";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, klant.getIdKlant());
        ResultSet result = preparedStatement.executeQuery();
            
        if (result.next()){
            gevondenKlant.setIdKlant(result.getInt("idKlant"));
            gevondenKlant.setVoornaam(result.getString("Voornaam"));
            gevondenKlant.setAchternaam(result.getString("Achternaam"));
            gevondenKlant.setTussenvoegsel(result.getString("Tussenvoegsel"));
            gevondenKlant.setTelefoonnummer(result.getString("Telefoonnummer"));
            gevondenKlant.setEmailadres(result.getString("Emailadres"));
        }
     
        connection.close();
        
        return gevondenKlant;
        
    }
    
    public Set<Klant> readAll() throws SQLException  {
        
        Set<Klant> klanten = new HashSet<>();
      
        
        connection = ConnectionManager.getConnection();
       
        String query = "SELECT * FROM Klant";
        preparedStatement = connection.prepareStatement(query);
        ResultSet result = preparedStatement.executeQuery(query);
            
        while(result.next()){
            Klant klant = new Klant();
            klant.setIdKlant(result.getInt("idKlant"));
            klant.setVoornaam(result.getString("Voornaam"));
            klant.setAchternaam(result.getString("Achternaam"));
            klant.setTussenvoegsel(result.getString("Tussenvoegsel"));
            klant.setTelefoonnummer(result.getString("Telefoonnummer"));
            klant.setEmailadres(result.getString("Emailadres"));
            klanten.add(klant);
            }
       
            connection.close();
  
        return klanten;
    }
    
     public Set<Klant> readByAchternaamKlant(Klant klant) throws SQLException {
         
       
        Set<Klant> klanten = new HashSet<>();
       
        
        connection = ConnectionManager.getConnection();
        
        String query = "SELECT * FROM Klant WHERE Klant.Achternaam = ?";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, klant.getAchternaam());
        ResultSet result = preparedStatement.executeQuery();
        
        while(result.next()){
            Klant klantGevonden = new Klant();
            klantGevonden.setIdKlant(result.getInt("idKlant"));
            klantGevonden.setVoornaam(result.getString("Voornaam"));
            klantGevonden.setAchternaam(result.getString("Achternaam"));
            klantGevonden.setTussenvoegsel(result.getString("Tussenvoegsel"));
            klantGevonden.setTelefoonnummer(result.getString("Telefoonnummer"));
            klantGevonden.setEmailadres(result.getString("Emailadres"));
            
            klanten.add(klantGevonden);
          }
        
            connection.close();
      
        return klanten;
            
            
        
        
    }
     
     
     public void update(Klant klant) throws SQLException  {
        
        connection = ConnectionManager.getConnection();
        
        
        
        String query = "UPDATE Klant SET Klant.Voornaam = ?, "
                + "klant.Achternaam = ?, klant.Tussenvoegsel = ?, klant.Telefoonnummer = ?, "
                + "klant.Emailadres = ?"
                + "WHERE Klant.idKlant = ?";
                            
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, klant.getVoornaam());
        preparedStatement.setString(2, klant.getAchternaam());
        preparedStatement.setString(3, klant.getTussenvoegsel());
        preparedStatement.setString(4, klant.getTelefoonnummer());
        preparedStatement.setString(5, klant.getEmailadres());
        preparedStatement.setInt(6, klant.getIdKlant());
        preparedStatement.executeUpdate();
    
        connection.close();
      
    }
}
