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
    
    public void run(){
        view.startScreen();
        
      
    }
    
    
    
    
}