/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.model;

import com.mycompany.mavenproject1.database.dao.AccountDAO;
import com.mycompany.mavenproject1.database.dao.AccounttypeDAO;
import com.mycompany.mavenproject1.database.dao.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

/**
 *
 * @author robertrook
 */
public class Model {
    
    // aanmaken van 1 accound  zonder onderhoudsscherm 
    
    private void maakAccountTypeRecord(){
        
        AccounttypeDAO accounttypeDao = new AccounttypeDAO();
        Accounttype accounttype = new Accounttype();
        accounttype.setId(1);
        accounttype.setTYpe("admin");
        
        accounttypeDao.create(accounttype);
        
      
    }
    
    private boolean bestaatAccount(int i){
        boolean output = false;
        AccountDAO accountDao = new AccountDAO();
        Account account = new Account();
        account.setIdAccount(1);
      
        output = accountDao.bestaatAccount(account);

      
        
        return output;
            
        
    }
    
    
    
    
    private void maakAccountRecord(){
        AccountDAO accountDao = new AccountDAO();
        Account account = new Account();
        account.setIdAccount(1);
        account.setGebruikersnaam("Robert Rook");
        account.setWachtwoord("Geheim");
        account.setDatum_Aanmaak (new Date());
        account.setAccountype_id(1);
        
        accountDao.create(account);
       
        
        
    }
    

    public void maakAccount(){
        boolean bestaatAccount1 = bestaatAccount(1);
         
        if (!bestaatAccount1){
            maakAccountTypeRecord();
            maakAccountRecord();
        }
     }
    
    // artikel acties
    
    public void createArtikel(String naam, BigDecimal prijs, int voorraad){        
        ArtikelDAO artikelDao = new ArtikelDAO();
        Artikel artikel = new Artikel();
        artikel.setIdArtikel(0);
        artikel.setNaam(naam);
        artikel.setPrijs(prijs);
        artikel.setVoorraad(voorraad);
        
        artikelDao.create(artikel);
    }
    
    public void deleteArtikel (int idArtikel){
        ArtikelDAO artikelDao = new ArtikelDAO();
        Artikel artikel = new Artikel();
        artikel.setIdArtikel(idArtikel);
      
        artikelDao.delete(artikel);
        
    }
    
    public Artikel readByIdArtikel (int idArtikel){
        ArtikelDAO artikelDao = new ArtikelDAO();
        Artikel artikel = new Artikel();
        artikel.setIdArtikel(idArtikel);
        Artikel gevondenArtikel = artikelDao.readByIdArtikel(artikel);
  
        return gevondenArtikel;
   }
   
    public void updateArtikel(int idArtikel, String naam, BigDecimal prijs, int voorraad){
        ArtikelDAO artikelDao = new ArtikelDAO();
        Artikel artikel = new Artikel();
        artikel.setIdArtikel(idArtikel);
        artikel.setNaam(naam);
        artikel.setPrijs(prijs);
        artikel.setVoorraad(voorraad);

        artikelDao.update(artikel);
   }
    
    public Set<Artikel> readAllArtikel () {
        ArtikelDAO artikelDao = new ArtikelDAO();
        Set<Artikel> artikelen = artikelDao.readAll();
       
        return artikelen;
   }

   
    public Set <Artikel> readByNameArtikel (String naam) {
       ArtikelDAO artikelDao = new ArtikelDAO();
        Artikel artikel = new Artikel();
        artikel.setNaam(naam);
        Set<Artikel> artikelen = artikelDao.readByNaam(artikel);
        
        return artikelen;
       
   }
   

   
    
    // klant acties 
    
     public void createKlant(String voornaam, String achternaam, String tussenvoegsel, String telefoonnummer, String emailadres){
        
        KlantDAO klantDao = new KlantDAO();
        Klant klant = new Klant();
       
        
        klant.setIdKlant(0);
        klant.setVoornaam(voornaam);
        klant.setAchternaam(achternaam);
        klant.setTussenvoegsel(tussenvoegsel);
        klant.setTelefoonnummer(telefoonnummer);
        klant.setEmailadres(emailadres);

        klantDao.create(klant);

    }
      
    public void deleteKlant(int idKlant) {
        KlantDAO klantDao = new KlantDAO();
        Klant klant = new Klant();
        klant.setIdKlant(idKlant);
       
        klantDao.delete(klant);

    }
    
    
    public Klant readByIDKlant(int idKlant){
        
        KlantDAO klantDao = new KlantDAO();
        Klant klant = new Klant();
        klant.setIdKlant(idKlant);
    
        Klant gevondenKlant = klantDao.readByIdKLant(klant);

        return gevondenKlant;
   
    }
    
    public void updateKlant(int idKlant, String voornaam, String achternaam, String tussenvoegsel, String telefoonnummer, String emailadres) {
        
        KlantDAO klantDao = new KlantDAO();
        Klant klant = new Klant();
        klant.setIdKlant(idKlant);
        klant.setVoornaam(voornaam);
        klant.setAchternaam(achternaam);
        klant.setTussenvoegsel(tussenvoegsel);
        klant.setTelefoonnummer(telefoonnummer);
        klant.setEmailadres(emailadres);
   
        klantDao.update(klant);
 
    }
    
    public Set<Klant> readAllKlant() {
        KlantDAO klantDao = new KlantDAO();
        Set<Klant> klanten = klantDao.readAll();
       
        return klanten;


    }
    
    public Set<Klant> readByAchternaamKlant(String achternaam){
        
        KlantDAO klantDao = new KlantDAO();
        Klant klant = new Klant();
        klant.setAchternaam(achternaam);
        Set<Klant> klanten = klantDao.readByAchternaamKlant(klant);
        
        return klanten;
     
    }
    
    
    
    // bestelling acties
    
    
    
    public void createBestelling(int idKlant, int idAccount){
        BestellingDAO bestellingDao = new BestellingDAO();
        Bestelling bestelling = new Bestelling();
        bestelling.setIdBestelling(0);
        bestelling.setIdKlant(idKlant);
        bestelling.setDatum_Bestelling(new Date());
        bestelling.setIdAccount(idAccount);
        
     
        bestellingDao.create(bestelling);
 
    }
    
    public void deleteBestelling(int idBestelling){
        BestellingDAO bestellingDao = new BestellingDAO();
        Bestelling bestelling = new Bestelling();
        bestelling.setIdBestelling(idBestelling);
        
        bestellingDao.delete(bestelling);
    
    }
    
    public Bestelling readByIdBestelling(int idBestelling){
        
        BestellingDAO bestellingDao = new BestellingDAO();
        Bestelling bestelling = new Bestelling();
        bestelling.setIdBestelling(idBestelling);
        Bestelling gevondenBestelling = bestellingDao.readByIdBestelling(bestelling);

        return gevondenBestelling;
     
    }
    
    public Set<Bestelling> readAllBestelling(){
        BestellingDAO bestellingDao = new BestellingDAO();
        Set<Bestelling> bestellingen = bestellingDao.readAll();
       
        return bestellingen;
 
    }
    
    public Set<Bestelling> readByIdKlantBestelling(int idKlant){
        
        BestellingDAO bestellingDao = new BestellingDAO();
        Bestelling bestelling = new Bestelling();
        bestelling.setIdKlant(idKlant);
        Set<Bestelling> bestellingen = bestellingDao.readByIdKlant(bestelling);
        
        return bestellingen;
    }
    
    public void updateBestelling(int idBestelling, int idKlant, int idAccount){
        BestellingDAO bestellingDao = new BestellingDAO();
        Bestelling bestelling = new Bestelling();
        
        bestelling.setIdBestelling(idBestelling);
        bestelling.setIdKlant(idKlant);
        bestelling.setDatum_Bestelling(new Date());
        bestelling.setIdAccount(idAccount);

        bestellingDao.update(bestelling);

    }
    
    public void createBestelArtikel(int idBestelling, int idArtikel, int aantal){
        BestelArtikelDAO bestelArtikelDao = new BestelArtikelDAO();
        BestelArtikel bestelArtikel = new BestelArtikel();
        bestelArtikel.setIdBestelling(idBestelling);
        bestelArtikel.setIdArtikel(idArtikel);
        bestelArtikel.setAantal(aantal);
      
        bestelArtikelDao.create(bestelArtikel);

    }
    
    public void deleteBestelArtikel(int idBestelling, int idArtikel){
        BestelArtikelDAO bestelArtikelDao = new BestelArtikelDAO();
        BestelArtikel bestelArtikel = new BestelArtikel();
        bestelArtikel.setIdBestelling(idBestelling);
        bestelArtikel.setIdArtikel(idArtikel);
        
     
        bestelArtikelDao.delete(bestelArtikel);
  
    }
    
    public BestelArtikel readByIdBestellingIdArtikel(int idBestelling, int idArtikel){
        BestelArtikelDAO bestelArtikelDoa = new BestelArtikelDAO();
        BestelArtikel bestelArtikel = new BestelArtikel();
        bestelArtikel.setIdBestelling(idBestelling);
        bestelArtikel.setIdArtikel(idArtikel);
        
        BestelArtikel gevondenBestelArtikel=bestelArtikelDoa.readByIdBestellingIdArtikel(bestelArtikel);
        
        return gevondenBestelArtikel;
  
    }
    
    public Set<BestelArtikel> readAllBestelArtikel(){
        BestelArtikelDAO bestelArtikelDao = new BestelArtikelDAO();
        Set<BestelArtikel> bestelArtikelen = bestelArtikelDao.readAll();

        return bestelArtikelen;
    }
    
    public Set<BestelArtikel> readByIdBestellingBestelArtikel(int idBestelling){
        BestelArtikelDAO bestelArtikelDao = new BestelArtikelDAO();
        BestelArtikel bestelArtikel = new BestelArtikel();
        bestelArtikel.setIdBestelling(idBestelling);
      
        Set<BestelArtikel> bestelArtikelen = bestelArtikelDao.readByIdBestelling(bestelArtikel);
       
        return bestelArtikelen;
   
    }
    
    public void updateBestelArtikel(int idBestelling, int idArtikel, int aantal){
        BestelArtikelDAO bestelArtikelDoa = new BestelArtikelDAO();
        BestelArtikel bestelArtikel = new BestelArtikel();
        bestelArtikel.setIdBestelling(idBestelling);
        bestelArtikel.setIdArtikel(idArtikel);
        bestelArtikel.setAantal(aantal);
   
        bestelArtikelDoa.update(bestelArtikel);
      
  
    }
    
    
    
    
 
    
    
    
}
