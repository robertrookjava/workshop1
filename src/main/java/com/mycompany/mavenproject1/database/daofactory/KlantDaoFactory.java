/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.database.daofactory;

import com.mycompany.mavenproject1.database.dao.KlantDAO;
import com.mycompany.mavenproject1.database.daoMySQL.BestellingDAOMySQL;
import com.mycompany.mavenproject1.database.daoMySQL.KlantDAOMySQL;
import com.mycompany.mavenproject1.database.daoOracle.BestellingDAOOracle;
import com.mycompany.mavenproject1.database.daoOracle.KlantDAOOracle;
import com.mycompany.mavenproject1.database.Database;
import com.mycompany.mavenproject1.database.dao.BestellingDAO;

/**
 *
 * @author robertrook
 */
public class KlantDaoFactory {
    public KlantDAO getKlantDao (Database database){
    
   
    switch (database) {
        case MySQL:
                return new KlantDAOMySQL();
                         
        case Oracle:
            return new KlantDAOOracle();
                  
        default:
            return new KlantDAOMySQL();
       
        }
    }
    
}
