/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.database.daofactory;
import com.mycompany.mavenproject1.database.dao.BestellingDAO;
import com.mycompany.mavenproject1.database.daoMySQL.BestellingDAOMySQL;
import com.mycompany.mavenproject1.database.daoOracle.BestellingDAOOracle;

/**
 *
 * @author robertrook
 */
public class BestellingDaoFactory {
    public BestellingDAO getBestellingDao (String database){
       if (database.equals("MySql")){
           return new BestellingDAOMySQL();
       }
       else if (database.equals("Oracle")){
           return new BestellingDAOOracle();
       }
       return null;
       
   }
}
