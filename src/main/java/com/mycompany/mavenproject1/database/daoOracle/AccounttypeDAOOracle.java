/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.database.daoOracle;
import com.mycompany.mavenproject1.database.Database;
import com.mycompany.mavenproject1.database.dao.*;

/**
 *
 * @author robertrook
 */
public class AccounttypeDAOOracle extends AccounttypeDAO{
    protected Database database = Database.Oracle;
   protected String SQLCreate = "INSERT INTO ACCOUNTYPE"
                    + "(ID, TYPE) VALUES"
                    + "(?,?)";
    
    @Override
    public Database getDatabase(){
        return this.database;
    }
    
  
   @Override
    public String getSQLCreate(){
        return this.SQLCreate;
    }
    
    
}
