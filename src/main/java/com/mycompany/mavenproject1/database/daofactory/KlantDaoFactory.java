/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.database.daofactory;

import com.mycompany.mavenproject1.database.dao.KlantDAO;
import com.mycompany.mavenproject1.database.daoMySQL.KlantDAOMySQL;
import com.mycompany.mavenproject1.database.daoOracle.KlantDAOOracle;

/**
 *
 * @author robertrook
 */
public class KlantDaoFactory {
    public KlantDAO getKlantDao (String database){
       if (database.equals("MySql")){
           return new KlantDAOMySQL();
       }
       else if (database.equals("Oracle")){
           return new KlantDAOOracle();
       }
       return null;
    }
    
}
