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
public abstract class ArtikelDAO {
    
    protected abstract String getDatabase();

   
    
    
    public void create(Artikel artikel)   {
        
        Connection connection = null;
        PreparedStatement preparedStatement  = null;  
        ResultSet result = null;
        
        try {
        
            connection = ConnectionManager.getConnection(getDatabase());
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
        
        }
        
        catch (SQLException ex){
            System.out.println(ex);
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        finally {
            try { if (result != null)   result.close(); } catch (Exception ex) {ex.printStackTrace();}
            try { if (preparedStatement != null) preparedStatement.close(); } catch (Exception ex) {ex.printStackTrace();};
            try { if (connection != null) connection.close(); } catch (Exception ex) {ex.printStackTrace();}
        }
         
    }
    
    
    
    public void delete(Artikel artikel)   {
        
        Connection connection = null;
        PreparedStatement preparedStatement  = null;  
        ResultSet result = null;
        // Load the JDBC MySQL Driver
        
        try {
            connection = ConnectionManager.getConnection(getDatabase());



            String query = "DELETE FROM Artikel WHERE idArtikel = ?";


            preparedStatement = connection.prepareStatement(query);


            preparedStatement.setInt(1, artikel.getIdArtikel());
            preparedStatement.executeUpdate();
        }
        
        catch (SQLException ex){
            System.out.println(ex);
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        finally {
            try { if (result != null)   result.close(); } catch (Exception ex) {ex.printStackTrace();}
            try { if (preparedStatement != null) preparedStatement.close(); } catch (Exception ex) {ex.printStackTrace();};
            try { if (connection != null) connection.close(); } catch (Exception ex) {ex.printStackTrace();}
        }
        
    }
    
    public Artikel readByIdArtikel (Artikel artikel)  {
        
        
        Connection connection = null;
        PreparedStatement preparedStatement  = null;  
        ResultSet result = null;
        Artikel gevondenArtikel = new Artikel();
        
        try {
            connection = ConnectionManager.getConnection(getDatabase());

            String query = "SELECT * FROM Artikel WHERE Artikel.idArtikel = ?";



            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, artikel.getIdArtikel());

            result = preparedStatement.executeQuery();

            if (result.next()){
                gevondenArtikel.setIdArtikel(result.getInt("idArtikel"));
                gevondenArtikel.setNaam(result.getString("naam"));
                gevondenArtikel.setPrijs(result.getBigDecimal("prijs"));
                gevondenArtikel.setVoorraad(result.getInt("voorraad"));
            }

        }
        
        catch (SQLException ex){
            System.out.println(ex);
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        finally {
            try { if (result != null)   result.close(); } catch (Exception ex) {ex.printStackTrace();}
            try { if (preparedStatement != null) preparedStatement.close(); } catch (Exception ex) {ex.printStackTrace();};
            try { if (connection != null) connection.close(); } catch (Exception ex) {ex.printStackTrace();}
        }
        
        
        return gevondenArtikel;
        
    }
    
    
    public boolean existsByIdArtikel (Artikel artikel)  {
        
        
        Connection connection = null;
        PreparedStatement preparedStatement  = null;  
        ResultSet result = null;
        Artikel gevondenArtikel = new Artikel();
        boolean exists = false;
        
        
        try {
            connection = ConnectionManager.getConnection(getDatabase());

            String query = "SELECT * FROM Artikel WHERE Artikel.idArtikel = ?";



            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, artikel.getIdArtikel());

            result = preparedStatement.executeQuery();
            
            exists=result.next();

        }
        
        catch (SQLException ex){
            System.out.println(ex);
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        finally {
            try { if (result != null)   result.close(); } catch (Exception ex) {ex.printStackTrace();}
            try { if (preparedStatement != null) preparedStatement.close(); } catch (Exception ex) {ex.printStackTrace();};
            try { if (connection != null) connection.close(); } catch (Exception ex) {ex.printStackTrace();}
        }
        
        
        return exists;
        
    }
    
 
     public boolean existsBestelArtikelByIdArtikel (Artikel artikel)  {
        
        
        Connection connection = null;
        PreparedStatement preparedStatement  = null;  
        ResultSet result = null;
        Artikel gevondenArtikel = new Artikel();
        boolean exists = false;
        
        
        try {
            connection = ConnectionManager.getConnection(getDatabase());

            String query = "SELECT * FROM BestelArtikel WHERE bestelartikel.idArtikel = ?";



            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, artikel.getIdArtikel());

            result = preparedStatement.executeQuery();
            
            exists=result.next();

        }
        
        catch (SQLException ex){
            System.out.println(ex);
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        finally {
            try { if (result != null)   result.close(); } catch (Exception ex) {ex.printStackTrace();}
            try { if (preparedStatement != null) preparedStatement.close(); } catch (Exception ex) {ex.printStackTrace();};
            try { if (connection != null) connection.close(); } catch (Exception ex) {ex.printStackTrace();}
        }
        
        
        return exists;
        
    }
    
    
    
    
    public boolean existsByNaam(Artikel artikel)  {
        
        Connection connection = null;
        PreparedStatement preparedStatement  = null;  
        ResultSet result = null;
       
        Set<Artikel> artikelen = new HashSet<>();
        boolean exists = false;
        
        
        try {
            connection = ConnectionManager.getConnection(getDatabase());

            String query = "SELECT * FROM Artikel WHERE Artikel.Naam = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, artikel.getNaam());
            result = preparedStatement.executeQuery();

            exists=result.next();
        
        }
         catch (SQLException ex){
            System.out.println(ex);
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        finally {
            try { if (result != null)   result.close(); } catch (Exception ex) {ex.printStackTrace();}
            try { if (preparedStatement != null) preparedStatement.close(); } catch (Exception ex) {ex.printStackTrace();};
            try { if (connection != null) connection.close(); } catch (Exception ex) {ex.printStackTrace();}
        }
      
        return exists;
            
            
        
        
    }
    
    
    
    
    public Set<Artikel> readAll()  {
        
        Connection connection = null;
        PreparedStatement preparedStatement  = null;  
        ResultSet result = null;
        
        Set<Artikel> artikelen = new HashSet<>();
        
        try {
            connection = ConnectionManager.getConnection(getDatabase());

            String query = "SELECT * FROM Artikel";


            preparedStatement = connection.prepareStatement(query);

            result = preparedStatement.executeQuery(query);

            while(result.next()){
                Artikel artikel = new Artikel();
                artikel.setIdArtikel(result.getInt("idArtikel"));
                artikel.setNaam(result.getString("naam"));
                artikel.setPrijs(result.getBigDecimal("prijs"));
                artikel.setVoorraad(result.getInt("voorraad"));
                artikelen.add(artikel);
                }

        }
        
        catch (SQLException ex){
            System.out.println(ex);
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        finally {
            try { if (result != null)   result.close(); } catch (Exception ex) {ex.printStackTrace();}
            try { if (preparedStatement != null) preparedStatement.close(); } catch (Exception ex) {ex.printStackTrace();};
            try { if (connection != null) connection.close(); } catch (Exception ex) {ex.printStackTrace();}
        }
  
        return artikelen;
    }
    
     public Set<Artikel> readByNaam(Artikel artikel)  {
        
        Connection connection = null;
        PreparedStatement preparedStatement  = null;  
        ResultSet result = null;
       
        Set<Artikel> artikelen = new HashSet<>();
        
        
        try {
            connection = ConnectionManager.getConnection(getDatabase());

            String query = "SELECT * FROM Artikel WHERE Artikel.Naam = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, artikel.getNaam());
            result = preparedStatement.executeQuery();

            while(result.next()){
                Artikel artikelGevonden = new Artikel();
                artikelGevonden.setIdArtikel(result.getInt("idArtikel"));
                artikelGevonden.setNaam(result.getString("naam"));
                artikelGevonden.setPrijs(result.getBigDecimal("prijs"));
                artikelGevonden.setVoorraad(result.getInt("voorraad"));
                artikelen.add(artikelGevonden);
              }
        
        }
         catch (SQLException ex){
            System.out.println(ex);
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        finally {
            try { if (result != null)   result.close(); } catch (Exception ex) {ex.printStackTrace();}
            try { if (preparedStatement != null) preparedStatement.close(); } catch (Exception ex) {ex.printStackTrace();};
            try { if (connection != null) connection.close(); } catch (Exception ex) {ex.printStackTrace();}
        }
      
        return artikelen;
            
            
        
        
    }
     
     
     public void update(Artikel artikel)   {
         
        Connection connection = null;
        PreparedStatement preparedStatement  = null;  
        ResultSet result = null; 
        
        try {
        
            connection = ConnectionManager.getConnection(getDatabase());


            String query = "UPDATE Artikel SET Artikel.naam = ?, "
                    + " Artikel.prijs = ?, Artikel.voorraad = ? "
                    + "WHERE Artikel.idArtikel = ?";


            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, artikel.getNaam());
            preparedStatement.setBigDecimal(2, artikel.getPrijs());
            preparedStatement.setInt(3, artikel.getVoorraad());
            preparedStatement.setInt(4, artikel.getIdArtikel());
            preparedStatement.executeUpdate();


            }
        
         catch (SQLException ex){
            System.out.println(ex);
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        finally {
            try { if (result != null)   result.close(); } catch (Exception ex) {ex.printStackTrace();}
            try { if (preparedStatement != null) preparedStatement.close(); } catch (Exception ex) {ex.printStackTrace();};
            try { if (connection != null) connection.close(); } catch (Exception ex) {ex.printStackTrace();}
        }
      
    }
    
    
}
