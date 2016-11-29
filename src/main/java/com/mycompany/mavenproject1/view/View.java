/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.view;
import java.util.Scanner;

/**
 *
 * @author robertrook
 */
public class View {
    
    // hier komen alle menuopties en schermen
    // schermen als methods
    // antwoorden als methods uitgelezen uit private fields
    // menu's uitwerken
    
    private enum MenuOption {CreateBestelling, DeleteBestelling,ReadByIdBestelling,testReadAllBestelling,
    ReadByIdKlantBestelling,UpdateBestelling  
    }
    
    private final Scanner input;
    
    private String userInput;

    
    public View (){
        input = new Scanner (System.in);
    }
    
    private String getUserInput (){
        return userInput;
    }
    
    
    public void askUserInput (String question){
        printOutput(question);
        userInput = input.next();
    }
    
    public void printOutput (String output){
        System.out.println(output);
    }
    
    

    
    public void startScreen(){
        
    }
    
    public void menuCreerBestelling (){
        
    }
    
    public void menuCreerArtikel (){
        
    }
    
    public void menuCreerKlant(){
        
    }
    
    
    
  
    
    // alle mogelijk menu's in method en uitprogrammeren met gebruik van al bestaande private methods
   
    
}
