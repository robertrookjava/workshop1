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
public class AccountDAO {
    
    
    
    private PreparedStatement preparedStatement;
    
    private Connection connection;
    
    
    public void create(Account account) throws SQLException  {
        
        
        connection = ConnectionManager.getConnection();
        String query = "INSERT INTO Account (idAccount, Gebruikersnaam, Wachtwoord, Datum_Aanmaak,accountype_id) VALUES(?, ?, ?, ?, ?)";
         
        preparedStatement = connection.prepareStatement(query);
            
        preparedStatement.setInt(1, account.getIdAccount());
        preparedStatement.setString(2, account.getGebruikersnaam());
        preparedStatement.setString(3, account.getWachtwoord());
        
        java.util.Date date = account.getDatum_Aanmaak();
        
        preparedStatement.setDate(4, new java.sql.Date(date.getTime()));
        
        preparedStatement.setInt(5, account.getAccountype_id());
        preparedStatement.executeUpdate();
     
        connection.close();
         
    }
    
    
    public void delete(Account account) throws SQLException  {
        
        // Load the JDBC MySQL Driver
        connection = ConnectionManager.getConnection();
        
      
           
        String query = "DELETE FROM Account WHERE idAccount = ?";
        
       
        preparedStatement = connection.prepareStatement(query);
            
            
        preparedStatement.setInt(1, account.getIdAccount());
        preparedStatement.executeUpdate();
        connection.close();
        
    }
    
    public Account readByIdAccount (Account account) throws SQLException {
        
        Account gevondenAccount = new Account();
        
        connection = ConnectionManager.getConnection();
        
        String query = "SELECT * FROM Account WHERE Account.idAccount = ?";
        
        
            
        preparedStatement = connection.prepareStatement(query);
            
        preparedStatement.setInt(1, account.getIdAccount());
            
        ResultSet result = preparedStatement.executeQuery();
            
        if (result.next()){
            gevondenAccount.setIdAccount(result.getInt("idAccount"));
            gevondenAccount.setGebruikersnaam(result.getString("Gebruikersnaam"));
            gevondenAccount.setWachtwoord(result.getString("Wachtwoord"));
            gevondenAccount.setDatum_Aanmaak(result.getDate("Datum_Aanmaak"));
            gevondenAccount.setAccountype_id(result.getInt("accountype_id"));
        }
        
        
        connection.close();
        
        return gevondenAccount;
        
    }
    
     public boolean bestaatAccount (Account account) throws SQLException {
        
       
        
        connection = ConnectionManager.getConnection();
        String query = "SELECT * FROM Account WHERE Account.idAccount = ?";
        
        boolean output = false;
            
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, account.getIdAccount());
        ResultSet result = preparedStatement.executeQuery();
            
        if (result.next()){
            output = true;
        }
        
         connection.close();
        
        return output;
        
    }
    
    
     public Account readByGebruikersnaam (Account account) throws SQLException {
         
         
        
        
        connection = ConnectionManager.getConnection();
        
        String query = "SELECT * FROM Account WHERE account.Gebruikersnaam = ?";
     
        preparedStatement = connection.prepareStatement(query);
        
            
        preparedStatement.setString(1, account.getGebruikersnaam());
            
        ResultSet result = preparedStatement.executeQuery();
        
        Account accountGevonden = new Account();    
        
        if (result.next()){
            
            accountGevonden.setIdAccount(result.getInt("idAccount"));
            accountGevonden.setGebruikersnaam(result.getString("Gebruikersnaam"));
            accountGevonden.setWachtwoord(result.getString("Wachtwoord"));
            accountGevonden.setDatum_Aanmaak(result.getDate("Gebruikersnaam"));
            accountGevonden.setAccountype_id(result.getInt("accountype_id"));
            
          }
        
            connection.close();
      
        
        return accountGevonden;
            
            
        
        
    }
     
     /*
     public void update(Account account) throws SQLException  {
        
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

*/ 
    
}
