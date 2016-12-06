/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.view;
import java.util.Scanner;
import java.math.BigDecimal;
import com.mycompany.mavenproject1.robertclasses.*;

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
    private int userInputInt;
    private BigDecimal userInputBigDecimal;
    
    
    // user input artikel
    private int userInputIdArtikel;
    private String userInputNaam;
    private BigDecimal userInputPrijs;
    private int userInputVoorraad;
    
    // user input klant;
    private int userInputIdKlant;
    private String userInputVoornaam;
    private String userInputAchternaam;
    private String userInputTussenvoegsel;
    private String userInputTelefoonnummer;
    private String userInputEmailadres;
    
    
    
    
    
    // user input artikel ophalen
    
    public int getUserInputIdArtikel (){
        return userInputIdArtikel;
    }
    
    public String getUserInputNaam (){
        return userInputNaam;
    }
    
    public BigDecimal getUserInputPrijs (){
        return userInputPrijs;
    }
    
    public int getUserInputVoorraad(){
        return userInputVoorraad;
    }
    
    
    // user input klant ophalen
    public int getUserInputIdklant (){
        return userInputIdKlant;
    }
    
    public String getUserInputVoornaam (){
        return userInputVoornaam;
    }
    
    
    public String getUserInputAchternaam (){
        return userInputAchternaam;
    }
    
    public String getUserInputTussenvoegsel (){
        return userInputTussenvoegsel;
    }

    public String getUserInputTelefoonnummer (){
        return userInputTelefoonnummer;
    }
    
    
    public String getUserInputEmailadres (){
        return userInputEmailadres;
    }
    
    
    // ask user input artikel
    
    public void askUserInputIdArtikel (String question){
        askUserInputInt(question);
        userInputIdArtikel=userInputInt;
        
    }
    
    public void askUserInputNaam (String question) {
        askUserInput(question);
        userInputNaam=userInput;
        
    }
    
    public void askUserInputPrijs (String question){
        askUserInputBigDecimal(question);
        userInputPrijs=userInputBigDecimal;
        
    }
    
    public void askUserInputVoorraad (String question){
        askUserInputInt(question);
        userInputVoorraad=userInputInt;
    }
    
    
    // ask user input klant
    
    public void askUserInputIdKlant (String question){
        askUserInputInt(question);
        userInputIdKlant=userInputInt;
    }
  
    public void askUserInputVoornaam (String question){
        askUserInput(question);
        userInputVoornaam=userInput;
    }
    
    public void askUserInputAchternaam (String question){
        askUserInput(question);
        userInputAchternaam=userInput;
    }
    
    public void askUserInputTussenvoegsel (String question){
        askUserInput(question);
        userInputTussenvoegsel=userInput;
    }
    
    public void askUserInputTelefoonnummer (String question){
        askUserInput(question);
        userInputTelefoonnummer=userInput;
    }
    
    public void askUserInputEmailadres (String question){
        askUserInput(question);
        userInputEmailadres=userInput;
    }
            
    
    
    
    public View (){
        input = new Scanner (System.in);
    }
    
    public String getUserInput (){
        return userInput;
    }
    
    public int getUserInputInt () {
        return userInputInt;
    }
    
    public BigDecimal getUserInputBigDecimal () {
        return userInputBigDecimal;
    }
    
    
    
    
    
    
    public void askUserInput (){
        userInput = input.nextLine();
    }
    
    public void askUserInput (String question){
        printOutput(question);
        userInput = input.next();
    }
    
    public void askUserInputInt (String question){
        boolean inputOK = false;
        while (!inputOK){
            printOutput(question);
            userInput = input.next();
            inputOK = CheckFormat.isInteger(userInput);
            if (!inputOK) {
                printOutput("Voer a.u.b. een geheel getaal in!");
            }
        }
        userInputInt=Integer.parseInt(userInput);
        
    }
    
    public void askUserInputBigDecimal (String question){
        boolean inputOK = false;
        while (!inputOK){
            printOutput(question);
            userInput = input.next();
            inputOK = CheckFormat.isBigDecimal(userInput);
            if (!inputOK) {
                printOutput("Voer a.u.b. een numerieke waarde in");
            }
        }
        userInputBigDecimal = new BigDecimal (userInput);
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
      System.out.println("Maak bestellig aan - b1");
      System.out.println("Voeg artikelen toe aan bestelling (bestelartikel) - b2");
      System.out.println("Verwijder artikelen van een bestelling (bestelartikel) - b3");
      System.out.println("Laat alle bestelling zien van een klant - b4");
      
      //System.out.println("Alle bestellingen weergeven - b5");
      //System.out.println("Alle bestellingen van een klant opzoeken - b6");
      //System.out.println("Alle artikelen (via bestel artikel) van een idBestelling opzoeken (b7");
      //System.out.println("");
      
      System.out.println("--------------------------------------------\");");
        
    }
    
    public void menuScreen() {
        menuIntro();
        menuExtra();
        menuArtikel();
        menuKlant();
        menuBestelling();
    }
    
    public void menuA1(){ // Artikel opzoeken op id 
        askUserInputIdArtikel("Voer a.u.b. een idArtikel in");
    }
    
    public void menuA2(){ //Artikel opzoeken op naam
        askUserInputNaam("Voer a.u.b. de naam van een artikel in");
    }
    
    public void menuA3(){//Alle artikelen weergeven
        // niet geimplementeerd
    }
    
    public void menuA4(){//Artikel toevoegen
        askUserInputNaam("Voer a.u.b. artikel naam in");
        askUserInputPrijs("Voer a.u.b. de prijs in");
        askUserInputVoorraad("Voer a.u.b. de voorraad in");
    }
    
    public void menuA5(){//Artikel wijzigen
        askUserInputIdArtikel("Voer a.u.b. een idArtikel in");
        askUserInputNaam("Voer a.u.b. artikel naam in");
        askUserInputPrijs("Voer a.u.b. de prijs in");
        askUserInputVoorraad("Voer a.u.b. de voorraad in");
    }
    
    public void menuA6(){ // Artikel verwijderen
        askUserInputIdArtikel("Voer a.u.b. een idArtikel in");
    }
    
    public void menuK1(){ //Klant opzoeken op id
        askUserInputIdKlant("Voer a.u.b.een idKlant in");
    }
    
    public void menuK2(){//Klant opzoeken op naam
        askUserInputAchternaam("Voer a.u.b. de achternaam van een klant in");
    }
    
    public void menuK3(){//Alle klanten weergeven
    // niet geimplementeerd    
    }
    
    public void menuK4(){//Klant toevoegen
        askUserInputVoornaam("Voer a.u.b. de voornaam in");
        askUserInputAchternaam("Voer a.u.b. de achternaam in");
        askUserInputTussenvoegsel("Voer a.u.b. het tussenvoegsel in");
        askUserInputTelefoonnummer("Voer a.u.b. het telefoonnummer in");
        askUserInputEmailadres("Voer a.u.b. het emailadres in");
    }
    
    public void menuK5(){//Klant wijzigen
        askUserInputIdKlant("Voer a.u.b.een idKlant in");
        askUserInputVoornaam("Voer a.u.b. de voornaam in");
        askUserInputAchternaam("Voer a.u.b. de achternaam in");
        askUserInputTussenvoegsel("Voer a.u.b. het tussenvoegsel in");
        askUserInputTelefoonnummer("Voer a.u.b. het telefoonnummer in");
        askUserInputEmailadres("Voer a.u.b. het emailadres in");
    }
    
    public void menuK6(){//Klant verwijderen
        askUserInputIdKlant("Voer a.u.b.een idKlant in");
        
    }
    
    public void menuB1(){// maak bestelling aan
        askUserInputIdKlant("Voer a.u.b.een idKlant in");
    }
    
    public void menuB2(){// laat alle bestellingen zien
        // niet geimplementeerd
    }
    
    public void menuB2(){// voeg artikelen toe aan bestelling (bestelartikel)
        
    }
    
    public void menuB3(){// verwijder artikelen van een bestelling 
        
    }
    
    public void menuB4(){// laat alle bestellingen van een klant zien
        
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
