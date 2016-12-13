/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.database.daoMySQL;
import com.mycompany.mavenproject1.database.Database;
import com.mycompany.mavenproject1.database.dao.*;

/**
 *
 * @author robertrook
 */
public class BestelArtikelDAOMySQL extends BestelArtikelDAO {
    
    protected Database database = Database.MySQL;
    
    @Override
    public Database getDatabase(){
        return this.database;
    }
    
}
