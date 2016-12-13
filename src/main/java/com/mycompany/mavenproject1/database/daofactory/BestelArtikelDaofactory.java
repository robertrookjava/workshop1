/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.database.daofactory;
import com.mycompany.mavenproject1.database.dao.BestelArtikelDAO;
import com.mycompany.mavenproject1.database.daoMySQL.ArtikelDAOMySQL;
import com.mycompany.mavenproject1.database.daoMySQL.BestelArtikelDAOMySQL;
import com.mycompany.mavenproject1.database.daoOracle.ArtikelDAOOracle;
import com.mycompany.mavenproject1.database.daoOracle.BestelArtikelDAOOracle;
import com.mycompany.mavenproject1.database.Database;

/**
 *
 * @author robertrook
 */
public class BestelArtikelDaofactory {
    public BestelArtikelDAO getBestelArtikelDao (Database database){

        switch (database) {
            case MySQL:
                return new BestelArtikelDAOMySQL();
                         
            case Oracle:
                return new BestelArtikelDAOOracle();
                  
            default:
                return new BestelArtikelDAOOracle();
       
        }
    }
    
}
