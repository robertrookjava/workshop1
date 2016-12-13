/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.database.daofactory;
import com.mycompany.mavenproject1.database.dao.BestellingDAO;
import com.mycompany.mavenproject1.database.daoMySQL.BestelArtikelDAOMySQL;
import com.mycompany.mavenproject1.database.daoMySQL.BestellingDAOMySQL;
import com.mycompany.mavenproject1.database.daoOracle.BestelArtikelDAOOracle;
import com.mycompany.mavenproject1.database.daoOracle.BestellingDAOOracle;
import com.mycompany.mavenproject1.database.Database;

/**
 *
 * @author robertrook
 */
public class BestellingDaoFactory {
    public BestellingDAO getBestellingDao (Database database){
       
    
    switch (database) {
        case MySQL:
                return new BestellingDAOMySQL();
                         
        case Oracle:
            return new BestellingDAOOracle();
                  
        default:
            return new BestellingDAOMySQL();
       
        }
    }
}
