/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.robertclasses;

import com.mycompany.mavenproject1.database.dao.ArtikelDAO;
import com.mycompany.mavenproject1.model.Artikel;
import com.mycompany.mavenproject1.database.dao.KlantDAO;
import com.mycompany.mavenproject1.model.Klant;
import com.mycompany.mavenproject1.database.dao.BestellingDAO;
import com.mycompany.mavenproject1.model.Bestelling;
import java.util.*;


import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Set;

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
         //testReadByNameArtikel();
         //testReadAllArtikel();
         
         //testCreateKlant();
         //testDeleteKlant();
         //testReadByIDKlant();
         //testUpdateKlant();
         //testReadAllKlant();
         //testReadByAchternaamKlant();
         
         // Crud.maakAccount();
         
         //testCreateBestelling();
         //testDeleteBestelling();
         //testReadByIdBestelling();
         //testReadAllBestelling();
         //testReadByIdKlantBestelling();
         testUpdateBestelling();
         
         //testCreateBestelArtikel();
         //testDeleteBestelArtikel();
         //testReadByIdBestellingIdArtikel();
         //testRealAllbestelArtikel();
         //testReadByIdBestellingBestelArtikel()
         //testUpdateBestelArtikel(
         
         
         
         
         
         
    }
     
     // test ArtikelDAO
     
     
    public static void testCreateBestelling(){
        BestellingDAO bestellingDao = new BestellingDAO();
        Bestelling bestelling = new Bestelling();
        bestelling.setIdBestelling(0);
        bestelling.setIdKlant(6);
        bestelling.setDatum_Bestelling(new Date());
        bestelling.setIdAccount(1);
        
        try {
            bestellingDao.create(bestelling);
        }
        catch (SQLException ex) {
          System.out.println(ex);
            
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        
        
    }
    
    public static void testDeleteBestelling(){
        BestellingDAO bestellingDao = new BestellingDAO();
        Bestelling bestelling = new Bestelling();
        bestelling.setIdBestelling(3);
        try {
            bestellingDao.delete(bestelling);
        }
        catch (SQLException ex) {
          System.out.println(ex);
            
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        
    }
    
    public static void testReadByIdBestelling(){
        
        BestellingDAO bestellingDao = new BestellingDAO();
        Bestelling bestelling = new Bestelling();
        bestelling.setIdBestelling(4);
        
        
        try {
            Bestelling gevondenBestelling = bestellingDao.readByIdBestelling(bestelling);
            System.out.println(gevondenBestelling.getIdKlant());
            System.out.println(gevondenBestelling.getDatum_Bestelling());
            System.out.println(gevondenBestelling.getIdAccount());
        }
        catch (SQLException ex) {
          System.out.println(ex);
            
        }
        catch (Exception ex){
            System.out.println(ex);
            
        
        }
    
     
    }
    
    public static void testReadAllBestelling(){
        BestellingDAO bestellingDao = new BestellingDAO();
     
        try {
        Set<Bestelling> bestellingen = bestellingDao.readAll();
       
            for (Bestelling x:bestellingen){         
                System.out.println(x.getIdBestelling());
                System.out.println(x.getIdKlant());
                System.out.println(x.getDatum_Bestelling());
                System.out.println(x.getIdAccount());
                System.out.println();
             
            }
        }
        catch (SQLException ex) {
          System.out.println(ex);
            
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        
          
    }
    
    public static void testReadByIdKlantBestelling(){
        
        BestellingDAO bestellingDao = new BestellingDAO();
        Bestelling bestelling = new Bestelling();
        bestelling.setIdKlant(5);
      
        try {
        Set<Bestelling> bestellingen = bestellingDao.readByIdKlant(bestelling);
            for (Bestelling x:bestellingen){
                System.out.println("In de loop");
                System.out.println(x.getIdBestelling());
                System.out.println(x.getIdKlant());
                System.out.println(x.getDatum_Bestelling());
                System.out.println(x.getIdAccount());
                System.out.println();
             
            }
        }
        catch (SQLException ex) {
          System.out.println(ex);
            
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        
        
    }
    
    public static void testUpdateBestelling(){
        BestellingDAO bestellingDao = new BestellingDAO();
        Bestelling bestelling = new Bestelling();
        
        bestelling.setIdBestelling(4);
        bestelling.setIdKlant(4);
        bestelling.setDatum_Bestelling(new Date());
        bestelling.setIdAccount(1);
  
        try {
            bestellingDao.update(bestelling);
        }
        catch (SQLException ex) {
          System.out.println(ex);
            
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        
    }
    
    public static void testCreateBestelArtikel(){
        BestellingDAO bestellingDao = new BestellingDAO();
        Bestelling bestelling = new Bestelling();
        bestelling.setIdBestelling(0);
        bestelling.setIdKlant(6);
        bestelling.setDatum_Bestelling(new Date());
        bestelling.setIdAccount(1);
        
        try {
            bestellingDao.create(bestelling);
        }
        catch (SQLException ex) {
          System.out.println(ex);
            
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        
    }
    
    public static void testDeleteBestelArtikel(){
        BestellingDAO bestellingDao = new BestellingDAO();
        Bestelling bestelling = new Bestelling();
        bestelling.setIdBestelling(3);
        try {
            bestellingDao.delete(bestelling);
        }
        catch (SQLException ex) {
          System.out.println(ex);
            
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        
    }
    
    public static void testReadByIdBestellingIdArtikel(){
        BestellingDAO bestellingDao = new BestellingDAO();
        Bestelling bestelling = new Bestelling();
        bestelling.setIdBestelling(4);
        
        
        try {
            Bestelling gevondenBestelling = bestellingDao.readByIdBestelling(bestelling);
            System.out.println(gevondenBestelling.getIdKlant());
            System.out.println(gevondenBestelling.getDatum_Bestelling());
            System.out.println(gevondenBestelling.getIdAccount());
        }
        catch (SQLException ex) {
          System.out.println(ex);
            
        }
        catch (Exception ex){
            System.out.println(ex);
            
        
        }
    
        
    }
    
    public static void testRealAllBestelArtikel(){
        ArtikelDAO artikelDao = new ArtikelDAO();
     
        try {
        Set<Artikel> artikelen = artikelDao.readAll();
       
            for (Artikel x:artikelen){         
                System.out.println(x.getIdArtikel());
                System.out.println(x.getNaam());
                System.out.println(x.getPrijs());
                System.out.println(x.getVoorraad());
                System.out.println();
             
            }
        }
        catch (SQLException ex) {
          System.out.println(ex);
            
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        
    }
    
    public static void testReadByIdBestellingBestelArtikel(){
        ArtikelDAO artikelDao = new ArtikelDAO();
     
        try {
        Set<Artikel> artikelen = artikelDao.readAll();
       
            for (Artikel x:artikelen){         
                System.out.println(x.getIdArtikel());
                System.out.println(x.getNaam());
                System.out.println(x.getPrijs());
                System.out.println(x.getVoorraad());
                System.out.println();
             
            }
        }
        catch (SQLException ex) {
          System.out.println(ex);
            
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        
    }
    
    public static void testUpdateBestelArtikel(){
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
          System.out.println(ex);
            
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        
    }
        
     
    public static void testArtikelCreate(){
        
        ArtikelDAO artikelDao = new ArtikelDAO();
        Artikel artikel = new Artikel();
        artikel.setIdArtikel(0);
        artikel.setNaam("naam6");
        artikel.setPrijs(new BigDecimal("67.89"));
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
        ArtikelDAO artikelDao = new ArtikelDAO();
     
        try {
        Set<Artikel> artikelen = artikelDao.readAll();
       
            for (Artikel x:artikelen){         
                System.out.println(x.getIdArtikel());
                System.out.println(x.getNaam());
                System.out.println(x.getPrijs());
                System.out.println(x.getVoorraad());
                System.out.println();
             
            }
        }
        catch (SQLException ex) {
          System.out.println(ex);
            
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        
          
    }
    
    public static void testReadByNameArtikel(){
        
        ArtikelDAO artikelDao = new ArtikelDAO();
        Artikel artikel = new Artikel();
      
        try {
        Set<Artikel> artikelen = artikelDao.readAll();
            for (Artikel x:artikelen){
                System.out.println("In de loop");
                System.out.println(x.getIdArtikel());
                System.out.println(x.getNaam());
                System.out.println(x.getPrijs());
                System.out.println(x.getVoorraad());
                System.out.println();
             
            }
        }
        catch (SQLException ex) {
          System.out.println(ex);
            
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        
        
    }
    
    // test KlantDAO
    
     public static void testCreateKlant(){
        
       KlantDAO klantDao = new KlantDAO();
        Klant klant = new Klant();
       
        
        klant.setIdKlant(0);
        klant.setVoornaam("voornaam6");
        klant.setAchternaam("achternaam6");
        klant.setTussenvoegsel("tussenvoegse6");
        klant.setTelefoonnummer("telefoonnummer6");
        klant.setEmailadres("emailadres6");
        
        try {
            klantDao.create(klant);
        }
        catch (SQLException ex) {
          System.out.println(ex);    
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        

    }
      
    public static void testDeleteKlant() {
        KlantDAO klantDao = new KlantDAO();
        Klant klant = new Klant();
        klant.setIdKlant(4);
        try {
            klantDao.delete(klant);
        }
        catch (SQLException ex) {
          System.out.println(ex);
            
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        
    }
    
    
    public static void testReadByIDKlant(){
        
        KlantDAO klantDao = new KlantDAO();
        Klant klant = new Klant();
        
        klant.setIdKlant(5);
        
        
        try {
            Klant gevondenKlant = klantDao.readByIdKLant(klant);
            
            System.out.println(gevondenKlant.getVoornaam());
            System.out.println(gevondenKlant.getAchternaam());
            System.out.println(gevondenKlant.getTussenvoegsel());
            System.out.println(gevondenKlant.getTelefoonnummer());
            System.out.println(gevondenKlant.getEmailadres());
        }
          catch (SQLException ex) {
          System.out.println(ex);  
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        
   
    }
    
    public static void testUpdateKlant() {
        
        KlantDAO klantDao = new KlantDAO();
        Klant klant = new Klant();
        klant.setIdKlant(3);
        klant.setVoornaam("voornaam3");
        klant.setAchternaam("achternaam2");
        klant.setTussenvoegsel("tussenvoegsel3");
        klant.setTelefoonnummer("telefoonnummer3");
        klant.setEmailadres("emailadres3");
        
        try {
            klantDao.update(klant);
        }
        catch (SQLException ex) {
          System.out.println(ex);
            
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }
    
    public static void testReadAllKlant() {
        KlantDAO klantDao = new KlantDAO();
     
        try {
            Set<Klant> klanten = klantDao.readAll();
       
            for (Klant x:klanten) {         
                System.out.println(x.getIdKlant());
                System.out.println(x.getVoornaam());
                System.out.println(x.getAchternaam());
                System.out.println(x.getTussenvoegsel());
                System.out.println(x.getTelefoonnummer());
                System.out.println(x.getEmailadres());    
                System.out.println();
             
            }
        }
        catch (SQLException ex) {
          System.out.println(ex);
            
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        
          
    }
    
    public static void testReadByAchternaamKlant(){
        
        KlantDAO klantDao = new KlantDAO();
        Klant klant = new Klant();
        klant.setAchternaam("achternaam2");
        
        
        try {
            Set<Klant> klanten = klantDao.readByAchternaamKlant(klant);
            for (Klant x:klanten) {         
                System.out.println(x.getIdKlant());
                System.out.println(x.getVoornaam());
                System.out.println(x.getAchternaam());
                System.out.println(x.getTussenvoegsel());
                System.out.println(x.getTelefoonnummer());
                System.out.println(x.getEmailadres());    
                System.out.println();
             
            }
        }
        catch (SQLException ex) {
          System.out.println(ex);  
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    
     
    }
    
    
   
    
    
    
    
    
    
    
    
    
    
    
     
     
     
     
    
}
