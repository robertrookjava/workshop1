/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.robertclasses;

import com.mycompany.mavenproject1.database.dao.ArtikelDAO;
import com.mycompany.mavenproject1.model.Artikel;
import java.math.BigDecimal;
import java.sql.SQLException;

/**
 *
 * @author robertrook
 */
public class Test {
    
     public static void testDatabaseConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Gelukkig");
        }
        catch (Exception ex){
            System.out.println("Helaas pindakaas");
            System.out.println(ex);
        }
        

    }
     
     public static void test(){
         //testDatabaseConnection();
         //testArtikelCreate();
         //testArtikelDelete();
         //testReadByArtikelID();
         //testUpdateArtikel();
         
     }
     
      public static void testArtikelCreate(){
        
        ArtikelDAO artikelDao = new ArtikelDAO();
        Artikel artikel = new Artikel();
        artikel.setIdArtikel(0);
        artikel.setNaam("naam4");
        artikel.setPrijs(new BigDecimal("22.56"));
        artikel.setVoorraad(12);
        
        try {
            artikelDao.create(artikel);
        }
        catch (SQLException ex) {
          System.out.println("Sql exception 1");
            
        }
        catch (Exception ex){
            System.out.println("Exception 1");
        }
        

    }
      
    public static void testArtikelDelete(){
        ArtikelDAO artikelDao = new ArtikelDAO();
        Artikel artikel = new Artikel();
        artikel.setIdArtikel(18);
        try {
            artikelDao.delete(artikel);
        }
        catch (SQLException ex) {
          System.out.println("Sql exception 3");
            
        }
        catch (Exception ex){
            System.out.println("Exception 4");
        }
        
    }
    
    
    public static void testReadByArtikelID(){
        
        ArtikelDAO artikelDao = new ArtikelDAO();
        Artikel artikel = new Artikel();
        
        artikel.setIdArtikel(22);
        
        
        try {
            Artikel gevondenArtikel = artikelDao.readByIdArtikel(artikel);
            System.out.println(gevondenArtikel.getNaam());
            System.out.println(gevondenArtikel.getPrijs());
            System.out.println(gevondenArtikel.getVoorraad());
        }
        catch (SQLException ex) {
          System.out.println("Sql exception 1");
            
        }
        catch (Exception ex){
            System.out.println("Exception 1");
        }
        
   
    }
    
    public static void testUpdateArtikel() {
        
        ArtikelDAO artikelDao = new ArtikelDAO();
        Artikel artikel = new Artikel();
        artikel.setIdArtikel(20);
        artikel.setNaam("nieuwe naam1");
        artikel.setPrijs(new BigDecimal("56.78"));
        artikel.setVoorraad(99);
        
        try {
            artikelDao.update(artikel);
        }
        catch (SQLException ex) {
          System.out.println("Sql exception 1");
            
        }
        catch (Exception ex){
            System.out.println("Exception 1");
        }
    }
    
    public static void testReadAllArtikel (){
        
    }
    
    
    
     
     
     
     
    
}
