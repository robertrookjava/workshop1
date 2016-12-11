/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.database.daofactory;
import com.mycompany.mavenproject1.database.dao.BestelArtikelDAO;
import com.mycompany.mavenproject1.database.daoMySQL.BestelArtikelDAOMySQL;
import com.mycompany.mavenproject1.database.daoOracle.BestelArtikelDAOOracle;

/**
 *
 * @author robertrook
 */
public class BestelArtikelDaofactory {
    public BestelArtikelDAO getBestelArtikelDao (String database){
       if (database.equals("MySql")){
           return new BestelArtikelDAOMySQL();
       }
       else if (database.equals("Oracle")){
           return new BestelArtikelDAOOracle();
       }
       return null;
       
   }
    
}
