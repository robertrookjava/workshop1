/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;
import com.mycompany.mavenproject1.database.ConnectionManager;
import com.mycompany.mavenproject1.database.dao.*;
import com.mycompany.mavenproject1.model.*;
import java.math.BigDecimal;
import java.sql.*;
import com.mycompany.mavenproject1.robertclasses.Test;


/**
 *
 * @author robertrook
 */
public class Application {
    
    private static boolean test = true;
    
    public static void main(String[] args) {
        if (test) {
            Test.test();
        }
        else {
            run();
        }
        
    }
    
    public static void run(){
       System.out.println("Runnen met die handel");
    }
    
    
    
    
    
    
   
}