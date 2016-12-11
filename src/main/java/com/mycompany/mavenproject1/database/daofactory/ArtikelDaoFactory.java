/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.database.daofactory;

import com.mycompany.mavenproject1.database.dao.ArtikelDAO;
import com.mycompany.mavenproject1.database.daoMySQL.ArtikelDAOMySQL;
import com.mycompany.mavenproject1.database.daoOracle.ArtikelDAOOracle;

/**
 *
 * @author robertrook
 */
public class ArtikelDaoFactory {
    public ArtikelDAO getArtikelDao (String database){
       if (database.equals("MySql")){
           return new ArtikelDAOMySQL();
       }
       else if (database.equals("Oracle")){
           return new ArtikelDAOOracle();
       }
       return null;
       
   }
    
}
