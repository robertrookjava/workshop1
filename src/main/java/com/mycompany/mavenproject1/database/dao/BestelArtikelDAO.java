/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.database.dao;

import com.mycompany.mavenproject1.database.ConnectionManager;
import com.mycompany.mavenproject1.model.BestelArtikel;
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
public class BestelArtikelDAO {
    
    private PreparedStatement preparedStatement;
    
    private Connection connection;
    
    
    public void create(BestelArtikel bestelArtikel) throws SQLException  {
        
        
        connection = ConnectionManager.getConnection();
        // String query = "INSERT INTO Artikel (idArtikel, Naam, Prijs, Voorraad) VALUES(?, ?, ?, ?)";
        //String query = "INSERT INTO Artikel  VALUES (?, ?, ?, ?)";
        
        String query = "INSERT INTO BESTELLARTIKEL"
		+ "(IDBESTELLING, IDARTIKEL, AANTAL) VALUES"
		+ "(?,?,?)";
        
        
        
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, bestelArtikel.getIdBestelling());
        preparedStatement.setInt(2, bestelArtikel.getIdArtikel());
        preparedStatement.setInt(3, bestelArtikel.getAantal());
        
        preparedStatement.executeUpdate();
        
        connection.close();
       
         
    }
    
    public void delete(BestelArtikel bestelArtikel) throws SQLException  {
        
        // Load the JDBC MySQL Driver
        connection = ConnectionManager.getConnection();

        String query = "DELETE FROM BestelArtike WHERE idBestelling = ? and idArtikel = ?";
        
       
        preparedStatement = connection.prepareStatement(query);
            
            
        preparedStatement.setInt(1, bestelArtikel.getIdBestelling());
        preparedStatement.setInt(2, bestelArtikel.getIdArtikel());
        preparedStatement.executeUpdate();
        connection.close();
        
    }
    
    public BestelArtikel readByIdBestellingIdArtikel (BestelArtikel bestelArtikel) throws SQLException {
        
        BestelArtikel gevondenBestelArtikel = new BestelArtikel();
        
        connection = ConnectionManager.getConnection();
        
        String query = "SELECT * FROM Bestelling WHERE idBestelling = ? and idArtikel = ?";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, bestelArtikel.getIdBestelling());
        preparedStatement.setInt(2, bestelArtikel.getIdArtikel());
        ResultSet result = preparedStatement.executeQuery();
            
        if (result.next()){
            gevondenBestelArtikel.setIdBestelling(result.getInt("idBestelling"));
            gevondenBestelArtikel.setIdArtikel(result.getInt("idArtikel"));
            gevondenBestelArtikel.setAantal(result.getInt("aantal"));
           
        }
     
        connection.close();
        
        return gevondenBestelArtikel;
        
    }
    
    public Set<BestelArtikel> readAll() throws SQLException  {
        
        Set<BestelArtikel> bestelArtikelen = new HashSet<>();
      
        
        connection = ConnectionManager.getConnection();
       
        String query = "SELECT * FROM BestelArtikel";
        preparedStatement = connection.prepareStatement(query);
        ResultSet result = preparedStatement.executeQuery(query);
            
        while(result.next()){
            BestelArtikel bestelArtikel = new BestelArtikel();
            bestelArtikel.setIdBestelling(result.getInt("idBestelling"));
            bestelArtikel.setIdArtikel(result.getInt("idArtikel"));
            bestelArtikel.setAantal(result.getInt("Aantal"));
  
            bestelArtikelen.add(bestelArtikel);
            }
       
            connection.close();
  
        return bestelArtikelen;
    }
    
     public Set<BestelArtikel> readByIdBestelling (BestelArtikel bestelArtikel) throws SQLException {
         
       
        Set<BestelArtikel> bestelArtikelen = new HashSet<>();
       
        
        connection = ConnectionManager.getConnection();
        
        String query = "SELECT * FROM BestelArtikel WHERE idBestelling = ?";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, bestelArtikel.getIdBestelling());
        ResultSet result = preparedStatement.executeQuery();
        
        while(result.next()){
            BestelArtikel bestelArtikelGevonden = new BestelArtikel();
            bestelArtikelGevonden.setIdBestelling(result.getInt("idBestelling"));
            bestelArtikelGevonden.setIdArtikel(result.getInt("idArtikel"));
            bestelArtikelGevonden.setAantal(result.getInt("Aantal"));
          
            bestelArtikelen.add(bestelArtikel);
            
         }
        
            connection.close();
      
        return bestelArtikelen;
            
            
        
        
    }
     
     
     public void update(BestelArtikel bestelArtikel) throws SQLException  {
        
        connection = ConnectionManager.getConnection();
        
        
        
        String query = "UPDATE BestelArtikel SET aantal = ? "
                + "WHERE idBestelling = ? and idArtikel = ?";
                            
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, bestelArtikel.getAantal());
        preparedStatement.setInt(2, bestelArtikel.getIdBestelling());
        preparedStatement.setInt(3, bestelArtikel.getIdArtikel());
        preparedStatement.executeUpdate();
    
        connection.close();
      
    }
    
}
