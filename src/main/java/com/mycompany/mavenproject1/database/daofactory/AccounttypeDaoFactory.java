/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.database.daofactory;
import com.mycompany.mavenproject1.database.dao.*;
import com.mycompany.mavenproject1.database.daoMySQL.*;
import com.mycompany.mavenproject1.database.daoOracle.*;


/**
 *
 * @author robertrook
 */
public class AccounttypeDaoFactory {
    public AccounttypeDAO getAccounttypeDao (String database){
       if (database.equals("MySql")){
           return new AccounttypeDAOMySQL();
       }
       else if (database.equals("Oracle")){
           return new AccounttypeDAOOracle();
       }
       return null;
       
   }
}
