/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.robertclasses;
import com.mycompany.mavenproject1.database.dao.AccounttypeDAO;
import com.mycompany.mavenproject1.model.Accounttype;
import com.mycompany.mavenproject1.database.dao.AccountDAO;
import com.mycompany.mavenproject1.model.Account;

import java.sql.*;
import java.util.*;
import java.util.Date;


/**
 *
 * @author robertrook
 */
public class Robert {
    
    
    // maak account om dat ik geen onderhoudsscherm accounts heb en je ander foreign key problemen krijgt
    private static void maakAccountTypeRecord(){
        
        AccounttypeDAO accounttypeDao = new AccounttypeDAO();
        Accounttype accounttype = new Accounttype();
        accounttype.setId(1);
        accounttype.setTYpe("admin");
        
        accounttypeDao.create(accounttype);
        
        
        
    }
    
    
    private static void maakAccountRecord(){
        AccountDAO accountDao = new AccountDAO();
        Account account = new Account();
        account.setIdAccount(1);
        account.setGebruikersnaam("Robert Rook");
        account.setWachtwoord("Geheim");
        account.setDatum_Aanmaak (new Date());
        account.setAccountype_id(1);
        
        accountDao.create(account);
        
        
        
    }
    
    public static void maakAccount(){
        maakAccountTypeRecord();
        maakAccountRecord();
    }
 
            
            
            
    
    
    
}
