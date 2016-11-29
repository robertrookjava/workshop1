/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.controller;
import com.mycompany.mavenproject1.model.*;
import com.mycompany.mavenproject1.view.*;

/**
 *
 * @author robertrook
 */
public class Controller {
    
     
    private Model model;
    private View view;
    private boolean exit = false;
    
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
    
    private void verwerkInput (String userInput){
        switch (userInput) {
            case "menu":  verwerkInput_menu();
                     break;
            case "ma":  verwerkInput_ma();
                     break;
            case "a1":  verwerkInput_a1();
                     break;
            case "a2":  verwerkInput_a2();
                     break;
            case "a3":  verwerkInput_a3();
                     break;
            case "a4":  verwerkInput_a4();
                     break;
            case "a5":  verwerkInput_a5();
                     break;
            case "a6":  verwerkInput_a6();
                     break;
            
            case "k1":  verwerkInput_k1();
                     break;
            case "k2":  verwerkInput_k2();
                     break;
            case "k3":  verwerkInput_k3();
                     break;
            case "k4":  verwerkInput_k4();
                     break;
            case "k5":  verwerkInput_k5();
                     break;
            case "k6":  verwerkInput_k6();
                     break;
            case "b1":  verwerkInput_b1();
                     break;
            case "b2":  verwerkInput_b2();
                     break;
            case "b3":  verwerkInput_b3();
                     break;
            case "b4":  verwerkInput_b4();
                     break;
            case "b5":  verwerkInput_b5();
                     break;
            case "b6":  verwerkInput_b6();
                     break;
            case "b7":  verwerkInput_b7();
                     break;
            
            default: verwerkInput_menu();
                     break;
                     
                     
        
    }
    
    private void verwerkInput_menu(){
        
    }
    
    private void verwerkInput_ma(){
        
    }
    
    private void verwerkInput_a1(){
        
    }
    
    private void verwerkInput_a2(){
        
    }
    
    private void verwerkInput_a3(){
        
    }
    
    private void verwerkInput_a4(){
        
    }
    
    private void verwerkInput_a5(){
        
    }
    
    private void verwerkInput_a6(){
        
    }
    
    private void verwerkInput_k1(){
        
    }
    
    private void verwerkInput_k2(){
        
    }
    
    private void verwerkInput_k3(){
        
    }
    
    private void verwerkInput_k4(){
        
    }
    
    private void verwerkInput_k5(){
        
    }
    
    private void verwerkInput_k6(){
        
    }
    
    private void verwerkInput_b1(){
        
    }
    
    private void verwerkInput_b2(){
        
    }
    
    private void verwerkInput_b3(){
        
    }
    
    private void verwerkInput_b4(){
        
    }
    
    private void verwerkInput_b5(){
        
    }
    
    private void verwerkInput_b6(){
        
    }
    
    private void verwerkInput_b7(){
        
    }
   
    
    
    
    public void run(){
        String userInput="";
        view.startScreen();
        view.menuScreen();
        while (!(userInput.equalsIgnoreCase("exit"))){
            view.askUserInput("Welke menu optie?");
            userInput = view.getUserInput();
            verwerkInput(userInput);
        }
        System.out.println("Tot ziens");
    }
    
    
    
    
}
