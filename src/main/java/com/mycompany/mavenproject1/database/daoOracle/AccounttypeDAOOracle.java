/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.database.daoOracle;
import com.mycompany.mavenproject1.database.dao.*;

/**
 *
 * @author robertrook
 */
public class AccounttypeDAOOracle extends AccounttypeDAO{
    protected String database = "Oracle";
    
    public String getDatabase(){
        return this.database;
    }
    
}
