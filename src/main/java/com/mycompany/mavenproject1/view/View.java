/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.view;
import java.util.Scanner;
import java.math.BigDecimal;

/**
 *
 * @author robertrook
 */
public class View {
    
    // hier komen alle menuopties en schermen
    // schermen als methods
    // antwoorden als methods uitgelezen uit private fields
    // menu's uitwerken
  
    
    private final Scanner input;
    
    private String userInput;
    
    // user input artikel
    private int userInputIdArtikel;
    private String userInputNaam;
    private BigDecimal userinputPrijs;
    private int userInputVoorraad;
    
    // user input klant;
    private int userInputidKlant;
    private String userInputIdVoornaam;
    
    
    
    

    
    public View (){
        input = new Scanner (System.in);
    }
    
    public String getUserInput (){
        return userInput;
    }
    
    
    
    
    public void askUserInput (){
     userInput = input.next();
    }
    
    public void askUserInput (String question){
        printOutput(question);
        userInput = input.next();
    }
    
    public void printOutput (String output){
        System.out.println(output);
    }
    
    

    
    public void startScreen(){
        System.out.println ("Welkom bij de Applikaasie ");
        System.out.println ("----------------------------");
        System.out.println ();
        System.out.println ();
        
    }
    
    public void endScreen(){
        System.out.println("Tot ziens");
    }
    
    
    public void menuIntro(){
        System.out.println ("Hier volgen alle menu opties");  
        System.out.println("");
        System.out.println();
        System.out.println("");    
    }
    
    public void menuExtra(){
        System.out.println("------------------------------------------");
        System.out.println("Algemeen");
        System.out.println("");
        System.out.println("");
        System.out.println("Toon menu - menu");
        System.out.println("Maak account - ma");
        System.out.println("Afsluiten - exit");
        System.out.println("");
    }
    
    public void menuArtikel(){
        System.out.println("------------------------------------------");
        System.out.println("Artikel");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Artikel opzoeken op id - a1 ");
        System.out.println("Artikel opzoeken op naam - a2");
        System.out.println("Alle artikelen weergeven - a3");
        System.out.println("Artikel toevoegen - a4");
        System.out.println("Artikel wijzigen  - a5");
        System.out.println("Artikel verwijderen - a6");
        System.out.println("");
    }
    
    public void menuKlant(){
      System.out.println("--------------------------------------------");
      System.out.println("Klant");
      System.out.println("");
      System.out.println("");
      System.out.println("");
      System.out.println("Klant opzoeken op id - k1");
      System.out.println("Klant opzoeken op naam - k2");
      System.out.println("Alle klanten weergeven - k3");
      System.out.println("Klant toevoegen - k4");
      System.out.println("Klant wijzigen - k5");
      System.out.println("Klant verwijderen - k6");
      System.out.println("");
      System.out.println("");
      System.out.println("");
      
    }
    
    public void menuBestelling (){
      System.out.println("--------------------------------------------");
      System.out.println("Bestelling");
      System.out.println("");
      System.out.println("");
      System.out.println("");
      System.out.println("Bestelling toevoegen - b1");
      System.out.println("Bestelling wijzigen - b2");
      System.out.println("Bestelling verwijderen - b3");
      System.out.println("Bestelling opzoeken - b4");
      System.out.println("Alle bestellingen weergeven - b5");
      System.out.println("Alle bestellingen van een klant opzoeken - b6");
      System.out.println("Alle artikelen (via bestel artikel) van een idBestelling opzoeken (b7");
      System.out.println("");
      System.out.println("--------------------------------------------\");");
        
    }
    
    public void menuScreen() {
        menuIntro();
        menuExtra();
        menuArtikel();
        menuKlant();
        menuBestelling();
    }
    
    public void menuZoekArtikelOpId(){
        
    }
    
    
    
    /*
    Toon menu (menu)


Maak account  (ma)

Afsluiten (exit)

Artikel

-	Artikel opzoeken op id   (a1)
-	Artikel opzoeken op naam  (a2)
-	Alle artikelen weergeven (a3)
-	Artikel toevoegen (a4)
-	Artikel wijzigen (a5)
-	Artikel verwijderen (a6)


Klant

-	Klant opzoeken op id (k1)
-	Klant opzoeken op naam(k2)
-	Alle klanten weergeven (k3)
-	Klant toevoegen (k4)
-	Klant wijzigen (k5)
-	Klant verwijderen (k6)



Bestelling

-	Bestelling toevoegen (b1)
-	Bestelling wijzigen (b2)
-	Bestelling verwijderen (b3)
-	Bestelling opzoeken (b4)
-	Alle bestellingen weergeven (b5)
-	Alle bestellingen van een klant opzoeken (b6)  
-	Alle artikelen (via bestel artikel) van een idBestelling opzoeken (b7)

    
    */
  
}
