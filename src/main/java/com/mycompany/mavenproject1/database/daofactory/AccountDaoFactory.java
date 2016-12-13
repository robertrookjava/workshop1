/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.database.daofactory;
import com.mycompany.mavenproject1.database.ConnectionManagerMySQL;
import com.mycompany.mavenproject1.database.ConnectionManagerOracle;
import com.mycompany.mavenproject1.database.Database;
import com.mycompany.mavenproject1.database.dao.*;
import com.mycompany.mavenproject1.database.daoMySQL.*;
import com.mycompany.mavenproject1.database.daoOracle.*;


/**
 *
 * @author robertrook
 */
public class AccountDaoFactory {
    public AccountDAO getAccountDao (Database database){
       
       
        switch (database) {
            case MySQL:
                return new AccountDAOMySql();
                         
            case Oracle:
                return new AccountDAOOracle();

                    
            default:
                return new AccountDAOMySql();
       
            }
        }

        
        
    
    }
