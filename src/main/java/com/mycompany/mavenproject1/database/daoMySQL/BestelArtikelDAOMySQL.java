/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.database.daoMySQL;
import com.mycompany.mavenproject1.database.dao.*;

/**
 *
 * @author robertrook
 */
public class BestelArtikelDAOMySQL extends BestelArtikelDAO {
    
    protected String database = "MySql";
    
    public String getDatabase(){
        return this.database;
    }
    
}
