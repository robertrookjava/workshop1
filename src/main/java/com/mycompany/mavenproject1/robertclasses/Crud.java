/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.robertclasses;

import com.mycompany.mavenproject1.database.dao.AccountDAO;
import com.mycompany.mavenproject1.database.dao.AccounttypeDAO;
import com.mycompany.mavenproject1.model.Account;
import com.mycompany.mavenproject1.model.Accounttype;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author robertrook
 */
public class Crud {
    
    // maak account om dat ik geen onderhoudsscherm accounts heb en je ander foreign key problemen krijgt
    public static void maakAccountTypeRecord(){
        
        AccounttypeDAO accounttypeDao = new AccounttypeDAO();
        Accounttype accounttype = new Accounttype();
        accounttype.setId(1);
        accounttype.setTYpe("admin");
        try {
            accounttypeDao.create(accounttype);
        }
        catch (SQLException ex) {
          System.out.println(ex);
            
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        
    }
    
    public static boolean bestaatAccount(int i){
        boolean output = false;
        AccountDAO accountDao = new AccountDAO();
        Account account = new Account();
        account.setIdAccount(1);
        try {
            output = accountDao.bestaatAccount(account);
        }
        catch (SQLException ex) {
          System.out.println(ex);
            
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        
        
        return output;
            
        
    }
    
    
    
    
    public static void maakAccountRecord(){
        AccountDAO accountDao = new AccountDAO();
        Account account = new Account();
        account.setIdAccount(1);
        account.setGebruikersnaam("Robert Rook");
        account.setWachtwoord("Geheim");
        account.setDatum_Aanmaak (new Date());
        account.setAccountype_id(1);
        try {
            accountDao.create(account);
        }
        catch (SQLException ex) {
          System.out.println(ex);
            
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        
    }
    

    public static void maakAccount(){
        boolean bestaatAccount1 = bestaatAccount(1);
         
        if (!bestaatAccount1){
            maakAccountTypeRecord();
            maakAccountRecord();
        }
     }
 
}
        
    
    
    
    
    
